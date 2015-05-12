package com.virtuoel.unreal.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.virtuoel.unreal.init.UnrealItems;
import com.virtuoel.unreal.reference.Reference;

public class CreativeTabUnreal
{
	public static final CreativeTabs UNREAL_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
	{
		@Override
		@SideOnly(Side.CLIENT)
		public Item getTabIconItem()
		{
			return UnrealItems.healthSuper;
		}
	}.setBackgroundImageName(Reference.MOD_ID + Reference.Files.Extensions.PNG);
}
