package com.virtuoel.unreal.block;

import java.util.Iterator;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLadder;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;

public class BlockIronLadder extends BlockUnreal
{
	public static final PropertyDirection FACING = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

	public BlockIronLadder(Material material)
	{
		super(material);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}

	public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state)
	{
		this.setBlockBoundsBasedOnState(worldIn, pos);
		return super.getCollisionBoundingBox(worldIn, pos, state);
	}

	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getSelectedBoundingBox(World worldIn, BlockPos pos)
	{
		this.setBlockBoundsBasedOnState(worldIn, pos);
		return super.getSelectedBoundingBox(worldIn, pos);
	}

	public void setBlockBoundsBasedOnState(IBlockAccess worldIn, BlockPos pos)
	{
		IBlockState iblockstate = worldIn.getBlockState(pos);

		if (iblockstate.getBlock() == this)
		{
			float f = 0.125F;

			switch (BlockIronLadder.SwitchEnumFacing.FACING_LOOKUP[((EnumFacing)iblockstate.getValue(FACING)).ordinal()])
			{
			case 1:
				this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
				break;
			case 2:
				this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
				break;
			case 3:
				this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
				break;
			case 4:
			default:
				this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
			}
		}
	}

	public boolean isOpaqueCube()
	{
		return false;
	}

	public boolean isFullCube()
	{
		return false;
	}

	public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	{
		return worldIn.isSideSolid(pos.west(), EnumFacing.EAST, true) ||
				worldIn.isSideSolid(pos.east(), EnumFacing.WEST, true) ||
				worldIn.isSideSolid(pos.north(), EnumFacing.SOUTH, true) ||
				worldIn.isSideSolid(pos.south(), EnumFacing.NORTH, true) ||
				worldIn.getBlockState(pos.add(0, 1, 0)).getBlock() == this;
	}

	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
	{
		if (facing.getAxis().isHorizontal() && this.canBlockStay(worldIn, pos, facing))
		{
			return this.getDefaultState().withProperty(FACING, facing);
		}
		else if (worldIn.getBlockState(pos.add(0, 1, 0)).getBlock() == this)
		{
			return this.getDefaultState().withProperty(FACING, worldIn.getBlockState(pos.add(0, 1, 0)).getValue(FACING));
		}
		else
		{
			Iterator iterator = EnumFacing.Plane.HORIZONTAL.iterator();
			EnumFacing enumfacing1;

			do
			{
				if (!iterator.hasNext())
				{
					return this.getDefaultState();
				}

				enumfacing1 = (EnumFacing)iterator.next();
			}
			while (!this.canBlockStay(worldIn, pos, enumfacing1));

			return this.getDefaultState().withProperty(FACING, enumfacing1);
		}
	}

	public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock)
	{
		EnumFacing enumfacing = (EnumFacing)state.getValue(FACING);

		if (!this.canBlockStay(worldIn, pos, enumfacing))
		{
			this.dropBlockAsItem(worldIn, pos, state, 0);
			worldIn.setBlockToAir(pos);
		}

		super.onNeighborBlockChange(worldIn, pos, state, neighborBlock);
	}

	protected boolean canBlockStay(World worldIn, BlockPos pos, EnumFacing facing)
	{
		return worldIn.isSideSolid(pos.offset(facing.getOpposite()), facing, true) || 
				(worldIn.getBlockState(pos.add(0, 1, 0)).getBlock() == this && (EnumFacing)worldIn.getBlockState(pos.add(0, 1, 0)).getValue(FACING) == facing);
	}

	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}

	public IBlockState getStateFromMeta(int meta)
	{
		EnumFacing enumfacing = EnumFacing.getFront(meta);

		if (enumfacing.getAxis() == EnumFacing.Axis.Y)
		{
			enumfacing = EnumFacing.NORTH;
		}

		return this.getDefaultState().withProperty(FACING, enumfacing);
	}

	public int getMetaFromState(IBlockState state)
	{
		return ((EnumFacing)state.getValue(FACING)).getIndex();
	}

	protected BlockState createBlockState()
	{
		return new BlockState(this, new IProperty[] {FACING});
	}

	@Override public boolean isLadder(IBlockAccess world, BlockPos pos, EntityLivingBase entity) { return true; }

	static final class SwitchEnumFacing
	{
		static final int[] FACING_LOOKUP = new int[EnumFacing.values().length];
		private static final String __OBFID = "CL_00002104";

		static
		{
			try
			{
				FACING_LOOKUP[EnumFacing.NORTH.ordinal()] = 1;
			}
			catch (NoSuchFieldError var4)
			{
				;
			}

			try
			{
				FACING_LOOKUP[EnumFacing.SOUTH.ordinal()] = 2;
			}
			catch (NoSuchFieldError var3)
			{
				;
			}

			try
			{
				FACING_LOOKUP[EnumFacing.WEST.ordinal()] = 3;
			}
			catch (NoSuchFieldError var2)
			{
				;
			}

			try
			{
				FACING_LOOKUP[EnumFacing.EAST.ordinal()] = 4;
			}
			catch (NoSuchFieldError var1)
			{
				;
			}
		}
	}
}
