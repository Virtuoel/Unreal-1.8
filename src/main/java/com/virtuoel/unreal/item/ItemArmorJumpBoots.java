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
	@SideOnly(Side.CLIENT)
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
		if(!par2EntityPlayer.isSneaking())
		{
			if(par3ItemStack.getItem()==this)
			{
				PotionEffect potioneffect = new PotionEffect(8, 2, 3, true, false);
				par2EntityPlayer.addPotionEffect(potioneffect);
				par2EntityPlayer.fallDistance = 0.0F;
				/*
				if(par1World.isRemote)
				{
					//if(par2EntityPlayer.inventory.armorInventory[Reference.Armor.Type.BOOTS] != null && par2EntityPlayer.inventory.armorInventory[Reference.Armor.Type.BOOTS].getItem() == this)
					//{
						par2EntityPlayer.stepHeight = Reference.Entity.DEFAULT_STEP_HEIGHT * 2.0F;
					//}
					//else
					//{
					//	par2EntityPlayer.stepHeight = Reference.Entity.DEFAULT_STEP_HEIGHT;
					//}
				}*/
			}/*
			else
			{
				if(par1World.isRemote)
				{
					par2EntityPlayer.stepHeight = Reference.Entity.DEFAULT_STEP_HEIGHT;
				}
			}*/
		}
	}
	/*
	@Override
	public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_)
	{
		super.onUpdate(p_77663_1_, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
		if(p_77663_2_.isRemote && p_77663_3_ instanceof EntityLivingBase)
		{
			if(((EntityLivingBase)p_77663_3_).getEquipmentInSlot(0) != null && ((EntityLivingBase)p_77663_3_).getEquipmentInSlot(0).getItem() == this)
			{
				p_77663_3_.stepHeight = Reference.Entity.DEFAULT_STEP_HEIGHT * 2.0F;
			}
			else
			{
				p_77663_3_.stepHeight = Reference.Entity.DEFAULT_STEP_HEIGHT;
			}
		}
	}*/
	/*
	@SubscribeEvent
	public void onLiving(LivingUpdateEvent event)
	{
		if(event.entityLiving instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)event.entityLiving;
			ItemStack itemStack = player.inventory.armorItemInSlot(0);
			if (itemStack != null && itemStack.getItem() == this){
				player.stepHeight = Reference.Entity.DEFAULT_STEP_HEIGHT * 2.0F;
			}
				
			else
				player.stepHeight = Reference.Entity.DEFAULT_STEP_HEIGHT;
		}
	}*/
}

