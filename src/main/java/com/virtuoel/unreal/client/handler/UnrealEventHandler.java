package com.virtuoel.unreal.client.handler;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;

import com.virtuoel.unreal.client.settings.KeyBindings;
import com.virtuoel.unreal.init.UnrealItems;
import com.virtuoel.unreal.reference.Key;
import com.virtuoel.unreal.reference.Reference;
import com.virtuoel.unreal.reference.Settings;
import com.virtuoel.unreal.utility.LogHelper;

public class UnrealEventHandler
{

	private static void handleStepAssist(EntityLivingBase entityLiving)
	{
		if(entityLiving instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)entityLiving;
			if(!player.isSneaking())
			{
				ItemStack itemStack = player.inventory.armorItemInSlot(0);
				if(itemStack != null && itemStack.getItem() == UnrealItems.armorJumpBoots)
				{
					player.stepHeight = Reference.Entity.DEFAULT_STEP_HEIGHT * 2.0F;
				}
				else
				{
					player.stepHeight = Reference.Entity.DEFAULT_STEP_HEIGHT;
				}
			}
			else
			{
				player.stepHeight = Reference.Entity.DEFAULT_STEP_HEIGHT;
			}
		}
	}
	
	@SubscribeEvent
	public void onLiving(LivingUpdateEvent event)
	{
		handleStepAssist(event.entityLiving);
	}
	
	@SubscribeEvent
	public void onLivingFall(LivingUpdateEvent event)
	{
		
	}
	
}
