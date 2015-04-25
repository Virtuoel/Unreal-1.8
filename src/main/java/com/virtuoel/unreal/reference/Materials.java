package com.virtuoel.unreal.reference;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

import com.virtuoel.unreal.block.material.MaterialUnreal;

public class Materials
{
	public static final class Blocks
	{
		public static final Material tarydium = new MaterialUnreal(MapColor.iceColor).setRequiresTool().setImmovableMobility();
		public static final Material bedrock = new MaterialUnreal(MapColor.stoneColor).setRequiresTool().setImmovableMobility();
		public static final Material immobile = new MaterialUnreal(MapColor.stoneColor).setRequiresTool().setImmovableMobility();
		
	}
	
	public static final class Tools
	{
		public static Item.ToolMaterial TITANIUM = EnumHelper
			.addToolMaterial("Titanium", 2, 460, 6.0F, 2.0F, 8);
		
		//4, 900, 15.0F ?, ?
		
		public static Item.ToolMaterial TARYDIUM_ALLOY_REFINED = EnumHelper
			.addToolMaterial("Refined Tarydium Alloy", 6, 7200, 20.0F, 15.0F, 1);
	}
	//TODO ARMOR TEXTURES
	public static final class Armor
	{
		public static ItemArmor.ArmorMaterial SHIELD = EnumHelper
				.addArmorMaterial(Reference.Armor.Material.Name.SHIELD, Reference.Armor.Texture.SHIELD, 20, new int[] {64, 256, 128, 32}, 0);
		
		public static ItemArmor.ArmorMaterial SLIME = EnumHelper
				.addArmorMaterial(Reference.Armor.Material.Name.SLIME, Reference.Armor.Texture.SLIME, 6, new int[] {1, 1, 1, 1}, 12);
		
		public static ItemArmor.ArmorMaterial TITANIUM = EnumHelper
				.addArmorMaterial(Reference.Armor.Material.Name.TITANIUM, Reference.Armor.Texture.TITANIUM, 18, new int[] {4, 6, 5, 3}, 9);
	}
	
}
