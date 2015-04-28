package com.virtuoel.unreal.reference;

public class Reference
{
	public static final String MOD_ID = "unreal";
	public static final String MOD_NAME = "Unreal";
	public static final String VERSION = "1.7.10-0.2.0.16";
	public static final String SERVER_PROXY_CLASS = "com.virtuoel.unreal.proxy.ServerProxy";
	public static final String CLIENT_PROXY_CLASS = "com.virtuoel.unreal.proxy.ClientProxy";
	public static final String GUI_FACTORY_CLASS = "com.virtuoel.unreal.client.gui.GuiFactory";
	
	public static final class Files
	{
		public static final class Extensions
		{
			public static final String PNG = ".png";
			public static final String OGG = ".ogg";
			public static final String DAT = ".dat";
			public static final String JAR = ".jar";
			public static final String ZIP = ".zip";
		}
		
		public static class Paths
		{
			public static final String LANG = "lang/";
			public static final String MODELS = "models/";
			public static final String SOUNDS = "sounds/";
			public static final String STREAMING = "streaming/";
			public static final String TEXTURES = "textures/";
		}
	}
	
	public static final class ConfigCategory
	{
		public static final String BLOCKS = "Blocks";
		public static final String ITEMS = "Items";
		public static final String CRAFTING = "Crafting";
		public static final String WORLD = "World";
		public static final String WEAPONS = "Weapons";
		public static final String DEBUG = "Debug";
		public static final String ENTITY = "Entity";
	}
	
	public static final class DamageSource
	{
		public static final String TRANSLOCATOR = "translocator";
		public static final String CHAINSAW = "chainsaw";
		public static final String DISPERSION = "dispersionPistol";
		public static final String STINGER = "stinger";
		public static final String FLAK = "flak";
		public static final String FLAK_CANNON = "flakCannon";
		public static final String EIGHTBALL = "eightballLauncher";
		public static final String REDEEMER = "redeemer";
	}
	
	public static class Entity
	{
		public static class Name
		{
			public static String nameTranslocatorDisc = "TranslocatorDisc";
		}
		public static final float DEFAULT_STEP_HEIGHT = 0.6F;
	}
	
	public static final class Armor
	{
		public static final class Type
		{
			public static final int HELMET = 0;
			public static final int CHESTPLATE = 1;
			public static final int LEGGINGS = 2;
			public static final int BOOTS = 3;
		}
		
		public static final class Render
		{
			public static final int LEATHER = 0;
			public static final int CHAIN = 1;
			public static final int IRON = 2;
			public static final int DIAMOND = 3;
			public static final int GOLD = 4;
		}
		
		public static final class Material
		{
			public static final class Name
			{
				public static final String SHIELD = "Energy Shield";
				public static final String SLIME = "Slime";
				public static final String TITANIUM = "Titanium";
			}
		}
		
		public static final class Texture
		{
			public static final String SHIELD = "unreal:shield";
			public static final String SLIME = "unreal:slime";
			public static final String TITANIUM = "unreal:titanium";
		}
		
	}
	
	public static final class Blocks
	{
		public static final class Faces
		{
			public static final int BOTTOM = 0;
			public static final int TOP = 1;
			public static final int NORTH = 2;
			public static final int SOUTH = 3;
			public static final int WEST = 4;
			public static final int EAST = 5;
			public static final String[] FACE_ARRAY = {"bottom", "top", "north", "south", "west", "east"};
		}
	}
	
	public static final class Fluids
	{
		public static final String FLUID_STILL = "Still";
		public static final String FLUID_FLOWING = "Flowing";
	}
	
	public static final class Items
	{
		
	}
	
}