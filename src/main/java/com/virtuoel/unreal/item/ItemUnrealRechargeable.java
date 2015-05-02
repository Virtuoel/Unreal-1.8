package com.virtuoel.unreal.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.reference.Reference;


public class ItemUnrealRechargeable extends ItemUnrealDamageable
{
	public ItemStack chargeItem;
	public int damagePerCharge;
	
	public ItemUnrealRechargeable(ItemStack chargeItem, int damagePerCharge)
	{
		super();
		setChargeItem(chargeItem);
		this.damagePerCharge = damagePerCharge;
	}
	
	public Item setChargeItem(ItemStack stack)
	{
		chargeItem=ItemStack.copyItemStack(stack);
		return this;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if(par3EntityPlayer.isSneaking())
		{
			if(par1ItemStack.getItemDamage() > this.damagePerCharge && par3EntityPlayer.inventory.hasItemStack(chargeItem))
			{
				int totalInvCharges = 0;
        		int index = 0;
        		for(index = 0; index < par3EntityPlayer.inventory.mainInventory.length; index++)
        		{
        			if(chargeItem.isItemEqual(par3EntityPlayer.inventory.mainInventory[index]))
        			{
        				totalInvCharges+=par3EntityPlayer.inventory.mainInventory[index].stackSize;
        			}
        		}
        		if(totalInvCharges>=chargeItem.stackSize)
        		{
        			totalInvCharges=chargeItem.stackSize;
        			for(index = 0; index < par3EntityPlayer.inventory.mainInventory.length; index++)
            		{
        				if(totalInvCharges<=0)
        				{
        					break;
        				}
            			if(chargeItem.isItemEqual(par3EntityPlayer.inventory.mainInventory[index]))
            			{
            				if(par3EntityPlayer.inventory.mainInventory[index].stackSize > totalInvCharges)
                			{
                				par3EntityPlayer.inventory.mainInventory[index].stackSize -= totalInvCharges;
                				par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() - (totalInvCharges * this.damagePerCharge));
                				break;
                			}
            				else if(par3EntityPlayer.inventory.mainInventory[index] !=null)
            				{
            					totalInvCharges -= par3EntityPlayer.inventory.mainInventory[index].stackSize;
            					par1ItemStack.setItemDamage(par1ItemStack.getItemDamage() - (par3EntityPlayer.inventory.mainInventory[index].stackSize * this.damagePerCharge));
            					par3EntityPlayer.inventory.mainInventory[index] = null;
            				}
            			}
            		}
        		}
			}
		}
		return par1ItemStack;
	}
	
}
