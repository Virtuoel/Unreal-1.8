package com.virtuoel.unreal.item;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.virtuoel.unreal.creativetab.CreativeTabUnreal;

public class ItemAxeUnreal extends ItemToolUnreal
{
	private static final Set EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.planks, Blocks.bookshelf, Blocks.log, Blocks.log2, Blocks.chest, Blocks.pumpkin, Blocks.lit_pumpkin, Blocks.melon_block, Blocks.ladder});
    
	public ItemAxeUnreal(Item.ToolMaterial toolMaterial, float damageVsEntity)
	{
		super(damageVsEntity, toolMaterial, EFFECTIVE_ON);
		this.setMaxStackSize(1)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB)
		.setHarvestLevel("axe", toolMaterial.getHarvestLevel());
	}
	
	@Override
	public float getStrVsBlock(ItemStack stack, Block block)
    {
        return block.getMaterial() != Material.wood && block.getMaterial() != Material.plants && block.getMaterial() != Material.vine ? super.getStrVsBlock(stack, block) : this.efficiencyOnProperMaterial;
    }
}
