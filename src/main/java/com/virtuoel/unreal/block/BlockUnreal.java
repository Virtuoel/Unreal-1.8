package com.virtuoel.unreal.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderEnd;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.UnrealBlocks;
import com.virtuoel.unreal.init.UnrealItems;
import com.virtuoel.unreal.reference.Reference;

public class BlockUnreal extends Block
{
	private MapColor materialColorOverride;
	public BlockUnreal(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
	}
	/*
	@Override
	public Item getItemDropped(IBlockState state, Random p_149650_2_, int p_149650_3_)
	{
		if(this==UnrealBlocks.blockAsbestos)
		{
			return UnrealItems.itemBlockAsbestos;
		}
		else if(this==UnrealBlocks.blockEnderCrystal)
		{
			return UnrealItems.itemBlockEnderCrystal;
		}
		else if(this==UnrealBlocks.netherrackCompressed1x)
		{
			return UnrealItems.itemBlockNetherrackCompressed1x;
		}
		else if(this==UnrealBlocks.netherrackCompressed2x)
		{
			return UnrealItems.itemBlockNetherrackCompressed2x;
		}
		else if(this==UnrealBlocks.netherrackCompressed3x)
		{
			return UnrealItems.itemBlockNetherrackCompressed3x;
		}
		else if(this==UnrealBlocks.netherrackCompressed4x)
		{
			return UnrealItems.itemBlockNetherrackCompressed4x;
		}
		else if(this==UnrealBlocks.endStoneCompressed1x)
		{
			return UnrealItems.itemBlockEndStoneCompressed1x;
		}
		else if(this==UnrealBlocks.endStoneCompressed2x)
		{
			return UnrealItems.itemBlockEndStoneCompressed2x;
		}
		else if(this==UnrealBlocks.endStoneCompressed3x)
		{
			return UnrealItems.itemBlockEndStoneCompressed3x;
		}
		else if(this==UnrealBlocks.endStoneCompressed4x)
		{
			return UnrealItems.itemBlockEndStoneCompressed4x;
		}
		else if(this==UnrealBlocks.oreBedrockium)
		{
			return UnrealItems.itemBlockOreBedrockium;
		}
		else if(this==UnrealBlocks.blockBedrockium)
		{
			return UnrealItems.itemBlockBedrockium;
		}
		else if(this==UnrealBlocks.blockUUTC)
		{
			return UnrealItems.itemBlockUUTC;
		}
		return Item.getItemFromBlock(this);
	}
	*/
	@Override
	public boolean isFireSource(World world, BlockPos pos, EnumFacing side)
	{
		if((this == UnrealBlocks.netherrackCompressed1x ||
   			this == UnrealBlocks.netherrackCompressed2x ||
   		   	this == UnrealBlocks.netherrackCompressed3x ||
   		   	this == UnrealBlocks.netherrackCompressed4x) &&
			side == EnumFacing.UP)
		{
			return true;
		}
		return false;
	}
	/*
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos)
	{
		if(world.getBlockState(pos) == UnrealBlocks.blockAsbestos)
		{
			return new ItemStack(UnrealItems.itemBlockAsbestos,1,0);
		}
		else if(world.getBlockState(pos) == UnrealBlocks.blockEnderCrystal)
		{
			return new ItemStack(UnrealItems.itemBlockEnderCrystal,1,0);
		}
		else if(world.getBlockState(pos) == UnrealBlocks.netherrackCompressed1x)
		{
			return new ItemStack(UnrealItems.itemBlockNetherrackCompressed1x,1,0);
		}
		else if(world.getBlockState(pos) == UnrealBlocks.netherrackCompressed2x)
		{
			return new ItemStack(UnrealItems.itemBlockNetherrackCompressed2x,1,0);
		}
		else if(world.getBlockState(pos) == UnrealBlocks.netherrackCompressed3x)
		{
			return new ItemStack(UnrealItems.itemBlockNetherrackCompressed3x,1,0);
		}
		else if(world.getBlockState(pos) == UnrealBlocks.netherrackCompressed4x)
		{
			return new ItemStack(UnrealItems.itemBlockNetherrackCompressed4x,1,0);
		}
		else if(world.getBlockState(pos) == UnrealBlocks.endStoneCompressed1x)
		{
			return new ItemStack(UnrealItems.itemBlockEndStoneCompressed1x,1,0);
		}
		else if(world.getBlockState(pos) == UnrealBlocks.endStoneCompressed2x)
		{
			return new ItemStack(UnrealItems.itemBlockEndStoneCompressed2x,1,0);
		}
		else if(world.getBlockState(pos) == UnrealBlocks.endStoneCompressed3x)
		{
			return new ItemStack(UnrealItems.itemBlockEndStoneCompressed3x,1,0);
		}
		else if(world.getBlockState(pos) == UnrealBlocks.endStoneCompressed4x)
		{
			return new ItemStack(UnrealItems.itemBlockEndStoneCompressed4x,1,0);
		}
		else if(world.getBlockState(pos) == UnrealBlocks.oreBedrockium)
		{
			return new ItemStack(UnrealItems.itemBlockOreBedrockium,1,0);
		}
		else if(world.getBlockState(pos) == UnrealBlocks.blockBedrockium)
		{
			return new ItemStack(UnrealItems.itemBlockBedrockium,1,0);
		}
		else if(world.getBlockState(pos) == UnrealBlocks.blockUUTC)
		{
			return new ItemStack(UnrealItems.itemBlockUUTC,1,0);
		}
		
		return super.getPickBlock(target, world, pos);
	}*/
	
	public boolean canSustainPlant(IBlockAccess world, BlockPos pos, EnumFacing direction, net.minecraftforge.common.IPlantable plantable)
	{
		IBlockState state = world.getBlockState(pos);
		IBlockState plant = plantable.getPlant(world, pos.up());
		net.minecraftforge.common.EnumPlantType plantType = plantable.getPlantType(world, pos.up());
		
		if (plant.getBlock() == Blocks.nether_wart && this == UnrealBlocks.blockNetherWart)
		{
			return true;
		}
		
		/*
        switch (plantType)
        {
		case Beach:
			break;
		case Cave:
			break;
		case Crop:
			break;
		case Desert:
			break;
		case Nether:
			return this == UnrealBlocks.blockNetherWart;
		case Plains:
			break;
		case Water:
			break;
		}*/
		
		return super.canSustainPlant(world, pos, direction, plantable);
	}
	
	@Override
	public MapColor getMapColor(IBlockState state)
    {
		return this.materialColorOverride==null?this.getMaterial().getMaterialMapColor():this.materialColorOverride;
    }
	
	public Block setMapColor(MapColor par1MapColor)
	{
		materialColorOverride = par1MapColor;
		return this;
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
	
}