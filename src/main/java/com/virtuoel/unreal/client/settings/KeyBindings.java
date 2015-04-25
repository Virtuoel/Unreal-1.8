package com.virtuoel.unreal.client.settings;

import net.minecraft.client.settings.KeyBinding;

import org.lwjgl.input.Keyboard;

import com.virtuoel.unreal.reference.Names;

public class KeyBindings
{
	public static KeyBinding modeSwitch = new KeyBinding(Names.Keys.MODE_SWITCH,Keyboard.KEY_X,Names.Keys.CATEGORY);
	public static KeyBinding reload = new KeyBinding(Names.Keys.RELOAD,Keyboard.KEY_C,Names.Keys.CATEGORY);
}
