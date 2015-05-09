package com.virtuoel.unreal.item;

import java.util.List;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.UnrealBlocks;
import com.virtuoel.unreal.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSnow;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;


public class ItemForceField extends ItemItemBlockPlacerDamageable
{
	public ItemForceField(Block block)
	{
		super(block);
		this.setNoRepair()
		.setMaxStackSize(1).setHasSubtypes(true)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
		if(playerIn.isSneaking() && (stack.getItemDamage() > this.getDamageOnCraft() || playerIn.capabilities.isCreativeMode))
		{
			if(worldIn.getBlockState(pos).getBlock() == UnrealBlocks.blockForceField)
			{
				worldIn.playSoundEffect((double)((float)pos.getX() + 0.5F), (double)((float)pos.getY() + 0.5F), (double)((float)pos.getZ() + 0.5F), this.block.stepSound.getPlaceSound(), (this.block.stepSound.getVolume() + 1.0F) / 2.0F, this.block.stepSound.getFrequency() * 0.8F);
            	worldIn.setBlockToAir(pos);
				stack.setItemDamage(this.getDamageOnCraft());
				return true;
			}
		}
		return super.onItemUse(stack, playerIn, worldIn, pos, side, hitX, hitY, hitZ);
    }
    
}
