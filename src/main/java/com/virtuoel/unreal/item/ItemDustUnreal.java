package com.virtuoel.unreal.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import com.virtuoel.unreal.init.UnrealItems;

public class ItemDustUnreal extends ItemUnreal
{
	public ItemDustUnreal()
	{
		super();
	}
	
	@Override
	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
	{
		super.onUpdate(par1ItemStack, par2World, par3Entity, par4, par5);
		if(par3Entity instanceof EntityPlayer)
		{
			if(par1ItemStack.getItem()==UnrealItems.dustAsbestos || par1ItemStack.getItem()==UnrealItems.dustAsbestosTiny)
			{
				if(((EntityPlayer)par3Entity).inventory.armorItemInSlot(2)!=null&&
						((EntityPlayer)par3Entity).inventory.armorItemInSlot(2).getItem()==
								UnrealItems.armorToxinSuit)
				{
					if(((EntityPlayer)par3Entity).inventory.armorItemInSlot(2).getItemDamage()<240)
					{
						if(itemRand.nextInt(100)==0)
						{
							((EntityPlayer)par3Entity).inventory.armorItemInSlot(2).damageItem(1, (EntityPlayer)par3Entity);
						}
					}
					else
					{
						((EntityPlayer)par3Entity).inventory.armorInventory[2]=null;
					}
				}
				else
				{
					if(((EntityPlayer)par3Entity).getActivePotionEffect(Potion.poison)==null||
							((EntityPlayer)par3Entity).getActivePotionEffect(Potion.poison).getDuration()<4)
					{
						PotionEffect potioneffect = new PotionEffect(19, 59, 0, true, false);
						((EntityPlayer)par3Entity).addPotionEffect(potioneffect);
					}
				}
			}
		}
	}
}
