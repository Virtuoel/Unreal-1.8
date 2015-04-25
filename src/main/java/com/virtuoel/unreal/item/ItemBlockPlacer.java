package com.virtuoel.unreal.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.UnrealBlocks;
import com.virtuoel.unreal.init.UnrealItems;

public class ItemBlockPlacer extends ItemBlock
{
	//public final Block block;
	
	public ItemBlockPlacer(Block block)
	{
		super(block);
		//this.block = block;
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
		//this.block.setCreativeTab(null);
	}
	
	public ItemBlockPlacer setUnlocalizedName(String unlocalizedName)
	{
		super.setUnlocalizedName(unlocalizedName);
		return this;
	}
    
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List tooltip, boolean advanced)
    {
    	String info = "";
		if(stack.getItem()==Item.getItemFromBlock(UnrealBlocks.netherrackCompressed1x))
		{
			info = "9 Netherrack";
		}
		else if(stack.getItem()==Item.getItemFromBlock(UnrealBlocks.netherrackCompressed2x))
		{
			info = "81 Netherrack";
		}
		else if(stack.getItem()==Item.getItemFromBlock(UnrealBlocks.netherrackCompressed3x))
		{
			info = "729 Netherrack";
		}
		else if(stack.getItem()==Item.getItemFromBlock(UnrealBlocks.netherrackCompressed4x))
		{
			info = "6561 Netherrack";
		}
		else if(stack.getItem()==Item.getItemFromBlock(UnrealBlocks.endStoneCompressed1x))
		{
			info = "9 End Stone";
		}
		else if(stack.getItem()==Item.getItemFromBlock(UnrealBlocks.endStoneCompressed2x))
		{
			info = "81 End Stone";
		}
		else if(stack.getItem()==Item.getItemFromBlock(UnrealBlocks.endStoneCompressed3x))
		{
			info = "729 End Stone";
		}
		else if(stack.getItem()==Item.getItemFromBlock(UnrealBlocks.endStoneCompressed4x))
		{
			info = "6561 End Stone";
		}
		else if(stack.getItem()==Item.getItemFromBlock(UnrealBlocks.blockUUTC))
		{
			info = "Universally Usable Tarydium Composite";
		}
		if(!info.isEmpty())
		{
			tooltip.add(info);
		}
    }
    
    @Override
    public EnumRarity getRarity(ItemStack p_77613_1_)
    {
    	if(this.getBlock()==UnrealBlocks.blockEnderCrystal || 
    			this.getBlock()==UnrealBlocks.blockBedrockium || 
    			this.getBlock()==UnrealBlocks.oreBedrockium || 
    			this.getBlock()==UnrealBlocks.blockUUTC)
		{
			return EnumRarity.EPIC;
		}
        return p_77613_1_.isItemEnchanted() ? EnumRarity.RARE : EnumRarity.COMMON;
    }
    
    @Override
	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
	{
		super.onUpdate(par1ItemStack, par2World, par3Entity, par4, par5);
		if(par3Entity instanceof EntityPlayer)
		{
			if(par1ItemStack.getItem()==Item.getItemFromBlock(UnrealBlocks.blockAsbestos))
			{
				if(((EntityPlayer)par3Entity).inventory.armorItemInSlot(2)!=null&&
						((EntityPlayer)par3Entity).inventory.armorItemInSlot(2).getItem()==
								UnrealItems.armorToxinSuit)
				{
					if(itemRand.nextInt(100)==0)
					{
						((EntityPlayer)par3Entity).inventory.armorItemInSlot(2).damageItem(1, (EntityPlayer)par3Entity);
					}
				}
				else
				{
					if(((EntityPlayer)par3Entity).getActivePotionEffect(Potion.poison)==null||
							((EntityPlayer)par3Entity).getActivePotionEffect(Potion.poison).getDuration()<4)
					{
						PotionEffect potioneffect = new PotionEffect(19, 59, 0, true, false);
						((EntityPlayer)par3Entity).addPotionEffect(potioneffect);
					}
				}
			}
			else if(par1ItemStack.getItem()==Item.getItemFromBlock(UnrealBlocks.oreBedrockium) || par1ItemStack.getItem()==Item.getItemFromBlock(UnrealBlocks.blockBedrockium))
			{
				PotionEffect potioneffect = new PotionEffect(2, 2, 3, true, false);
				((EntityPlayer)par3Entity).addPotionEffect(potioneffect);
			}
		}
	}

    public String getUnlocalizedName(ItemStack stack)
    {
        return this.block.getUnlocalizedName();
    }

    public String getUnlocalizedName()
    {
        return this.block.getUnlocalizedName();
    }
    
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}
