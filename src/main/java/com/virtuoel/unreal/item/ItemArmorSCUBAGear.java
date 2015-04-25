package com.virtuoel.unreal.item;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.virtuoel.unreal.init.UnrealItems;

public class ItemArmorSCUBAGear extends ItemArmorUnrealBase
{

	public ItemArmorSCUBAGear(ItemArmor.ArmorMaterial par1EnumArmorMaterial, int par2, int par3)
	{
		super(par1EnumArmorMaterial, par2, par3);
		this.setMaxDamage(240);
		setNoRepair();
	}

	@Override
	public boolean isValidArmor(ItemStack stack, int armorType, Entity entity)
	{
		if (armorType == 0)return true;
		
		return false;
	}

	/**
	 * Return an item rarity from EnumRarity
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack)
	{
		return EnumRarity.UNCOMMON;
	}

	/**
	 * Return whether this item is repairable in an anvil.
	 */
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return UnrealItems.SCUBATankOxygen == par2ItemStack.getItem() ? true : false;
	}

	@Override
	public void onArmorTick(World par1World, EntityPlayer par2EntityPlayer, ItemStack par3ItemStack)
	{
		super.onArmorTick(par1World, par2EntityPlayer, par3ItemStack);
		if(par3ItemStack.getItem()==this&&par3ItemStack.getItemDamage()<par3ItemStack.getMaxDamage())
		{
			PotionEffect potioneffect = new PotionEffect(13, 2, 0, true, false);
			par2EntityPlayer.addPotionEffect(potioneffect);
			if(par2EntityPlayer.getActivePotionEffect(Potion.waterBreathing).getDuration()<4)
			{
				if(par2EntityPlayer.isInsideOfMaterial(Material.water)/*||par2EntityPlayer.isWet()*/)
				{
					if(itemRand.nextInt(100)==0)
					{
						par3ItemStack.damageItem(1, par2EntityPlayer);
						/*if(par2EntityPlayer.inventory.armorInventory[this.armorType].stackSize == 0)
						{
							par2EntityPlayer.inventory.armorInventory[this.armorType] = null;
						}*/
						//par1World.playSoundAtEntity(par2EntityPlayer, "random.breath", 2.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 0.8F));
						par1World.playSoundAtEntity(par2EntityPlayer, "random.drink", 0.5F, 0.0F);
						//par3ItemStack.setItemDamage(par3ItemStack.getItemDamage()+1);
					}
				}
			}
		}
	}
	
}

