package com.virtuoel.unreal.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityProjectileTarydiumShard extends EntityThrowable
{
	public EntityProjectileTarydiumShard(World p_i1776_1_)
	{
		super(p_i1776_1_);
	}
	
	public EntityProjectileTarydiumShard(World p_i1778_1_, double p_i1778_2_,	double p_i1778_4_, double p_i1778_6_)
	{
		super(p_i1778_1_, p_i1778_2_, p_i1778_4_, p_i1778_6_);
	}
	
	public EntityProjectileTarydiumShard(World p_i1777_1_, EntityLivingBase p_i1777_2_)
	{
		super(p_i1777_1_, p_i1777_2_);
	}
	
	@Override
    public void onUpdate()
	{
    	super.onUpdate();
    	//TODO modify for other projectiles
    	if (!worldObj.isRemote && !worldObj.isBlockLoaded(new BlockPos(posX, posY, posZ)))
    	{
			setDead();
		}
    }
	
	@Override
	protected void onImpact(MovingObjectPosition p_70184_1_)
	{
		
	}
	
}
