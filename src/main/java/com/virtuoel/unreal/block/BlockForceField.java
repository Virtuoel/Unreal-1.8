package com.virtuoel.unreal.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.UnrealBlocks;
import com.virtuoel.unreal.init.UnrealItems;
import com.virtuoel.unreal.item.ItemBlockPlacerDamageable;

public class BlockForceField extends BlockUnrealTransparent
{
	
	public BlockForceField(Material material)
	{
		super(material, false);
		this.setTickRandomly(true)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}

    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.TRANSLUCENT;
    }

    public boolean isFullCube()
    {
        return false;
    }
	
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos)
	{
		if (world.getBlockState(pos) == UnrealBlocks.blockForceField)
		{
			return new ItemStack(UnrealItems.forceField, 1, ((ItemBlockPlacerDamageable)UnrealItems.forceField).getDamageOnCraft());
		}
		return super.getPickBlock(target, world, pos);
	}
	
	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
		if(worldIn.rand.nextInt(100)==0)
		{
			worldIn.setBlockToAir(pos);
		}
    }
	
}
