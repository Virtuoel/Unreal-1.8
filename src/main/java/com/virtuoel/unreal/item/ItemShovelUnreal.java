package com.virtuoel.unreal.item;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.virtuoel.unreal.creativetab.CreativeTabUnreal;

public class ItemShovelUnreal extends ItemToolUnreal
{
    private static final Set blocksEffectiveAgainst = Sets.newHashSet(new Block[]{Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, Blocks.soul_sand, Blocks.mycelium});
    
    public ItemShovelUnreal(Item.ToolMaterial toolMaterial, float damageVsEntity)
	{
		super(damageVsEntity, toolMaterial, blocksEffectiveAgainst);
		this.setMaxStackSize(1)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB)
		.setHarvestLevel("shovel", toolMaterial.getHarvestLevel());
	}
	/*
    @Override
    public boolean func_150897_b(Block block)
    {
        return block == Blocks.snow_layer ? true : block == Blocks.snow;
    }
*/
    @Override
    public Set<String> getToolClasses(ItemStack itemStack)
    {
        return ImmutableSet.of("shovel");
    }

}
