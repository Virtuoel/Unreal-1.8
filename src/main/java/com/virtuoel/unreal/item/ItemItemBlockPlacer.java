package com.virtuoel.unreal.item;

import java.util.List;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.UnrealBlocks;
import com.virtuoel.unreal.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemReed;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ItemItemBlockPlacer extends ItemReed
{
	//public final Block block;
	public ItemItemBlockPlacer(Block block)
	{
    	super(block);
    	//this.block = block;
        this.setMaxStackSize(64)
        .setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
    
	@Override
    public String getUnlocalizedName(ItemStack stack)
    {
    	return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName(stack)));
    }
    
    @Override
    public String getUnlocalizedName()
    {
    	return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
