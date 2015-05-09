package com.virtuoel.unreal.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.virtuoel.unreal.block.BlockBedrockium;
import com.virtuoel.unreal.block.BlockCactusTarydium;
import com.virtuoel.unreal.block.BlockEnderCrystal;
import com.virtuoel.unreal.block.BlockForceField;
import com.virtuoel.unreal.block.BlockIronLadder;
import com.virtuoel.unreal.block.BlockNetherWartStorage;
import com.virtuoel.unreal.block.BlockOreUnreal;
import com.virtuoel.unreal.block.BlockSlimeUnreal;
import com.virtuoel.unreal.block.BlockUnreal;
import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.item.ItemBlockPlacer;
import com.virtuoel.unreal.reference.Materials;
import com.virtuoel.unreal.reference.Names;
import com.virtuoel.unreal.reference.Reference;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class UnrealBlocks
{
	
	//blocks
	public static Block blockTitanium;
	public static Block blockRutile;
	public static Block oreRutile;
	public static Block blockMagnesium;
	public static Block oreMagnesium;
	public static Block blockTarydium;
	public static Block oreTarydium;
	public static Block oreTarydiumNether;
	public static Block oreTarydiumEnd;
	public static Block oreTarydiumObsidian;
	public static Block blockCommandCosmetic;
	public static Block blockBedrockium;
	public static Block oreBedrockium;
	public static Block oreBedrockiumHidden;
	public static Block blockAsbestos;
	public static Block oreAsbestos;
	public static Block blockLithium;
	public static Block cactusTarydium;
	public static Block ladderIron;
	public static Block cobblestonePaved;
	public static Block stonePolished;
	public static Block obsidianNether;
	public static Block netherrackCompressed1x;
	public static Block netherrackCompressed2x;
	public static Block netherrackCompressed3x;
	public static Block netherrackCompressed4x;
	public static Block endStoneCompressed1x;
	public static Block endStoneCompressed2x;
	public static Block endStoneCompressed3x;
	public static Block endStoneCompressed4x;
	public static Block blockCinnabar;
	public static Block blockUUTC;
	public static Block blockTarydiumAlloyUnrefined;
	public static Block blockTarydiumAlloyRefined;
	public static Block blockEnderCrystal;
	public static Block blockFlint;
	public static Block blockCharcoal;
	public static Block blockGunpowder;
	public static Block blockEnder;
	public static Block blockLeather;
	public static Block blockBlaze;
	public static Block blockGhastTear;
	public static Block blockNetherWart;
	public static Block blockCocoa;
	public static Block blockInk;
	public static Block blockForceField;
	public static Block blockTarydiumFieldCollector;
	public static Block blockTarydiumFieldEmitter;
	public static Block blockTarydiumFieldRelay;
	public static Block blockTarydiumFieldStasis;
	public static Block blockTarydiumCrystal;
	public static Block blockGoldCorrugated;
	public static Block blockDiamondCorrugated;
	public static Block blockIronSmooth;
	public static Block blockMachineFrameBasic;
	public static Block blockSlimeBlack;
	
	public static void init()
	{
		//blocks
		blockTitanium = 
				new BlockUnreal(Material.iron)
				.setUnlocalizedName(Names.Blocks.BLOCK_TITANIUM)
				.setHardness(5.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockRutile = 
				new BlockUnreal(Material.iron)
				.setUnlocalizedName(Names.Blocks.BLOCK_RUTILE)
				.setHardness(5.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		oreRutile = 
				new BlockOreUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.ORE_RUTILE)
				.setHardness(3.0F).setResistance(5.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockMagnesium = 
				new BlockUnreal(Material.iron)
				.setUnlocalizedName(Names.Blocks.BLOCK_MAGNESIUM)
				.setHardness(5.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		oreMagnesium = 
				new BlockOreUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.ORE_MAGNESIUM)
				.setHardness(3.0F).setResistance(5.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockTarydium = 
				new BlockUnreal(Materials.Blocks.tarydium)
				.setUnlocalizedName(Names.Blocks.BLOCK_TARYDIUM)
				.setHardness(6.0F).setResistance(1000.0F)
				.setStepSound(Block.soundTypeGlass)
				.setLightLevel(1.0F)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		oreTarydium = 
				new BlockOreUnreal(Materials.Blocks.tarydium)
				.setUnlocalizedName(Names.Blocks.ORE_TARYDIUM)
				.setHardness(6.0F).setResistance(1000.0F)
				.setStepSound(Block.soundTypeStone)
				.setLightLevel(0.625F)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		oreTarydiumNether = 
				new BlockOreUnreal(Materials.Blocks.tarydium)
				.setUnlocalizedName(Names.Blocks.ORE_TARYDIUM_NETHER)
				.setHardness(3.0F).setResistance(1000.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		oreTarydiumEnd = 
				new BlockOreUnreal(Materials.Blocks.tarydium)
				.setUnlocalizedName(Names.Blocks.ORE_TARYDIUM_END)
				.setHardness(12.0F).setResistance(1000.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		oreTarydiumObsidian = 
				new BlockOreUnreal(Materials.Blocks.tarydium)
				.setUnlocalizedName(Names.Blocks.ORE_TARYDIUM_OBSIDIAN)
				.setHardness(50.0F).setResistance(1000.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockBedrockium = 
				new BlockBedrockium(Materials.Blocks.bedrock)
				.setUnlocalizedName(Names.Blocks.BLOCK_BEDROCKIUM)
				.setHardness(1000.0F).setResistance(500000.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(null);
		
		oreBedrockium = 
				new BlockBedrockium(Materials.Blocks.bedrock)
				.setUnlocalizedName(Names.Blocks.ORE_BEDROCKIUM)
				.setHardness(1000.0F).setResistance(500000.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(null);
		
		oreBedrockiumHidden = 
				new BlockBedrockium(Materials.Blocks.bedrock)
				.setUnlocalizedName(Names.Blocks.ORE_BEDROCKIUM_HIDDEN)
				.setBlockUnbreakable().setResistance(8000000.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(null);
		
		blockCommandCosmetic = 
				new BlockUnreal(Materials.Blocks.bedrock)
				.setUnlocalizedName(Names.Blocks.BLOCK_COMMAND_COSMETIC)
				.setHardness(1000.0F).setResistance(500000.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(null);
		
		blockAsbestos = 
				new BlockUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.BLOCK_ASBESTOS)
				.setHardness(3.0F).setResistance(5.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		oreAsbestos = 
				new BlockOreUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.ORE_ASBESTOS)
				.setHardness(3.0F).setResistance(5.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockLithium = 
				new BlockUnreal(Material.iron)
				.setUnlocalizedName(Names.Blocks.BLOCK_LITHIUM)
				.setHardness(5.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		cactusTarydium = 
				new BlockCactusTarydium(Materials.Blocks.tarydium)
				.setUnlocalizedName(Names.Blocks.CACTUS_TARYDIUM)
				.setHardness(3.0F).setResistance(1000.0F)
				.setStepSound(Block.soundTypeCloth)
				.setLightLevel(0.5F)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		ladderIron = 
				new BlockIronLadder(Material.iron)
				.setUnlocalizedName(Names.Blocks.LADDER_IRON)
				.setHardness(5.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeLadder)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		cobblestonePaved = 
				new BlockUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.COBBLESTONE_PAVED)
				.setHardness(3.0F).setResistance(5.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		stonePolished = 
				new BlockUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.STONE_POLISHED)
				.setHardness(2.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		obsidianNether = 
				new BlockUnreal(Materials.Blocks.immobile)
				.setUnlocalizedName(Names.Blocks.OBSIDIAN_NETHER)
				.setHardness(50.0F).setResistance(2000.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		netherrackCompressed1x = 
				new BlockUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.NETHERRACK_COMPRESSED_1X)
				.setHardness(0.8F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		netherrackCompressed2x = 
				new BlockUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.NETHERRACK_COMPRESSED_2X)
				.setHardness(1.2F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		netherrackCompressed3x = 
				new BlockUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.NETHERRACK_COMPRESSED_3X)
				.setHardness(1.6F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		netherrackCompressed4x = 
				new BlockUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.NETHERRACK_COMPRESSED_4X)
				.setHardness(2.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		endStoneCompressed1x = 
				new BlockUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.END_STONE_COMPRESSED_1X)
				.setHardness(6.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		endStoneCompressed2x = 
				new BlockUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.END_STONE_COMPRESSED_2X)
				.setHardness(9.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		endStoneCompressed3x = 
				new BlockUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.END_STONE_COMPRESSED_3X)
				.setHardness(12.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		endStoneCompressed4x = 
				new BlockUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.END_STONE_COMPRESSED_4X)
				.setHardness(15.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockCinnabar = 
				new BlockUnreal(Material.iron)
				.setUnlocalizedName(Names.Blocks.BLOCK_CINNABAR)
				.setHardness(5.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockUUTC = 
				new BlockUnreal(Materials.Blocks.tarydium)
				.setUnlocalizedName(Names.Blocks.BLOCK_UUTC)
				.setHardness(50.0F).setResistance(1000.0F)
				.setStepSound(Block.soundTypeMetal)
				.setLightLevel(1.0F)
				.setCreativeTab(null);
		
		blockTarydiumAlloyUnrefined = 
				new BlockUnreal(Materials.Blocks.tarydium)
				.setUnlocalizedName(Names.Blocks.BLOCK_TARYDIUM_ALLOY_UNREFINED)
				.setHardness(100.0F).setResistance(1000.0F)
				.setStepSound(Block.soundTypeMetal)
				.setLightLevel(0.5F)
				.setCreativeTab(null);
		
		blockTarydiumAlloyRefined = 
				new BlockUnreal(Materials.Blocks.tarydium)
				.setUnlocalizedName(Names.Blocks.BLOCK_TARYDIUM_ALLOY_REFINED)
				.setHardness(200.0F).setResistance(1000.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(null);
		
		blockEnderCrystal = 
				new BlockEnderCrystal(Materials.Blocks.immobile)
				.setUnlocalizedName(Names.Blocks.BLOCK_ENDER_CRYSTAL)
				.setHardness(200.0F).setResistance(1000.0F)
				.setStepSound(Block.soundTypeGlass)
				.setLightLevel(1.0F)
				.setCreativeTab(null);
		
		blockFlint = 
				new BlockUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.BLOCK_FLINT)
				.setHardness(3.0F).setResistance(5.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockCharcoal = 
				new BlockUnreal(Material.rock)
				.setUnlocalizedName(Names.Blocks.BLOCK_CHARCOAL)
				.setHardness(3.0F).setResistance(5.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockGunpowder = 
				new BlockUnreal(Material.sand)
				.setUnlocalizedName(Names.Blocks.BLOCK_GUNPOWDER)
				.setHardness(1.2F).setResistance(2.0F)
				.setStepSound(Block.soundTypeSand)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockEnder = 
				new BlockUnreal(Material.iron)
				.setUnlocalizedName(Names.Blocks.BLOCK_ENDER)
				.setHardness(3.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeGlass)
				.setLightLevel(1.0F)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockLeather = 
				new BlockUnreal(Material.cloth)
				.setUnlocalizedName(Names.Blocks.BLOCK_LEATHER)
				.setHardness(0.8F).setResistance(4.0F)
				.setStepSound(Block.soundTypeCloth)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockBlaze = 
				new BlockUnreal(Material.iron)
				.setUnlocalizedName(Names.Blocks.BLOCK_BLAZE)
				.setHardness(5.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeStone)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockGhastTear = 
				new BlockUnreal(Material.iron)
				.setUnlocalizedName(Names.Blocks.BLOCK_GHAST_TEAR)
				.setHardness(5.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeGlass)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockNetherWart = 
				new BlockNetherWartStorage(Material.clay)//BlockUnreal(Material.clay)
				.setUnlocalizedName(Names.Blocks.BLOCK_NETHER_WART)
				.setHardness(0.8F).setResistance(4.0F)
				.setStepSound(Block.soundTypeGravel)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockCocoa = 
				new BlockUnreal(Material.wood)
				.setUnlocalizedName(Names.Blocks.BLOCK_COCOA)
				.setHardness(1.0F).setResistance(5.0F)
				.setStepSound(Block.soundTypeWood)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockInk = 
				new BlockUnreal(Material.clay)
				.setUnlocalizedName(Names.Blocks.BLOCK_INK)
				.setHardness(1.0F).setResistance(5.0F)
				.setStepSound(Block.soundTypeGravel)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockForceField = 
				new BlockForceField(Materials.Blocks.immobile)
				.setUnlocalizedName(Names.Blocks.BLOCK_FORCE_FIELD)
				.setBlockUnbreakable().setResistance(500000.0F)
				.setStepSound(Block.soundTypeGlass)
				.setLightLevel(0.5F)
				.setCreativeTab(null);
		
		blockTarydiumFieldCollector = 
				new BlockUnreal(Material.iron)
				.setUnlocalizedName(Names.Blocks.BLOCK_TARYDIUM_FIELD_COLLECTOR)
				.setHardness(5.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockTarydiumFieldEmitter = 
				new BlockUnreal(Material.iron)
				.setUnlocalizedName(Names.Blocks.BLOCK_TARYDIUM_FIELD_EMITTER)
				.setHardness(5.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockTarydiumFieldRelay = 
				new BlockUnreal(Material.iron)
				.setUnlocalizedName(Names.Blocks.BLOCK_TARYDIUM_FIELD_RELAY)
				.setHardness(3.0F).setResistance(15.0F)
				.setStepSound(Block.soundTypeMetal)
				.setLightLevel(1.0F)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockTarydiumFieldStasis = 
				new BlockUnreal(Materials.Blocks.tarydium)
				.setUnlocalizedName(Names.Blocks.BLOCK_TARYDIUM_FIELD_STASIS)
				.setHardness(10.0F).setResistance(25.0F)
				.setStepSound(Block.soundTypeGlass)
				.setLightLevel(1.0F)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockTarydiumCrystal = 
				new BlockUnreal(Materials.Blocks.tarydium)
				.setUnlocalizedName(Names.Blocks.BLOCK_TARYDIUM_CRYSTAL)
				.setHardness(10.0F).setResistance(1000.0F)
				.setStepSound(Block.soundTypeGlass)
				.setLightLevel(1.0F)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockGoldCorrugated = 
				new BlockUnreal(Material.iron).setMapColor(MapColor.goldColor)
				.setUnlocalizedName(Names.Blocks.BLOCK_GOLD_CORRUGATED)
				.setHardness(3.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockDiamondCorrugated = 
				new BlockUnreal(Material.iron).setMapColor(MapColor.diamondColor)
				.setUnlocalizedName(Names.Blocks.BLOCK_DIAMOND_CORRUGATED)
				.setHardness(5.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockIronSmooth = 
				new BlockUnreal(Material.iron)
				.setUnlocalizedName(Names.Blocks.BLOCK_IRON_SMOOTH)
				.setHardness(5.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockMachineFrameBasic = 
				new BlockUnreal(Material.iron)
				.setUnlocalizedName(Names.Blocks.BLOCK_MACHINE_FRAME_BASIC)
				.setHardness(5.0F).setResistance(10.0F)
				.setStepSound(Block.soundTypeMetal)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
		blockSlimeBlack = 
				new BlockSlimeUnreal(Material.clay)
				.setUnlocalizedName(Names.Blocks.BLOCK_SLIME_BLACK)
				.setHardness(0.5F).setResistance(2.5F)
				.setStepSound(Block.SLIME_SOUND)
				.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		
	}
	
	public static void register()
	{
		//vanilla tweaks
		Blocks.anvil.setHarvestLevel("pickaxe", 1);
		Blocks.anvil.setStepSound(new Block.SoundType("anvil", 0.3F, 1.0F)
		{
			public String getBreakSound()
			{
				return "dig.stone";
			}
			public String getPlaceSound()
			{
				return "random.anvil_land";
			}
			public String getStepSound()
			{
				return "step.stone";
			}
		});
		Blocks.enchanting_table.setHarvestLevel("pickaxe", 3);
		Blocks.slime_block.setHarvestLevel("shovel", 0);
		Blocks.slime_block.setHardness(0.5F);
		
		//blocks
		blockTitanium.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(blockTitanium, Names.Blocks.BLOCK_TITANIUM);
		
		blockRutile.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(blockRutile, Names.Blocks.BLOCK_RUTILE);
		oreRutile.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(oreRutile, Names.Blocks.ORE_RUTILE);
		
		blockMagnesium.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(blockMagnesium, Names.Blocks.BLOCK_MAGNESIUM);
		oreMagnesium.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(oreMagnesium, Names.Blocks.ORE_MAGNESIUM);
		
		blockTarydium.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(blockTarydium, Names.Blocks.BLOCK_TARYDIUM);
		oreTarydium.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(oreTarydium, Names.Blocks.ORE_TARYDIUM);
		oreTarydiumNether.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(oreTarydiumNether, Names.Blocks.ORE_TARYDIUM_NETHER);
		oreTarydiumEnd.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(oreTarydiumEnd, Names.Blocks.ORE_TARYDIUM_END);
		oreTarydiumObsidian.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(oreTarydiumObsidian, Names.Blocks.ORE_TARYDIUM_OBSIDIAN);

		blockCommandCosmetic.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(blockCommandCosmetic, Names.Blocks.BLOCK_COMMAND_COSMETIC);
		blockBedrockium.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(blockBedrockium, ItemBlockPlacer.class, Names.Blocks.BLOCK_BEDROCKIUM);
		oreBedrockium.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(oreBedrockium, ItemBlockPlacer.class, Names.Blocks.ORE_BEDROCKIUM);
		GameRegistry.registerBlock(oreBedrockiumHidden, Names.Blocks.ORE_BEDROCKIUM_HIDDEN);
		
		blockAsbestos.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(blockAsbestos, ItemBlockPlacer.class, Names.Blocks.BLOCK_ASBESTOS);
		oreAsbestos.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(oreAsbestos, Names.Blocks.ORE_ASBESTOS);
		
		blockLithium.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(blockLithium, Names.Blocks.BLOCK_LITHIUM);
		
		cactusTarydium.setHarvestLevel("axe", 3);
		GameRegistry.registerBlock(cactusTarydium, Names.Blocks.CACTUS_TARYDIUM);
		ladderIron.setHarvestLevel("axe", -1);
		ladderIron.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(ladderIron, Names.Blocks.LADDER_IRON);
		cobblestonePaved.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(cobblestonePaved, Names.Blocks.COBBLESTONE_PAVED);
		stonePolished.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(stonePolished, Names.Blocks.STONE_POLISHED);
		obsidianNether.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(obsidianNether, Names.Blocks.OBSIDIAN_NETHER);
		
		netherrackCompressed1x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(netherrackCompressed1x, ItemBlockPlacer.class, Names.Blocks.NETHERRACK_COMPRESSED_1X);
		netherrackCompressed2x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(netherrackCompressed2x, ItemBlockPlacer.class, Names.Blocks.NETHERRACK_COMPRESSED_2X);
		netherrackCompressed3x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(netherrackCompressed3x, ItemBlockPlacer.class, Names.Blocks.NETHERRACK_COMPRESSED_3X);
		netherrackCompressed4x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(netherrackCompressed4x, ItemBlockPlacer.class, Names.Blocks.NETHERRACK_COMPRESSED_4X);
		endStoneCompressed1x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(endStoneCompressed1x, ItemBlockPlacer.class, Names.Blocks.END_STONE_COMPRESSED_1X);
		endStoneCompressed2x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(endStoneCompressed2x, ItemBlockPlacer.class, Names.Blocks.END_STONE_COMPRESSED_2X);
		endStoneCompressed3x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(endStoneCompressed3x, ItemBlockPlacer.class, Names.Blocks.END_STONE_COMPRESSED_3X);
		endStoneCompressed4x.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(endStoneCompressed4x, ItemBlockPlacer.class, Names.Blocks.END_STONE_COMPRESSED_4X);
		
		blockCinnabar.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(blockCinnabar, Names.Blocks.BLOCK_CINNABAR);
		blockUUTC.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(blockUUTC, ItemBlockPlacer.class, Names.Blocks.BLOCK_UUTC);
		blockTarydiumAlloyUnrefined.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(blockTarydiumAlloyUnrefined, Names.Blocks.BLOCK_TARYDIUM_ALLOY_UNREFINED);
		blockTarydiumAlloyRefined.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(blockTarydiumAlloyRefined, Names.Blocks.BLOCK_TARYDIUM_ALLOY_REFINED);
		blockEnderCrystal.setHarvestLevel("pickaxe", 5);
		GameRegistry.registerBlock(blockEnderCrystal, ItemBlockPlacer.class, Names.Blocks.BLOCK_ENDER_CRYSTAL);
		blockFlint.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(blockFlint, Names.Blocks.BLOCK_FLINT);
		blockCharcoal.setHarvestLevel("pickaxe", 0);
		GameRegistry.registerBlock(blockCharcoal, Names.Blocks.BLOCK_CHARCOAL);
		Blocks.fire.setFireInfo(blockCharcoal, 5, 5);
		
		blockGunpowder.setHarvestLevel("pickaxe", 0);
		blockGunpowder.setHarvestLevel("shovel", 0);
		GameRegistry.registerBlock(blockGunpowder, Names.Blocks.BLOCK_GUNPOWDER);
		blockEnder.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(blockEnder, Names.Blocks.BLOCK_ENDER);
		blockLeather.setHarvestLevel("axe", 0);
		GameRegistry.registerBlock(blockLeather, Names.Blocks.BLOCK_LEATHER);
		blockBlaze.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(blockBlaze, Names.Blocks.BLOCK_BLAZE);
		blockGhastTear.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(blockGhastTear, Names.Blocks.BLOCK_GHAST_TEAR);
		
		blockNetherWart.setHarvestLevel("axe", 0);
		blockNetherWart.setHarvestLevel("shovel", 0);
		GameRegistry.registerBlock(blockNetherWart, Names.Blocks.BLOCK_NETHER_WART);
		blockCocoa.setHarvestLevel("axe", 0);
		GameRegistry.registerBlock(blockCocoa, Names.Blocks.BLOCK_COCOA);
		Blocks.fire.setFireInfo(blockCocoa, 5, 20);
		blockInk.setHarvestLevel("axe", 0);
		blockInk.setHarvestLevel("shovel", 0);
		GameRegistry.registerBlock(blockInk, Names.Blocks.BLOCK_INK);
		
		GameRegistry.registerBlock(blockForceField, Names.Blocks.BLOCK_FORCE_FIELD);
		
		blockTarydiumFieldCollector.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(blockTarydiumFieldCollector, Names.Blocks.BLOCK_TARYDIUM_FIELD_COLLECTOR);
		blockTarydiumFieldEmitter.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(blockTarydiumFieldEmitter, Names.Blocks.BLOCK_TARYDIUM_FIELD_EMITTER);
		blockTarydiumFieldRelay.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(blockTarydiumFieldRelay, Names.Blocks.BLOCK_TARYDIUM_FIELD_RELAY);
		blockTarydiumFieldStasis.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(blockTarydiumFieldStasis, Names.Blocks.BLOCK_TARYDIUM_FIELD_STASIS);
		blockTarydiumCrystal.setHarvestLevel("pickaxe", 3);
		GameRegistry.registerBlock(blockTarydiumCrystal, Names.Blocks.BLOCK_TARYDIUM_CRYSTAL);

		blockGoldCorrugated.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(blockGoldCorrugated, Names.Blocks.BLOCK_GOLD_CORRUGATED);
		blockDiamondCorrugated.setHarvestLevel("pickaxe", 2);
		GameRegistry.registerBlock(blockDiamondCorrugated, Names.Blocks.BLOCK_DIAMOND_CORRUGATED);
		blockIronSmooth.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(blockIronSmooth, Names.Blocks.BLOCK_IRON_SMOOTH);
		
		blockMachineFrameBasic.setHarvestLevel("pickaxe", 1);
		GameRegistry.registerBlock(blockMachineFrameBasic, Names.Blocks.BLOCK_MACHINE_FRAME_BASIC);
		
		blockSlimeBlack.setHarvestLevel("shovel", 0);
		GameRegistry.registerBlock(blockSlimeBlack, Names.Blocks.BLOCK_SLIME_BLACK);
		
	}
	
	public static void registerRenders()
	{
		registerRender(blockTitanium);
		registerRender(blockRutile);
		registerRender(oreRutile);
		registerRender(blockMagnesium);
		registerRender(oreMagnesium);
		registerRender(blockTarydium);
		registerRender(oreTarydium);
		registerRender(oreTarydiumNether);
		registerRender(oreTarydiumEnd);
		registerRender(oreTarydiumObsidian);
		registerRender(blockCommandCosmetic);
		registerRender(blockBedrockium);
		registerRender(oreBedrockium);
		registerRender(oreBedrockiumHidden);
		registerRender(blockAsbestos);
		registerRender(oreAsbestos);
		registerRender(blockLithium);
		registerRender(cactusTarydium);
		registerRender(ladderIron);
		registerRender(cobblestonePaved);
		registerRender(stonePolished);
		registerRender(obsidianNether);
		registerRender(netherrackCompressed1x);
		registerRender(netherrackCompressed2x);
		registerRender(netherrackCompressed3x);
		registerRender(netherrackCompressed4x);
		registerRender(endStoneCompressed1x);
		registerRender(endStoneCompressed2x);
		registerRender(endStoneCompressed3x);
		registerRender(endStoneCompressed4x);
		registerRender(blockCinnabar);
		registerRender(blockUUTC);
		registerRender(blockTarydiumAlloyUnrefined);
		registerRender(blockTarydiumAlloyRefined);
		registerRender(blockEnderCrystal);
		registerRender(blockFlint);
		registerRender(blockCharcoal);
		registerRender(blockGunpowder);
		registerRender(blockEnder);
		registerRender(blockLeather);
		registerRender(blockBlaze);
		registerRender(blockGhastTear);
		registerRender(blockNetherWart);
		registerRender(blockCocoa);
		registerRender(blockInk);
		registerRender(blockForceField);
		registerRender(blockTarydiumFieldCollector);
		registerRender(blockTarydiumFieldEmitter);
		registerRender(blockTarydiumFieldRelay);
		registerRender(blockTarydiumFieldStasis);
		registerRender(blockTarydiumCrystal);
		registerRender(blockGoldCorrugated);
		registerRender(blockDiamondCorrugated);
		registerRender(blockIronSmooth);
		registerRender(blockMachineFrameBasic);
		registerRender(blockSlimeBlack);
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
