package com.virtuoel.unreal.block.material;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class MaterialUnreal extends Material
{
	
	public MaterialUnreal(MapColor p_i2116_1_)
	{
		super(p_i2116_1_);
	}
	
	private boolean canBurn;
	private boolean replaceable;
	private boolean isTranslucent;
	private boolean requiresNoTool = true;
	private int mobilityFlag;
	private boolean isAdventureModeExempt;
	
	@Override
	public boolean isLiquid()
	{
		return false;
	}
	
	@Override
	public boolean isSolid()
	{
		return true;
	}
	
	@Override
	public boolean blocksLight()
	{
		return true;
	}
	
	@Override
	public boolean blocksMovement()
	{
		return true;
	}
	
	public MaterialUnreal setTranslucent()
	{
		this.isTranslucent = true;
		return this;
	}
	
	public MaterialUnreal setRequiresTool()
	{
		this.requiresNoTool = false;
		return this;
	}
	
	public MaterialUnreal setBurning()
	{
		this.canBurn = true;
		return this;
	}
	
	@Override
	public boolean getCanBurn()
	{
		return this.canBurn;
	}
	
	public MaterialUnreal setReplaceable()
	{
		this.replaceable = true;
		return this;
	}
	
	@Override
	public boolean isReplaceable()
	{
		return this.replaceable;
	}
	
	@Override
	public boolean isOpaque()
	{
		return this.isTranslucent ? false : this.blocksMovement();
	}
	
	@Override
	public boolean isToolNotRequired()
	{
		return this.requiresNoTool;
	}
	
	@Override
	public int getMaterialMobility()
	{
		return this.mobilityFlag;
	}
	
	public MaterialUnreal setNoPushMobility()
	{
		this.mobilityFlag = 1;
		return this;
	}
	
	public MaterialUnreal setImmovableMobility()
	{
		this.mobilityFlag = 2;
		return this;
	}
	
	public MaterialUnreal setAdventureModeExempt()
	{
		this.isAdventureModeExempt = true;
		return this;
	}
	
}
