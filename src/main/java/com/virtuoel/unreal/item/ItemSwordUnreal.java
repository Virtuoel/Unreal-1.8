package com.virtuoel.unreal.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.reference.Reference;

public class ItemSwordUnreal extends ItemSword
{

	public ItemSwordUnreal(Item.ToolMaterial toolMaterial)
	{
		super(toolMaterial);
		this.setMaxStackSize(1)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
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
