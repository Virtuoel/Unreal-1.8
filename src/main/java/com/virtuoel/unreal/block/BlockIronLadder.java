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

	/**
	 * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
	 * cleared to be reused)
	 *//*
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
	{
		this.setBlockBoundsBasedOnState(p_149668_1_, p_149668_2_, p_149668_3_, p_149668_4_);
		return super.getCollisionBoundingBoxFromPool(p_149668_1_, p_149668_2_, p_149668_3_, p_149668_4_);
	}

	/**
	  * Updates the blocks bounds based on its current state. Args: world, x, y, z
	  *//*
	@Override
	public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
	{
		this.func_149797_b(p_149719_1_.getBlockMetadata(p_149719_2_, p_149719_3_, p_149719_4_));
	}

	/**
	   * Returns the bounding box of the wired rectangular prism to render.
	   *//*
	@SideOnly(Side.CLIENT)
	@Override
	public AxisAlignedBB getSelectedBoundingBoxFromPool(World p_149633_1_, int p_149633_2_, int p_149633_3_, int p_149633_4_)
	{
		this.setBlockBoundsBasedOnState(p_149633_1_, p_149633_2_, p_149633_3_, p_149633_4_);
		return super.getSelectedBoundingBoxFromPool(p_149633_1_, p_149633_2_, p_149633_3_, p_149633_4_);
	}

	public void func_149797_b(int p_149797_1_)
	{
		float f = 0.125F;

		if (p_149797_1_ == 2)
		{
			this.setBlockBounds(0.0F, 0.0F, 1.0F - f, 1.0F, 1.0F, 1.0F);
		}

		if (p_149797_1_ == 3)
		{
			this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, f);
		}

		if (p_149797_1_ == 4)
		{
			this.setBlockBounds(1.0F - f, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		}

		if (p_149797_1_ == 5)
		{
			this.setBlockBounds(0.0F, 0.0F, 0.0F, f, 1.0F, 1.0F);
		}
	}

	/**
	    * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	    * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	    *//*
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}

	/**
	     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	     *//*
	@Override
	public boolean renderAsNormalBlock()
	{
		return false;
	}

	/**
	      * The type of render function that is called for this block
	      *//*
	@Override
	public int getRenderType()
	{
		return 8;
	}

	/**
	       * Checks to see if its valid to put this block at the specified coordinates. Args: world, x, y, z
	       *//*
	@Override
	public boolean canPlaceBlockAt(World p_149742_1_, int p_149742_2_, int p_149742_3_, int p_149742_4_)
	{
		return p_149742_1_.isSideSolid(p_149742_2_ - 1, p_149742_3_, p_149742_4_, EAST ) ||
				p_149742_1_.isSideSolid(p_149742_2_ + 1, p_149742_3_, p_149742_4_, WEST ) ||
				p_149742_1_.isSideSolid(p_149742_2_, p_149742_3_, p_149742_4_ - 1, SOUTH) ||
				p_149742_1_.isSideSolid(p_149742_2_, p_149742_3_, p_149742_4_ + 1, NORTH) ||
				this.hasLadderAbove(p_149742_1_, p_149742_2_, p_149742_3_, p_149742_4_, -1);
	}

	/**
	        * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
	        *//*
	@Override
	public int onBlockPlaced(World p_149660_1_, int p_149660_2_, int p_149660_3_, int p_149660_4_, int p_149660_5_, float p_149660_6_, float p_149660_7_, float p_149660_8_, int p_149660_9_)
	{
		int j1 = p_149660_9_;

		if ((p_149660_9_ == 0 || p_149660_5_ == 2) && p_149660_1_.isSideSolid(p_149660_2_, p_149660_3_, p_149660_4_ + 1, NORTH))
		{
			j1 = 2;
		}

		if ((j1 == 0 || p_149660_5_ == 3) && p_149660_1_.isSideSolid(p_149660_2_, p_149660_3_, p_149660_4_ - 1, SOUTH))
		{
			j1 = 3;
		}

		if ((j1 == 0 || p_149660_5_ == 4) && p_149660_1_.isSideSolid(p_149660_2_ + 1, p_149660_3_, p_149660_4_, WEST))
		{
			j1 = 4;
		}

		if ((j1 == 0 || p_149660_5_ == 5) && p_149660_1_.isSideSolid(p_149660_2_ - 1, p_149660_3_, p_149660_4_, EAST))
		{
			j1 = 5;
		}

		if(j1 == p_149660_9_ && this.hasLadderAbove(p_149660_1_, p_149660_2_, p_149660_3_, p_149660_4_, -1))
		{
			j1 = p_149660_1_.getBlockMetadata(p_149660_2_, p_149660_3_+1, p_149660_4_);
		}

		return j1;
	}

	/**
	         * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	         * their own) Args: x, y, z, neighbor Block
	         *//*
	@Override
	public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
	{
		int l = p_149695_1_.getBlockMetadata(p_149695_2_, p_149695_3_, p_149695_4_);
		boolean flag = false;

		if (l == 2 && p_149695_1_.isSideSolid(p_149695_2_, p_149695_3_, p_149695_4_ + 1, NORTH))
		{
			flag = true;
		}

		if (l == 3 && p_149695_1_.isSideSolid(p_149695_2_, p_149695_3_, p_149695_4_ - 1, SOUTH))
		{
			flag = true;
		}

		if (l == 4 && p_149695_1_.isSideSolid(p_149695_2_ + 1, p_149695_3_, p_149695_4_, WEST))
		{
			flag = true;
		}

		if (l == 5 && p_149695_1_.isSideSolid(p_149695_2_ - 1, p_149695_3_, p_149695_4_, EAST))
		{
			flag = true;
		}

		if(!flag && this.hasLadderAbove(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, l))
		{
			flag = true;
		}

		if (!flag)
		{
			this.dropBlockAsItem(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, l, 0);
			p_149695_1_.setBlockToAir(p_149695_2_, p_149695_3_, p_149695_4_);
		}

		super.onNeighborBlockChange(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, p_149695_5_);
	}

	/**
	          * Returns the quantity of items to drop on block destruction.
	          *//*
	@Override
	public int quantityDropped(Random p_149745_1_)
	{
		return 1;
	}

	@Override
	public boolean isLadder(IBlockAccess world, int x, int y, int z, EntityLivingBase entity)
	{
		return true;
	}

	protected boolean hasLadderAbove(World world, int x, int y, int z, int meta)
	{
		boolean flag = true;

		if(!(world.getBlock(x, y+1, z) instanceof BlockIronLadder))flag=false;
		if(meta!=-1&&meta!=world.getBlockMetadata(x, y+1, z))flag=false;

		return flag;
	}
	           */

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
