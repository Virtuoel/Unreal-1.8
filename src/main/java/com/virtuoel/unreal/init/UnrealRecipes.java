package com.virtuoel.unreal.init;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
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

		int dustsPerPiece[] = {5, 8, 7, 4, 2, 3, 1, 3, 2};
		int dustMultipliers[] = {1, 1, 5, 1};
		Item dustItems[] = {UnrealItems.dustIron, UnrealItems.dustGold, UnrealItems.dustIronTiny, UnrealItems.dustTitanium};
		Item armorItems[][] = {
			{Items.iron_helmet,Items.iron_chestplate,Items.iron_leggings,Items.iron_boots,Items.iron_sword,Items.iron_pickaxe,Items.iron_shovel,Items.iron_axe,Items.iron_hoe},
			{Items.golden_helmet,Items.golden_chestplate,Items.golden_leggings,Items.golden_boots,Items.golden_sword,Items.golden_pickaxe,Items.golden_shovel,Items.golden_axe,Items.golden_hoe},
			{Items.chainmail_helmet,Items.chainmail_chestplate,Items.chainmail_leggings,Items.chainmail_boots,null,null,null,null,null},
			{UnrealItems.armorHelmetTitanium,UnrealItems.armorChestplateTitanium,UnrealItems.armorLeggingsTitanium,UnrealItems.armorBootsTitanium,UnrealItems.swordTitanium,UnrealItems.pickaxeTitanium,UnrealItems.shovelTitanium,UnrealItems.axeTitanium,UnrealItems.hoeTitanium}
			};
		
		for(int i=0;i<armorItems.length;i++)
		{
			for(int j=0;j<armorItems[i].length;j++)
			{
				if(armorItems[i][j]!=null){
					GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(dustItems[i],dustsPerPiece[j]*dustMultipliers[i]), new Object[]{
						new ItemStack(armorItems[i][j],1,0),"virtuoel.unreal.debug",
						}));
				}
			}
		}
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustEmeraldTiny,16), new Object[]{
			UnrealItems.invisibility,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustIron,2), new Object[]{
			Items.iron_door,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustIron,4), new Object[]{
			Blocks.iron_trapdoor,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustIron,5), new Object[]{
			Items.minecart,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustIron,4), new Object[]{
			Items.compass,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustIron,1), new Object[]{
			Blocks.activator_rail,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustIron,1), new Object[]{
			Blocks.rail,Blocks.rail,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustIron,2), new Object[]{
			Blocks.heavy_weighted_pressure_plate,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustIronTiny,4), new Object[]{
			Blocks.tripwire_hook,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustGoldTiny,8), new Object[]{
			Items.golden_carrot,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustGoldTiny,8), new Object[]{
			Items.speckled_melon,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustGold,4), new Object[]{
			Items.clock,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustGold,1), new Object[]{
			Blocks.golden_rail,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustGold,2), new Object[]{
			Blocks.light_weighted_pressure_plate,"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustGold,8), new Object[]{
			new ItemStack(Items.golden_apple,1,0),"virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustGold,64), new Object[]{
			new ItemStack(Items.golden_apple,1,1),"virtuoel.unreal.debug",
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
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.dustCinnabarTiny,1), new Object[]{
			UnrealItems.dustGoldTiny,"oreGold",UnrealItems.dustRedstoneTiny,"virtuoel.unreal.debug",UnrealItems.dustGoldTiny,"oreGold",UnrealItems.dustGoldTiny,UnrealItems.dustRedstoneTiny,UnrealItems.dustGoldTiny,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.bucketTarydiumSludge,1), new Object[]{
			"blockTarydium","gemTarydium","blockAsbestos","dustAsbestos","listAllMercury","listAllMercury","virtuoel.unreal.debug","virtuoel.unreal.debug",Items.bucket,
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.bucketHealth,1), new Object[]{
			Settings.Crafting.cheapHealthBuckets?UnrealItems.dustDiamondTiny:"dustDiamond",new ItemStack(Items.golden_apple,1,Settings.Crafting.cheapHealthBuckets?0:1),"virtuoel.unreal.debug","listAllMilk",Settings.Crafting.cheapHealthBuckets?UnrealItems.dustDiamondTiny:"dustDiamond",Items.bucket,Settings.Crafting.cheapHealthBuckets?UnrealItems.dustDiamondTiny:"dustDiamond","virtuoel.unreal.debug",Settings.Crafting.cheapHealthBuckets?UnrealItems.dustDiamondTiny:"dustDiamond"
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.bucketNanoblack,1), new Object[]{
			"blockSlimeBlack",UnrealItems.translocatorDisc,"blockLithium","listAllMercury","virtuoel.unreal.debug",Items.bucket,"blockSlimeBlack","blockLithium","virtuoel.unreal.debug",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(UnrealItems.slimeballBlack,1), new Object[]{
			"blockSlime","blockInk","blockInk","blockAsbestos","blockSlime","blockInk","blockSlime","blockInk","blockSlime",
			}));
		
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(Items.slime_ball,16), new Object[]{
			"dyeLime","virtuoel.unreal.debug","dyeGreen","slimeballBlack","dyeLime","dyeGreen","dyeLime","dyeGreen","dyeLime",
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
		//TODO debug recipe end ---------------------------------------------------------------------------------------------------------------------------------																																																																											
		
		//begin 3x3 and 2x2 recipes
		Object[][] squareRecipes = {
		{//0: 9 crafted into 1 of this
			UnrealBlocks.blockTitanium,               UnrealItems.ingotTitanium,                UnrealBlocks.blockRutile,                UnrealItems.ingotRutile,
			UnrealBlocks.blockMagnesium,              UnrealItems.ingotMagnesium,               UnrealBlocks.blockTarydiumAlloyRefined,  UnrealItems.ingotTarydiumAlloyRefined,
			UnrealBlocks.blockTarydiumAlloyUnrefined, UnrealItems.ingotTarydiumAlloyUnrefined,  UnrealBlocks.blockTarydium,              UnrealItems.gemTarydium,
			UnrealBlocks.blockLeather,                UnrealBlocks.blockGunpowder,              UnrealBlocks.blockFlint,                 UnrealBlocks.blockBlaze,
			UnrealBlocks.blockGhastTear,              UnrealBlocks.blockNetherWart,             UnrealBlocks.blockAsbestos,              UnrealBlocks.blockCharcoal,
			UnrealBlocks.blockBedrockium,             UnrealItems.ingotBedrockium,              UnrealBlocks.blockCinnabar,              UnrealBlocks.blockCocoa,
			UnrealBlocks.blockLithium,                UnrealItems.ingotLithium,                 UnrealBlocks.blockInk,                   UnrealBlocks.blockSlimeBlack,
			UnrealBlocks.netherrackCompressed1x,      UnrealBlocks.netherrackCompressed2x,      UnrealBlocks.netherrackCompressed3x,     UnrealBlocks.netherrackCompressed4x,
			UnrealBlocks.endStoneCompressed1x,        UnrealBlocks.endStoneCompressed2x,        UnrealBlocks.endStoneCompressed3x,       UnrealBlocks.endStoneCompressed4x,
			UnrealItems.appleCompressed1x,            UnrealItems.appleCompressed2x,            UnrealItems.appleCompressed3x,           UnrealItems.appleCompressed4x
		},{//1: 9 crafted from 1 of this
			"blockTitanium",                          "ingotTitanium",                          "blockRutile",                           "ingotRutile",
			"blockMagnesium",                         "ingotMagnesium",                         "blockTarydiumAlloyRefined",             "ingotTarydiumAlloyRefined",
			"blockTarydiumAlloyUnrefined",            "ingotTarydiumAlloyUnrefined",            "blockTarydium",                         "gemTarydium",
			"blockLeather",                           "blockGunpowder",                         "blockFlint",                            "blockBlaze",
			"blockTear",                              "blockNetherWart",                        "blockAsbestos",                         "blockCharcoal",
			"blockBedrockium",                        "ingotBedrockium",                        "blockCinnabar",                         "blockCocoa",
			"blockLithium",                           "ingotLithium",                           "blockInk",                              "blockSlimeBlack",
			"compressedNetherrack1x",                 "compressedNetherrack2x",                 "compressedNetherrack3x",                "compressedNetherrack4x",
			"compressedEndStone1x",                   "compressedEndStone2x",                   "compressedEndStone3x",                  "compressedEndStone4x",
			"compressedApple1x",                      "compressedApple2x",                      "compressedApple3x",                     "compressedApple4x"
		},{//2: 1 crafted into 9 of this
			UnrealItems.ingotTitanium,                UnrealItems.nuggetTitanium,               UnrealItems.ingotRutile,                 UnrealItems.nuggetRutile,
			UnrealItems.ingotMagnesium,               UnrealItems.nuggetMagnesium,              UnrealItems.ingotTarydiumAlloyRefined,   UnrealItems.nuggetTarydiumAlloyRefined,
			UnrealItems.ingotTarydiumAlloyUnrefined,  UnrealItems.nuggetTarydiumAlloyUnrefined, UnrealItems.gemTarydium,                 UnrealItems.shardTarydium,
			Items.leather,                            Items.gunpowder,                          Items.flint,                             Items.blaze_rod,
			Items.ghast_tear,                         Items.nether_wart,                        UnrealItems.dustAsbestos,                Items.coal,
			UnrealItems.ingotBedrockium,              UnrealItems.nuggetBedrockium,             UnrealItems.crystalCinnabar,             Items.dye,
			UnrealItems.ingotLithium,                 UnrealItems.nuggetLithium,                Items.dye,                               UnrealItems.slimeballBlack,
			Blocks.netherrack,                        UnrealBlocks.netherrackCompressed1x,      UnrealBlocks.netherrackCompressed2x,     UnrealBlocks.netherrackCompressed3x,
			Blocks.end_stone,                         UnrealBlocks.endStoneCompressed1x,        UnrealBlocks.endStoneCompressed2x,       UnrealBlocks.endStoneCompressed3x,
			Items.apple,                              UnrealItems.appleCompressed1x,            UnrealItems.appleCompressed2x,           UnrealItems.appleCompressed3x
		},{//3: 1 crafted from 9 of this
			"ingotTitanium",                          "nuggetTitanium",                         "ingotRutile",                          "nuggetRutile",
			"ingotMagnesium",                         "nuggetMagnesium",                        "ingotTarydiumAlloyRefined",            "nuggetTarydiumAlloyRefined",
			"ingotTarydiumAlloyUnrefined",            "nuggetTarydiumAlloyUnrefined",           "gemTarydium",                          "shardTarydium",
			Items.leather,                            "dustGunpowder",                          Items.flint,                            "rodBlaze",
			"itemTear",                               "cropNetherWart",                         "dustAsbestos",                         "charcoal",
			"ingotBedrockium",                        "nuggetBedrockium",                       "crystalCinnabar",                      "cropCocoa",
			"ingotLithium",                           "nuggetLithium",                          "itemInkSac",                           "slimeballBlack",
			"netherrack",                             "compressedNetherrack1x",                 "compressedNetherrack2x",               "compressedNetherrack3x",
			Blocks.end_stone,                         "compressedEndStone1x",                   "compressedEndStone2x",                 "compressedEndStone3x",
			"cropApple",                              "compressedApple1x",                      "compressedApple2x",                    "compressedApple3x"
		},{//4: component damage
			0,0,0,0,
			0,0,0,0,
			0,0,0,0,
			0,0,0,0,
			0,0,0,1,
			0,0,0,3,
			0,0,0,0,
			0,0,0,0,
			0,0,0,0,
			0,0,0,0
		},{//5: crafts into an item instead of a block
			false, true,  false, true,
			false, true,  false, true,
			false, true,  false, true,
			false, false, false, false,
			false, false, false, false,
			false, true,  false, false,
			false, true,  false, false,
			false, false, false, false,
			false, false, false, false,
			true, true,  true, true
		},{//6: crafts from items instead of blocks
			true,  true,  true,  true,
			true,  true,  true,  true,
			true,  true,  true,  true,
			true,  true,  true,  true,
			true,  true,  true,  true,
			true,  true,  true,  true,
			true,  true,  true,  true,
			false, false, false, false,
			false, false, false, false,
			true,  true,  true,  true
		},{//7: crafted from this many materials
			9,9,9,9,
			9,9,9,9,
			9,9,9,9,
			9,9,9,9,
			9,9,9,9,
			9,9,9,9,
			9,9,9,9,
			9,9,9,9,
			9,9,9,9,
			9,9,9,9
		}};
		
		for(int i=0;i<squareRecipes[0].length;i++)
		{
			
			GameRegistry.addRecipe((Integer) squareRecipes[7][i]==9?(Boolean)squareRecipes[5][i]?
			new ShapedOreRecipe(new ItemStack((Item) squareRecipes[0][i],1), new Object[]{
				"TTT","TTT","TTT",'T',squareRecipes[3][i],
				}):
			new ShapedOreRecipe(new ItemStack((Block)squareRecipes[0][i],1), new Object[]{
				"TTT","TTT","TTT",'T',squareRecipes[3][i],
				}):
																  (Boolean)squareRecipes[5][i]?
			new ShapedOreRecipe(new ItemStack((Item) squareRecipes[0][i],1), new Object[]{
				"TT","TT",'T',squareRecipes[3][i],
				}):
			new ShapedOreRecipe(new ItemStack((Block)squareRecipes[0][i],1), new Object[]{
				"TT","TT",'T',squareRecipes[3][i],
				})
			);
			
			GameRegistry.addRecipe((Boolean)squareRecipes[6][i]?
			new ShapedOreRecipe(new ItemStack((Item)squareRecipes[2][i],(Integer) squareRecipes[7][i],(Integer) squareRecipes[4][i]), new Object[]{
				"T",'T',squareRecipes[1][i],
			}):
			new ShapedOreRecipe(new ItemStack((Block)squareRecipes[2][i],(Integer) squareRecipes[7][i],(Integer) squareRecipes[4][i]), new Object[]{
				"T",'T',squareRecipes[1][i],
			})
			);
		}
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(UnrealBlocks.blockEnder,1), Settings.Crafting.ninePearlsPerEnderBlock
			?new Object[]{"TTT","TTT","TTT",'T',Items.ender_pearl,}
			:new Object[]{"TT", "TT" ,      'T',Items.ender_pearl,}
			));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ender_pearl,Settings.Crafting.ninePearlsPerEnderBlock?9:4), new Object[]{
			"T",'T',"blockEnder",
			}));
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.ender_pearl,Settings.Crafting.ninePearlsPerEnderBlock?9:4), new Object[]{
			"T",'T',"blockEnderPearl",
			}));
		
		//end blocks ---------------------------------------------------------------------------------------------------------------------------------
		
		Object[][] dustRecipes = {
		{
			Settings.Crafting.nineTinyDustPerTitaniumDust,             Settings.Crafting.nineTinyDustPerRutileDust,    Settings.Crafting.nineTinyDustPerMagnesiumDust,
			Settings.Crafting.nineTinyDustPerCinnabarDust,             Settings.Crafting.nineTinyDustPerAsbestosDust,  Settings.Crafting.nineTinyDustPerTarydiumAlloyUnrefinedDust,
			Settings.Crafting.nineTinyDustPerTarydiumAlloyRefinedDust, Settings.Crafting.nineTinyDustPerCoalDust,      Settings.Crafting.nineTinyDustPerCharcoalDust,
			Settings.Crafting.nineTinyDustPerIronDust,                 Settings.Crafting.nineTinyDustPerLapisDust,     Settings.Crafting.nineTinyDustPerGoldDust,
			Settings.Crafting.nineTinyDustPerRedstoneDust,             Settings.Crafting.nineTinyDustPerGlowstoneDust, Settings.Crafting.nineTinyDustPerNetherQuartzDust,
			Settings.Crafting.nineTinyDustPerDiamondDust,              Settings.Crafting.nineTinyDustPerEmeraldDust,   Settings.Crafting.nineTinyDustPerObsidianDust,
			Settings.Crafting.nineTinyDustPerLithiumDust,              Settings.Crafting.nineTinyDustPerGunpowderDust
		},{
			UnrealItems.dustTitanium,                                  UnrealItems.dustRutile,                         UnrealItems.dustMagnesium,
			UnrealItems.dustCinnabar,                                  UnrealItems.dustAsbestos,                       UnrealItems.dustTarydiumAlloyUnrefined,
			UnrealItems.dustTarydiumAlloyRefined,                      UnrealItems.dustCoal,                           UnrealItems.dustCharcoal,
			UnrealItems.dustIron,                                      UnrealItems.dustLapis,                          UnrealItems.dustGold,
			Items.redstone,                                            Items.glowstone_dust,                           UnrealItems.dustNetherQuartz,
			UnrealItems.dustDiamond,                                   UnrealItems.dustEmerald,                        UnrealItems.dustObsidian,
			UnrealItems.dustLithium,                                   Items.gunpowder,
		},{
			UnrealItems.dustTitaniumTiny,                              UnrealItems.dustRutileTiny,                     UnrealItems.dustMagnesiumTiny,                  
			UnrealItems.dustCinnabarTiny,                              UnrealItems.dustAsbestosTiny,                   UnrealItems.dustTarydiumAlloyUnrefinedTiny,
			UnrealItems.dustTarydiumAlloyRefinedTiny,                  UnrealItems.dustCoalTiny,                       UnrealItems.dustCharcoalTiny,
			UnrealItems.dustIronTiny,                                  UnrealItems.dustLapisTiny,                      UnrealItems.dustGoldTiny,
			UnrealItems.dustRedstoneTiny,                              UnrealItems.dustGlowstoneTiny,                  UnrealItems.dustNetherQuartzTiny,
			UnrealItems.dustDiamondTiny,                               UnrealItems.dustEmeraldTiny,                    UnrealItems.dustObsidianTiny,
			UnrealItems.dustLithiumTiny,                               UnrealItems.dustGunpowderTiny
		},{
			"dustTitanium",                                            "dustRutile",                                   "dustMagnesium",
			"dustCinnabar",                                            "dustAsbestos",                                 "dustTarydiumAlloyUnrefined",
			"dustTarydiumAlloyRefined",                                "dustCoal",                                     "dustCharcoal",
			"dustIron",                                                "dustLapis",                                    "dustGold",
			"dustRedstone",                                            "dustGlowstone",                                "dustNetherQuartz",
			"dustDiamond",                                             "dustEmerald",                                  "dustObsidian",
			"dustLithium",                                             "dustGunpowder"
		}};
		
		for(int i=0;i<dustRecipes[0].length;i++)
		{
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack((Item)dustRecipes[2][i],((Boolean)dustRecipes[0][i])?9:4), new Object[]{
				"T",'T',dustRecipes[3][i],
				}));
			
			GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack((Item)dustRecipes[1][i],1),((Boolean)dustRecipes[0][i])?
			new Object[]{
				"TTT","TTT","TTT",'T',dustRecipes[2][i],
			}:
			new Object[]{
				"TT","TT",'T',dustRecipes[2][i],
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
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Items.golden_apple,9,0), new Object[]{
			"GGG","GAG","GGG",'G',"blockGold",'A',"compressedApple1x",
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
		
		GameRegistry.addSmelting(UnrealItems.invisibility, 
				new ItemStack(UnrealItems.ingotMagnesium,20), 0.1F);
		
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
		OreDictionary.registerOre("compressedApple1x", UnrealItems.appleCompressed1x);
		OreDictionary.registerOre("compressedApple2x", UnrealItems.appleCompressed2x);
		OreDictionary.registerOre("compressedApple3x", UnrealItems.appleCompressed3x);
		OreDictionary.registerOre("compressedApple4x", UnrealItems.appleCompressed4x);
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
		OreDictionary.registerOre("blockLeather", UnrealBlocks.blockLeather);
		OreDictionary.registerOre("blockSlimeBlack", UnrealBlocks.blockSlimeBlack);
		OreDictionary.registerOre("slimeballBlack", UnrealItems.slimeballBlack);
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
