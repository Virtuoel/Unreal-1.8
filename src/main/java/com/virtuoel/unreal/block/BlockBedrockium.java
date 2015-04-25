package com.virtuoel.unreal.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderEnd;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.UnrealBlocks;
import com.virtuoel.unreal.init.UnrealItems;

public class BlockBedrockium extends BlockUnreal
{

	public BlockBedrockium(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	@Override
	public boolean canEntityDestroy(IBlockAccess world, BlockPos pos, Entity entity)
	{
		if (entity instanceof EntityWither)
		{
			return false;
		}
		else if (entity instanceof EntityDragon)
		{
			return false; 
		}
		
		return true;
	}
	
	@Override
	public boolean isFireSource(World world, BlockPos pos, EnumFacing side)
	{
		if ((world.provider instanceof WorldProviderEnd) && 
				(this == UnrealBlocks.oreBedrockiumHidden ||
   			 	 this == UnrealBlocks.oreBedrockium ||
    			 this == UnrealBlocks.blockBedrockium) &&
				 side == EnumFacing.UP)
		{
			return true;
		}
		return false;
	}
	
	@Override
	/**
	 * Called upon block activation (right click on the block.)
	 */
	public boolean onBlockActivated(World par1World, BlockPos pos, IBlockState state, EntityPlayer par5EntityPlayer, EnumFacing facing, float par7, float par8, float par9)
	{
		if (this == UnrealBlocks.oreBedrockiumHidden && par5EntityPlayer.getCurrentEquippedItem() != null && par5EntityPlayer.getCurrentEquippedItem().getItem() == UnrealItems.bucketMercury)
		{
			if (!par5EntityPlayer.capabilities.isCreativeMode)
			{
				if(--par5EntityPlayer.getCurrentEquippedItem().stackSize>0)
				{
					par5EntityPlayer.setCurrentItemOrArmor(0, new ItemStack(Items.bucket,1,0));
				}
				else if (!par5EntityPlayer.inventory.addItemStackToInventory(new ItemStack(Items.bucket,1,0)))
				{
					par5EntityPlayer.dropPlayerItemWithRandomChoice(new ItemStack(Items.bucket, 0), true);
				}
			}
			
			par1World.playSoundEffect((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, "random.fizz", 1.0F, par1World.rand.nextFloat() * 0.1F + 0.9F);
			if(par1World.rand.nextInt(4)==0)par1World.setBlockState(pos, UnrealBlocks.oreBedrockium.getDefaultState(), 3);
			return true;
		}
		else
		{
			return super.onBlockActivated(par1World, pos, state, par5EntityPlayer, facing, par7, par8, par9);
		}
	}
	
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos)
	{
		if (world.getBlockState(pos) == UnrealBlocks.oreBedrockiumHidden)
		{
			return new ItemStack(Blocks.bedrock, 1, 0);
		}
		
		return super.getPickBlock(target, world, pos);
	}
	
	@Override
	public boolean canCreatureSpawn(IBlockAccess world, BlockPos pos, net.minecraft.entity.EntityLiving.SpawnPlacementType type)
    {
		return false;
	}
	
}
