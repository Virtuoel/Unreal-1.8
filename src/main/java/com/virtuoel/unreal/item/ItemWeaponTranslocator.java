package com.virtuoel.unreal.item;

import java.util.List;
import java.util.UUID;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.World;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.virtuoel.unreal.entity.EntityTranslocatorDisc;
import com.virtuoel.unreal.reference.Reference;
import com.virtuoel.unreal.reference.Settings;
import com.virtuoel.unreal.utility.NBTHelper;

public class ItemWeaponTranslocator extends ItemWeaponBase
{
	
	private ItemStack ammo;
	private int meleeDamageAmount = 0;
	
	public ItemWeaponTranslocator(ItemStack weaponAmmo, int damage)
	{
		super(weaponAmmo, damage, 10);
	}
	
	@Override
	public void onCreated(ItemStack p_77622_1_, World p_77622_2_, EntityPlayer p_77622_3_)
	{
		setNBTDefaults(p_77622_1_, 1);
	}
	
	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
	{
		if(!stack.hasTagCompound())
		{
			setNBTDefaults(stack, 1);
		}
		if(!entityLiving.worldObj.isRemote && discEjected(stack))
		{
			if(entityLiving instanceof EntityPlayer && (((EntityPlayer) entityLiving).getEntityData().getInteger("playerGameType")==3))
			{
				return true;
			}
			EntityTranslocatorDisc disc = getDisc(stack);
			if(disc != null)
			{
				disc.setDead();
				entityLiving.worldObj.playSoundAtEntity(entityLiving, Reference.MOD_ID + ":weapons.gunTranslocator.recall", 0.3F, 1.0F);
			}
			stack.setItemDamage(1);
			NBTHelper.setLong(stack, "discUUIDLeast", 0);
			NBTHelper.setLong(stack, "discUUIDMost", 0);
		}
		return true;
	}
	
