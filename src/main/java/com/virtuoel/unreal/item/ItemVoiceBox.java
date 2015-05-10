package com.virtuoel.unreal.item;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;

public class ItemVoiceBox extends ItemUnreal
{
	private int soundTick = 0;
	
	public ItemVoiceBox()
	{
		super();
		this.setMaxStackSize(64)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		par3EntityPlayer.dropOneItem(false);
		return par1ItemStack;
	}
	
	/**
	 * Return an item rarity from EnumRarity
	 */
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack)
	{
		return EnumRarity.UNCOMMON;
	}
	
	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player)
	{
		return false;
	}
	
	/**
	 * Called by the default implemetation of EntityItem's onUpdate method, allowing for cleaner 
	 * control over the update of the item without having to write a subclass.
	 * 
	 * @param entityItem The entity Item
	 * @return Return true to skip any further update code.
	 */
	@Override
	public boolean onEntityItemUpdate(EntityItem entityItem)
	{
		super.onEntityItemUpdate(entityItem);
		//onUpdate(entityItem.getEntityItem(), entityItem.worldObj, entityItem, 0, true);
		ItemVoiceBox boxItem = (ItemVoiceBox)entityItem.getEntityItem().getItem();
		boxItem.setSoundTick(boxItem.getSoundTick()+1);
		if(boxItem.getSoundTick()>=3){
			boxItem.setSoundTick(0);
			switch(itemRand.nextInt(7)){
			case 0:
				entityItem.worldObj.playSoundAtEntity(entityItem, "mob.irongolem.hit", 1.0F, 1.9F / (itemRand.nextFloat() * 0.4F + 0.8F));
				break;
			case 1:
				//entityItem.worldObj.playSoundAtEntity(entityItem, "random.breath", 2.0F, 1.0F / (itemRand.nextFloat() * 0.4F + 0.8F));
				entityItem.worldObj.playSoundAtEntity(entityItem, "random.drink", 0.5F, 0.0F);//0.1F / (itemRand.nextFloat() * 0.4F + 0.8F));
				break;
			case 2:
				entityItem.worldObj.playSoundAtEntity(entityItem, "mob.blaze.hit", 1.0F, 0.0F); //0.1F / (itemRand.nextFloat() * 0.4F + 0.8F));
				break;
			case 3:
				entityItem.worldObj.playSoundAtEntity(entityItem, "tile.piston.out", 0.5F, 1.0F / (itemRand.nextFloat() * 0.4F + 0.8F));
				entityItem.worldObj.playSoundAtEntity(entityItem, "fireworks.launch", 1.0F, 0.0F); //0.1F / (itemRand.nextFloat() * 0.4F + 0.8F));
				break;
			case 4:
				entityItem.worldObj.playSoundAtEntity(entityItem, "random.explode", 0.5F, 1.0F / (itemRand.nextFloat() * 0.4F + 0.8F));
				break;
			case 5:
				entityItem.worldObj.playSoundAtEntity(entityItem, "random.bow", 1.0F, 0.0F); //0.1F / (itemRand.nextFloat() * 0.4F + 0.8F));
				break;
			default:
				return false;
			}
		}
		return false;
	}
	
	public void setSoundTick(int val)
	{
		this.soundTick=val;
	}
	
	public int getSoundTick()
	{
		return this.soundTick;
	}
	
}
