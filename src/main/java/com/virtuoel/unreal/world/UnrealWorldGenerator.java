package com.virtuoel.unreal.world;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import com.virtuoel.unreal.init.UnrealBlocks;
import com.virtuoel.unreal.reference.Settings;

public class UnrealWorldGenerator implements IWorldGenerator
{
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.getDimensionId())
		{
			case -1: generateNether(world, random,chunkX*16,chunkZ*16);
			case 0 : generateSurface(world, random,chunkX*16,chunkZ*16);
			case 1 : generateEnd(world, random,chunkX*16,chunkZ*16);
		}
	}
	
	private void generateSurface(World world, Random random, int BlockX, int BlockZ)
	{
		doGenerateOre(world, random, BlockX, BlockZ, 
				16, 24, //range
				UnrealBlocks.oreRutile, 0, //block, data
				Blocks.stone, //replace
				5, 1, //base #, rand #
				7, //ore qty
				false, //emerald-type generation
				Blocks.stone //debug orefinder block id
				);
		
		doGenerateOre(world, random, BlockX, BlockZ, 
				32, 64, //range
				UnrealBlocks.oreMagnesium, 0, //block, data
				Blocks.stone, //replace
				7, 1, //base #, rand #
				6, //ore qty
				false, //emerald-type generation
				Blocks.coal_block //debug orefinder block id
				);
		
		doGenerateOre(world, random, BlockX, BlockZ, 
				6, 50, //range
				UnrealBlocks.oreTarydium, 0, //block, data
				Blocks.stone, //replace
				3, 6, //base #, rand #
				1, //ore qty
				true, //emerald-type generation
				Blocks.lapis_block //debug orefinder block id
				);
		
		doGenerateOre(world, random, BlockX, BlockZ, 
				2, 72, //range
				UnrealBlocks.oreAsbestos, 0, //block, data
				Blocks.stone, //replace
				6, 1, //base #, rand #
				5, //ore qty
				false, //emerald-type generation
				Blocks.iron_block //debug orefinder block id
				);
		
		doGenerateOre(world, random, BlockX, BlockZ, 
				1, 4, //range
				UnrealBlocks.oreBedrockiumHidden, 0, //block, data
				Blocks.bedrock, //replace
				2, 2, //base #, rand #
				1, //ore qty
				true, //emerald-type generation
				Blocks.gold_block //debug orefinder block id
				);
	}
	
	private void generateNether(World world, Random random, int BlockX, int BlockZ)
	{
		doGenerateOre(world, random, BlockX, BlockZ, 
				6, 126, //range
				UnrealBlocks.oreTarydiumNether, 0, //block, data
				Blocks.netherrack, //replace
				3, 6, //base #, rand #
				1, //ore qty
				true, //emerald-type generation
				Blocks.redstone_block //debug orefinder block block
				);
		
	}
	
	private void generateEnd(World world, Random random, int BlockX, int BlockZ)
	{
		doGenerateOre(world, random, BlockX, BlockZ, 
				24, 120, //range
				UnrealBlocks.oreTarydiumEnd, 0, //block, data
				Blocks.end_stone, //replace
				3, 6, //base #, rand #
				1, //ore qty
				true, //emerald-type generation
				Blocks.diamond_block //debug orefinder block
				);
		
		doGenerateOre(world, random, BlockX, BlockZ, 
				24, 128, //range
				UnrealBlocks.oreTarydiumObsidian, 0, //block, data
				Blocks.obsidian, //replace
				3, 6, //base #, rand #
				1, //ore qty
				true, //emerald-type generation
				Blocks.emerald_block //debug orefinder block
				);
		
	}
	
	private void doGenerateOre(World world, Random random, int BlockX, int BlockZ, int minY, int maxY, Block oreBlock, int oreData, Block worldStoneReplace, int amountBase, int amountRandom, int amountOre, boolean singleBlock, Block debugBlock)
	{
		for(int i=0; i<amountBase+random.nextInt(amountRandom);i++)
		{
			int Xcoord = BlockX + random.nextInt(16);
			int Zcoord = BlockZ + random.nextInt(16);
			int Ycoord = random.nextInt(maxY-minY)+minY;
			
			if(singleBlock)
			{
				BlockPos atCoord = new BlockPos(Xcoord, Ycoord, Zcoord);
				IBlockState blockAtCoord = world.getBlockState(atCoord);
				/*
				if (blockAtCoord == worldStoneReplace)
				{
					world.setBlockState(new BlockPos(Xcoord, Ycoord, Zcoord), oreBlock.getStateFromMeta(oreData), 2);
					if(Settings.Debug.debugWorldGenerator)world.setBlockState(new BlockPos(Xcoord, 130, Zcoord), debugBlock.getDefaultState(), 2);
				}*/
				if (world.getBlockState(atCoord).getBlock().isReplaceableOreGen(world, atCoord, net.minecraft.block.state.pattern.BlockHelper.forBlock(worldStoneReplace)))
	            {
	                world.setBlockState(atCoord, oreBlock.getDefaultState(), 2);
	            }
			}
			else
			{
				new WorldGenMinable(oreBlock.getStateFromMeta(oreData), amountOre)
				.generate(world, random, new BlockPos(Xcoord, Ycoord, Zcoord));
				if(Settings.Debug.debugWorldGenerator)world.setBlockState(new BlockPos(Xcoord, 130, Zcoord), debugBlock.getDefaultState(), 2);
			}
		}
	}
}
