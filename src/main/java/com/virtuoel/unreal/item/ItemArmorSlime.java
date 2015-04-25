package com.virtuoel.unreal.item;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemArmorSlime extends ItemArmorUnrealBase
{
	
	public ItemArmorSlime(ItemArmor.ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_)
	{
		super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
	}

	/**
	 * Return whether this item is repairable in an anvil.
	 */
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return Item.getItemFromBlock(Blocks.slime_block) == par2ItemStack.getItem();
	}
	
	@Override
	public void onArmorTick(World par1World, EntityPlayer par2EntityPlayer, ItemStack par3ItemStack)
	{
		super.onArmorTick(par1World, par2EntityPlayer, par3ItemStack);
		if(par3ItemStack.getItem()==this && par3ItemStack.getItemDamage()>0)
		{
			if(par2EntityPlayer.isInsideOfMaterial(Material.water)||par2EntityPlayer.isWet())
			{
				if(itemRand.nextInt(100) == 0)
				{
					par3ItemStack.setItemDamage(par3ItemStack.getItemDamage()-1);
				}
			}
			else
			{
				if(itemRand.nextInt(250) == 0)
				{
					par3ItemStack.setItemDamage(par3ItemStack.getItemDamage()-1);
				}
			}
		}
	}
}
