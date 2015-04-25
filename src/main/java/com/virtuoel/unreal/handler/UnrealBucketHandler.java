package com.virtuoel.unreal.handler;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.fml.common.eventhandler.Event.Result;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class UnrealBucketHandler
{
	public static UnrealBucketHandler INSTANCE = new UnrealBucketHandler();
	public Map<Block, Item> buckets = new HashMap<Block, Item>();
	
	@SubscribeEvent
	public void onBucketFill(FillBucketEvent event)
	{
		ItemStack result = fillCustomBucket(event.world, event.target);
		if (result == null)
		{
			return;
		}
		event.result = result;
		event.setResult(Result.ALLOW);
	}
	
	private ItemStack fillCustomBucket(World world, MovingObjectPosition pos)
	{
		/*IBlockState block = world.getBlockState(pos.getBlockPos());
		Item bucket = buckets.get(block);
		if (bucket != null && world.getBlockState(pos.getBlockPos()) == 0)
		{
			world.setBlockToAir(pos.getBlockPos());
			return new ItemStack(bucket);
		}
		else
		{*/
			return null;
		//}
	}
}
