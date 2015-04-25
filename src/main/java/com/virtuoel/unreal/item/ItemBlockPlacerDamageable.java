package com.virtuoel.unreal.item;

import java.util.List;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;

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


public class ItemBlockPlacerDamageable extends ItemBlockPlacer
{
	private int damagePerPlace = 0;
	private int damageOnCraft = 1;
	
	public ItemBlockPlacerDamageable(Block block)
	{
		super(block);
		this.setNoRepair()
		.setMaxStackSize(1).setHasSubtypes(true)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	public ItemBlockPlacerDamageable setDamageOnCraft(int dmg)
	{
		this.damageOnCraft = dmg <= 0 ? 0 : dmg;
		return this;
	}
	
	public int getDamageOnCraft()
	{
		return damageOnCraft;
	}
	
	public ItemBlockPlacerDamageable setDamagePerPlace(int dmg)
	{
		this.damagePerPlace = dmg <= 0 ? 0 : dmg;
		return this;
	}
	
	public int getDamagePerPlace()
	{
		return damagePerPlace;
	}
	
	@Override
	public void getSubItems(Item par1item, CreativeTabs par2CreativeTabs, List par3List)
	{
		if(((ItemBlockPlacerDamageable)par1item).getDamageOnCraft() != 0)
		{
			par3List.add(new ItemStack(par1item, 1, 1));
			par3List.add(new ItemStack(par1item, 1, par1item.getMaxDamage()));
		}
		if(((ItemBlockPlacerDamageable)par1item).getDamageOnCraft() != 1 && ((ItemBlockPlacerDamageable)par1item).getDamageOnCraft() != par1item.getMaxDamage())
		{
			par3List.add(new ItemStack(par1item, 1, ((ItemBlockPlacerDamageable)par1item).getDamageOnCraft()));
		}
	}
	
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
    	if((stack.getMaxDamage() - this.getDamagePerPlace()) < stack.getItemDamage())
		{
			return false;
		}
    	
    	IBlockState iblockstate = worldIn.getBlockState(pos);
        Block block = iblockstate.getBlock();

        if (block == Blocks.snow_layer && ((Integer)iblockstate.getValue(BlockSnow.LAYERS)).intValue() < 1)
        {
            side = EnumFacing.UP;
        }
        else if (!block.isReplaceable(worldIn, pos))
        {
            pos = pos.offset(side);
        }

        if (stack.stackSize == 0)
        {
            return false;
        }
        else if (!playerIn.canPlayerEdit(pos, side, stack))
        {
            return false;
        }
        else if (pos.getY() == 255 && this.block.getMaterial().isSolid())
        {
            return false;
        }
        else if (worldIn.canBlockBePlaced(this.block, pos, false, side, (Entity)null, stack))
        {
            int i = this.getMetadata(stack.getMetadata());
            IBlockState iblockstate1 = this.block.onBlockPlaced(worldIn, pos, side, hitX, hitY, hitZ, i, playerIn);

            if (placeBlockAt(stack, playerIn, worldIn, pos, side, hitX, hitY, hitZ, iblockstate1))
            {
                worldIn.playSoundEffect((double)((float)pos.getX() + 0.5F), (double)((float)pos.getY() + 0.5F), (double)((float)pos.getZ() + 0.5F), this.block.stepSound.getPlaceSound(), (this.block.stepSound.getVolume() + 1.0F) / 2.0F, this.block.stepSound.getFrequency() * 0.8F);
                //--stack.stackSize;
                stack.damageItem(this.getDamagePerPlace(), playerIn);
            }

            return true;
        }
        else
        {
            return false;
        }
    }
    
}
