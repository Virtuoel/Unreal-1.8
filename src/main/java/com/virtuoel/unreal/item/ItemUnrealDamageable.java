package com.virtuoel.unreal.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;


public class ItemUnrealDamageable extends ItemUnreal
{
	private int damageOnCraft = 0;
	
	public ItemUnrealDamageable()
	{
		super();
		this.setNoRepair()
		.setMaxStackSize(1).setHasSubtypes(true)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	public ItemUnrealDamageable setDamageOnCraft(int dmg)
	{
		this.damageOnCraft = dmg <= 0 ? 0 : dmg;
		return this;
	}
	
	public int getDamageOnCraft()
	{
		return damageOnCraft;
	}
	
	@Override
	public void getSubItems(Item par1item, CreativeTabs par2CreativeTabs, List par3List)
	{
		if(((ItemUnrealDamageable)par1item).getDamageOnCraft() != 0)
		{
			par3List.add(new ItemStack(par1item, 1, 1));
			par3List.add(new ItemStack(par1item, 1, par1item.getMaxDamage()));
		}
		if(((ItemUnrealDamageable)par1item).getDamageOnCraft() != 1 && ((ItemUnrealDamageable)par1item).getDamageOnCraft() != par1item.getMaxDamage())
		{
			par3List.add(new ItemStack(par1item, 1, ((ItemUnrealDamageable)par1item).getDamageOnCraft()));
		}
	}
	
}
