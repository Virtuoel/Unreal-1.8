package com.virtuoel.unreal.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.virtuoel.unreal.Unreal;
import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.entity.EntityTranslocatorDisc;
import com.virtuoel.unreal.item.ItemArmorAsbestosSuit;
import com.virtuoel.unreal.item.ItemArmorJumpBoots;
import com.virtuoel.unreal.item.ItemArmorSCUBAGear;
import com.virtuoel.unreal.item.ItemArmorShieldBelt;
import com.virtuoel.unreal.item.ItemArmorSlime;
import com.virtuoel.unreal.item.ItemArmorToxinSuit;
import com.virtuoel.unreal.item.ItemArmorUnrealBase;
import com.virtuoel.unreal.item.ItemAxeUnreal;
import com.virtuoel.unreal.item.ItemBlockPlacer;
import com.virtuoel.unreal.item.ItemDustUnreal;
import com.virtuoel.unreal.item.ItemHoeUnreal;
import com.virtuoel.unreal.item.ItemItemBlockPlacerDamageable;
import com.virtuoel.unreal.item.ItemPickaxeUnreal;
import com.virtuoel.unreal.item.ItemRecordUnreal;
import com.virtuoel.unreal.item.ItemShovelUnreal;
import com.virtuoel.unreal.item.ItemSwordUnreal;
import com.virtuoel.unreal.item.ItemUnreal;
import com.virtuoel.unreal.item.ItemUnrealDamageable;
import com.virtuoel.unreal.item.ItemVoiceBox;
import com.virtuoel.unreal.item.ItemWeaponBase;
import com.virtuoel.unreal.item.ItemWeaponTranslocator;
import com.virtuoel.unreal.reference.Materials;
import com.virtuoel.unreal.reference.Names;
import com.virtuoel.unreal.reference.Reference;
import com.virtuoel.unreal.reference.Settings;
import com.virtuoel.unreal.renderer.entity.RenderTranslocatorDisc;

public class UnrealEntities
{
	
	public static void register()
	{
		EntityRegistry.registerModEntity(EntityTranslocatorDisc.class, Reference.Entity.Name.nameTranslocatorDisc, Settings.Entity.ID.entityIDTranslocatorDisc, Unreal.instance, 64, 3, true);
	}
	
	public static void registerRenders()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityTranslocatorDisc.class, new RenderTranslocatorDisc(Minecraft.getMinecraft().getRenderManager()));
	}
	
}
