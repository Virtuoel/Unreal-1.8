package com.virtuoel.unreal.block;

import java.util.Iterator;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.reference.Materials;

public class BlockCactusTarydium extends BlockUnreal implements IPlantable
{

	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 15);

	public BlockCactusTarydium(Material material)
	{
		super(material);
		this.setDefaultState(this.blockState.getBaseState().withProperty(AGE, Integer.valueOf(0)));
		this.setTickRandomly(true);
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}

	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	{
		BlockPos blockpos1 = pos.up();
		
		if (worldIn.isAirBlock(blockpos1))
		{
			int i;
			
			for (i = 1; worldIn.getBlockState(pos.down(i)).getBlock() == this; ++i)
			{
				;
			}
			
			if (i < 3)
			{
				int j = ((Integer)state.getValue(AGE)).intValue();

				if (j == 15)
				{
					worldIn.setBlockState(blockpos1, this.getDefaultState());
					IBlockState iblockstate1 = state.withProperty(AGE, Integer.valueOf(0));
					worldIn.setBlockState(pos, iblockstate1, 4);
					this.onNeighborBlockChange(worldIn, blockpos1, iblockstate1, this);
				}
				else
				{
					worldIn.setBlockState(pos, state.withProperty(AGE, Integer.valueOf(j + 1)), 4);
				}
			}
		}
	}
	
	public AxisAlignedBB getCollisionBoundingBox(World worldIn, BlockPos pos, IBlockState state)
	{
		float f = 0.0625F;
		return new AxisAlignedBB((double)((float)pos.getX() + f), (double)pos.getY(), (double)((float)pos.getZ() + f), (double)((float)(pos.getX() + 1) - f), (double)((float)(pos.getY() + 1) - f), (double)((float)(pos.getZ() + 1) - f));
	}
	
	@SideOnly(Side.CLIENT)
	public AxisAlignedBB getSelectedBoundingBox(World worldIn, BlockPos pos)
	{
		float f = 0.0625F;
		return new AxisAlignedBB((double)((float)pos.getX() + f), (double)pos.getY(), (double)((float)pos.getZ() + f), (double)((float)(pos.getX() + 1) - f), (double)(pos.getY() + 1), (double)((float)(pos.getZ() + 1) - f));
	}
	
	public boolean isFullCube()
	{
		return false;
	}
	
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos)
	{
		return super.canPlaceBlockAt(worldIn, pos) ? this.canBlockStay(worldIn, pos) : false;
	}
	
	/**
     * Called when a neighboring block changes.
     */
	public void onNeighborBlockChange(World worldIn, BlockPos pos, IBlockState state, Block neighborBlock)
	{
		if (!this.canBlockStay(worldIn, pos))
		{
			worldIn.destroyBlock(pos, true);
		}
	}
	
	public boolean canBlockStay(World worldIn, BlockPos pos)
	{
		Iterator iterator = EnumFacing.Plane.HORIZONTAL.iterator();
		
		while (iterator.hasNext())
		{
			EnumFacing enumfacing = (EnumFacing)iterator.next();

			if (worldIn.getBlockState(pos.offset(enumfacing)).getBlock().getMaterial().isSolid())
			{
				return false;
			}
		}
		
		Block block = worldIn.getBlockState(pos.down()).getBlock();
		return block.getMaterial()==Materials.Blocks.tarydium;
		//return block.canSustainPlant(worldIn, pos.down(), EnumFacing.UP, this);
	}
	
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	{
		entityIn.attackEntityFrom(DamageSource.cactus, 4.0F);
	}
	
	@Override
    public void onBlockHarvested(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player)
	{
		player.attackEntityFrom(DamageSource.cactus, 4.0F);
	}
	
	public IBlockState getStateFromMeta(int meta)
	{
		return this.getDefaultState().withProperty(AGE, Integer.valueOf(meta));
	}
	
	@SideOnly(Side.CLIENT)
	public EnumWorldBlockLayer getBlockLayer()
	{
		return EnumWorldBlockLayer.CUTOUT;
	}
	
	public int getMetaFromState(IBlockState state)
	{
		return ((Integer)state.getValue(AGE)).intValue();
	}
	
	protected BlockState createBlockState()
	{
		return new BlockState(this, new IProperty[] {AGE});
	}
	
	@Override
	public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
	{
		Block block = world.getBlockState(pos.down()).getBlock();
		if(world.getBlockState(pos).getBlock().canSustainPlant(world, pos, EnumFacing.UP, Blocks.cactus))return EnumPlantType.Plains;
		return EnumPlantType.Desert;
	}
	
	@Override
	public IBlockState getPlant(net.minecraft.world.IBlockAccess world, BlockPos pos)
	{
		return getDefaultState();
	}
}