	@Override
	public boolean onEntityItemUpdate(EntityItem entityItem)
	{
		ItemStack stack = entityItem.getEntityItem();
		EntityTranslocatorDisc disc = getDisc(stack);
		if(disc != null)
		{
			entityItem.worldObj.playSoundAtEntity(entityItem, Reference.MOD_ID + ":weapons.gunTranslocator.recall", 0.3F, 1.0F);
			disc.setDead();
		}
		NBTHelper.setLong(stack, "discUUIDLeast", 0);
		NBTHelper.setLong(stack, "discUUIDMost", 0);
		stack.setItemDamage(1);
		return false;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if(!par1ItemStack.hasTagCompound())
		{
			setNBTDefaults(par1ItemStack, 1);
		}
		if(!par2World.isRemote && !par3EntityPlayer.isSneaking())
		{
			if(!discEjected(par1ItemStack))
			{
				par2World.playSoundAtEntity(par3EntityPlayer, Reference.MOD_ID + ":weapons.gunTranslocator.fire", 0.3F, 1.0F);
				par1ItemStack.setItemDamage(100);
				
				final float VELOCITY = 1.0f;
				EntityTranslocatorDisc newDisc = new EntityTranslocatorDisc(par2World, par3EntityPlayer, VELOCITY);
				
				if (!par2World.isRemote)
	            {
					par2World.spawnEntityInWorld(newDisc);
	            }
				
				NBTHelper.setLong(par1ItemStack, "discUUIDLeast", newDisc.getUniqueID().getLeastSignificantBits());
				NBTHelper.setLong(par1ItemStack, "discUUIDMost", newDisc.getUniqueID().getMostSignificantBits());
			}
			else
			{
				EntityTranslocatorDisc disc = getDisc(par1ItemStack);
				
				if(disc != null && ((!Settings.Weapons.translocatorTeleportAcrossDimensions && disc.dimension == par3EntityPlayer.dimension) || Settings.Weapons.translocatorTeleportAcrossDimensions))
				{
					//for Translocator entity teleport
					NBTHelper.setBoolean(par1ItemStack, "teleporting", true);
					
					disc.teleported = true;
					double newX = disc.posX;
					double newY = disc.posY;
					double newZ = disc.posZ;
					
					if (par3EntityPlayer.isRiding())
					{
						par3EntityPlayer.mountEntity((Entity)null);
					}
					
					if(Settings.Weapons.translocatorTeleportAcrossDimensions && disc.dimension != par3EntityPlayer.dimension)
					{
						par3EntityPlayer.setWorld(DimensionManager.getWorld(disc.dimension));
					}
					par3EntityPlayer.setPositionAndUpdate(newX, newY, newZ);
					par3EntityPlayer.setVelocity(par3EntityPlayer.motionX, 0, par3EntityPlayer.motionZ);
					par3EntityPlayer.fallDistance = 0.0f;
					
					par2World.playSoundAtEntity(par3EntityPlayer, Reference.MOD_ID + ":entity.translocatorDisc.teleport", 0.3F, 1.0F);
					
					par1ItemStack.setItemDamage(1);
					NBTHelper.setLong(par1ItemStack, "discUUIDLeast", 0);
					NBTHelper.setLong(par1ItemStack, "discUUIDMost", 0);
					disc.setDead();
					NBTHelper.setBoolean(par1ItemStack, "teleporting", false);
				}
				else if(disc != null)
				{
					disc.setDead();
					
					par2World.playSoundAtEntity(par3EntityPlayer, Reference.MOD_ID + ":weapons.gunTranslocator.recall", 0.3F, 1.0F);
					
					par1ItemStack.setItemDamage(1);
					NBTHelper.setLong(par1ItemStack, "discUUIDLeast", 0);
					NBTHelper.setLong(par1ItemStack, "discUUIDMost", 0);
				}
			}
		}/*
		else
		{
			if(discEjected(par1ItemStack) && getDisc(par1ItemStack) == null)
			{
				boolean flag = par3EntityPlayer.capabilities.isCreativeMode;
				if(flag || par3EntityPlayer.inventory.hasItem(UnrealItems.translocatorDisc) || par3EntityPlayer.inventory.hasItem(UnrealItems.recordLongFlight))
				{
					if(!flag)
					{
						if(par3EntityPlayer.inventory.hasItem(UnrealItems.recordLongFlight))
						{
							par3EntityPlayer.inventory.consumeInventoryItem(UnrealItems.recordLongFlight);
						}
						else if(par3EntityPlayer.inventory.hasItem(UnrealItems.translocatorDisc))
						{
							par3EntityPlayer.inventory.consumeInventoryItem(UnrealItems.translocatorDisc);
						}
					}
					par1ItemStack.setItemDamage(1);
					
					NBTHelper.setLong(par1ItemStack, "discUUIDLeast", 0);
					NBTHelper.setLong(par1ItemStack, "discUUIDMost", 0);
				}
			}
		}*/
		return par1ItemStack;
	}
	
	private boolean removeDisc(ItemStack par1ItemStack)
	{
		Entity toRemove = getDisc(par1ItemStack);
		
		if(toRemove != null)
		{
			toRemove.setDead();
			return true;
		}
		return false;
	}
	
