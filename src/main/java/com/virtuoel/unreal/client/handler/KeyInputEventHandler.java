package com.virtuoel.unreal.client.handler;

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

public class KeyInputEventHandler
{
	private static Key getPressedKeyBinding()
	{
		if(KeyBindings.modeSwitch.isPressed())
		{
			return Key.MODE_SWITCH;
		}
		else if(KeyBindings.reload.isPressed())
		{
			return Key.RELOAD;
		}
		return Key.UNKNOWN;
	}
	
	@SubscribeEvent
	public void handleKeyInputEvent(InputEvent.KeyInputEvent event)
	{
		if(Settings.Debug.printDebugKeyBindingValues)
		{
			LogHelper.info(getPressedKeyBinding());
		}
	}
	
}
