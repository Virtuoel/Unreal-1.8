package com.virtuoel.unreal.item;

import java.util.List;




import net.minecraft.entity.Entity;
//import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.UnrealItems;
import com.virtuoel.unreal.reference.Reference;

//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;

public class ItemUnreal extends Item
{
	public ItemUnreal()
	{
		super();
		this.setMaxStackSize(64);
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	
	@Override
	public EnumAction getItemUseAction(ItemStack stack)
	{
		if(stack.getItem()==UnrealItems.weaponCasingBasic||
				stack.getItem()==UnrealItems.weaponCasingAdv)
		{
			return EnumAction.BLOCK;
		}
		return EnumAction.NONE;
	}
	
	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
		if(this.getItemUseAction(par1ItemStack) == EnumAction.BLOCK)
		{
			return 72000;
		}
		return 0;
    }
	
	/**
	 * allows items to add custom lines of information to the mouseover description
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List p_77624_3_, boolean p_77624_4_)
	{
		String info = "";
		if(p_77624_1_.getItem()==UnrealItems.shardTarydium)
		{
			info = "Stinger Ammo";
		}
		else if(p_77624_1_.getItem()==UnrealItems.ammoEightball)
		{
			info = "Eightball Launcher Ammo";
		}
		else if(p_77624_1_.getItem()==UnrealItems.ammoWarhead)
		{
			info = "Redeemer Ammo";
		}
		else if(p_77624_1_.getItem()==UnrealItems.ammoFlakShell)
		{
			info = "Flak Cannon Ammo";
		}
		else if(p_77624_1_.getItem()==UnrealItems.dispersionUpgrade)
		{
			info = "Dispersion Pistol Upgrade";
		}
		if(!info.isEmpty())
		{
			p_77624_3_.add(info);
		}
		
	}
	
	/**
     * Return an item rarity from EnumRarity
     */
	@Override
    public EnumRarity getRarity(ItemStack p_77613_1_)
    {
		if(this==UnrealItems.shardTarydium||
				this==UnrealItems.gemTarydium||
				this==UnrealItems.lensTarydium||
				this==UnrealItems.weaponCasingBasic||
				this==UnrealItems.tarydPowerBasic||
				this==UnrealItems.chainsawBlade)
		{
			return EnumRarity.UNCOMMON;
		}
		else if(this==UnrealItems.weaponCasingAdv||
				this==UnrealItems.chainsawBladeHardened||
				this==UnrealItems.dispersionUpgrade||
				this==UnrealItems.warheadBody||
				this==UnrealItems.warheadCone||
				this==UnrealItems.warheadThruster||
				this==UnrealItems.forceField)
		{
			return EnumRarity.RARE;
		}
		else if(this==UnrealItems.ammoWarhead||
				this==UnrealItems.chainsawMotor||
				this==UnrealItems.gunTranslocator||
				this==UnrealItems.translocatorDisc||
				this==UnrealItems.ingotBedrockium||
				this==UnrealItems.nuggetBedrockium)
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
			if(par1ItemStack.getItem()==UnrealItems.ingotBedrockium || par1ItemStack.getItem()==UnrealItems.nuggetBedrockium)
			{
				PotionEffect potioneffect = new PotionEffect(2, 2, 3, true, false);
				((EntityPlayer)par3Entity).addPotionEffect(potioneffect);
			}
		}
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
	
    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {
        return String.format("item.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }
    
    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
	
}