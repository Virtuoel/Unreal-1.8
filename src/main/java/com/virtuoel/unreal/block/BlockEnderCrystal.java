package com.virtuoel.unreal.block;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.UnrealBlocks;

public class BlockEnderCrystal extends BlockUnreal
{
	
	public BlockEnderCrystal(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		if (!worldIn.isRemote)
		{
			List list = worldIn.getEntitiesWithinAABB(EntityEnderCrystal.class, AxisAlignedBB.fromBounds((double)pos.getX() + this.minX, (double)pos.getY()-2 + this.minY, (double)pos.getZ() + this.minZ, (double)pos.getX() + this.maxX, (double)pos.getY() + this.maxY, (double)pos.getZ() + this.maxZ));
			boolean flag1 = list.isEmpty();
			if ((Block.isEqualTo(worldIn.getBlockState(pos.add(0, -2, 0)).getBlock(), UnrealBlocks.oreBedrockiumHidden) ||
					Block.isEqualTo(worldIn.getBlockState(pos.add(0, -2, 0)).getBlock(), UnrealBlocks.oreBedrockium) ||
					Block.isEqualTo(worldIn.getBlockState(pos.add(0, -2, 0)).getBlock(), UnrealBlocks.blockBedrockium) ||
					Block.isEqualTo(worldIn.getBlockState(pos.add(0, -2, 0)).getBlock(), Blocks.bedrock)) &&
					(worldIn.isAirBlock(pos.add(0, -1, 0)) ||
					Block.isEqualTo(worldIn.getBlockState(pos.add(0, -1, 0)).getBlock(), Blocks.fire)) &&
					flag1)
			{
				worldIn.setBlockToAir(pos);
				worldIn.playSoundEffect((double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, "mob.ghast.fireball", 1.0F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
				worldIn.setBlockState(pos.add(0, -1, 0), Blocks.fire.getDefaultState(), 3);
				EntityEnderCrystal entityendercrystal = new EntityEnderCrystal(worldIn);
				entityendercrystal.setLocationAndAngles((double)((float)pos.getX() + 0.5F), (double)(pos.getY() - 1), (double)((float)pos.getZ() + 0.5F), worldIn.rand.nextFloat() * 360.0F, 0.0F);
				worldIn.spawnEntityInWorld(entityendercrystal);
				return true;
			}
			else
			{
				return super.onBlockActivated(worldIn, pos, state, playerIn, side, hitX, hitY, hitZ);
			}
		}
		return true;
	}

	@Override
	public boolean canEntityDestroy(IBlockAccess world, BlockPos pos, Entity entity)
	{
		if (entity instanceof EntityWither)
		{
			return true;
		}
		else if (entity instanceof EntityDragon)
		{
			return false;
		}
		return true;
	}
	
}
