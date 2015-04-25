package com.virtuoel.unreal.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import com.virtuoel.unreal.item.ItemForceField;
import com.virtuoel.unreal.item.ItemUnrealDamageable;
import com.virtuoel.unreal.item.ItemWeaponBase;
import com.virtuoel.unreal.reference.Settings;

public class UnrealRecipes
{
	public static void init()
	{
		//vanilla tweaks
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.gold_ingot,1), new Object[]{
				"III","III","III",'I',"nuggetGold",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.coal,9,0), new Object[]{
				"I",'I',"blockCoal",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.redstone,9,0), new Object[]{
				"I",'I',"blockRedstone",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.dye,9,4), new Object[]{
				"I",'I',"blockLapis",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.gold_ingot,9), new Object[]{
				"I",'I',"blockGold",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.diamond,9), new Object[]{
				"I",'I',"blockDiamond",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.redstone_torch,1), new Object[]{
				"R","T",'R',"dustRedstone",'T',"stickWood",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.repeater,1), new Object[]{
				"TRT","SSS",'R',"dustRedstone",'S',"stone",'T',Blocks.redstone_torch,
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.redstone_lamp,1,0), new Object[]{
				" R ","RGR"," R ",'R',"dustRedstone",'G',"glowstone",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.noteblock,1), new Object[]{
				"PPP","PRP","PPP",'R',"dustRedstone",'P',"plankWood",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.jukebox,1), new Object[]{
				"PPP","PRP","PPP",'R',"gemDiamond",'P',"plankWood",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.golden_rail,6), new Object[]{
				"G G","GSG","GRG",'R',"dustRedstone",'S',"stickWood",'G',"ingotGold"
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.detector_rail,6), new Object[]{
				"G G","GSG","GRG",'R',"dustRedstone",'S',Blocks.stone_pressure_plate,'G',"ingotIron"
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.clock,1,0), new Object[]{
				" R ","RGR"," R ",'G',"dustRedstone",'R',"ingotGold",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.compass,1,0), new Object[]{
				" R ","RGR"," R ",'G',"dustRedstone",'R',"ingotIron",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.dispenser,1), new Object[]{
				"PPP","PBP","PRP",'R',"dustRedstone",'P',"cobblestone",'B',Items.bow,
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.dropper,1), new Object[]{
				"PPP","P P","PRP",'R',"dustRedstone",'P',"cobblestone",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.piston,1), new Object[]{
				"PPP","CBC","CRC",'R',"dustRedstone",'C',"cobblestone",'B',"ingotIron",'P',"plankWood",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.daylight_detector,1), new Object[]{
				"GGG","QQQ","SSS",'G',"blockGlass",'Q',"gemQuartz",'S',"slabWood",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.daylight_detector,1), new Object[]{
				" T ","TQT","SSS",'S',"stone",'Q',"gemQuartz",'T',Blocks.redstone_torch,
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.enchanting_table,1,0), new Object[]{
				" B ","DOD","OOO",'O',"obsidian",'B',Items.book,'D',"gemDiamond",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.ender_chest,1,0), new Object[]{
				"OOO","OEO","OOO",'O',"obsidian",'E',Items.ender_eye,
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.beacon,1,0), new Object[]{
				"GGG","GSG","OOO",'O',"obsidian",'G',"blockGlassColorless",'S',Items.nether_star,
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.beacon,1,0), new Object[]{
				"GGG","GSG","OOO",'O',"obsidian",'G',"blockGlass",'S',Items.nether_star,
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.golden_apple,1,0), new Object[]{
				"GGG","GAG","GGG",'G',"ingotGold",'A',"cropApple",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.golden_apple,1,1), new Object[]{
				"GGG","GAG","GGG",'G',"blockGold",'A',"cropApple",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.anvil,1,0), new Object[]{
				"BBB"," I ","III",'B',"blockIron",'I',"ingotIron",
				}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_ingot,9,0), new Object[]{
				"B",'B',"blockIron",
				}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.fermented_spider_eye,1,0), new Object[]{
				Items.spider_eye,Blocks.red_mushroom,Items.sugar,
				}));
		
		//TODO temporary debugTool recipes ---------------------------------------------------------------------------------------------------------------------------------
		
		//removing
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.cobblestone,1), new Object[]{
			"virtuoel.unreal.debug",
			}));
		
		//fueling
		ItemStack coalLike = new ItemStack(Items.coal,1,OreDictionary.WILDCARD_VALUE);
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.debugTool,3), new Object[]{
			"virtuoel.unreal.debug",coalLike,coalLike,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.debugTool,3), new Object[]{
			"virtuoel.unreal.debug","virtuoel.unreal.debug",coalLike,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.debugTool,4), new Object[]{
			"virtuoel.unreal.debug","virtuoel.unreal.debug",coalLike,coalLike,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.debugTool,4), new Object[]{
			"virtuoel.unreal.debug",coalLike,coalLike,coalLike,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.debugTool,13), new Object[]{
			"virtuoel.unreal.debug","listAllLava",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.debugTool,11), new Object[]{
			"virtuoel.unreal.debug","blockCoal",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.debugTool,10), new Object[]{
			"virtuoel.unreal.debug","blockCharcoal",
			}));
		
		//grinding
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustMagnesium,1), new Object[]{
			"ingotMagnesium","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustMagnesium,4), new Object[]{
			"oreMagnesium","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustRutile,1), new Object[]{
			"ingotRutile","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustRutile,2), new Object[]{
			"oreRutile","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustTitanium,1), new Object[]{
			"ingotTitanium","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustTitanium,2), new Object[]{
			"oreTitanium","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.glowstone_dust,4), new Object[]{
			"glowstone","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.mossy_cobblestone,1), new Object[]{
			new ItemStack(Blocks.cobblestone_wall,1,1),"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.mossy_cobblestone,1), new Object[]{
			new ItemStack(Blocks.stonebrick,1,1),"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.gunpowder,4), new Object[]{
			Blocks.tnt,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.blaze_powder,4), new Object[]{
			"rodBlaze","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.quartz,4), new Object[]{
			"blockNetherQuartz","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.quartz,4), new Object[]{
			"blockQuartz","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.flint,1), new Object[]{
			Blocks.gravel,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustTarydiumAlloyUnrefined,1), new Object[]{
			"ingotTarydiumAlloyUnrefined","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustTarydiumAlloyRefined,1), new Object[]{
			"ingotTarydiumAlloyRefined","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustIron,1), new Object[]{
			"ingotIron","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustIron,2), new Object[]{
			"oreIron","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustGold,1), new Object[]{
			"ingotGold","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustGold,2), new Object[]{
			"oreGold","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustCoal,1), new Object[]{
			"coal","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustCharcoal,1), new Object[]{
			"charcoal","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustLapis,1), new Object[]{
			"gemLapis","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustDiamond,1), new Object[]{
			"gemDiamond","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustEmerald,1), new Object[]{
			"gemEmerald","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustNetherQuartz,1), new Object[]{
			"crystalNetherQuartz","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustObsidian,4), new Object[]{
			"obsidian","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustObsidian,4), new Object[]{
			"netherobsidian","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustObsidian,4), new Object[]{
			"enderobsidian","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustLithium,1), new Object[]{
			"ingotLithium","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.string,4), new Object[]{
			new ItemStack(Blocks.wool,1,OreDictionary.WILDCARD_VALUE),"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.sand,1), new Object[]{
			"cobblestone","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustAsbestos,2), new Object[]{
			"oreAsbestos","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustIron,3), new Object[]{
			Items.bucket,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustCinnabar,1), new Object[]{
			"crystalCinnabar","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustLithiumTiny,1), new Object[]{
			"crystalNetherQuartz","crystalNetherQuartz","listAllLava","virtuoel.unreal.debug",
			}));
		
		int[] prismarineShardsPerDamage = {4, 9, 8};
		for(int i = 0; i < 3; i++)
		{
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.prismarine_shard,prismarineShardsPerDamage[i]), new Object[]{
				new ItemStack(Blocks.prismarine,1,i),"virtuoel.unreal.debug",
				}));
		}
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.prismarine_crystals,5), new Object[]{
			Blocks.sea_lantern,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.coal,2,0), new Object[]{
			"oreCoal","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.redstone,8), new Object[]{
			"oreRedstone","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dye,16,4), new Object[]{
			"oreLapis","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond,2), new Object[]{
			"oreDiamond","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.emerald,2), new Object[]{
			"oreEmerald","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.quartz,2), new Object[]{
			"oreQuartz","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.quartz,2), new Object[]{
			"oreNetherQuartz","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond,2), new Object[]{
			Blocks.enchanting_table,"virtuoel.unreal.debug",
			}));
		
		//refining
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.crystalCinnabar,1), new Object[]{
			"oreRedstone","oreRedstone","oreRedstone","oreRedstone","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.crystalCinnabar,2), new Object[]{
			"virtuoel.unreal.debug","virtuoel.unreal.debug","virtuoel.unreal.debug","virtuoel.unreal.debug","virtuoel.unreal.debug","virtuoel.unreal.debug","virtuoel.unreal.debug","virtuoel.unreal.debug","oreCinnabar",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.bucketMercury,1), new Object[]{
			"virtuoel.unreal.debug","dustCinnabar","dustCinnabar",Items.bucket,"virtuoel.unreal.debug","dustCinnabar","virtuoel.unreal.debug","dustCinnabar","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.nuggetTarydiumAlloyRefined,9), new Object[]{
			"ingotTarydiumAlloyUnrefined","virtuoel.unreal.debug","listAllMercury",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.gravel,2), new Object[]{
			Blocks.cobblestone,Blocks.cobblestone,Items.flint,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealBlocks.oreTarydiumNether,1), new Object[]{
			UnrealBlocks.oreTarydium,"compressedNetherrack4x","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealBlocks.oreTarydiumEnd,1), new Object[]{
			UnrealBlocks.oreTarydiumNether,"compressedEndStone4x","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealBlocks.oreTarydiumObsidian,1), new Object[]{
			"netherobsidian","virtuoel.unreal.debug","netherobsidian",UnrealBlocks.oreTarydiumEnd,"netherobsidian","netherobsidian","netherobsidian","netherobsidian","netherobsidian",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.rodTarydiumAlloyRefined,1), new Object[]{
			"listAllMercury","virtuoel.unreal.debug","listAllMercury","rodTarydiumAlloyUnrefined",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.SCUBATankOxygen,1), new Object[]{
			UnrealItems.SCUBATankEmpty,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.coal,1,0), new Object[]{
			"dustCoal","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.coal,1,1), new Object[]{
			"dustCharcoal","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.dye,1,4), new Object[]{
			"dustLapis","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.diamond,1), new Object[]{
			"dustDiamond","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.emerald,1), new Object[]{
			"dustEmerald","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.quartz,1), new Object[]{
			"dustNetherQuartz","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.obsidian,1), new Object[]{
			"dustObsidian","dustObsidian","dustObsidian","dustObsidian","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.gunpowder,1), new Object[]{
			Items.flint,Items.flint,Items.flint,Items.flint,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.leather,1), new Object[]{
			Items.sugar,Items.sugar,Items.rotten_flesh,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.leather,2), new Object[]{
			Items.sugar,Items.sugar,Items.sugar,Items.sugar,Items.rotten_flesh,Items.rotten_flesh,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.end_stone,1), new Object[]{
			Blocks.sandstone,Items.ender_pearl,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.end_stone,5), new Object[]{
			"obsidian","obsidian","obsidian","obsidian","obsidian",Items.ender_pearl,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.obsidian,1), new Object[]{
			"listAllWater","listAllLava","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.obsidian,2), new Object[]{
			"listAllWater","listAllLava","listAllWater","listAllLava","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.obsidian,3), new Object[]{
			"listAllWater","listAllLava","listAllWater","listAllLava","listAllWater","listAllLava","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.obsidian,4), new Object[]{
			"listAllWater","listAllLava","listAllLava","virtuoel.unreal.debug","listAllWater","listAllLava","listAllWater","listAllLava","listAllWater",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.crystalCinnabar,1), new Object[]{
			"dustCinnabar","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.nuggetBedrockium,1), new Object[]{
			"listAllMercury","virtuoel.unreal.debug","listAllMercury","oreBedrockium","listAllMercury","listAllMercury","listAllMercury","listAllMercury","listAllMercury",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Blocks.dragon_egg,2), new Object[]{
			"virtuoel.unreal.debug","virtuoel.unreal.debug",UnrealBlocks.blockEnderCrystal,Blocks.dragon_egg,UnrealBlocks.blockEnderCrystal,"blockBedrockium","virtuoel.unreal.debug",UnrealBlocks.blockEnderCrystal,UnrealBlocks.blockEnderCrystal,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.bucketTarydiumSludge,1), new Object[]{
			"blockTarydium","gemTarydium","blockAsbestos","dustAsbestos","listAllMercury","listAllMercury","virtuoel.unreal.debug","virtuoel.unreal.debug",Items.bucket,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.bucketHealth,1), new Object[]{
			"dustDiamond",new ItemStack(Items.golden_apple,1,0),"virtuoel.unreal.debug","listAllMilk","dustDiamond",Items.bucket,"dustDiamond","virtuoel.unreal.debug","dustDiamond",
			}));//TODO golden apple type in settings
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.bucketNanoblack,1), new Object[]{
			"blockInk",UnrealItems.translocatorDisc,"blockLithium","listAllMercury","virtuoel.unreal.debug",Items.bucket,"blockInk","blockLithium","virtuoel.unreal.debug",
			}));
		
		//unrefining
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.nuggetTarydiumAlloyUnrefined,1), new Object[]{
			"nuggetTarydiumAlloyRefined","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.nuggetRutile,1), new Object[]{
			"nuggetTitanium","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.SCUBATankEmpty,1), new Object[]{
			UnrealItems.SCUBATankOxygen,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealBlocks.blockTarydium,1), new Object[]{
			UnrealBlocks.blockUUTC,"virtuoel.unreal.debug"
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustCinnabarTiny,1), new Object[]{
			UnrealItems.dustGoldTiny,"oreGold",UnrealItems.dustRedstoneTiny,"virtuoel.unreal.debug",UnrealItems.dustGoldTiny,"oreGold",UnrealItems.dustGoldTiny,UnrealItems.dustRedstoneTiny,UnrealItems.dustGoldTiny,
			}));
		//TODO debug recipe end ---------------------------------------------------------------------------------------------------------------------------------
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockTitanium,1), new Object[]{
			"TTT","TTT","TTT",'T',"ingotTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ingotTitanium,9), new Object[]{
			"T",'T',"blockTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ingotTitanium,1), new Object[]{
			"TTT","TTT","TTT",'T',"nuggetTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.nuggetTitanium,9), new Object[]{
			"T",'T',"ingotTitanium",
			}));
		//
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockRutile,1), new Object[]{
			"TTT","TTT","TTT",'T',"ingotRutile",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ingotRutile,9), new Object[]{
			"T",'T',"blockRutile",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ingotRutile,1), new Object[]{
			"TTT","TTT","TTT",'T',"nuggetRutile",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.nuggetRutile,9), new Object[]{
			"T",'T',"ingotRutile",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockMagnesium,1), new Object[]{
			"TTT","TTT","TTT",'T',"ingotMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ingotMagnesium,9), new Object[]{
			"T",'T',"blockMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ingotMagnesium,1), new Object[]{
			"TTT","TTT","TTT",'T',"nuggetMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.nuggetMagnesium,9), new Object[]{
			"T",'T',"ingotMagnesium",
			}));
		//
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ingotTarydiumAlloyRefined,9), new Object[]{
			"T",'T',"blockTarydiumAlloyRefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ingotTarydiumAlloyRefined,1), new Object[]{
			"TTT","TTT","TTT",'T',"nuggetTarydiumAlloyRefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.nuggetTarydiumAlloyRefined,9), new Object[]{
			"T",'T',"ingotTarydiumAlloyRefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockTarydiumAlloyRefined,1), new Object[]{
			"TTT","TTT","TTT",'T',"ingotTarydiumAlloyRefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ingotTarydiumAlloyUnrefined,9), new Object[]{
			"T",'T',"blockTarydiumAlloyUnrefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ingotTarydiumAlloyUnrefined,1), new Object[]{
			"TTT","TTT","TTT",'T',"nuggetTarydiumAlloyUnrefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.nuggetTarydiumAlloyUnrefined,9), new Object[]{
			"T",'T',"ingotTarydiumAlloyUnrefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockTarydiumAlloyUnrefined,1), new Object[]{
			"TTT","TTT","TTT",'T',"ingotTarydiumAlloyUnrefined",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.gemTarydium,1), new Object[]{
			"TTT","TTT","TTT",'T',"shardTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.shardTarydium,9), new Object[]{
			"T",'T',"gemTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockTarydium,1), new Object[]{
			"TTT","TTT","TTT",'T',"gemTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.gemTarydium,9), new Object[]{
			"T",'T',"blockTarydium",
			}));
		
		if(Settings.Crafting.ninePearlsPerEnderBlock)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockEnder,1), new Object[]{
				"CCC","CCC","CCC",'C',Items.ender_pearl,
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ender_pearl,9), new Object[]{
				"C",'C',"blockEnder",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ender_pearl,9), new Object[]{
				"C",'C',"blockEnderPearl",
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockEnder,1), new Object[]{
				"CC","CC",'C',Items.ender_pearl,
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ender_pearl,4), new Object[]{
				"C",'C',"blockEnder",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ender_pearl,4), new Object[]{
				"C",'C',"blockEnderPearl",
				}));
		}
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockLeather,1), new Object[]{
			"TTT","TTT","TTT",'T',Items.leather,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.leather,9), new Object[]{
			"C",'C',"blockLeather",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.gunpowder,9), new Object[]{
			"T",'T',"blockGunpowder",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockFlint,1), new Object[]{
			"TTT","TTT","TTT",'T',Items.flint,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.flint,9), new Object[]{
			"T",'T',"blockFlint",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockGunpowder,1), new Object[]{
			"TTT","TTT","TTT",'T',"dustGunpowder",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.blaze_rod,9), new Object[]{
			"T",'T',"blockBlaze",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockBlaze,1), new Object[]{
			"TTT","TTT","TTT",'T',"rodBlaze",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ghast_tear,9), new Object[]{
			"T",'T',"blockTear",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockGhastTear,1), new Object[]{
			"TTT","TTT","TTT",'T',"itemTear",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockNetherWart,1), new Object[]{
			"TTT","TTT","TTT",'T',"cropNetherWart",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.nether_wart,9), new Object[]{
			"T",'T',"blockNetherWart",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockAsbestos,1), new Object[]{
			"TTT","TTT","TTT",'T',"dustAsbestos",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustAsbestos,9), new Object[]{
			"C",'C',"blockAsbestos",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockCharcoal,1), new Object[]{
			"TTT","TTT","TTT",'T',"charcoal",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.coal,9,1), new Object[]{
			"C",'C',"blockCharcoal",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ingotBedrockium,9), new Object[]{
			"T",'T',"blockBedrockium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ingotBedrockium,1), new Object[]{
			"TTT","TTT","TTT",'T',"nuggetBedrockium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.nuggetBedrockium,9), new Object[]{
			"T",'T',"ingotBedrockium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockBedrockium,1), new Object[]{
			"TTT","TTT","TTT",'T',"ingotBedrockium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.crystalCinnabar,9), new Object[]{
			"T",'T',"blockCinnabar",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockCinnabar,1), new Object[]{
			"TTT","TTT","TTT",'T',"crystalCinnabar",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.dye,9,3), new Object[]{
			"T",'T',"blockCocoa",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockCocoa,1), new Object[]{
			"TTT","TTT","TTT",'T',"cropCocoa",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.dye,9,0), new Object[]{
			"T",'T',"blockInk",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockInk,1), new Object[]{
			"TTT","TTT","TTT",'T',"itemInkSac",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ingotLithium,9), new Object[]{
			"T",'T',"blockLithium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ingotLithium,1), new Object[]{
			"TTT","TTT","TTT",'T',"nuggetLithium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.nuggetLithium,9), new Object[]{
			"T",'T',"ingotLithium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockLithium,1), new Object[]{
			"TTT","TTT","TTT",'T',"ingotLithium",
			}));
		//end blocks ---------------------------------------------------------------------------------------------------------------------------------
		if(Settings.Crafting.nineTinyDustPerTitaniumDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustTitaniumTiny,9), new Object[]{
				"T",'T',"dustTitanium",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustTitanium,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustTitaniumTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustTitaniumTiny,4), new Object[]{
				"T",'T',"dustTitanium",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustTitanium,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustTitaniumTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerRutileDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustRutileTiny,9), new Object[]{
				"T",'T',"dustRutile",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustRutile,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustRutileTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustRutileTiny,4), new Object[]{
				"T",'T',"dustRutile",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustRutile,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustRutileTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerMagnesiumDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustMagnesiumTiny,9), new Object[]{
				"T",'T',"dustMagnesium",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustMagnesium,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustMagnesiumTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustMagnesiumTiny,4), new Object[]{
				"T",'T',"dustMagnesium",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustMagnesium,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustMagnesiumTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerCinnabarDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustCinnabarTiny,9), new Object[]{
				"T",'T',"dustCinnabar",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustCinnabar,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustCinnabarTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustCinnabarTiny,4), new Object[]{
				"T",'T',"dustCinnabar",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustCinnabar,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustCinnabarTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerAsbestosDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustAsbestosTiny,9), new Object[]{
				"T",'T',"dustAsbestos",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustAsbestos,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustAsbestosTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustAsbestosTiny,4), new Object[]{
				"T",'T',"dustAsbestos",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustAsbestos,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustAsbestosTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerTarydiumAlloyUnrefinedDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustTarydiumAlloyUnrefinedTiny,9), new Object[]{
				"T",'T',"dustTarydiumAlloyUnrefined",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustTarydiumAlloyUnrefined,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustTarydiumAlloyUnrefinedTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustTarydiumAlloyUnrefinedTiny,4), new Object[]{
				"T",'T',"dustTarydiumAlloyUnrefined",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustTarydiumAlloyUnrefined,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustTarydiumAlloyUnrefinedTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerTarydiumAlloyRefinedDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustTarydiumAlloyRefinedTiny,9), new Object[]{
				"T",'T',"dustTarydiumAlloyRefined",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustTarydiumAlloyRefined,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustTarydiumAlloyRefinedTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustTarydiumAlloyRefinedTiny,4), new Object[]{
				"T",'T',"dustTarydiumAlloyRefined",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustTarydiumAlloyRefined,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustTarydiumAlloyRefinedTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerCoalDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustCoalTiny,9), new Object[]{
				"T",'T',"dustCoal",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustCoal,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustCoalTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustCoalTiny,4), new Object[]{
				"T",'T',"dustCoal",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustCoal,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustCoalTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerCharcoalDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustCharcoalTiny,9), new Object[]{
				"T",'T',"dustCharcoal",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustCharcoal,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustCharcoalTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustCharcoalTiny,4), new Object[]{
				"T",'T',"dustCharcoal",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustCharcoal,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustCharcoalTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerIronDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustIronTiny,9), new Object[]{
				"T",'T',"dustIron",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustIron,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustIronTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustIronTiny,4), new Object[]{
				"T",'T',"dustIron",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustIron,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustIronTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerLapisDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustLapisTiny,9), new Object[]{
				"T",'T',"dustLapis",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustLapis,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustLapisTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustLapisTiny,4), new Object[]{
				"T",'T',"dustLapis",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustLapis,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustLapisTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerGoldDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustGoldTiny,9), new Object[]{
				"T",'T',"dustGold",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustGold,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustGoldTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustGoldTiny,4), new Object[]{
				"T",'T',"dustGold",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustGold,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustGoldTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerRedstoneDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustRedstoneTiny,9), new Object[]{
				"T",'T',"dustRedstone",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.redstone,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustRedstoneTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustRedstoneTiny,4), new Object[]{
				"T",'T',"dustRedstone",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.redstone,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustRedstoneTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerGlowstoneDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustGlowstoneTiny,9), new Object[]{
				"T",'T',"dustGlowstone",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.glowstone_dust,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustGlowstoneTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustGlowstoneTiny,4), new Object[]{
				"T",'T',"dustGlowstone",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.glowstone_dust,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustGlowstoneTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerNetherQuartzDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustNetherQuartzTiny,9), new Object[]{
				"T",'T',"dustNetherQuartz",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustNetherQuartz,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustNetherQuartzTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustNetherQuartzTiny,4), new Object[]{
				"T",'T',"dustNetherQuartz",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustNetherQuartz,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustNetherQuartzTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerDiamondDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustDiamondTiny,9), new Object[]{
				"T",'T',"dustDiamond",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustDiamond,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustDiamondTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustDiamondTiny,4), new Object[]{
				"T",'T',"dustDiamond",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustDiamond,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustDiamondTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerEmeraldDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustEmeraldTiny,9), new Object[]{
				"T",'T',"dustEmerald",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustEmerald,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustEmeraldTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustEmeraldTiny,4), new Object[]{
				"T",'T',"dustEmerald",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustEmerald,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustEmeraldTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerObsidianDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustObsidianTiny,9), new Object[]{
				"T",'T',"dustObsidian",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustObsidian,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustObsidianTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustObsidianTiny,4), new Object[]{
				"T",'T',"dustObsidian",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustObsidian,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustObsidianTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerLithiumDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustLithiumTiny,9), new Object[]{
				"T",'T',"dustLithium",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustLithium,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustLithiumTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustLithiumTiny,4), new Object[]{
				"T",'T',"dustLithium",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustLithium,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustLithiumTiny,
				}));
		}
		if(Settings.Crafting.nineTinyDustPerGunpowderDust)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustGunpowderTiny,9), new Object[]{
				"T",'T',"dustGunpowder",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.gunpowder,1), new Object[]{
				"TTT","TTT","TTT",'T',UnrealItems.dustGunpowderTiny,
				}));
		}
		else
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dustGunpowderTiny,4), new Object[]{
				"T",'T',"dustGunpowder",
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.gunpowder,1), new Object[]{
				"TT","TT",'T',UnrealItems.dustGunpowderTiny,
				}));
		}
		//end tiny dusts -----------------------------------------------------------------------------------------------------------------------------
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.axeTitanium,1), new Object[]{
			"TT ","TS "," S ",'T',"ingotTitanium",'S',"rodIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.hoeTitanium,1), new Object[]{
			"TT"," S"," S",'T',"ingotTitanium",'S',"rodIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.pickaxeTitanium,1), new Object[]{
			"TTT"," S "," S ",'T',"ingotTitanium",'S',"rodIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.shovelTitanium,1), new Object[]{
			"T","S","S",'T',"ingotTitanium",'S',"rodIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.swordTitanium,1), new Object[]{
			"T","T","S",'T',"ingotTitanium",'S',"rodIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.cactusTarydium,1), new Object[]{
			"STS","TCT","STS",'T',"gemTarydium",'C',Blocks.cactus,'S',"shardTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.weaponCasingBasic,1), new Object[]{
			"TTL","NPT"," BT",'T',"ingotTitanium",'B',Blocks.stone_button,'P',new ItemStack(UnrealItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),'L',Blocks.lever,'N',"nuggetTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.caseTitanium,2), new Object[]{
			"STS","T T","STS",'T',"ingotTitanium",'S',"nuggetTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.tarydPowerBasic,1,((ItemUnrealDamageable)UnrealItems.tarydPowerBasic).getDamageOnCraft()), new Object[]{
			"NTN","NCN","TLT",'T',"gemTarydium",'N',"shardTarydium",'C',UnrealItems.caseTitanium,'L',UnrealItems.lensTarydium,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.tarydPowerBasic,1,((ItemUnrealDamageable)UnrealItems.tarydPowerBasic).getDamageOnCraft()), new Object[]{
			"TLT","NCN","NTN",'T',"gemTarydium",'N',"shardTarydium",'C',UnrealItems.caseTitanium,'L',UnrealItems.lensTarydium,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.tarydPowerBasic,1,((ItemUnrealDamageable)UnrealItems.tarydPowerBasic).getDamageOnCraft()), new Object[]{
			"TNN","LCT","TNN",'T',"gemTarydium",'N',"shardTarydium",'C',UnrealItems.caseTitanium,'L',UnrealItems.lensTarydium,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.tarydPowerBasic,1,((ItemUnrealDamageable)UnrealItems.tarydPowerBasic).getDamageOnCraft()), new Object[]{
			"NNT","TCL","NNT",'T',"gemTarydium",'N',"shardTarydium",'C',UnrealItems.caseTitanium,'L',UnrealItems.lensTarydium,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ammoEightball,4), new Object[]{
			"NIF","PSB","NIF",'S',UnrealBlocks.cactusTarydium,'I',"ingotIron",'P',"blockGunpowder",'F',Items.fire_charge,'N',"nuggetIron",'B',"blockIron"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.nuggetIron,9), new Object[]{
			"I",'I',"ingotIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.iron_ingot,1), new Object[]{
			"III","III","III",'I',"nuggetIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.armorShieldBelt,1), new Object[]{
			"TLT","O O","TPT",'T',"blockTitanium",'L',"blockEmerald",'O',"blockGold",'P',new ItemStack(UnrealItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.gunBarrelIron,4), new Object[]{
			"III","N N","III",'N',"nuggetIron",'I',"ingotIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.gunEightballLauncher,1,((ItemWeaponBase)UnrealItems.gunEightballLauncher).getDamageOnCraft()), new Object[]{
			"RTT","BKM","TTC",'B',UnrealItems.gunBarrelIronLarge,'C',UnrealItems.weaponCasingAdv,'T',"ingotTitanium",'R',"dustRedstone",'K',UnrealItems.ammoEightball,'M',"blockTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.gunStinger,1,((ItemWeaponBase)UnrealItems.gunStinger).getDamageOnCraft()), new Object[]{
			"BTT","BRT","TCT",'B',UnrealItems.gunBarrelIron,'C',UnrealItems.weaponCasingBasic,'T',"ingotTitanium",'R',UnrealItems.gemTarydium,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.translocatorDisc,1), new Object[]{
			"TRT","NPN","FDF",'T',"blockTitanium",'D',"blockDiamond",'P',"blockEnder",'R',Blocks.redstone_torch,'N',"record",'F',UnrealBlocks.blockMachineFrameBasic,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.translocatorDisc,1), new Object[]{
			"TRT","NPN","FDF",'T',"blockTitanium",'D',"blockDiamond",'P',"blockEnderPearl",'R',Blocks.redstone_torch,'N',"record",'F',UnrealBlocks.blockMachineFrameBasic,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.gunTranslocator,1,((ItemWeaponBase)UnrealItems.gunTranslocator).getDamageOnCraft()), new Object[]{
			"DBE","SCR","TTT",'T',"blockTitanium",'D',UnrealItems.translocatorDisc,'C',UnrealItems.weaponCasingAdv,'B',UnrealItems.gunBarrelIron,'S',Blocks.daylight_detector,'R',"blockRedstone",'E',"blockEnder",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.gunTranslocator,1,((ItemWeaponBase)UnrealItems.gunTranslocator).getDamageOnCraft()), new Object[]{
			"DBE","SCR","TTT",'T',"blockTitanium",'D',UnrealItems.translocatorDisc,'C',UnrealItems.weaponCasingAdv,'B',UnrealItems.gunBarrelIron,'S',Blocks.daylight_detector,'R',"blockRedstone",'E',"blockEnderPearl",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.weaponCasingAdv,1), new Object[]{
			"DTQ","TCY","RYT",'T',"ingotTitanium",'D',"gemDiamond",'C',UnrealItems.weaponCasingBasic,'Q',"crystalNetherQuartz",'R',"dustRedstone",'Y',"gemTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.armorJumpBoots,1), new Object[]{
			"TRT","NCN","PBP",'T',"rodIron",'N',new ItemStack(Items.potionitem,1,8235),'C',new ItemStack(UnrealItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),'B',new ItemStack(UnrealItems.armorBootsTitanium,1,OreDictionary.WILDCARD_VALUE),'R',"blockRedstone",'P',Blocks.piston,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.gunFlakCannon,1,((ItemWeaponBase)UnrealItems.gunFlakCannon).getDamageOnCraft()), new Object[]{
			"SBG","IBT","ICY",'I',"ingotTitanium",'C',UnrealItems.weaponCasingBasic,'B',UnrealItems.gunBarrelIron,'S',UnrealItems.ammoFlakShell,'Y',"dyeOrange",'G',"dustGunpowder",'T',"blockTitanium"
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.flak,2), new Object[]{
			"nuggetMagnesium","nuggetIron","dustGunpowder",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.flakShellCold,1), new Object[]{
			UnrealItems.flak,UnrealItems.flak,UnrealItems.flak,UnrealItems.flak,UnrealItems.flak,UnrealItems.flak,UnrealItems.flak,UnrealItems.flak,UnrealItems.caseTitanium,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.ammoFlakShell,1), new Object[]{
			UnrealItems.flakShellWarm,"dyeOrange",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.ladderIron,3), new Object[]{
			"B B","BIB","B B",'I',"ingotIron",'B',Blocks.iron_bars,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.cobblestonePaved,1), new Object[]{
			"TT","TT",'T',Blocks.cobblestone,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.cobblestone,4), new Object[]{
			"T",'T',UnrealBlocks.cobblestonePaved,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.caseIron,2), new Object[]{
			"STS","T T","STS",'T',"ingotIron",'S',"nuggetIron",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.flakShellCold,1), new Object[]{
			UnrealItems.flak,UnrealItems.flak,UnrealItems.flak,UnrealItems.flak,UnrealItems.flak,UnrealItems.flak,UnrealItems.flak,UnrealItems.flak,UnrealItems.caseIron,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'S',"nuggetBedrockium",'T',"blockEnder",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'T',"nuggetBedrockium",'S',"blockEnder",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'S',"dustDiamond",'T',"blockEnder",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'T',"dustDiamond",'S',"blockEnder",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'S',"nuggetBedrockium",'T',"blockEnderPearl",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'T',"nuggetBedrockium",'S',"blockEnderPearl",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'S',"dustDiamond",'T',"blockEnderPearl",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockUUTC,1), new Object[]{
			"STS","TBT","STS",'T',"dustDiamond",'S',"blockEnderPearl",'B',"blockTarydium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.gunRedeemer,1,((ItemWeaponBase)UnrealItems.gunRedeemer).getDamageOnCraft()), new Object[]{
			"MOT","OYT","TTL",'O',"obsidian",'T',"blockTitanium",'Y',"blockTarydium",'M',UnrealItems.ammoWarhead,'L',new ItemStack(UnrealItems.gunEightballLauncher,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ammoWarhead,1), new Object[]{
			"CBT",'C',UnrealItems.warheadCone,'B',UnrealItems.warheadBody,'T',UnrealItems.warheadThruster,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.warheadCone,1), new Object[]{
			"NIB","BTE","NIB",'N',"nuggetIron",'I',"ingotIron",'B',"blockIron",'T',Items.tnt_minecart,'E',"blockEnder",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.warheadCone,1), new Object[]{
			"NIB","BTE","NIB",'N',"nuggetIron",'I',"ingotIron",'B',"blockIron",'T',Items.tnt_minecart,'E',"blockEnderPearl",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.warheadBody,1), new Object[]{
			"BIB","TCT","BIB",'I',"ingotIron",'B',"blockIron",'T',Items.tnt_minecart,'C',new ItemStack(UnrealItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.warheadThruster,1), new Object[]{
			"IBB","ERT","IBB",'I',"blockIron",'B',UnrealItems.ammoEightball,'E',"blockEnder",'R',"blockRedstone",'T',Items.tnt_minecart,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.warheadThruster,1), new Object[]{
			"IBB","ERT","IBB",'I',"blockIron",'B',UnrealItems.ammoEightball,'E',"blockEnderPearl",'R',"blockRedstone",'T',Items.tnt_minecart,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.chainLink,4), new Object[]{
			"TBT","BIB","TBT",'I',"ingotIron",'B',Blocks.iron_bars,'T',"nuggetTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.chainsawBlade,1), new Object[]{
			"BCC","CIC","CCB",'B',Blocks.iron_bars,'C',UnrealItems.chainLink,'I',UnrealItems.caseIron,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.chainsawBladeHardened,1), new Object[]{
			"DDT","BBB","DDT",'D',"gemDiamond",'T',"gemTarydium",'B',UnrealItems.chainsawBlade,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.chainsawMotor,1), new Object[]{
			"BTC","WPI","BAF",'B',Blocks.iron_bars,'T',"blockTitanium",'C',new ItemStack(UnrealItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),'W',Blocks.heavy_weighted_pressure_plate,'P',Blocks.piston,'I',"blockIron",'A',UnrealItems.weaponCasingAdv,'F',new ItemStack(UnrealItems.gunFlakCannon,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.meleeChainsaw,1,((ItemWeaponBase)UnrealItems.meleeChainsaw).getDamageOnCraft()), new Object[]{
			"BBT","CCT","OOM",'B',Blocks.iron_bars,'T',"blockTitanium",'C',UnrealItems.chainsawBladeHardened,'M',UnrealItems.chainsawMotor,'O',"dustObsidian",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.chainmail_helmet,1), new Object[]{
			"CCC","C C",'C',UnrealItems.chainLink,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.chainmail_chestplate,1), new Object[]{
			"C C","CCC","CCC",'C',UnrealItems.chainLink,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.chainmail_leggings,1), new Object[]{
			"CCC","C C","C C",'C',UnrealItems.chainLink,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.chainmail_boots,1), new Object[]{
			"C C","C C",'C',UnrealItems.chainLink,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.gunBarrelIronLarge,1), new Object[]{
			"BBB","BIB","BBB",'B',UnrealItems.gunBarrelIron,'I',"rodIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dispersionUpgrade,1), new Object[]{
			"CEC","BTB","CEC",'T',"blockLithium",'E',"blockEnder",'B',UnrealItems.gunBarrelIronLarge,'C',new ItemStack(UnrealItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.dispersionUpgrade,1), new Object[]{
			"CEC","BTB","CEC",'T',"blockLithium",'E',"blockEnderPearl",'B',UnrealItems.gunBarrelIronLarge,'C',new ItemStack(UnrealItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.gunDispersionPistol,1,((ItemWeaponBase)UnrealItems.gunDispersionPistol).getDamageOnCraft()), new Object[]{
			"ETC","BAU","EGC",'T',"ingotTitanium",'E',"blockEnder",'B',UnrealItems.gunBarrelIronLarge,'A',UnrealItems.gunBarrelIron,'C',new ItemStack(UnrealItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),'U',UnrealItems.dispersionUpgrade,'G',UnrealItems.weaponCasingBasic,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.gunDispersionPistol,1,((ItemWeaponBase)UnrealItems.gunDispersionPistol).getDamageOnCraft()), new Object[]{
			"ETC","BAU","EGC",'T',"ingotTitanium",'E',"blockEnderPearl",'B',UnrealItems.gunBarrelIronLarge,'A',UnrealItems.gunBarrelIron,'C',new ItemStack(UnrealItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),'U',UnrealItems.dispersionUpgrade,'G',UnrealItems.weaponCasingBasic,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustTitanium,1), new Object[]{
			"dustRutile","dustMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustTitanium,2), new Object[]{
			"dustRutile","dustMagnesium","dustRutile","dustMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustTitanium,3), new Object[]{
			"dustRutile","dustMagnesium","dustRutile","dustMagnesium","dustRutile","dustMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustTitanium,4), new Object[]{
			"dustRutile","dustMagnesium","dustRutile","dustMagnesium","dustRutile","dustMagnesium","dustRutile","dustMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.diamond_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',UnrealBlocks.blockUUTC,'D',"dyeLightBlue",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.coal_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',UnrealBlocks.blockUUTC,'D',"dyeBlack",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.emerald_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',UnrealBlocks.blockUUTC,'D',"dyeLime",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.gold_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',UnrealBlocks.blockUUTC,'D',"dyeYellow",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.iron_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',UnrealBlocks.blockUUTC,'D',"dyeLightGray",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.lapis_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',UnrealBlocks.blockUUTC,'D',"dyeBlue",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.quartz_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',UnrealBlocks.blockUUTC,'D',"dyeWhite",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.redstone_ore,8), new Object[]{
			"UUU","UDU","UUU",'U',UnrealBlocks.blockUUTC,'D',"dyeRed",
			}));
		
		//compressed start ---------------------------------------------------------------------------------------------------------------------------------
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.netherrackCompressed1x,1), new Object[]{
			"TTT","TTT","TTT",'T',"netherrack",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.netherrack,9), new Object[]{
			"T",'T',"compressedNetherrack1x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.netherrackCompressed2x,1), new Object[]{
			"TTT","TTT","TTT",'T',"compressedNetherrack1x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.netherrackCompressed1x,9), new Object[]{
			"T",'T',"compressedNetherrack2x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.netherrackCompressed3x,1), new Object[]{
			"TTT","TTT","TTT",'T',"compressedNetherrack2x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.netherrackCompressed2x,9), new Object[]{
			"T",'T',"compressedNetherrack3x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.netherrackCompressed4x,1), new Object[]{
			"TTT","TTT","TTT",'T',"compressedNetherrack3x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.netherrackCompressed3x,9), new Object[]{
			"T",'T',"compressedNetherrack4x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.endStoneCompressed1x,1), new Object[]{
			"TTT","TTT","TTT",'T',Blocks.end_stone,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.end_stone,9), new Object[]{
			"T",'T',"compressedEndStone1x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.endStoneCompressed2x,1), new Object[]{
			"TTT","TTT","TTT",'T',"compressedEndStone1x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.endStoneCompressed1x,9), new Object[]{
			"T",'T',"compressedEndStone2x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.endStoneCompressed3x,1), new Object[]{
			"TTT","TTT","TTT",'T',"compressedEndStone2x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.endStoneCompressed2x,9), new Object[]{
			"T",'T',"compressedEndStone3x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.endStoneCompressed4x,1), new Object[]{
			"TTT","TTT","TTT",'T',"compressedEndStone3x",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.endStoneCompressed3x,9), new Object[]{
			"T",'T',"compressedEndStone4x",
			}));
		//compressed end ---------------------------------------------------------------------------------------------------------------------------------
		//slabs start -------------------------------------------------------------------------------------------------------------------------------------
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.stonePolished,1), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.stone_slab,1,0),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.sandstone,1), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.stone_slab,1,1),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.cobblestone,1), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.stone_slab,1,3),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.brick_block,1), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.stone_slab,1,4),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.stonebrick,1), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.stone_slab,1,5),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.nether_brick,1), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.stone_slab,1,6),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.quartz_block,1,0), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.stone_slab,1,7),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.planks,1,0), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.wooden_slab,1,0),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.planks,1,1), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.wooden_slab,1,1),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.planks,1,2), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.wooden_slab,1,2),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.planks,1,3), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.wooden_slab,1,3),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.planks,1,4), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.wooden_slab,1,4),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.planks,1,5), new Object[]{
			"S","B","S",'S',new ItemStack(Blocks.wooden_slab,1,5),'B',"slimeball",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.stone_slab,2,0), new Object[]{
			"S",'S',UnrealBlocks.stonePolished,
			}));
		//slabs end
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.saddle,1), new Object[]{
			"LLL","LWL","I I",'L',"blockLeather",'I',"blockIron",'W',new ItemStack(Blocks.wool,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.armorAsbestosSuit,1), new Object[]{
			"OMO","TCT","OGO",'O',"blockAsbestos",'M',"listAllMercury",'C',new ItemStack(UnrealItems.armorToxinSuit,1,OreDictionary.WILDCARD_VALUE),'G',"blockMagnesium",'T',"blockTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.armorToxinSuit,1), new Object[]{
			"MGM","TKT","ARA",'M',"listAllMilk",'G',Items.speckled_melon,'T',"blockTitanium",'K',new ItemStack(Items.chainmail_chestplate,1,OreDictionary.WILDCARD_VALUE),'A',"blockAsbestos",'R',"blockRutile",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.rodTarydiumAlloyRefined,4), new Object[]{
			"STS","SES","STS",'T',"blockTitanium",'S',"dustTarydiumAlloyRefined",'E',"compressedEndStone4x"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.rodTarydiumAlloyUnrefined,4), new Object[]{
			"STS","SES","STS",'T',"blockTitanium",'S',"dustTarydiumAlloyUnrefined",'E',"compressedEndStone4x"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.axeTarydiumAlloyRefined,1), new Object[]{
			"TTE","TSE","ESE",'T',"blockTarydiumAlloyRefined",'S',"rodTarydiumAlloyRefined",'E',"compressedEndStone4x"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.hoeTarydiumAlloyRefined,1), new Object[]{
			"TTE","ESE","ESE",'T',"blockTarydiumAlloyRefined",'S',"rodTarydiumAlloyRefined",'E',"compressedEndStone4x"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.pickaxeTarydiumAlloyRefined,1), new Object[]{
			"TTT","ESE","ESE",'T',"blockTarydiumAlloyRefined",'S',"rodTarydiumAlloyRefined",'E',"compressedEndStone4x"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.shovelTarydiumAlloyRefined,1), new Object[]{
			"ETE","ESE","ESE",'T',"blockTarydiumAlloyRefined",'S',"rodTarydiumAlloyRefined",'E',"compressedEndStone4x"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.swordTarydiumAlloyRefined,1), new Object[]{
			"ETE","ETE","ESE",'T',"blockTarydiumAlloyRefined",'S',"rodTarydiumAlloyRefined",'E',"compressedEndStone4x"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.SCUBATankEmpty,1), new Object[]{
			" MC","ISI","ICI",'M',UnrealItems.ribbonMagnesium,'C',UnrealItems.chainLink,'I',"nuggetIron",'S',UnrealItems.caseIron,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.armorSCUBAGear,1), new Object[]{
			"BHB","ARA","ATA",'A',UnrealItems.SCUBATankOxygen,'H',new ItemStack(UnrealItems.armorHelmetTitanium,1,OreDictionary.WILDCARD_VALUE),'B',UnrealItems.gunBarrelIron,'T',new ItemStack(UnrealItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),'R',"rodTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.voiceBox,1), new Object[]{
			UnrealItems.ammoFlakShell,"blockRedstone",Blocks.jukebox,UnrealItems.chainsawBlade,UnrealItems.weaponCasingBasic,UnrealItems.ammoEightball,UnrealItems.gunBarrelIron,UnrealItems.tarydPowerBasic,"record",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockEnderCrystal,1), new Object[]{
			"RUR","UTU","RUR",'R',"blockTarydiumAlloyRefined",'U',"blockTarydiumAlloyUnrefined",'T',"blockTear",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockEnderCrystal,1), new Object[]{
			"RUR","UTU","RUR",'U',"blockTarydiumAlloyRefined",'R',"blockTarydiumAlloyUnrefined",'T',"blockTear",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockEnderCrystal,1), new Object[]{
			"RUR","UTU","RUR",'U',"blockTarydiumAlloyUnrefined",'R',"dustTarydiumAlloyRefined",'T',Items.nether_star,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockEnderCrystal,1), new Object[]{
			"RUR","UTU","RUR",'R',"blockTarydiumAlloyUnrefined",'U',"dustTarydiumAlloyRefined",'T',Items.nether_star,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.netherrack,4), new Object[]{
			"CCC","CNC","CCC",'C',"cobblestone",'N',"blockNetherWart",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.obsidianNether,4), new Object[]{
			"WOW","ONO","WOW",'O',"obsidian",'W',"compressedNetherrack1x",'N',Items.magma_cream,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.stone_slab,6,0), new Object[]{
			"SSS",'S',UnrealBlocks.stonePolished,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.ribbonMagnesium,1), new Object[]{
			"MMM",'M',"nuggetMagnesium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.armorHelmetTitanium,1), new Object[]{
			"III","I I",'I',"ingotTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.armorChestplateTitanium,1), new Object[]{
			"I I","III","III",'I',"ingotTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.armorLeggingsTitanium,1), new Object[]{
			"III","I I","I I",'I',"ingotTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.armorBootsTitanium,1), new Object[]{
			"I I","I I",'I',"ingotTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.armorHelmetSlime,1), new Object[]{
			"III","I I",'I',"blockSlime",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.armorChestplateSlime,1), new Object[]{
			"I I","III","III",'I',"blockSlime",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.armorLeggingsSlime,1), new Object[]{
			"III","I I","I I",'I',"blockSlime",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.armorBootsSlime,1), new Object[]{
			"I I","I I",'I',"blockSlime",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.forceField,1,((ItemForceField)UnrealItems.forceField).getDamageOnCraft()), new Object[]{
			"PTR","GBT","PTR",'R',"rodTitanium",'T',"blockTitanium",'B',UnrealItems.dispersionUpgrade,'G',"blockGlassPurple",'P',new ItemStack(UnrealItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.universalTranslator,1), new Object[]{
			"TGT","PBP","TRT",'I',"ingotTitanium",'T',"blockTitanium",'B',UnrealItems.dispersionUpgrade,'G',"blockGlassGreen",'P',new ItemStack(UnrealItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),'R',"blockRedstone"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.rodIron,4), new Object[]{
			"ICI","IFI","ICI",'I',"dustIron",'F',"blockFlint",'C',"blockCoal",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.rodTitanium,4), new Object[]{
			"IFI","ICI","IFI",'I',"dustTitanium",'F',"blockIron",'C',"obsidian",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.rodGold,4), new Object[]{
			"IFI","ICI","IFI",'I',"dustGold",'F',"blockLapis",'C',"blockRedstone",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.nuggetBedrockium,1), new Object[]{
			"CDC","DGD","CDC",'C',"compressedCobblestone2x",'D',"compressedCobblestone3x",'G',"gemDiamond"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.lensTarydium,1), new Object[]{
			"STS","TGT","STS",'T',"rodTitanium",'S',"shardTarydium",'G',"blockGlass",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockTarydiumCrystal,1), new Object[]{
			"NIN","IBI","BDB",'N',"shardTarydium",'I',"gemTarydium",'B',"blockTarydium",'D',"gemDiamond"
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockTarydiumFieldStasis,1), new Object[]{
			"RLR","LCL","RLR",'R',"rodGold",'L',UnrealItems.lensTarydium,'C',UnrealBlocks.blockTarydiumCrystal,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockTarydiumFieldCollector,1), new Object[]{
			"NLN","IRI","BTB",'B',"blockGold",'I',"ingotGold",'N',"nuggetGold",'T',UnrealBlocks.blockMachineFrameBasic,'L',UnrealItems.lensTarydium,'R',"rodTitanium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockTarydiumFieldEmitter,1), new Object[]{
			"NLN","IRI","TLT",'I',"ingotGold",'N',"nuggetGold",'T',UnrealBlocks.blockMachineFrameBasic,'L',UnrealItems.lensTarydium,'R',"rodIron",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockTarydiumFieldRelay,2), new Object[]{
			"RLR","ITI","NGN",'I',"ingotGold",'N',"nuggetGold",'T',"rodTitanium",'L',UnrealItems.lensTarydium,'R',"rodIron",'G',"rodGold",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockGoldCorrugated,4), new Object[]{
			"CBC","BTB","CBC",'B',"blockGold",'C',"cobblestone",'T',UnrealBlocks.stonePolished,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockDiamondCorrugated,4), new Object[]{
			"CBC","BTB","CBC",'B',"blockDiamond",'C',"cobblestone",'T',UnrealBlocks.stonePolished,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockIronSmooth,4), new Object[]{
			"CBC","BTB","CBC",'B',"blockIron",'C',UnrealBlocks.stonePolished,'T',UnrealBlocks.cobblestonePaved,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockMachineFrameBasic,1), new Object[]{
			"RIR","SCS","RIR",'R',UnrealItems.ribbonMagnesium,'I',"ingotRutile",'S',"shardTarydium",'C',UnrealItems.caseIron,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockMachineFrameBasic,1), new Object[]{
			"RSR","ICI","RSR",'R',UnrealItems.ribbonMagnesium,'I',"ingotRutile",'S',"shardTarydium",'C',UnrealItems.caseIron,
			}));
		
		//TODO change to machine when ready
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.debugTool,1), new Object[]{
			"PSP","FCF","RDR",'P',Blocks.piston,'S',Items.shears,'F',"blockFlint",'C',UnrealBlocks.blockMachineFrameBasic,'R',Items.comparator,'D',Blocks.dropper,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.stonebrick,4,1), new Object[]{
			" M ","MSM"," M ",'M',Blocks.mossy_cobblestone,'S',UnrealBlocks.stonePolished,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.oreBedrockiumHidden,1), new Object[]{
			"IOI","ONO","IOI",'I',"blockInk",'O',UnrealBlocks.oreTarydiumObsidian,'N',"blockBedrockium",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockCommandCosmetic,1), new Object[]{
			"OWO","WBW","ORO",'R',"blockRedstone",'W',new ItemStack(Blocks.stained_hardened_clay,1,0),'O',new ItemStack(Blocks.stained_hardened_clay,1,1),'B',UnrealBlocks.oreBedrockiumHidden,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.coreInvulnerability,1), new Object[]{
			"NBN","BHB","NBN",'N',"listAllNanoblack",'B',UnrealBlocks.oreBedrockiumHidden,'H',"listAllHealth",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.armorInvulnerability,1), new Object[]{
			"RCR","PIP","RCR",'R',"rodTitanium",'C',"blockCinnabar",'P',UnrealItems.dispersionUpgrade,'I',UnrealItems.coreInvulnerability
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.name_tag,1), new Object[]{
			" FL","PDF","SP ",'D',"gemDiamond",'F',Items.item_frame,'L',Items.lead,'P',Items.paper,'S',Items.sign,
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.healthSuperEmpty,1), new Object[]{
			"RTR","GCG","RTR",'R',"rodTitanium",'T',"blockTitanium",'G',"blockGlassGray",'C',UnrealItems.caseTitanium,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.healthSuper,1), new Object[]{
			UnrealItems.healthSuperEmpty,"listAllHealth","virtuoel.unreal.debug","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealItems.invisibility,1), new Object[]{
			"EGE","FPF","MTM",'E',"dustEmerald",'G',"blockGlassLime",'F',UnrealBlocks.blockMachineFrameBasic,'T',new ItemStack(UnrealItems.tarydPowerBasic,1,OreDictionary.WILDCARD_VALUE),'M',"blockMagnesium",'P',new ItemStack(Items.potionitem,1,8270),
			}));
		
	}
	
	public static void initSmelting()
	{
		GameRegistry.addSmelting(UnrealBlocks.oreRutile, 
				new ItemStack(UnrealItems.ingotRutile,1), 1.0F);
		
		GameRegistry.addSmelting(UnrealBlocks.oreAsbestos, 
				new ItemStack(UnrealItems.dustAsbestos,1), 1.0F);
		
		GameRegistry.addSmelting(UnrealBlocks.oreMagnesium, 
				new ItemStack(UnrealItems.ingotMagnesium,3), 0.3F);
		
		GameRegistry.addSmelting(UnrealBlocks.cactusTarydium, 
				new ItemStack(UnrealItems.shardTarydium,1), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.tarydPowerBasic, 
				new ItemStack(UnrealItems.recordLongFlight,1), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.flakShellCold, 
				new ItemStack(UnrealItems.flakShellWarm,1), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.caseIron, 
				new ItemStack(Items.iron_ingot,2), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.caseTitanium, 
				new ItemStack(UnrealItems.ingotTitanium,2), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.dustMagnesium, 
				new ItemStack(UnrealItems.ingotMagnesium,1), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.dustTitanium, 
				new ItemStack(UnrealItems.ingotTitanium,1), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.dustRutile, 
				new ItemStack(UnrealItems.ingotRutile,1), 0.1F);
		
		GameRegistry.addSmelting(UnrealBlocks.blockUUTC, 
				new ItemStack(UnrealItems.nuggetTarydiumAlloyUnrefined,1), 1.0F);
		
		GameRegistry.addSmelting(UnrealItems.dustIron, 
				new ItemStack(Items.iron_ingot,1), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.dustGold, 
				new ItemStack(Items.gold_ingot,1), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.dustLithium, 
				new ItemStack(UnrealItems.ingotLithium,1), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.dustTarydiumAlloyUnrefined, 
				new ItemStack(UnrealItems.ingotTarydiumAlloyUnrefined,1), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.dustTarydiumAlloyRefined, 
				new ItemStack(UnrealItems.ingotTarydiumAlloyRefined,1), 0.1F);

		GameRegistry.addSmelting(UnrealItems.gunBarrelIron, 
				new ItemStack(UnrealItems.nuggetIron,14), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.gunBarrelIronLarge, 
				new ItemStack(Items.iron_ingot,12), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.chainLink, 
				new ItemStack(UnrealItems.nuggetIron,5), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.chainsawBlade, 
				new ItemStack(Items.iron_ingot,6), 0.1F);
		
		GameRegistry.addSmelting(UnrealBlocks.ladderIron, 
				new ItemStack(Items.iron_ingot,1), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.ribbonMagnesium, 
				new ItemStack(UnrealItems.nuggetMagnesium,3), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.rodIron, 
				new ItemStack(Items.iron_ingot,1), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.rodTitanium, 
				new ItemStack(UnrealItems.ingotTitanium,1), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.rodGold, 
				new ItemStack(Items.gold_ingot,1), 0.1F);
		
		GameRegistry.addSmelting(UnrealItems.healthSuperEmpty, 
				new ItemStack(UnrealItems.ingotTitanium,24), 0.1F);
		
	}
	
	public static void initOreDict()
	{
		OreDictionary.registerOre("netherrack", Blocks.netherrack);
		OreDictionary.registerOre("obsidian", Blocks.obsidian);
		OreDictionary.registerOre("glowstone", Blocks.glowstone);
		OreDictionary.registerOre("blockSlime", Blocks.slime_block);
		OreDictionary.registerOre("dustGunpowder", Items.gunpowder);
		OreDictionary.registerOre("rodBlaze", Items.blaze_rod);
		OreDictionary.registerOre("blazeRod", Items.blaze_rod);
		OreDictionary.registerOre("dustBlaze", Items.blaze_powder);
		OreDictionary.registerOre("itemTear", Items.ghast_tear);
		OreDictionary.registerOre("itemInkSac", new ItemStack(Items.dye, 1, 0));
		OreDictionary.registerOre("crystalNetherQuartz", Items.quartz);
		OreDictionary.registerOre("oreNetherQuartz", Blocks.quartz_ore);
		OreDictionary.registerOre("blockNetherQuartz",  new ItemStack(Blocks.quartz_block,1,OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("coal", new ItemStack(Items.coal,1,0));
		OreDictionary.registerOre("charcoal", new ItemStack(Items.coal,1,1));
		OreDictionary.registerOre("shardPrismarine", Items.prismarine_shard);
		OreDictionary.registerOre("crystalPrismarine", Items.prismarine_crystals);
		OreDictionary.registerOre("blockPrismarine", new ItemStack(Blocks.prismarine,1,OreDictionary.WILDCARD_VALUE));
		OreDictionary.registerOre("cropApple", Items.apple);
		OreDictionary.registerOre("cropCocoa", new ItemStack(Items.dye,1,3));
		OreDictionary.registerOre("cropNetherWart", Items.nether_wart);
		
		OreDictionary.registerOre("virtuoel.unreal.debug", UnrealItems.debugTool);
		
		OreDictionary.registerOre("ingotTitanium", UnrealItems.ingotTitanium);
		OreDictionary.registerOre("dustTitanium", UnrealItems.dustTitanium);
		OreDictionary.registerOre("nuggetTitanium", UnrealItems.nuggetTitanium);
		OreDictionary.registerOre("blockTitanium", UnrealBlocks.blockTitanium);
		OreDictionary.registerOre("oreTarydium", UnrealBlocks.oreTarydium);
		OreDictionary.registerOre("shardTarydium", UnrealItems.shardTarydium);
		OreDictionary.registerOre("gemTarydium", UnrealItems.gemTarydium);
		OreDictionary.registerOre("blockTarydium", UnrealBlocks.blockTarydium);
		OreDictionary.registerOre("nuggetIron", UnrealItems.nuggetIron);
		OreDictionary.registerOre("blockLeather", UnrealBlocks.blockLeather);
		OreDictionary.registerOre("oreTarydium", UnrealBlocks.oreTarydiumEnd);
		OreDictionary.registerOre("oreTarydium", UnrealBlocks.oreTarydiumNether);
		OreDictionary.registerOre("oreTarydium", UnrealBlocks.oreTarydiumObsidian);
		OreDictionary.registerOre("oreEnderTarydium", UnrealBlocks.oreTarydiumEnd);
		OreDictionary.registerOre("oreEndTarydium", UnrealBlocks.oreTarydiumEnd);
		OreDictionary.registerOre("oreNetherTarydium", UnrealBlocks.oreTarydiumNether);
		OreDictionary.registerOre("oreTarydiumEnder", UnrealBlocks.oreTarydiumEnd);
		OreDictionary.registerOre("oreTarydiumEnd", UnrealBlocks.oreTarydiumEnd);
		OreDictionary.registerOre("oreTarydiumNether", UnrealBlocks.oreTarydiumNether);
		OreDictionary.registerOre("oreMagnesium", UnrealBlocks.oreMagnesium);
		OreDictionary.registerOre("ingotMagnesium", UnrealItems.ingotMagnesium);
		OreDictionary.registerOre("dustMagnesium", UnrealItems.dustMagnesium);
		OreDictionary.registerOre("nuggetMagnesium", UnrealItems.nuggetMagnesium);
		OreDictionary.registerOre("blockMagnesium", UnrealBlocks.blockMagnesium);
		OreDictionary.registerOre("oreRutile", UnrealBlocks.oreRutile);
		OreDictionary.registerOre("ingotRutile", UnrealItems.ingotRutile);
		OreDictionary.registerOre("dustRutile", UnrealItems.dustRutile);
		OreDictionary.registerOre("nuggetRutile", UnrealItems.nuggetRutile);
		OreDictionary.registerOre("blockRutile", UnrealBlocks.blockRutile);
		OreDictionary.registerOre("compressedNetherrack1x", UnrealBlocks.netherrackCompressed1x);
		OreDictionary.registerOre("compressedNetherrack2x", UnrealBlocks.netherrackCompressed2x);
		OreDictionary.registerOre("compressedNetherrack3x", UnrealBlocks.netherrackCompressed3x);
		OreDictionary.registerOre("compressedNetherrack4x", UnrealBlocks.netherrackCompressed4x);
		OreDictionary.registerOre("compressedEndStone1x", UnrealBlocks.endStoneCompressed1x);
		OreDictionary.registerOre("compressedEndStone2x", UnrealBlocks.endStoneCompressed2x);
		OreDictionary.registerOre("compressedEndStone3x", UnrealBlocks.endStoneCompressed3x);
		OreDictionary.registerOre("compressedEndStone4x", UnrealBlocks.endStoneCompressed4x);
		OreDictionary.registerOre("blockTarydiumAlloyRefined", UnrealBlocks.blockTarydiumAlloyRefined);
		OreDictionary.registerOre("blockTarydiumAlloyUnrefined", UnrealBlocks.blockTarydiumAlloyUnrefined);
		OreDictionary.registerOre("ingotTarydiumAlloyRefined", UnrealItems.ingotTarydiumAlloyRefined);
		OreDictionary.registerOre("ingotTarydiumAlloyUnrefined", UnrealItems.ingotTarydiumAlloyUnrefined);
		OreDictionary.registerOre("nuggetTarydiumAlloyRefined", UnrealItems.nuggetTarydiumAlloyRefined);
		OreDictionary.registerOre("nuggetTarydiumAlloyUnrefined", UnrealItems.nuggetTarydiumAlloyUnrefined);
		OreDictionary.registerOre("blockFlint", UnrealBlocks.blockFlint);
		OreDictionary.registerOre("blockGunpowder", UnrealBlocks.blockGunpowder);
		OreDictionary.registerOre("blockEnder", UnrealBlocks.blockEnder);
		OreDictionary.registerOre("blockEnderPearl", UnrealBlocks.blockEnder);
		OreDictionary.registerOre("dustIron", UnrealItems.dustIron);
		OreDictionary.registerOre("dustGold", UnrealItems.dustGold);
		OreDictionary.registerOre("dustTarydiumAlloyUnrefined", UnrealItems.dustTarydiumAlloyUnrefined);
		OreDictionary.registerOre("dustTarydiumAlloyRefined", UnrealItems.dustTarydiumAlloyRefined);
		OreDictionary.registerOre("rodTarydiumAlloyUnrefined", UnrealItems.rodTarydiumAlloyUnrefined);
		OreDictionary.registerOre("rodTarydiumAlloyRefined", UnrealItems.rodTarydiumAlloyRefined);
		OreDictionary.registerOre("rodIron", UnrealItems.rodIron);
		OreDictionary.registerOre("rodTitanium", UnrealItems.rodTitanium);
		OreDictionary.registerOre("rodGold", UnrealItems.rodGold);
		OreDictionary.registerOre("blockBlaze", UnrealBlocks.blockBlaze);
		OreDictionary.registerOre("blockTear", UnrealBlocks.blockGhastTear);
		OreDictionary.registerOre("blockBlazeRod", UnrealBlocks.blockBlaze);
		OreDictionary.registerOre("blockGhastTear", UnrealBlocks.blockGhastTear);
		OreDictionary.registerOre("dustCoal", UnrealItems.dustCoal);
		OreDictionary.registerOre("dustCharcoal", UnrealItems.dustCharcoal);
		OreDictionary.registerOre("dustLapis", UnrealItems.dustLapis);
		OreDictionary.registerOre("dyeBlue", UnrealItems.dustLapis);
		OreDictionary.registerOre("dustDiamond", UnrealItems.dustDiamond);
		OreDictionary.registerOre("dustEmerald", UnrealItems.dustEmerald);
		OreDictionary.registerOre("dustNetherQuartz", UnrealItems.dustNetherQuartz);
		OreDictionary.registerOre("record", UnrealItems.recordLongFlight);
		OreDictionary.registerOre("blockNetherWart", UnrealBlocks.blockNetherWart);
		OreDictionary.registerOre("oreAsbestos", UnrealBlocks.oreAsbestos);
		OreDictionary.registerOre("dustAsbestos", UnrealItems.dustAsbestos);
		OreDictionary.registerOre("blockAsbestos", UnrealBlocks.blockAsbestos);
		OreDictionary.registerOre("blockCharcoal", UnrealBlocks.blockCharcoal);
		OreDictionary.registerOre("dustObsidian", UnrealItems.dustObsidian);
		OreDictionary.registerOre("dustCinnabar", UnrealItems.dustCinnabar);
		OreDictionary.registerOre("crystalCinnabar", UnrealItems.crystalCinnabar);
		OreDictionary.registerOre("blockCinnabar", UnrealBlocks.blockCinnabar);
		OreDictionary.registerOre("oreBedrockium", UnrealBlocks.oreBedrockium);
		OreDictionary.registerOre("ingotBedrockium", UnrealItems.ingotBedrockium);
		OreDictionary.registerOre("nuggetBedrockium", UnrealItems.nuggetBedrockium);
		OreDictionary.registerOre("blockBedrockium", UnrealBlocks.blockBedrockium);
		OreDictionary.registerOre("blockCocoa", UnrealBlocks.blockCocoa);
		OreDictionary.registerOre("blockInk", UnrealBlocks.blockInk);
		OreDictionary.registerOre("obsidian", UnrealBlocks.obsidianNether);
		OreDictionary.registerOre("netherobsidian", UnrealBlocks.obsidianNether);
		OreDictionary.registerOre("blockGold", UnrealBlocks.blockGoldCorrugated);
		OreDictionary.registerOre("blockDiamond", UnrealBlocks.blockDiamondCorrugated);
		OreDictionary.registerOre("blockIron", UnrealBlocks.blockIronSmooth);
		OreDictionary.registerOre("ingotLithium", UnrealItems.ingotLithium);
		OreDictionary.registerOre("dustLithium", UnrealItems.dustLithium);
		OreDictionary.registerOre("nuggetLithium", UnrealItems.nuggetLithium);
		OreDictionary.registerOre("blockLithium", UnrealBlocks.blockLithium);
		
		//buckets & fluids (temp)
		OreDictionary.registerOre("listAllWater", Items.water_bucket);
		OreDictionary.registerOre("listAllLava", Items.lava_bucket);
		OreDictionary.registerOre("listAllMilk", Items.milk_bucket);
		OreDictionary.registerOre("listAllMercury", UnrealItems.bucketMercury);
		OreDictionary.registerOre("listAllTarydiumSludge", UnrealItems.bucketTarydiumSludge);
		OreDictionary.registerOre("listAllHealth", UnrealItems.bucketHealth);
		OreDictionary.registerOre("listAllNanoblack", UnrealItems.bucketNanoblack);
	}
}
