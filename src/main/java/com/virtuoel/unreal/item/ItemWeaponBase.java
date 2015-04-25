package com.virtuoel.unreal.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.UnrealItems;
import com.virtuoel.unreal.reference.DamageSources;
import com.virtuoel.unreal.reference.Reference;
import com.virtuoel.unreal.utility.NBTHelper;

public class ItemWeaponBase extends ItemUnreal
{
	private ItemStack ammo;
	private int meleeDamageAmount = 0;
	private final int shotDelay;
	private int damageOnCraft = 1;
	
	public ItemWeaponBase(ItemStack weaponAmmo, int damage, int delay)
	{
		super();
		shotDelay = delay;
		setAmmoItem(weaponAmmo)
		.setMaxDamage(damage)
		.setNoRepair().setFull3D()
		.setMaxStackSize(1).setHasSubtypes(true)
		.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	public Item setDamageOnCraft(int dmg)
	{
		this.damageOnCraft = dmg;
		return this;
	}
	
	public int getDamageOnCraft()
	{
		return damageOnCraft;
	}
	
	@Override
	public void onCreated(ItemStack p_77622_1_, World p_77622_2_, EntityPlayer p_77622_3_)
	{
		setNBTDefaults(p_77622_1_, 5);
	}
	
	@Override
	public void onUpdate(ItemStack par1ItemStack, World p_77663_2_, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_)
	{
		super.onUpdate(par1ItemStack, p_77663_2_, p_77663_3_, p_77663_4_, p_77663_5_);
		if(!par1ItemStack.hasTagCompound())
		{
			setNBTDefaults(par1ItemStack, 5);
		}
		if(par1ItemStack.getItemDamage()>par1ItemStack.getMaxDamage())
		{
			par1ItemStack.setItemDamage(par1ItemStack.getMaxDamage());
		}
		if(par1ItemStack.getItem() == UnrealItems.gunStinger && NBTHelper.getInt(par1ItemStack, "attackTime") == 1)
		{
			p_77663_2_.playSoundAtEntity(p_77663_3_, Reference.MOD_ID + ":weapons."+this.getUnlocalizedName(par1ItemStack).substring(this.getUnlocalizedName(par1ItemStack).indexOf(":")+1)+".startFire", 0.3F, 1.0F);
		}
		if(NBTHelper.getInt(par1ItemStack, "attackTime") == (par1ItemStack.getItem() == UnrealItems.gunStinger ? NBTHelper.getBoolean(par1ItemStack, "attacking") ? 4 : -1 : 1)){
			p_77663_2_.playSoundAtEntity(p_77663_3_, Reference.MOD_ID + ":weapons."+this.getUnlocalizedName(par1ItemStack).substring(this.getUnlocalizedName(par1ItemStack).indexOf(":")+1)+".fire", 0.3F, 1.0F);
		}
		if(NBTHelper.getBoolean(par1ItemStack, "attacking") || NBTHelper.getInt(par1ItemStack, "attackTime") > 0)
		{
			NBTHelper.setInteger(par1ItemStack, "attackTime", NBTHelper.getInt(par1ItemStack, "attackTime") + 1);
		}
		if(par1ItemStack.getItem() == UnrealItems.gunFlakCannon && NBTHelper.getInt(par1ItemStack, "attackTime") == 10){
			p_77663_2_.playSoundAtEntity(p_77663_3_, Reference.MOD_ID + ":weapons."+this.getUnlocalizedName(par1ItemStack).substring(this.getUnlocalizedName(par1ItemStack).indexOf(":")+1)+".reload", 0.3F, 1.0F);
		}
		if(NBTHelper.getInt(par1ItemStack, "attackTime") > NBTHelper.getInt(par1ItemStack, "attackDelay"))
		{
			NBTHelper.setInteger(par1ItemStack, "attackTime", (par1ItemStack.getItem() == UnrealItems.gunStinger&&NBTHelper.getBoolean(par1ItemStack, "attacking") ? 3 : 0));
			if(!NBTHelper.getBoolean(par1ItemStack, "attacking") && !(par1ItemStack.getItem() == UnrealItems.gunStinger))
			{
				NBTHelper.setInteger(par1ItemStack, "attackTime", 0);
			}
			NBTHelper.setBoolean(par1ItemStack, "attacking", false);
		}
	}
	
	@Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
		//NBTHelper.setInteger(stack, "attackTime", 0);
		NBTHelper.setBoolean(stack, "attacking", false);
        return stack;
    }
	
