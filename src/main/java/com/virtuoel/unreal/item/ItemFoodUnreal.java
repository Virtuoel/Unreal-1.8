package com.virtuoel.unreal.item;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.UnrealItems;
import com.virtuoel.unreal.reference.Reference;

public class ItemFoodUnreal extends ItemFood
{
	public int itemUseDuration = 32;
	public ItemFoodUnreal(int amount, float saturation, boolean isWolfFood)
	{
		super(amount, saturation, isWolfFood);
		this.setMaxStackSize(64)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	public ItemFoodUnreal(int amount, float saturation, boolean isWolfFood, int useDuration)
	{
		super(amount, saturation, isWolfFood);
		this.itemUseDuration = useDuration;
		this.setMaxStackSize(64)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced)
    {
    	String info = "";
		if(stack.getItem()==UnrealItems.appleCompressed1x)
		{
			info = "9 Apples";
		}
		else if(stack.getItem()==UnrealItems.appleCompressed2x)
		{
			info = "81 Apples";
		}
		else if(stack.getItem()==UnrealItems.appleCompressed3x)
		{
			info = "729 Apples";
		}
		else if(stack.getItem()==UnrealItems.appleCompressed4x)
		{
			info = "6561 Apples";
		}
		if(!info.isEmpty())
		{
			tooltip.add(info);
		}
    }
    
	
	@Override
	public int getMaxItemUseDuration(ItemStack stack)
    {
        return itemUseDuration;
    }
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
	
}
