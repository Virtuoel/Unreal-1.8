package com.virtuoel.unreal.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.item.ItemArmorAsbestosSuit;
import com.virtuoel.unreal.item.ItemArmorJumpBoots;
import com.virtuoel.unreal.item.ItemArmorSCUBAGear;
import com.virtuoel.unreal.item.ItemArmorShieldBelt;
import com.virtuoel.unreal.item.ItemArmorSlime;
import com.virtuoel.unreal.item.ItemArmorToxinSuit;
import com.virtuoel.unreal.item.ItemArmorUnrealBase;
import com.virtuoel.unreal.item.ItemAxeUnreal;
import com.virtuoel.unreal.item.ItemDustUnreal;
import com.virtuoel.unreal.item.ItemFoodUnreal;
import com.virtuoel.unreal.item.ItemForceField;
import com.virtuoel.unreal.item.ItemHoeUnreal;
import com.virtuoel.unreal.item.ItemPickaxeUnreal;
import com.virtuoel.unreal.item.ItemRecordUnreal;
import com.virtuoel.unreal.item.ItemShovelUnreal;
import com.virtuoel.unreal.item.ItemSwordUnreal;
import com.virtuoel.unreal.item.ItemUnreal;
import com.virtuoel.unreal.item.ItemUnrealDamageable;
import com.virtuoel.unreal.item.ItemUnrealRechargeable;
import com.virtuoel.unreal.item.ItemVoiceBox;
import com.virtuoel.unreal.item.ItemWeaponBase;
import com.virtuoel.unreal.item.ItemWeaponTranslocator;
import com.virtuoel.unreal.reference.Materials;
import com.virtuoel.unreal.reference.Names;
import com.virtuoel.unreal.reference.Reference;

public class UnrealItems
{
	//ore materials, metals, gems, alloys
	public static Item ingotTitanium;
	public static Item nuggetTitanium;
	public static Item dustTitanium;
	public static Item ingotRutile;
	public static Item nuggetRutile;
	public static Item dustRutile;
	public static Item ingotMagnesium;
	public static Item nuggetMagnesium;
	public static Item dustMagnesium;
	public static Item gemTarydium;
	public static Item shardTarydium;
	public static Item crystalCinnabar;
	public static Item dustCinnabar;
	public static Item dustAsbestos;
	public static Item nuggetIron;
	public static Item ingotBedrockium;
	public static Item nuggetBedrockium;
	public static Item ingotTarydiumAlloyUnrefined;
	public static Item nuggetTarydiumAlloyUnrefined;
	public static Item dustTarydiumAlloyUnrefined;
	public static Item ingotTarydiumAlloyRefined;
	public static Item nuggetTarydiumAlloyRefined;
	public static Item dustTarydiumAlloyRefined;
	public static Item ingotLithium;
	public static Item nuggetLithium;
	public static Item dustLithium;
	
	//components
	public static Item caseIron;
	public static Item caseTitanium;
	public static Item gunBarrelIron;
	public static Item gunBarrelIronLarge;
	public static Item weaponCasingBasic;
	public static Item weaponCasingAdv;
	public static Item tarydPowerBasic;
	public static Item chainLink;
	public static Item ribbonMagnesium;
	public static Item chainsawBlade;
	public static Item chainsawBladeHardened;
	public static Item chainsawMotor;
	public static Item SCUBATankEmpty;
	public static Item SCUBATankOxygen;
	public static Item flak;
	public static Item flakShellCold;
	public static Item flakShellWarm;
	public static Item translocatorDisc;
	public static Item dispersionUpgrade;
	public static Item warheadCone;
	public static Item warheadBody;
	public static Item warheadThruster;
	public static Item rodTarydiumAlloyUnrefined;
	public static Item rodTarydiumAlloyRefined;
	public static Item rodIron;
	public static Item rodTitanium;
	public static Item rodGold;
	public static Item lensTarydium;
	public static Item coreInvulnerability;
	public static Item slimeballBlack;
	
	//food
	public static Item appleCompressed1x;
	public static Item appleCompressed2x;
	public static Item appleCompressed3x;
	public static Item appleCompressed4x;
	
	//fluid containers
	public static Item bucketMercury;
	public static Item bucketTarydiumSludge;
	public static Item bucketHealth;
	public static Item bucketNanoblack;
	
	//tools
	public static Item debugTool;
	public static Item forceField;
	public static Item voiceBox;
	public static Item universalTranslator;
	public static Item recordLongFlight;
	public static Item swordTitanium;
	public static Item pickaxeTitanium;
	public static Item shovelTitanium;
	public static Item axeTitanium;
	public static Item hoeTitanium;
	public static Item swordTarydiumAlloyRefined;
	public static Item pickaxeTarydiumAlloyRefined;
	public static Item shovelTarydiumAlloyRefined;
	public static Item axeTarydiumAlloyRefined;
	public static Item hoeTarydiumAlloyRefined;
	
	//armor
	public static Item armorSCUBAGear;
	public static Item armorShieldBelt;
	public static Item armorToxinSuit;
	public static Item armorAsbestosSuit;
	public static Item armorJumpBoots;
	public static Item armorHelmetTitanium;
	public static Item armorChestplateTitanium;
	public static Item armorLeggingsTitanium;
	public static Item armorBootsTitanium;
	public static Item armorHelmetSlime;
	public static Item armorChestplateSlime;
	public static Item armorLeggingsSlime;
	public static Item armorBootsSlime;
	public static Item armorInvulnerability;
	
	//ammo
	public static Item ammoEightball;
	public static Item ammoFlakShell;
	public static Item ammoWarhead;
	
	//vanilla item dusts
	public static Item dustCoal;
	public static Item dustCharcoal;
	public static Item dustIron;
	public static Item dustLapis;
	public static Item dustGold;
	public static Item dustNetherQuartz;
	public static Item dustDiamond;
	public static Item dustEmerald;
	public static Item dustObsidian;
	
