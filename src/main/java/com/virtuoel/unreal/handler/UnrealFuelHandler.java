package com.virtuoel.unreal.handler;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

import com.virtuoel.unreal.init.UnrealBlocks;
import com.virtuoel.unreal.init.UnrealItems;

public class UnrealFuelHandler implements IFuelHandler
{
	@Override
	public int getBurnTime(ItemStack fuel)
	{
		if(fuel==null)return 0;
		if(fuel.getItem()==Item.getItemFromBlock(UnrealBlocks.blockBlaze))
		{
			return 2400*9;
		}
		else if(fuel.getItem()==Item.getItemFromBlock(UnrealBlocks.blockCharcoal))
		{
			return 1600*9;
		}
		else if(fuel.getItem()==UnrealItems.debugTool)
		{
			return 1600;
		}
		
		if(fuel.getItem()==Items.blaze_powder)
		{
			return 200*2;
		}
		else if(fuel.getItem()==Items.boat)
		{
			return 300;
		}
		else if(fuel.getItem()==Items.sign)
		{
			return 300;
		}
		else if(fuel.getItem()==Item.getItemFromBlock(Blocks.ladder))
		{
			return 300;
		}
		else if(fuel.getItem()==Item.getItemFromBlock(Blocks.oak_door))
		{
			return 300;
		}
		else if(fuel.getItem()==Item.getItemFromBlock(Blocks.birch_door))
		{
			return 300;
		}
		else if(fuel.getItem()==Item.getItemFromBlock(Blocks.spruce_door))
		{
			return 300;
		}
		else if(fuel.getItem()==Item.getItemFromBlock(Blocks.jungle_door))
		{
			return 300;
		}
		else if(fuel.getItem()==Item.getItemFromBlock(Blocks.acacia_door))
		{
			return 300;
		}
		else if(fuel.getItem()==Item.getItemFromBlock(Blocks.dark_oak_door))
		{
			return 300;
		}
		
		return 0;
	}
}
