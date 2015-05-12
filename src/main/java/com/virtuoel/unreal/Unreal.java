package com.virtuoel.unreal;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import com.virtuoel.unreal.client.handler.KeyInputEventHandler;
import com.virtuoel.unreal.client.handler.UnrealEventHandler;
import com.virtuoel.unreal.handler.ConfigurationHandler;
import com.virtuoel.unreal.handler.UnrealBlockBreakHandler;
import com.virtuoel.unreal.handler.UnrealBucketHandler;
import com.virtuoel.unreal.handler.UnrealFuelHandler;
import com.virtuoel.unreal.init.UnrealBlocks;
import com.virtuoel.unreal.init.UnrealEntities;
import com.virtuoel.unreal.init.UnrealFluids;
import com.virtuoel.unreal.init.UnrealItems;
import com.virtuoel.unreal.init.UnrealRecipes;
import com.virtuoel.unreal.proxy.IProxy;
import com.virtuoel.unreal.reference.Names;
import com.virtuoel.unreal.reference.Reference;
import com.virtuoel.unreal.reference.Settings;
import com.virtuoel.unreal.utility.LogHelper;
import com.virtuoel.unreal.world.UnrealWorldGenerator;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Unreal
{
	@Mod.Instance(Reference.MOD_ID)
	public static Unreal instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static IProxy proxy;
    
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		LogHelper.info("Pre Initilization Started.");
		
		
		ConfigurationHandler.init(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
		LogHelper.info("Configuration File Loaded.");
		
		proxy.registerKeyBindings();
		LogHelper.info("Key Binding Registration Completed.");
		
		if(!Settings.Debug.debugClearItems)
		{
			
			/*
			UnrealFluids.initFluids();
			LogHelper.info("Fluids and Fluid Blocks Initilized.");
			*/
	    	UnrealBlocks.init();
	    	UnrealBlocks.register();
			LogHelper.info("Blocks Initilized.");
			
	    	UnrealItems.init();
	    	UnrealItems.register();
			LogHelper.info("Items Initilized.");
			
			UnrealRecipes.initOreDict();
			LogHelper.info("Ore Dictionary Registration Completed.");
			/*
			FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack(Names.Fluids.FLUID_MERCURY, FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(UnrealItems.bucketMercury), new ItemStack(Items.bucket));
			FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack(Names.Fluids.FLUID_TARYDIUM_SLUDGE, FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(UnrealItems.bucketTarydiumSludge), new ItemStack(Items.bucket));
			FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack(Names.Fluids.FLUID_HEALTH, FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(UnrealItems.bucketHealth), new ItemStack(Items.bucket));
			FluidContainerRegistry.registerFluidContainer(FluidRegistry.getFluidStack(Names.Fluids.FLUID_NANOBLACK, FluidContainerRegistry.BUCKET_VOLUME), new ItemStack(UnrealItems.bucketNanoblack), new ItemStack(Items.bucket));
			LogHelper.info("Fluid Container Items Registered.");
			
			UnrealBucketHandler.INSTANCE.buckets.put(UnrealFluids.fluidBlockMercury, UnrealItems.bucketMercury);
			UnrealBucketHandler.INSTANCE.buckets.put(UnrealFluids.fluidBlockTarydiumSludge, UnrealItems.bucketTarydiumSludge);
			UnrealBucketHandler.INSTANCE.buckets.put(UnrealFluids.fluidBlockHealth, UnrealItems.bucketHealth);
			UnrealBucketHandler.INSTANCE.buckets.put(UnrealFluids.fluidBlockNanoblack, UnrealItems.bucketNanoblack);
			MinecraftForge.EVENT_BUS.register(UnrealBucketHandler.INSTANCE);
			LogHelper.info("Bucket Handler Registered.");
			*/
		}
		else
		{
			LogHelper.info("Fluids Cleared.");
			LogHelper.info("Blocks Cleared.");
			LogHelper.info("Items Cleared.");
			LogHelper.info("Fluid Registration Skipped.");
			LogHelper.info("Ore Dictionary Registration Skipped.");
			LogHelper.info("Fluid Container Item Registration Skipped.");
			LogHelper.info("Bucket Handler Registration Skipped.");
		}
		
		LogHelper.info("Pre Initilization Completed.");
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		LogHelper.info("Initilization Started.");
		
		MinecraftForge.EVENT_BUS.register(new UnrealEventHandler());
		LogHelper.info("General Event Handler Registered.");
		
		FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
		LogHelper.info("Key Input Event Handler Registered.");
		
		if(!Settings.Debug.debugClearItems)
		{
			MinecraftForge.EVENT_BUS.register(new UnrealBlockBreakHandler());
			LogHelper.info("Block Break Event Handler Registered.");
			
			UnrealEntities.register();
			LogHelper.info("Entities Registered.");
			
	    	proxy.registerRenders();
			LogHelper.info("Item, Block, and Entity Renders Registered.");
			
			GameRegistry.registerWorldGenerator(new UnrealWorldGenerator(), Settings.World.worldGeneratorWeight);
			LogHelper.info("World Generator Registered.");
			
			GameRegistry.registerFuelHandler(new UnrealFuelHandler());
			LogHelper.info("Fuel Handler Registered.");
			
			UnrealRecipes.init();
			LogHelper.info("Crafting Recipes Initilized.");
			
			UnrealRecipes.initSmelting();
			LogHelper.info("Smelting Recipes Initilized.");
		}
		else
		{
			LogHelper.info("Block Break Event Handler Disabled.");
			LogHelper.info("Entities Cleared.");
			LogHelper.info("Renders Disabled.");
			LogHelper.info("World Generation Disabled.");
			LogHelper.info("Fuel Handler Disabled.");
			LogHelper.info("Crafting Recipes Cleared.");
			LogHelper.info("Smelting Recipes Cleared.");
		}
		
		LogHelper.info("Initilization Completed.");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Post Initilization Started.");
		
		//integration temp
		
		
		if(Settings.Debug.printDebugOreDictionaryValues)
		{
			for(String oreName : OreDictionary.getOreNames())
			{
				LogHelper.info(oreName);
			}
		}
		
		LogHelper.info("Post Initilization Completed.");
	}
}