	//tiny dusts
	public static Item dustTitaniumTiny;
	public static Item dustRutileTiny;
	public static Item dustMagnesiumTiny;
	public static Item dustCinnabarTiny;
	public static Item dustAsbestosTiny;
	public static Item dustTarydiumAlloyUnrefinedTiny;
	public static Item dustTarydiumAlloyRefinedTiny;
	public static Item dustCoalTiny;
	public static Item dustCharcoalTiny;
	public static Item dustIronTiny;
	public static Item dustLapisTiny;
	public static Item dustGoldTiny;
	public static Item dustRedstoneTiny;
	public static Item dustGlowstoneTiny;
	public static Item dustNetherQuartzTiny;
	public static Item dustDiamondTiny;
	public static Item dustEmeraldTiny;
	public static Item dustObsidianTiny;
	public static Item dustLithiumTiny;
	public static Item dustGunpowderTiny;
	
	//weapons
	public static Item gunTranslocator;
	public static Item gunDispersionPistol;
	public static Item meleeChainsaw;
	public static Item gunStinger;
	public static Item gunFlakCannon;
	public static Item gunEightballLauncher;
	public static Item gunRedeemer;
	
	//health
	public static Item healthSuperEmpty;
	public static Item healthSuper;
	
	//pickups
	public static Item invisibility;
	
