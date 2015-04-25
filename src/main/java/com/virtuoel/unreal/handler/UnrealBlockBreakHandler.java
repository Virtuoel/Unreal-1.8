package com.virtuoel.unreal.handler;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.virtuoel.unreal.init.UnrealItems;
import com.virtuoel.unreal.utility.LogHelper;

public class UnrealBlockBreakHandler
{
	@SubscribeEvent(/*priority=EventPriority.HIGHEST,*/receiveCanceled=true)
    public void onPlayerStartBreaking(PlayerEvent.BreakSpeed event)
	{
		//LogHelper.info("breaking...");
        if(event.entityPlayer.getCurrentEquippedItem() != null && event.entityPlayer.getCurrentEquippedItem().getItem() == UnrealItems.pickaxeTarydiumAlloyRefined)
        {
    		//LogHelper.info("with pick...");
        	if(event.state.getBlock() == Blocks.bedrock || event.entityPlayer.worldObj.getBlockState(event.pos).getBlock() == Blocks.bedrock)
        	{
        		//LogHelper.info("bedrock...");
        		//event.state.getBlock().setHardness(20.0F);
        		//event.setCanceled(false);
        		//event.newSpeed = 20.0F;
        		
        	}
        	/*if(block.getBlockHardness(world, event.x, event.y, event.z) == -1.0F)
                {
                    event.newSpeed = 20.0F;
                }*/
        }
        else
        {
        	if(event.state == Blocks.bedrock)
        	{
        		//event.state.getBlock().setBlockUnbreakable();
        		//event.setCanceled(true);
        		
        	}
        }
    }
	
}
