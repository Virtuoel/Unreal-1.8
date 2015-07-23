package com.virtuoel.unreal.handler;

import java.io.File;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import com.virtuoel.unreal.reference.Reference;
import com.virtuoel.unreal.reference.Settings;

public class ConfigurationHandler
{
	public static Configuration configuration;
	
	public static void init(File configFile)
	{
		if(configuration==null)
		{
			configuration = new Configuration(configFile);
			loadConfiguration();
		}
	}
	
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
		{
			loadConfiguration();
		}
	}
	
	private static void loadConfiguration()
	{
		Settings.Blocks.asbestosOrePoison = configuration.getBoolean("asbestosOrePoison", Reference.ConfigCategory.BLOCKS, false, "True for Asbestos Ore to cause a poison effect when in the inventory");
		Settings.Blocks.asbestosBlockPoison = configuration.getBoolean("asbestosBlockPoison", Reference.ConfigCategory.BLOCKS, true, "True for Asbestos Blocks to cause a poison effect when in the inventory");
		Settings.Items.asbestosDustPoison = configuration.getBoolean("asbestosDustPoison", Reference.ConfigCategory.ITEMS, true, "True for Asbestos Dust to cause a poison effect when in the inventory");
		Settings.Items.asbestosTinyDustPoison = configuration.getBoolean("asbestosTinyDustPoison", Reference.ConfigCategory.ITEMS, true, "True for Tiny Asbestos Dust to cause a poison effect when in the inventory");
		Settings.Blocks.bedrockiumOreSlowness = configuration.getBoolean("bedrockiumOreSlowness", Reference.ConfigCategory.BLOCKS, true, "True for Bedrockium Ore to cause a slowness effect when in the inventory");
		Settings.Blocks.bedrockiumBlockSlowness = configuration.getBoolean("bedrockiumBlockSlowness", Reference.ConfigCategory.BLOCKS, true, "True for Bedrockium Blocks to cause a slowness effect when in the inventory");
		Settings.Items.bedrockiumIngotSlowness = configuration.getBoolean("bedrockiumIngotSlowness", Reference.ConfigCategory.ITEMS, true, "True for Bedrockium Ingots to cause a slowness effect when in the inventory");
		Settings.Items.bedrockiumNuggetSlowness = configuration.getBoolean("bedrockiumNuggetSlowness", Reference.ConfigCategory.ITEMS, true, "True for Bedrockium Nuggets to cause a slowness effect when in the inventory");
		
		Settings.Crafting.ninePearlsPerEnderBlock = configuration.getBoolean("ninePearlsPerEnderBlock", Reference.ConfigCategory.CRAFTING, false, "True for 9 Ender Pearls per block, false for 4");
		
		Settings.Crafting.nineTinyDustPerTitaniumDust = configuration.getBoolean("nineTinyDustPerTitaniumDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Titanium Dust per Titanium Dust, false for 4");
		Settings.Crafting.nineTinyDustPerRutileDust = configuration.getBoolean("nineTinyDustPerRutileDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Rutile Dust per Rutile Dust, false for 4");
		Settings.Crafting.nineTinyDustPerMagnesiumDust = configuration.getBoolean("nineTinyDustPerMagnesiumDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Magnesium Dust per Magnesium Dust, false for 4");
		Settings.Crafting.nineTinyDustPerCinnabarDust = configuration.getBoolean("nineTinyDustPerCinnabarDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Cinnabar Dust per Cinnabar Dust, false for 4");
		Settings.Crafting.nineTinyDustPerAsbestosDust = configuration.getBoolean("nineTinyDustPerAsbestosDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Asbestos Dust per Asbestos Dust, false for 4");
		Settings.Crafting.nineTinyDustPerTarydiumAlloyUnrefinedDust = configuration.getBoolean("nineTinyDustPerTarydiumAlloyUnrefinedDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Unrefined Tarydium Alloy Dust per Unrefined Tarydium Alloy Dust, false for 4");
		Settings.Crafting.nineTinyDustPerTarydiumAlloyRefinedDust = configuration.getBoolean("nineTinyDustPerTarydiumAlloyRefinedDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Refined Tarydium Alloy Dust per Refined Tarydium Alloy Dust, false for 4");
		Settings.Crafting.nineTinyDustPerCoalDust = configuration.getBoolean("nineTinyDustPerCoalDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Coal Dust per Coal Dust, false for 4");
		Settings.Crafting.nineTinyDustPerCharcoalDust = configuration.getBoolean("nineTinyDustPerCharcoalDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Charcoal Dust per Charcoal Dust, false for 4");
		Settings.Crafting.nineTinyDustPerIronDust = configuration.getBoolean("nineTinyDustPerIronDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Iron Dust per Iron Dust, false for 4");
		Settings.Crafting.nineTinyDustPerLapisDust = configuration.getBoolean("nineTinyDustPerLapisDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Lapis Lazuli Dust per Lapis Lazuli Dust, false for 4");
		Settings.Crafting.nineTinyDustPerGoldDust = configuration.getBoolean("nineTinyDustPerGoldDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Gold Dust per Gold Dust, false for 4");
		Settings.Crafting.nineTinyDustPerRedstoneDust = configuration.getBoolean("nineTinyDustPerRedstoneDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Redstone Dust per Redstone Dust, false for 4");
		Settings.Crafting.nineTinyDustPerGlowstoneDust = configuration.getBoolean("nineTinyDustPerGlowstoneDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Glowstone Dust per Glowstone Dust, false for 4");
		Settings.Crafting.nineTinyDustPerNetherQuartzDust = configuration.getBoolean("nineTinyDustPerNetherQuartzDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Nether Quartz Dust per Nether Quartz Dust, false for 4");
		Settings.Crafting.nineTinyDustPerDiamondDust = configuration.getBoolean("nineTinyDustPerDiamondDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Diamond Dust per Diamond Dust, false for 4");
		Settings.Crafting.nineTinyDustPerEmeraldDust = configuration.getBoolean("nineTinyDustPerEmeraldDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Emerald Dust per Emerald Dust, false for 4");
		Settings.Crafting.nineTinyDustPerObsidianDust = configuration.getBoolean("nineTinyDustPerObsidianDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Obsidian Dust per Obsidian Dust, false for 4");
		Settings.Crafting.nineTinyDustPerLithiumDust = configuration.getBoolean("nineTinyDustPerLithiumDust", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Lithium Dust per Lithium Dust, false for 4");
		Settings.Crafting.nineTinyDustPerGunpowderDust = configuration.getBoolean("nineTinyDustPerGunpowder", Reference.ConfigCategory.CRAFTING, true, "True for 9 Tiny Pile of Gunpowder per Gunpowder, false for 4");
		
		Settings.Crafting.cheapHealthBuckets = configuration.getBoolean("cheapHealthBuckets", Reference.ConfigCategory.CRAFTING, true, "True for Health Buckets to use Golden Apples and Tiny Diamond Dust (9x cheaper), false for Notch Apples and Diamond Dust.");
		
		Settings.World.worldGeneratorWeight = configuration.getInt("worldGeneratorWeight", Configuration.CATEGORY_GENERAL, 1, 0, 1000, "Weight of world generator");
		
		Settings.Weapons.stingerTerrainDamage = configuration.getBoolean("stingerTerrainDamage", Reference.ConfigCategory.WEAPONS, true, "If Stinger destroys terrain");
		Settings.Weapons.eightballTerrainDamage = configuration.getBoolean("eightballTerrainDamage", Reference.ConfigCategory.WEAPONS, false, "If Eightball Launcher destroys terrain");
		Settings.Weapons.redeemerTerrainDamage = configuration.getBoolean("redeemerTerrainDamage", Reference.ConfigCategory.WEAPONS, false, "If Redeemer destroys terrain");
		Settings.Weapons.translocatorTeleportAcrossDimensions = configuration.getBoolean("translocatorTeleportAcrossDimensions", Reference.ConfigCategory.WEAPONS, true, "If you are able to use the translocator to teleport across dimensions");
		
		Settings.Entity.ID.entityIDTranslocatorDisc = configuration.getInt("entityIDTranslocatorDisc", Reference.ConfigCategory.ENTITY, 1, 1, 32, "ID of Translocator Disc Entity");
		
		Settings.Debug.printDebugOreDictionaryValues = configuration.getBoolean("printDebugOreDictionaryValues", Reference.ConfigCategory.DEBUG, false, "True to print Ore Dictionary entries");
		Settings.Debug.printDebugKeyBindingValues = configuration.getBoolean("printDebugKeyBindingValues", Reference.ConfigCategory.DEBUG, false, "True to print keybindings");
		Settings.Debug.printDebugTextureNames = configuration.getBoolean("printDebugTextureNames", Reference.ConfigCategory.DEBUG, false, "True to print texture names");
		Settings.Debug.debugClearItems = configuration.getBoolean("debugClearItems", Reference.ConfigCategory.DEBUG, false, "True to remove all items and blocks from this mod");
		Settings.Debug.debugWorldGenerator = configuration.getBoolean("debugWorldGenerator", Reference.ConfigCategory.DEBUG, false, "True to have a (permanent) debug overlay of ore locations in the sky");
		
		if(configuration.hasChanged())
		{
			configuration.save();
		}
	}
}