	public static void init()
	{
		//ore materials, metals, gems, alloys
		ingotTitanium = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.INGOT_TITANIUM)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		nuggetTitanium = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.NUGGET_TITANIUM)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustTitanium = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_TITANIUM)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);

		ingotRutile = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.INGOT_RUTILE)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		nuggetRutile = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.NUGGET_RUTILE)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustRutile = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_RUTILE)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);

		ingotMagnesium = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.INGOT_MAGNESIUM)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		nuggetMagnesium = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.NUGGET_MAGNESIUM)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustMagnesium = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_MAGNESIUM)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		gemTarydium = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.GEM_TARYDIUM)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		shardTarydium = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.SHARD_TARYDIUM)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		crystalCinnabar = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.CRYSTAL_CINNABAR)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustCinnabar = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_CINNABAR)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustAsbestos = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_ASBESTOS)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		nuggetIron = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.NUGGET_IRON)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		ingotBedrockium = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.INGOT_BEDROCKIUM)
				.setMaxStackSize(64)
				.setCreativeTab(null);
		
		nuggetBedrockium = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.NUGGET_BEDROCKIUM)
				.setMaxStackSize(64)
				.setCreativeTab(null);

		ingotTarydiumAlloyUnrefined = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.INGOT_TARYDIUM_ALLOY_UNREFINED)
				.setMaxStackSize(64)
				.setCreativeTab(null);
		
		nuggetTarydiumAlloyUnrefined = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.NUGGET_TARYDIUM_ALLOY_UNREFINED)
				.setMaxStackSize(64)
				.setCreativeTab(null);
		
		dustTarydiumAlloyUnrefined = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_TARYDIUM_ALLOY_UNREFINED)
				.setMaxStackSize(64)
				.setCreativeTab(null);

		ingotTarydiumAlloyRefined = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.INGOT_TARYDIUM_ALLOY_REFINED)
				.setMaxStackSize(64)
				.setCreativeTab(null);
		
		nuggetTarydiumAlloyRefined = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.NUGGET_TARYDIUM_ALLOY_REFINED)
				.setMaxStackSize(64)
				.setCreativeTab(null);
		
		dustTarydiumAlloyRefined = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_TARYDIUM_ALLOY_REFINED)
				.setMaxStackSize(64)
				.setCreativeTab(null);

		ingotLithium = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.INGOT_LITHIUM)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		nuggetLithium = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.NUGGET_LITHIUM)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustLithium = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_LITHIUM)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		//components
		caseIron = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.CASE_IRON)
				.setMaxStackSize(16)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		caseTitanium = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.CASE_TITANIUM)
				.setMaxStackSize(16)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		gunBarrelIron = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.GUN_BARREL_IRON)
				.setMaxStackSize(16)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		gunBarrelIronLarge = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.GUN_BARREL_IRON_LARGE)
				.setMaxStackSize(8)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		weaponCasingBasic = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.WEAPON_CASING_BASIC)
				.setMaxStackSize(16).setFull3D()
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		weaponCasingAdv = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.WEAPON_CASING_ADVANCED)
				.setMaxStackSize(16).setFull3D()
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		tarydPowerBasic = 
				new ItemUnrealRechargeable(new ItemStack(UnrealItems.shardTarydium,1,0), 10)
				.setDamageOnCraft(1).setMaxDamage(101)
				.setUnlocalizedName(Names.Items.TARYDIUM_POWER)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		chainLink = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.CHAIN_LINK)
				.setMaxStackSize(32)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		ribbonMagnesium = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.RIBBON_MAGNESIUM)
				.setMaxStackSize(48)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		chainsawBlade = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.CHAINSAW_BLADE)
				.setMaxStackSize(8).setFull3D()
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		chainsawBladeHardened = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.CHAINSAW_BLADE_HARDENED)
				.setMaxStackSize(8).setFull3D()
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		chainsawMotor = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.CHAINSAW_MOTOR)
				.setMaxStackSize(4)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		SCUBATankEmpty = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.SCUBA_TANK_EMPTY)
				.setMaxStackSize(4)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		SCUBATankOxygen = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.SCUBA_TANK_OXYGEN)
				.setMaxStackSize(4)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		flak = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.FLAK)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		flakShellCold = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.FLAK_SHELL_COLD)
				.setMaxStackSize(16)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		flakShellWarm = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.FLAK_SHELL_WARM)
				.setMaxStackSize(16)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		translocatorDisc = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.TRANSLOCATOR_DISC)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dispersionUpgrade = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.DISPERSION_UPGRADE)
				.setMaxStackSize(4)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		warheadCone = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.WARHEAD_CONE)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		warheadBody = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.WARHEAD_BODY)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		warheadThruster = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.WARHEAD_THRUSTER)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		rodTarydiumAlloyUnrefined = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.ROD_TARYDIUM_ALLOY_UNREFINED)
				.setMaxStackSize(64).setFull3D()
				.setCreativeTab(null);
		
		rodTarydiumAlloyRefined = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.ROD_TARYDIUM_ALLOY_REFINED)
				.setMaxStackSize(64).setFull3D()
				.setCreativeTab(null);
		
		rodIron = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.ROD_IRON)
				.setMaxStackSize(64).setFull3D()
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		rodTitanium = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.ROD_TITANIUM)
				.setMaxStackSize(64).setFull3D()
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		rodGold = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.ROD_GOLD)
				.setMaxStackSize(64).setFull3D()
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		lensTarydium = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.LENS_TARYDIUM)
				.setMaxStackSize(16)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		coreInvulnerability = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.CORE_INVULNERABILITY)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		slimeballBlack = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.SLIMEBALL_BLACK)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		//food
		appleCompressed1x = 
				new ItemFoodUnreal(5, 0.6F, false, 32+(8*1))
				.setUnlocalizedName(Names.Items.APPLE_COMPRESSED_1X)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		appleCompressed2x = 
				new ItemFoodUnreal(6, 0.9F, false, 32+(8*2))
				.setUnlocalizedName(Names.Items.APPLE_COMPRESSED_2X)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		appleCompressed3x = 
				new ItemFoodUnreal(7, 1.2F, false, 32+(8*3))
				.setUnlocalizedName(Names.Items.APPLE_COMPRESSED_3X)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		appleCompressed4x = 
				new ItemFoodUnreal(8, 1.5F, false, 32+(8*4))
				.setUnlocalizedName(Names.Items.APPLE_COMPRESSED_4X)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		//fluid containers
		bucketMercury = 
				new ItemUnreal()//new ItemBucketUnreal(ModFluids.fluidBlockMercury)
				.setUnlocalizedName(Names.Items.BUCKET_MERCURY)
				.setMaxStackSize(1).setContainerItem(Items.bucket)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		//TODO Note: Radioactive
		bucketTarydiumSludge = 
				new ItemUnreal()//new ItemBucketUnreal(ModFluids.fluidBlockTarydiumSludge)
				.setUnlocalizedName(Names.Items.BUCKET_TARYDIUM_SLUDGE)
				.setMaxStackSize(1).setContainerItem(Items.bucket)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		bucketHealth = 
				new ItemUnreal()//new ItemBucketUnreal(ModFluids.fluidBlockHealth)
				.setUnlocalizedName(Names.Items.BUCKET_HEALTH)
				.setMaxStackSize(1).setContainerItem(Items.bucket)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		bucketNanoblack = 
				new ItemUnreal()//new ItemBucketUnreal(ModFluids.fluidBlockNanoblack)
				.setUnlocalizedName(Names.Items.BUCKET_NANOBLACK)
				.setMaxStackSize(1).setContainerItem(Items.bucket)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		//tools
		debugTool = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.DEBUG_TOOL)
				.setMaxStackSize(16)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		forceField = 
				new ItemForceField(UnrealBlocks.blockForceField)
				.setDamagePerPlace(100)
				.setMaxDamage((1*100)+1)
				.setUnlocalizedName(Names.Items.FORCE_FIELD)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		voiceBox = 
				new ItemVoiceBox()
				.setUnlocalizedName(Names.Items.VOICE_BOX)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		universalTranslator = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.UNIVERSAL_TRANSLATOR)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		recordLongFlight = 
				new ItemRecordUnreal(Names.Items.RECORD_LONG_FLIGHT_MUSIC)
				.setUnlocalizedName(Names.Items.RECORD_LONG_FLIGHT)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		swordTitanium = 
				new ItemSwordUnreal(Materials.Tools.TITANIUM)
				.setUnlocalizedName(Names.Items.SWORD_TITANIUM)
				.setMaxStackSize(1).setFull3D()
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		pickaxeTitanium = 
				new ItemPickaxeUnreal(Materials.Tools.TITANIUM, 2.0F)
				.setUnlocalizedName(Names.Items.PICK_TITANIUM)
				.setMaxStackSize(1).setFull3D()
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		shovelTitanium = 
				new ItemShovelUnreal(Materials.Tools.TITANIUM, 1.0F)
				.setUnlocalizedName(Names.Items.SHOVEL_TITANIUM)
				.setMaxStackSize(1).setFull3D()
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		axeTitanium = 
				new ItemAxeUnreal(Materials.Tools.TITANIUM, 3.0F)
				.setUnlocalizedName(Names.Items.AXE_TITANIUM)
				.setMaxStackSize(1).setFull3D()
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		hoeTitanium = 
				new ItemHoeUnreal(Materials.Tools.TITANIUM)
				.setUnlocalizedName(Names.Items.HOE_TITANIUM)
				.setMaxStackSize(1).setFull3D()
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		swordTarydiumAlloyRefined = 
				new ItemSwordUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED)
				.setUnlocalizedName(Names.Items.SWORD_TARYDIUM_ALLOY_REFINED)
				.setMaxStackSize(1).setFull3D()
				.setCreativeTab(null);
		
		pickaxeTarydiumAlloyRefined = 
				new ItemPickaxeUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED, 2.0F)
				.setUnlocalizedName(Names.Items.PICK_TARYDIUM_ALLOY_REFINED)
				.setMaxStackSize(1).setFull3D()
				.setCreativeTab(null);
		
		shovelTarydiumAlloyRefined = 
				new ItemShovelUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED, 1.0F)
				.setUnlocalizedName(Names.Items.SHOVEL_TARYDIUM_ALLOY_REFINED)
				.setMaxStackSize(1).setFull3D()
				.setCreativeTab(null);
		
		axeTarydiumAlloyRefined = 
				new ItemAxeUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED, 3.0F)
				.setUnlocalizedName(Names.Items.AXE_TARYDIUM_ALLOY_REFINED)
				.setMaxStackSize(1).setFull3D()
				.setCreativeTab(null);
		
		hoeTarydiumAlloyRefined = 
				new ItemHoeUnreal(Materials.Tools.TARYDIUM_ALLOY_REFINED)
				.setUnlocalizedName(Names.Items.HOE_TARYDIUM_ALLOY_REFINED)
				.setMaxStackSize(1).setFull3D()
				.setCreativeTab(null);
		
		//special armor
		armorSCUBAGear = 
				new ItemArmorSCUBAGear(ItemArmor.ArmorMaterial.GOLD, Reference.Armor.Render.IRON, Reference.Armor.Type.HELMET)
				.setUnlocalizedName(Names.Items.SCUBA_GEAR)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		armorShieldBelt = 
				new ItemArmorShieldBelt(Materials.Armor.SHIELD, Reference.Armor.Render.GOLD, Reference.Armor.Type.LEGGINGS)
				.setUnlocalizedName(Names.Items.SHIELD_BELT)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		armorToxinSuit = 
				new ItemArmorToxinSuit(ItemArmor.ArmorMaterial.CHAIN, Reference.Armor.Render.IRON, Reference.Armor.Type.CHESTPLATE)
				.setUnlocalizedName(Names.Items.TOXIN_SUIT)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		armorAsbestosSuit = 
				new ItemArmorAsbestosSuit(ItemArmor.ArmorMaterial.CHAIN, Reference.Armor.Render.CHAIN, Reference.Armor.Type.CHESTPLATE)
				.setUnlocalizedName(Names.Items.ASBESTOS_SUIT)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		armorJumpBoots = 
				new ItemArmorJumpBoots(ItemArmor.ArmorMaterial.IRON, Reference.Armor.Render.IRON, Reference.Armor.Type.BOOTS)
				.setUnlocalizedName(Names.Items.JUMP_BOOTS)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		//regular armor
		armorHelmetTitanium = 
				new ItemArmorUnrealBase(Materials.Armor.TITANIUM, Reference.Armor.Render.IRON, Reference.Armor.Type.HELMET)
				.setUnlocalizedName(Names.Items.HELMET_TITANIUM)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		armorChestplateTitanium = 
				new ItemArmorUnrealBase(Materials.Armor.TITANIUM, Reference.Armor.Render.IRON, Reference.Armor.Type.CHESTPLATE)
				.setUnlocalizedName(Names.Items.CHESTPLATE_TITANIUM)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		armorLeggingsTitanium = 
				new ItemArmorUnrealBase(Materials.Armor.TITANIUM, Reference.Armor.Render.IRON, Reference.Armor.Type.LEGGINGS)
				.setUnlocalizedName(Names.Items.LEGGINGS_TITANIUM)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		armorBootsTitanium = 
				new ItemArmorUnrealBase(Materials.Armor.TITANIUM, Reference.Armor.Render.IRON, Reference.Armor.Type.BOOTS)
				.setUnlocalizedName(Names.Items.BOOTS_TITANIUM)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		armorHelmetSlime = 
				new ItemArmorSlime(Materials.Armor.SLIME, Reference.Armor.Render.LEATHER, Reference.Armor.Type.HELMET)
				.setUnlocalizedName(Names.Items.HELMET_SLIME)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		armorChestplateSlime = 
				new ItemArmorSlime(Materials.Armor.SLIME, Reference.Armor.Render.LEATHER, Reference.Armor.Type.CHESTPLATE)
				.setUnlocalizedName(Names.Items.CHESTPLATE_SLIME)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		armorLeggingsSlime = 
				new ItemArmorSlime(Materials.Armor.SLIME, Reference.Armor.Render.LEATHER, Reference.Armor.Type.LEGGINGS)
				.setUnlocalizedName(Names.Items.LEGGINGS_SLIME)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		armorBootsSlime = 
				new ItemArmorSlime(Materials.Armor.SLIME, Reference.Armor.Render.LEATHER, Reference.Armor.Type.BOOTS)
				.setUnlocalizedName(Names.Items.BOOTS_SLIME)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		armorInvulnerability = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.INVULNERABILITY)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		//ammo
		ammoEightball = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.AMMO_EIGHTBALL)
				.setMaxStackSize(16)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		ammoFlakShell = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.AMMO_FLAK_SHELL)
				.setMaxStackSize(16)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		ammoWarhead = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.AMMO_WARHEAD)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		//vanilla item dusts
		dustCoal = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_COAL)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustCharcoal = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_CHARCOAL)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustIron = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_IRON)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustLapis = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_LAPIS)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustGold = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_GOLD)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustNetherQuartz = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_NETHER_QUARTZ)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustDiamond = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_DIAMOND)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustEmerald = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_EMERALD)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustObsidian = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_OBSIDIAN)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		//tiny dusts
		dustTitaniumTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_TITANIUM_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustRutileTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_RUTILE_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustMagnesiumTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_MAGNESIUM_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustCinnabarTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_CINNABAR_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustAsbestosTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_ASBESTOS_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustTarydiumAlloyUnrefinedTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_TARYDIUM_ALLOY_UNREFINED_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(null);
		
		dustTarydiumAlloyRefinedTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_TARYDIUM_ALLOY_REFINED_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(null);
		
		dustCoalTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_COAL_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustCharcoalTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_CHARCOAL_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustIronTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_IRON_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustLapisTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_LAPIS_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustGoldTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_GOLD_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustRedstoneTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_REDSTONE_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustGlowstoneTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_GLOWSTONE_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustNetherQuartzTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_NETHER_QUARTZ_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustDiamondTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_DIAMOND_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustEmeraldTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_EMERALD_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustObsidianTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_OBSIDIAN_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustLithiumTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_LITHIUM_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		dustGunpowderTiny = 
				new ItemDustUnreal()
				.setUnlocalizedName(Names.Items.DUST_GUNPOWDER_TINY)
				.setMaxStackSize(64)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		//weapons
		gunTranslocator = 
				new ItemWeaponTranslocator(new ItemStack(UnrealItems.translocatorDisc, 0, 1), 101)
				.setDamageOnCraft(1)
				.setUnlocalizedName(Names.Items.GUN_TRANSLOCATOR)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		gunDispersionPistol = 
				new ItemWeaponBase(new ItemStack(UnrealItems.dispersionUpgrade, 0, 1), 5001, 7)
				.setDamageOnCraft(1)
				.setUnlocalizedName(Names.Items.GUN_DISPERSION_PISTOL)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		meleeChainsaw = 
				new ItemWeaponBase(new ItemStack(UnrealItems.chainLink, 0, 1), 101, 20)
				.setDamageOnCraft(1)
				.setUnlocalizedName(Names.Items.MELEE_CHAINSAW)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		gunStinger = 
				new ItemWeaponBase(new ItemStack(UnrealItems.shardTarydium, 0, 1), 101, 5)
				.setDamageOnCraft(100-9+1)
				.setUnlocalizedName(Names.Items.GUN_STINGER)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		gunFlakCannon = 
				new ItemWeaponBase(new ItemStack(UnrealItems.ammoFlakShell, 0, 1), 51, 22)
				.setDamageOnCraft(50-5+1)
				.setUnlocalizedName(Names.Items.GUN_FLAK)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		gunEightballLauncher = 
				new ItemWeaponBase(new ItemStack(UnrealItems.ammoEightball, 0, 1), 49, 18)
				.setDamageOnCraft(48)
				.setUnlocalizedName(Names.Items.GUN_EIGHTBALL)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		gunRedeemer = 
				new ItemWeaponBase(new ItemStack(UnrealItems.ammoWarhead, 0, 1), 101, 20)
				.setDamageOnCraft(1)
				.setUnlocalizedName(Names.Items.GUN_REDEEMER)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		//health
		healthSuperEmpty = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.HEALTH_SUPER_EMPTY)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		healthSuper = 
				new ItemUnreal()
				.setUnlocalizedName(Names.Items.HEALTH_SUPER)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		//misc pickups
		invisibility = 
				new ItemUnrealDamageable()
				.setDamageOnCraft(1).setMaxDamage(101)
				.setUnlocalizedName(Names.Items.INVISIBILITY)
				.setMaxStackSize(1)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	public static void register()
	{
		//ore materials, metals, gems, alloys
		GameRegistry.registerItem(ingotTitanium, Names.Items.INGOT_TITANIUM);
		GameRegistry.registerItem(nuggetTitanium, Names.Items.NUGGET_TITANIUM);
		GameRegistry.registerItem(dustTitanium, Names.Items.DUST_TITANIUM);
		GameRegistry.registerItem(ingotRutile, Names.Items.INGOT_RUTILE);
		GameRegistry.registerItem(nuggetRutile, Names.Items.NUGGET_RUTILE);
		GameRegistry.registerItem(dustRutile, Names.Items.DUST_RUTILE);
		GameRegistry.registerItem(ingotMagnesium, Names.Items.INGOT_MAGNESIUM);
		GameRegistry.registerItem(nuggetMagnesium, Names.Items.NUGGET_MAGNESIUM);
		GameRegistry.registerItem(dustMagnesium, Names.Items.DUST_MAGNESIUM);
		GameRegistry.registerItem(gemTarydium, Names.Items.GEM_TARYDIUM);
		GameRegistry.registerItem(shardTarydium, Names.Items.SHARD_TARYDIUM);
		GameRegistry.registerItem(crystalCinnabar, Names.Items.CRYSTAL_CINNABAR);
		GameRegistry.registerItem(dustCinnabar, Names.Items.DUST_CINNABAR);
		GameRegistry.registerItem(dustAsbestos, Names.Items.DUST_ASBESTOS);
		GameRegistry.registerItem(nuggetIron, Names.Items.NUGGET_IRON);
		GameRegistry.registerItem(ingotBedrockium, Names.Items.INGOT_BEDROCKIUM);
		GameRegistry.registerItem(nuggetBedrockium, Names.Items.NUGGET_BEDROCKIUM);
		GameRegistry.registerItem(ingotTarydiumAlloyUnrefined, Names.Items.INGOT_TARYDIUM_ALLOY_UNREFINED);
		GameRegistry.registerItem(nuggetTarydiumAlloyUnrefined, Names.Items.NUGGET_TARYDIUM_ALLOY_UNREFINED);
		GameRegistry.registerItem(dustTarydiumAlloyUnrefined, Names.Items.DUST_TARYDIUM_ALLOY_UNREFINED);
		GameRegistry.registerItem(ingotTarydiumAlloyRefined, Names.Items.INGOT_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(nuggetTarydiumAlloyRefined, Names.Items.NUGGET_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(dustTarydiumAlloyRefined, Names.Items.DUST_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(ingotLithium, Names.Items.INGOT_LITHIUM);
		GameRegistry.registerItem(nuggetLithium, Names.Items.NUGGET_LITHIUM);
		GameRegistry.registerItem(dustLithium, Names.Items.DUST_LITHIUM);
		
		//components
		GameRegistry.registerItem(caseIron, Names.Items.CASE_IRON);
		GameRegistry.registerItem(caseTitanium, Names.Items.CASE_TITANIUM);
		GameRegistry.registerItem(gunBarrelIron, Names.Items.GUN_BARREL_IRON);
		GameRegistry.registerItem(gunBarrelIronLarge, Names.Items.GUN_BARREL_IRON_LARGE);
		GameRegistry.registerItem(weaponCasingBasic, Names.Items.WEAPON_CASING_BASIC);
		GameRegistry.registerItem(weaponCasingAdv, Names.Items.WEAPON_CASING_ADVANCED);
		GameRegistry.registerItem(tarydPowerBasic, Names.Items.TARYDIUM_POWER);
		GameRegistry.registerItem(chainLink, Names.Items.CHAIN_LINK);
		GameRegistry.registerItem(ribbonMagnesium, Names.Items.RIBBON_MAGNESIUM);
		GameRegistry.registerItem(chainsawBlade, Names.Items.CHAINSAW_BLADE);
		GameRegistry.registerItem(chainsawBladeHardened, Names.Items.CHAINSAW_BLADE_HARDENED);
		GameRegistry.registerItem(chainsawMotor, Names.Items.CHAINSAW_MOTOR);
		GameRegistry.registerItem(SCUBATankEmpty, Names.Items.SCUBA_TANK_EMPTY);
		GameRegistry.registerItem(SCUBATankOxygen, Names.Items.SCUBA_TANK_OXYGEN);
		GameRegistry.registerItem(flak, Names.Items.FLAK);
		GameRegistry.registerItem(flakShellCold, Names.Items.FLAK_SHELL_COLD);
		GameRegistry.registerItem(flakShellWarm, Names.Items.FLAK_SHELL_WARM);
		GameRegistry.registerItem(translocatorDisc, Names.Items.TRANSLOCATOR_DISC);
		GameRegistry.registerItem(dispersionUpgrade, Names.Items.DISPERSION_UPGRADE);
		GameRegistry.registerItem(warheadCone, Names.Items.WARHEAD_CONE);
		GameRegistry.registerItem(warheadBody, Names.Items.WARHEAD_BODY);
		GameRegistry.registerItem(warheadThruster, Names.Items.WARHEAD_THRUSTER);
		GameRegistry.registerItem(rodTarydiumAlloyUnrefined, Names.Items.ROD_TARYDIUM_ALLOY_UNREFINED);
		GameRegistry.registerItem(rodTarydiumAlloyRefined, Names.Items.ROD_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(rodIron, Names.Items.ROD_IRON);
		GameRegistry.registerItem(rodTitanium, Names.Items.ROD_TITANIUM);
		GameRegistry.registerItem(rodGold, Names.Items.ROD_GOLD);
		GameRegistry.registerItem(lensTarydium, Names.Items.LENS_TARYDIUM);
		GameRegistry.registerItem(coreInvulnerability, Names.Items.CORE_INVULNERABILITY);
		GameRegistry.registerItem(slimeballBlack, Names.Items.SLIMEBALL_BLACK);
		
		//food
		GameRegistry.registerItem(appleCompressed1x, Names.Items.APPLE_COMPRESSED_1X);
		GameRegistry.registerItem(appleCompressed2x, Names.Items.APPLE_COMPRESSED_2X);
		GameRegistry.registerItem(appleCompressed3x, Names.Items.APPLE_COMPRESSED_3X);
		GameRegistry.registerItem(appleCompressed4x, Names.Items.APPLE_COMPRESSED_4X);
		
		//fluid containers
		GameRegistry.registerItem(bucketMercury, Names.Items.BUCKET_MERCURY);
		GameRegistry.registerItem(bucketTarydiumSludge, Names.Items.BUCKET_TARYDIUM_SLUDGE);
		GameRegistry.registerItem(bucketHealth, Names.Items.BUCKET_HEALTH);
		GameRegistry.registerItem(bucketNanoblack, Names.Items.BUCKET_NANOBLACK);
		
		//tools
		GameRegistry.registerItem(debugTool, Names.Items.DEBUG_TOOL);
		GameRegistry.registerItem(forceField, Names.Items.FORCE_FIELD);
		GameRegistry.registerItem(voiceBox, Names.Items.VOICE_BOX);
		GameRegistry.registerItem(universalTranslator, Names.Items.UNIVERSAL_TRANSLATOR);
		GameRegistry.registerItem(recordLongFlight, Names.Items.RECORD_LONG_FLIGHT);
		GameRegistry.registerItem(swordTitanium, Names.Items.SWORD_TITANIUM);
		GameRegistry.registerItem(pickaxeTitanium, Names.Items.PICK_TITANIUM);
		GameRegistry.registerItem(shovelTitanium, Names.Items.SHOVEL_TITANIUM);
		GameRegistry.registerItem(axeTitanium, Names.Items.AXE_TITANIUM);
		GameRegistry.registerItem(hoeTitanium, Names.Items.HOE_TITANIUM);
		GameRegistry.registerItem(swordTarydiumAlloyRefined, Names.Items.SWORD_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(pickaxeTarydiumAlloyRefined, Names.Items.PICK_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(shovelTarydiumAlloyRefined, Names.Items.SHOVEL_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(axeTarydiumAlloyRefined, Names.Items.AXE_TARYDIUM_ALLOY_REFINED);
		GameRegistry.registerItem(hoeTarydiumAlloyRefined, Names.Items.HOE_TARYDIUM_ALLOY_REFINED);
		
		//armor
		GameRegistry.registerItem(armorSCUBAGear, Names.Items.SCUBA_GEAR);
		GameRegistry.registerItem(armorShieldBelt, Names.Items.SHIELD_BELT);
		GameRegistry.registerItem(armorToxinSuit, Names.Items.TOXIN_SUIT);
		GameRegistry.registerItem(armorAsbestosSuit, Names.Items.ASBESTOS_SUIT);
		GameRegistry.registerItem(armorJumpBoots, Names.Items.JUMP_BOOTS);
		GameRegistry.registerItem(armorHelmetTitanium, Names.Items.HELMET_TITANIUM);
		GameRegistry.registerItem(armorChestplateTitanium, Names.Items.CHESTPLATE_TITANIUM);
		GameRegistry.registerItem(armorLeggingsTitanium, Names.Items.LEGGINGS_TITANIUM);
		GameRegistry.registerItem(armorBootsTitanium, Names.Items.BOOTS_TITANIUM);
		GameRegistry.registerItem(armorHelmetSlime, Names.Items.HELMET_SLIME);
		GameRegistry.registerItem(armorChestplateSlime, Names.Items.CHESTPLATE_SLIME);
		GameRegistry.registerItem(armorLeggingsSlime, Names.Items.LEGGINGS_SLIME);
		GameRegistry.registerItem(armorBootsSlime, Names.Items.BOOTS_SLIME);
		GameRegistry.registerItem(armorInvulnerability, Names.Items.INVULNERABILITY);
		
		//ammo
		GameRegistry.registerItem(ammoEightball, Names.Items.AMMO_EIGHTBALL);
		GameRegistry.registerItem(ammoFlakShell, Names.Items.AMMO_FLAK_SHELL);
		GameRegistry.registerItem(ammoWarhead, Names.Items.AMMO_WARHEAD);
		
		//vanilla item dusts
		GameRegistry.registerItem(dustCoal, Names.Items.DUST_COAL);
		GameRegistry.registerItem(dustCharcoal, Names.Items.DUST_CHARCOAL);
		GameRegistry.registerItem(dustIron, Names.Items.DUST_IRON);
		GameRegistry.registerItem(dustLapis, Names.Items.DUST_LAPIS);
		GameRegistry.registerItem(dustGold, Names.Items.DUST_GOLD);
		GameRegistry.registerItem(dustNetherQuartz, Names.Items.DUST_NETHER_QUARTZ);
		GameRegistry.registerItem(dustDiamond, Names.Items.DUST_DIAMOND);
		GameRegistry.registerItem(dustEmerald, Names.Items.DUST_EMERALD);
		GameRegistry.registerItem(dustObsidian, Names.Items.DUST_OBSIDIAN);

		//tiny dusts
		GameRegistry.registerItem(dustTitaniumTiny, Names.Items.DUST_TITANIUM_TINY);
		GameRegistry.registerItem(dustRutileTiny, Names.Items.DUST_RUTILE_TINY);
		GameRegistry.registerItem(dustMagnesiumTiny, Names.Items.DUST_MAGNESIUM_TINY);
		GameRegistry.registerItem(dustCinnabarTiny, Names.Items.DUST_CINNABAR_TINY);
		GameRegistry.registerItem(dustAsbestosTiny, Names.Items.DUST_ASBESTOS_TINY);
		GameRegistry.registerItem(dustTarydiumAlloyUnrefinedTiny, Names.Items.DUST_TARYDIUM_ALLOY_UNREFINED_TINY);
		GameRegistry.registerItem(dustTarydiumAlloyRefinedTiny, Names.Items.DUST_TARYDIUM_ALLOY_REFINED_TINY);
		GameRegistry.registerItem(dustCoalTiny, Names.Items.DUST_COAL_TINY);
		GameRegistry.registerItem(dustCharcoalTiny, Names.Items.DUST_CHARCOAL_TINY);
		GameRegistry.registerItem(dustIronTiny, Names.Items.DUST_IRON_TINY);
		GameRegistry.registerItem(dustLapisTiny, Names.Items.DUST_LAPIS_TINY);
		GameRegistry.registerItem(dustGoldTiny, Names.Items.DUST_GOLD_TINY);
		GameRegistry.registerItem(dustRedstoneTiny, Names.Items.DUST_REDSTONE_TINY);
		GameRegistry.registerItem(dustGlowstoneTiny, Names.Items.DUST_GLOWSTONE_TINY);
		GameRegistry.registerItem(dustNetherQuartzTiny, Names.Items.DUST_NETHER_QUARTZ_TINY);
		GameRegistry.registerItem(dustDiamondTiny, Names.Items.DUST_DIAMOND_TINY);
		GameRegistry.registerItem(dustEmeraldTiny, Names.Items.DUST_EMERALD_TINY);
		GameRegistry.registerItem(dustObsidianTiny, Names.Items.DUST_OBSIDIAN_TINY);
		GameRegistry.registerItem(dustLithiumTiny, Names.Items.DUST_LITHIUM_TINY);
		GameRegistry.registerItem(dustGunpowderTiny, Names.Items.DUST_GUNPOWDER_TINY);
		
		//weapons
		GameRegistry.registerItem(gunTranslocator, Names.Items.GUN_TRANSLOCATOR);
		GameRegistry.registerItem(gunDispersionPistol, Names.Items.GUN_DISPERSION_PISTOL);
		GameRegistry.registerItem(meleeChainsaw, Names.Items.MELEE_CHAINSAW);
		GameRegistry.registerItem(gunStinger, Names.Items.GUN_STINGER);
		GameRegistry.registerItem(gunFlakCannon, Names.Items.GUN_FLAK);
		GameRegistry.registerItem(gunEightballLauncher, Names.Items.GUN_EIGHTBALL);
		GameRegistry.registerItem(gunRedeemer, Names.Items.GUN_REDEEMER);
		
		//health
		GameRegistry.registerItem(healthSuperEmpty, Names.Items.HEALTH_SUPER_EMPTY);
		GameRegistry.registerItem(healthSuper, Names.Items.HEALTH_SUPER);
		
		//misc pickups
		GameRegistry.registerItem(invisibility, Names.Items.INVISIBILITY);
	}
	
	public static void registerRenders()
	{
		//ore materials, metals, gems, alloys
		registerRender(ingotTitanium);
		registerRender(nuggetTitanium);
		registerRender(dustTitanium);
		registerRender(ingotRutile);
		registerRender(nuggetRutile);
		registerRender(dustRutile);
		registerRender(ingotMagnesium);
		registerRender(nuggetMagnesium);
		registerRender(dustMagnesium);
		registerRender(gemTarydium);
		registerRender(shardTarydium);
		registerRender(crystalCinnabar);
		registerRender(dustCinnabar);
		registerRender(dustAsbestos);
		registerRender(nuggetIron);
		registerRender(ingotBedrockium);
		registerRender(nuggetBedrockium);
		registerRender(ingotTarydiumAlloyUnrefined);
		registerRender(nuggetTarydiumAlloyUnrefined);
		registerRender(dustTarydiumAlloyUnrefined);
		registerRender(ingotTarydiumAlloyRefined);
		registerRender(nuggetTarydiumAlloyRefined);
		registerRender(dustTarydiumAlloyRefined);
		registerRender(ingotLithium);
		registerRender(nuggetLithium);
		registerRender(dustLithium);
		
		//components
		registerRender(caseIron);
		registerRender(caseTitanium);
		registerRender(gunBarrelIron);
		registerRender(gunBarrelIronLarge);
		registerRender(weaponCasingBasic);
		registerRender(weaponCasingAdv);
		registerRender(tarydPowerBasic);
		registerRender(chainLink);
		registerRender(ribbonMagnesium);
		registerRender(chainsawBlade);
		registerRender(chainsawBladeHardened);
		registerRender(chainsawMotor);
		registerRender(SCUBATankEmpty);
		registerRender(SCUBATankOxygen);
		registerRender(flak);
		registerRender(flakShellCold);
		registerRender(flakShellWarm);
		registerRender(translocatorDisc);
		registerRender(dispersionUpgrade);
		registerRender(warheadCone);
		registerRender(warheadBody);
		registerRender(warheadThruster);
		registerRender(rodTarydiumAlloyUnrefined);
		registerRender(rodTarydiumAlloyRefined);
		registerRender(rodIron);
		registerRender(rodTitanium);
		registerRender(rodGold);
		registerRender(lensTarydium);
		registerRender(coreInvulnerability);
		registerRender(slimeballBlack);
		
		//fluid containers
		registerRender(bucketMercury);
		registerRender(bucketTarydiumSludge);
		registerRender(bucketHealth);
		registerRender(bucketNanoblack);
		
		//food
		registerRender(appleCompressed1x);
		registerRender(appleCompressed2x);
		registerRender(appleCompressed3x);
		registerRender(appleCompressed4x);
		
		//tools
		registerRender(debugTool);
		registerRender(forceField);
		registerRender(voiceBox);
		registerRender(universalTranslator);
		registerRender(recordLongFlight);
		registerRender(swordTitanium);
		registerRender(pickaxeTitanium);
		registerRender(shovelTitanium);
		registerRender(axeTitanium);
		registerRender(hoeTitanium);
		registerRender(swordTarydiumAlloyRefined);
		registerRender(pickaxeTarydiumAlloyRefined);
		registerRender(shovelTarydiumAlloyRefined);
		registerRender(axeTarydiumAlloyRefined);
		registerRender(hoeTarydiumAlloyRefined);
		
		//armor
		registerRender(armorSCUBAGear);
		registerRender(armorShieldBelt);
		registerRender(armorToxinSuit);
		registerRender(armorAsbestosSuit);
		registerRender(armorJumpBoots);
		registerRender(armorHelmetTitanium);
		registerRender(armorChestplateTitanium);
		registerRender(armorLeggingsTitanium);
		registerRender(armorBootsTitanium);
		registerRender(armorHelmetSlime);
		registerRender(armorChestplateSlime);
		registerRender(armorLeggingsSlime);
		registerRender(armorBootsSlime);
		registerRender(armorInvulnerability);
		
		//ammo
		registerRender(ammoEightball);
		registerRender(ammoFlakShell);
		registerRender(ammoWarhead);
		
		//vanilla item dusts
		registerRender(dustCoal);
		registerRender(dustCharcoal);
		registerRender(dustIron);
		registerRender(dustLapis);
		registerRender(dustGold);
		registerRender(dustNetherQuartz);
		registerRender(dustDiamond);
		registerRender(dustEmerald);
		registerRender(dustObsidian);

		//tiny dusts
		registerRender(dustTitaniumTiny);
		registerRender(dustRutileTiny);
		registerRender(dustMagnesiumTiny);
		registerRender(dustCinnabarTiny);
		registerRender(dustAsbestosTiny);
		registerRender(dustTarydiumAlloyUnrefinedTiny);
		registerRender(dustTarydiumAlloyRefinedTiny);
		registerRender(dustCoalTiny);
		registerRender(dustCharcoalTiny);
		registerRender(dustIronTiny);
		registerRender(dustLapisTiny);
		registerRender(dustGoldTiny);
		registerRender(dustRedstoneTiny);
		registerRender(dustGlowstoneTiny);
		registerRender(dustNetherQuartzTiny);
		registerRender(dustDiamondTiny);
		registerRender(dustEmeraldTiny);
		registerRender(dustObsidianTiny);
		registerRender(dustLithiumTiny);
		registerRender(dustGunpowderTiny);
		
		//weapons
		registerRender(gunTranslocator);
		registerRender(gunDispersionPistol);
		registerRender(meleeChainsaw);
		registerRender(gunStinger);
		registerRender(gunFlakCannon);
		registerRender(gunEightballLauncher);
		registerRender(gunRedeemer);
		
		//health
		registerRender(healthSuperEmpty);
		registerRender(healthSuper);
		
		//misc pickups
		registerRender(invisibility);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
