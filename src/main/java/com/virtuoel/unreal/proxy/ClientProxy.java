package com.virtuoel.unreal.proxy;

import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import com.virtuoel.unreal.entity.EntityTranslocatorDisc;
import com.virtuoel.unreal.init.UnrealBlocks;
import com.virtuoel.unreal.init.UnrealEntities;
import com.virtuoel.unreal.init.UnrealItems;
import com.virtuoel.unreal.renderer.entity.RenderTranslocatorDisc;

//import com.virtuoel.unreal.client.settings.KeyBindings;

//import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenders()
	{
		UnrealItems.registerRenders();
		UnrealBlocks.registerRenders();
		
		UnrealEntities.registerRenders();
	}
	
	@Override
	public void registerKeyBindings()
	{
		//ClientRegistry.registerKeyBinding(KeyBindings.modeSwitch);
		//ClientRegistry.registerKeyBinding(KeyBindings.reload);
	}
	
}