	public void onPlayerStoppedUsing(ItemStack stack, World worldIn, EntityPlayer playerIn, int timeLeft)
	{
		//NBTHelper.setInteger(stack, "attackTime", 0);
		NBTHelper.setBoolean(stack, "attacking", false);
	}
	
	@Override
	public boolean onEntityItemUpdate(EntityItem entityItem)
	{

		ItemStack stack = entityItem.getEntityItem();
		NBTHelper.setInteger(stack, "attackTime", 0);
		NBTHelper.setBoolean(stack, "attacking", false);
		return false;
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
		if(par3EntityPlayer.isSneaking())
		{
			par3EntityPlayer.setItemInUse(par1ItemStack, 16);
			toggleConsume(par1ItemStack);
			if(par2World.isRemote)
			{
				if(NBTHelper.getBoolean(par1ItemStack, "consumeMode"))
				{
					par3EntityPlayer.addChatMessage(new ChatComponentText("Auto-Reloading Enabled"));
				}
				else
				{
					par3EntityPlayer.addChatMessage(new ChatComponentText("Auto-Reloading Disabled"));
				}
			}
		}
		else
		{
			//par3EntityPlayer.setItemInUse(par1ItemStack, NBTHelper.getInt(par1ItemStack, "maxAttackTime"));
			NBTHelper.setBoolean(par1ItemStack, "attacking", true);
		}
		return par1ItemStack;
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
			setNBTDefaults(par1ItemStack, 5);
		}
		if(NBTHelper.getInt(par1ItemStack, "ammoMax")!=0)
		{
			par3List.add("Ammo: " + (NBTHelper.getInt(par1ItemStack, "ammoAmount")) + "/" + (NBTHelper.getInt(par1ItemStack, "ammoMax")));
		}
	}
	/*
	@Override
	/**
	 * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
	 * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
	 *//*
    public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        return true;
    }
	  */
	private void setNBTDefaults(ItemStack par1ItemStack, int ammoDefault)
	{
		NBTHelper.setBoolean(par1ItemStack, "consumeMode", false);
		NBTHelper.setInteger(par1ItemStack, "ammoAmount", ammoDefault);
		NBTHelper.setInteger(par1ItemStack, "ammoMax", 100);
		NBTHelper.setInteger(par1ItemStack, "attackDelay", shotDelay);
		NBTHelper.setInteger(par1ItemStack, "attackTime", 0);
		NBTHelper.setInteger(par1ItemStack, "maxAttackTime", 7200);
		NBTHelper.setBoolean(par1ItemStack, "attacking", false);
	}
	
	private void toggleConsume(ItemStack par1ItemStack)
	{
		NBTHelper.setBoolean(par1ItemStack, "consumeMode", !NBTHelper.getBoolean(par1ItemStack, "consumeMode"));
		//consumeMode = !consumeMode;
	}
	
	private Item setAmmoItem(ItemStack ammoStack)
	{
		ammo=ItemStack.copyItemStack(ammoStack);
		return this;
	}
	/*
	@Override
	public Multimap getItemAttributeModifiers()
	{
		Multimap multimap = super.getItemAttributeModifiers();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", (double)this.meleeDamageAmount, 1));
		return multimap;
	}
	 */
	
	/**
	 * Return an item rarity from EnumRarity
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack)
	{
		return EnumRarity.RARE;
	}
	
	@Override
    public float getDigSpeed(ItemStack itemstack, IBlockState state)
    {
        return -1.0F;
    }
	
	@Override
	public float getStrVsBlock(ItemStack p_150893_1_, Block p_150893_2_)
	{
		return -1.0F;
	}
	
	@Override
	public void getSubItems(Item par1item, CreativeTabs par2CreativeTabs, List par3List)
	{
		if(((ItemWeaponBase)par1item).getDamageOnCraft() != 0)
		{
			par3List.add(new ItemStack(par1item, 1, 1));
			par3List.add(new ItemStack(par1item, 1, par1item.getMaxDamage()));
		}
		if(((ItemWeaponBase)par1item).getDamageOnCraft() != 1 && ((ItemWeaponBase)par1item).getDamageOnCraft() != par1item.getMaxDamage())
		{
			par3List.add(new ItemStack(par1item, 1, ((ItemWeaponBase)par1item).getDamageOnCraft()));
		}
	}
	
	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player)
	{
		return true;
	}
	
	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack)
	{
		return true;
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
	{
		
		return NBTHelper.getInt(par1ItemStack, "maxAttackTime");
	}
	
}
