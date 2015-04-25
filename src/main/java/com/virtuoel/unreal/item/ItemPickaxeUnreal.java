package com.virtuoel.unreal.item;

import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraftforge.common.ForgeHooks;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.virtuoel.unreal.creativetab.CreativeTabUnreal;

public class ItemPickaxeUnreal extends ItemToolUnreal
{
	private static final Set EFFECTIVE_ON = Sets.newHashSet(new Block[] {Blocks.activator_rail, Blocks.coal_ore, Blocks.cobblestone, Blocks.detector_rail, Blocks.diamond_block, Blocks.diamond_ore, Blocks.double_stone_slab, Blocks.golden_rail, Blocks.gold_block, Blocks.gold_ore, Blocks.ice, Blocks.iron_block, Blocks.iron_ore, Blocks.lapis_block, Blocks.lapis_ore, Blocks.lit_redstone_ore, Blocks.mossy_cobblestone, Blocks.netherrack, Blocks.packed_ice, Blocks.rail, Blocks.redstone_ore, Blocks.sandstone, Blocks.red_sandstone, Blocks.stone, Blocks.stone_slab});
	
	public ItemPickaxeUnreal(Item.ToolMaterial toolMaterial, float damageVsEntity)
	{
		super(damageVsEntity, toolMaterial, EFFECTIVE_ON);
		this.setMaxStackSize(1)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB)
		.setHarvestLevel("pickaxe", toolMaterial.getHarvestLevel());
	}
	
	@Override
    public boolean canHarvestBlock(Block blockIn)
    {
		return this.toolMaterial.getHarvestLevel() >= blockIn.getHarvestLevel(blockIn.getDefaultState());
    }
		/*
        return blockIn == Blocks.obsidian ? 
        		this.toolMaterial.getHarvestLevel() >= 3 : 
        			(blockIn != Blocks.diamond_block && blockIn != Blocks.diamond_ore ? 
        					(blockIn != Blocks.emerald_ore && blockIn != Blocks.emerald_block ? 
        							(blockIn != Blocks.gold_block && blockIn != Blocks.gold_ore ? 
        									(blockIn != Blocks.iron_block && blockIn != Blocks.iron_ore ? 
        											(blockIn != Blocks.lapis_block && blockIn != Blocks.lapis_ore ? 
        													(blockIn != Blocks.redstone_ore && blockIn != Blocks.lit_redstone_ore ? 
        															(blockIn.getMaterial() == Material.rock ? 
        																true : 
        															(blockIn.getMaterial() == Material.iron ? 
        																true : 
        															blockIn.getMaterial() == Material.anvil)) : 
        													this.toolMaterial.getHarvestLevel() >= 2) : 
        											this.toolMaterial.getHarvestLevel() >= 1) : 
        									this.toolMaterial.getHarvestLevel() >= 1) : 
        							this.toolMaterial.getHarvestLevel() >= 2) : 
        					this.toolMaterial.getHarvestLevel() >= 2) : 
        			this.toolMaterial.getHarvestLevel() >= 2);
        
    }*/

    public float getStrVsBlock(ItemStack stack, Block block)
    {
        return block.getMaterial() != Material.iron && block.getMaterial() != Material.anvil && block.getMaterial() != Material.rock ? super.getStrVsBlock(stack, block) : this.efficiencyOnProperMaterial;
    }
	
	@Override
	public Set<String> getToolClasses(ItemStack itemStack)
	{
		return ImmutableSet.of("pickaxe");
	}

}