	@Override
	public void onUpdate(ItemStack p_77663_1_, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_)
	{
		super.onUpdate(p_77663_1_, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
		
		if(!p_77663_1_.hasTagCompound())
		{
			setNBTDefaults(p_77663_1_, 1);
		}
		
		if(!NBTHelper.getBoolean(p_77663_1_, "teleporting") && discEjected(p_77663_1_) && getDisc(p_77663_1_) == null)
		{
			p_77663_2_.playSoundAtEntity(p_77663_3_, Reference.MOD_ID + ":weapons.gunTranslocator.recall", 0.3F, 1.0F);
			p_77663_1_.setItemDamage(1);
			
			NBTHelper.setLong(p_77663_1_, "discUUIDLeast", 0);
			NBTHelper.setLong(p_77663_1_, "discUUIDMost", 0);
		}
		
	}
	
	/**
	 * allows items to add custom lines of information to the mouseover description
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
	{
		if(!par1ItemStack.hasTagCompound())
		{
			setNBTDefaults(par1ItemStack, 1);
		}
		if(discEjected(par1ItemStack))
		{
			EntityTranslocatorDisc disc = getDisc(par1ItemStack);
			if(disc != null && disc.posY < 256+32 && ((!Settings.Weapons.translocatorTeleportAcrossDimensions && disc.dimension == par2EntityPlayer.dimension) || Settings.Weapons.translocatorTeleportAcrossDimensions))
			{
				double newX = disc.posX;
				double newZ = disc.posZ;
				
				newX = newX<0 ? (int)newX-1 : (int)newX;
				newZ = newZ<0 ? (int)newZ-1 : (int)newZ;
				
				par3List.add("Active");
				par3List.add("Dim: " + DimensionManager.getWorld(disc.dimension).provider.getDimensionName());
				par3List.add("X: " + newX);
				par3List.add("Y: " + (int)disc.posY);
				par3List.add("Z: " + newZ);
				return;
			}
			else
			{
				par3List.add("Unknown Status");
				if(disc !=null)
				{
					par3List.add("Dim: " + DimensionManager.getWorld(disc.dimension).provider.getDimensionName());
				}
				else
				{
					par3List.add("Dim: ?");
				}
				par3List.add("X: ?");
				par3List.add("Y: ?");
				par3List.add("Z: ?");
				return;
			}
		}
		par3List.add("Inactive");
		par3List.add("Dim: -");
		par3List.add("X: -");
		par3List.add("Y: -");
		par3List.add("Z: -");
		return;
	}
	
	private ItemStack setNBTDefaults(ItemStack par1ItemStack, int ammoDefault)
	{
		NBTHelper.setLong(par1ItemStack, "discUUIDLeast", 0);
		NBTHelper.setLong(par1ItemStack, "discUUIDMost", 0);
		NBTHelper.setBoolean(par1ItemStack, "teleporting", false);
		return par1ItemStack;
	}
	
	private UUID getDiscUUID(ItemStack par1ItemStack)
	{
		if(!par1ItemStack.hasTagCompound())
		{
			setNBTDefaults(par1ItemStack, 1);
		}
		return new UUID(NBTHelper.getLong(par1ItemStack, "discUUIDMost"), NBTHelper.getLong(par1ItemStack, "discUUIDLeast"));
	}
	
	private int getDiscDimension(ItemStack par1ItemStack, World par2World)
	{
		EntityTranslocatorDisc disc = getDisc(par1ItemStack);
		if(disc!=null)
		{
			return disc.dimension;
		}
		return Integer.MAX_VALUE;
	}
	
	private boolean discEjected(ItemStack par1ItemStack)
	{
		if(!par1ItemStack.hasTagCompound())
		{
			setNBTDefaults(par1ItemStack, 1);
		}
		if(NBTHelper.getLong(par1ItemStack, "discUUIDLeast") == 0 && NBTHelper.getLong(par1ItemStack, "discUUIDMost") == 0)
		{
			return false;
		}
		return true;
	}
	
	private EntityTranslocatorDisc getDisc(ItemStack par1ItemStack)
	{
		if(!par1ItemStack.hasTagCompound())
		{
			setNBTDefaults(par1ItemStack, 1);
		}
		return (EntityTranslocatorDisc)MinecraftServer.getServer().getEntityFromUuid(new UUID(NBTHelper.getLong(par1ItemStack, "discUUIDMost"), NBTHelper.getLong(par1ItemStack, "discUUIDLeast")));
	}
	
	/**
	 * Return an item rarity from EnumRarity
	 */
	@Override
	public EnumRarity getRarity(ItemStack par1ItemStack)
	{
		return EnumRarity.EPIC;
	}
	
	@Override
	public void getSubItems(Item par1item, CreativeTabs par2CreativeTabs, List par3List)
	{
		par3List.add(new ItemStack(par1item, 1, 1));
		//par3List.add(new ItemStack(par1item, 1, par1item.getMaxDamage()));
	}
	
}
