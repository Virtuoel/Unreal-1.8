package com.virtuoel.unreal.init;

import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.virtuoel.unreal.block.BlockFluidUnreal;
import com.virtuoel.unreal.fluid.Health;
import com.virtuoel.unreal.fluid.Mercury;
import com.virtuoel.unreal.fluid.Nanoblack;
import com.virtuoel.unreal.fluid.Tarydium;
import com.virtuoel.unreal.reference.Names;
import com.virtuoel.unreal.reference.Reference;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class UnrealFluids
{

	public static Fluid fluidMercury = new Mercury(Names.Fluids.FLUID_MERCURY)
		.setDensity(1500).setViscosity(2500);
	
	public static Fluid fluidTarydiumSludge = new Tarydium(Names.Fluids.FLUID_TARYDIUM_SLUDGE)
		.setDensity(2000).setViscosity(3250).setLuminosity(7);
	
	public static Fluid fluidHealth = new Health(Names.Fluids.FLUID_HEALTH)
		.setDensity(1000).setViscosity(1500).setLuminosity(15);
	
	public static Fluid fluidNanoblack = new Nanoblack(Names.Fluids.FLUID_NANOBLACK)
		.setDensity(3000).setViscosity(4000).setLuminosity(3);
	
	//fluid blocks
	public static BlockFluidUnreal fluidBlockMercury;
	public static BlockFluidUnreal fluidBlockTarydiumSludge;
	public static BlockFluidUnreal fluidBlockHealth;
	public static BlockFluidUnreal fluidBlockNanoblack;
	
	public static void initFluids()
	{
		/*
		FluidRegistry.registerFluid(fluidMercury);
		Fluid fMercury = FluidRegistry.getFluid(fluidMercury.getName());
		fluidBlockMercury = (BlockFluidUnreal)
				new BlockFluidUnreal(fMercury, Material.water)
				.setBlockName(Names.Fluids.FLUID_BLOCK_MERCURY);
		GameRegistry.registerBlock(fluidBlockMercury, Names.Fluids.FLUID_BLOCK_MERCURY);
		fMercury.setIcons(fluidBlockMercury.getIcon(Reference.Blocks.Faces.TOP, 0), fluidBlockMercury.getIcon(Reference.Blocks.Faces.NORTH, 0));
		fMercury.setBlock(fluidBlockMercury);
		*/
		
		FluidRegistry.registerFluid(fluidMercury);
		fluidMercury.setUnlocalizedName(Names.Fluids.FLUID_MERCURY);
		fluidBlockMercury = (BlockFluidUnreal)
				new BlockFluidUnreal(fluidMercury, Material.water)
				.setUnlocalizedName(Names.Fluids.FLUID_BLOCK_MERCURY);
		//fluidMercury.setIcons(fluidBlockMercury.getIcon(Reference.Blocks.Faces.TOP, 0), fluidBlockMercury.getIcon(Reference.Blocks.Faces.NORTH, 0));
		GameRegistry.registerBlock(fluidBlockMercury, Names.Fluids.FLUID_BLOCK_MERCURY);
		
		FluidRegistry.registerFluid(fluidTarydiumSludge);
		fluidTarydiumSludge.setUnlocalizedName(Names.Fluids.FLUID_TARYDIUM_SLUDGE);
		fluidBlockTarydiumSludge = (BlockFluidUnreal)
				new BlockFluidUnreal(fluidTarydiumSludge, Material.water)
				.setUnlocalizedName(Names.Fluids.FLUID_BLOCK_TARYDIUM_SLUDGE);
		//fluidTarydiumSludge.setIcons(fluidBlockTarydiumSludge.getIcon(Reference.Blocks.Faces.TOP, 0), fluidBlockTarydiumSludge.getIcon(Reference.Blocks.Faces.NORTH, 0));
		GameRegistry.registerBlock(fluidBlockTarydiumSludge, Names.Fluids.FLUID_BLOCK_TARYDIUM_SLUDGE);
		
		FluidRegistry.registerFluid(fluidHealth);
		fluidHealth.setUnlocalizedName(Names.Fluids.FLUID_HEALTH);
		fluidBlockHealth = (BlockFluidUnreal)
				new BlockFluidUnreal(fluidHealth, Material.water)
				.setUnlocalizedName(Names.Fluids.FLUID_BLOCK_HEALTH);
		//fluidHealth.setIcons(fluidBlockHealth.getIcon(Reference.Blocks.Faces.TOP, 0), fluidBlockHealth.getIcon(Reference.Blocks.Faces.NORTH, 0));
		GameRegistry.registerBlock(fluidBlockHealth, Names.Fluids.FLUID_BLOCK_HEALTH);
		
		FluidRegistry.registerFluid(fluidNanoblack);
		fluidNanoblack.setUnlocalizedName(Names.Fluids.FLUID_NANOBLACK);
		fluidBlockNanoblack = (BlockFluidUnreal)
				new BlockFluidUnreal(fluidNanoblack, Material.water)
				.setUnlocalizedName(Names.Fluids.FLUID_BLOCK_NANOBLACK);
		//fluidNanoblack.setIcons(fluidBlockNanoblack.getIcon(Reference.Blocks.Faces.TOP, 0), fluidBlockNanoblack.getIcon(Reference.Blocks.Faces.NORTH, 0));
		GameRegistry.registerBlock(fluidBlockNanoblack, Names.Fluids.FLUID_BLOCK_NANOBLACK);
		
		
	}
}
