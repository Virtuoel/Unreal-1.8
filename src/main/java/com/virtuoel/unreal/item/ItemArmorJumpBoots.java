package com.virtuoel.unreal.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.virtuoel.unreal.init.UnrealItems;
import com.virtuoel.unreal.reference.Reference;
import com.virtuoel.unreal.reference.Settings;

public class ItemArmorJumpBoots extends ItemArmorUnrealBase
{

	public ItemArmorJumpBoots(ItemArmor.ArmorMaterial par1EnumArmorMaterial, int par2, int par3)
	{
		super(par1EnumArmorMaterial, par2, par3);
		setNoRepair();
	}

	@Override
	public boolean isValidArmor(ItemStack stack, int armorType, Entity entity)
	{
		if (armorType == 3)return true;

		return false;
	}

	/**
	 * Return an item rarity from EnumRarity
	 */
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack)
	{
		return EnumRarity.RARE;
	}

	/**
	 * Return whether this item is repairable in an anvil.
	 */
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return UnrealItems.ingotTitanium == par2ItemStack.getItem() ? true : false;
	}

	@Override
	public void onArmorTick(World par1World, EntityPlayer par2EntityPlayer, ItemStack par3ItemStack)
	{
		super.onArmorTick(par1World, par2EntityPlayer, par3ItemStack);
		if(Settings.Items.jumpBootsJumpBoost && !par2EntityPlayer.isSneaking())
		{
			if(par3ItemStack.getItem()==this)
			{
				PotionEffect potioneffect = new PotionEffect(8, 2, 3, true, false);
				par2EntityPlayer.addPotionEffect(potioneffect);
				par2EntityPlayer.fallDistance = 0.0F;
			}
		}
	}
}

