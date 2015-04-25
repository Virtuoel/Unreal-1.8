package com.virtuoel.unreal.block;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.UnrealBlocks;
import com.virtuoel.unreal.init.UnrealItems;

public class BlockOreUnreal extends BlockUnreal
{
	
	public BlockOreUnreal(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random p_149650_2_, int p_149650_3_)
	{
		if(this==UnrealBlocks.oreTarydium)
		{
			return UnrealItems.shardTarydium;
		}
		else if(this==UnrealBlocks.oreTarydiumNether)
		{
			return UnrealItems.gemTarydium;
		}
		else if(this==UnrealBlocks.oreMagnesium)
		{
			return UnrealItems.dustMagnesium;
		}
		else if(this==UnrealBlocks.oreAsbestos)
		{
			return UnrealItems.dustAsbestos;
		}
		return super.getItemDropped(state, p_149650_2_, p_149650_3_);
	}
	
	/**
	 * Returns the quantity of items to drop on block destruction.
	 */
	@Override
	public int quantityDropped(Random random)
	{
		if(this==UnrealBlocks.oreTarydium)
		{
			return 4 + random.nextInt(5);
		}
		else if(this==UnrealBlocks.oreMagnesium)
		{
			return 1 + random.nextInt(4);
		}
		return 1;
	}
	
	/**
	 * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
	 */
	@Override
	public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
	{
		if (p_149679_1_ > 0 && Item.getItemFromBlock(this) != this.getItemDropped(this.getStateFromMeta(0), p_149679_2_, p_149679_1_))
		{
			int j = p_149679_2_.nextInt(p_149679_1_ + 2) - 1;
			
			if (j < 0)
			{
				j = 0;
			}
			
			return this.quantityDropped(p_149679_2_) * (j + 1);
		}
		else
		{
			return this.quantityDropped(p_149679_2_);
		}
	}
	
	/**
	 * Drops the block items with a specified chance of dropping the specified items
	 */
	@Override
	public void dropBlockAsItemWithChance(World p_149690_1_, BlockPos pos, IBlockState state, float p_149690_6_, int p_149690_7_)
	{
		super.dropBlockAsItemWithChance(p_149690_1_, pos, state, p_149690_6_, p_149690_7_);
	}
	
	private Random rand = new Random();
	@Override
	public int getExpDrop(IBlockAccess p_149690_1_, BlockPos pos, int p_149690_7_)
	{
		if (this.getItemDropped(this.getStateFromMeta(0), rand, p_149690_7_) != Item.getItemFromBlock(this))
		{
			int j1 = 0;
			
			if (this == UnrealBlocks.oreTarydium)
			{
				j1 = MathHelper.getRandomIntegerInRange(rand, 3, 7);
			}
			else if (this == UnrealBlocks.oreMagnesium)
			{
				j1 = MathHelper.getRandomIntegerInRange(rand, 1, 5);
			}
			else if (this == UnrealBlocks.oreAsbestos)
			{
				j1 = MathHelper.getRandomIntegerInRange(rand, 1, 5);
			}
			
			return j1;
		}
		return 0;
	}
	
}
