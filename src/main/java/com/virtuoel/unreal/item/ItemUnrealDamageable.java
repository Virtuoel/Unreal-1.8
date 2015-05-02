package com.virtuoel.unreal.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.UnrealBlocks;


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
	
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return false;
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
	public void onUpdate(ItemStack par1ItemStack, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_)
	{
		super.onUpdate(par1ItemStack, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
		if(par1ItemStack.getItemDamage()<0)
		{
			par1ItemStack.setItemDamage(0);
		}
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
