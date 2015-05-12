package com.virtuoel.unreal.entity;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

import com.virtuoel.unreal.init.UnrealItems;
import com.virtuoel.unreal.reference.Reference;
import com.virtuoel.unreal.reference.Settings;
import com.virtuoel.unreal.utility.NBTHelper;

public class EntityTranslocatorDisc extends EntityProjectileUnreal
{
	public boolean isDamaged = false;
	public boolean teleported = false;
	
	public EntityTranslocatorDisc(World worldIn)
    {
        super(worldIn);
    }

    public EntityTranslocatorDisc(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }

    public EntityTranslocatorDisc(World worldIn, EntityLivingBase shooter, EntityLivingBase p_i1755_3_, float p_i1755_4_, float p_i1755_5_)
    {
        super(worldIn, shooter, p_i1755_3_, p_i1755_4_, p_i1755_5_);
    }

    public EntityTranslocatorDisc(World worldIn, EntityLivingBase shooter, float p_i1756_3_)
    {
        super(worldIn, shooter, p_i1756_3_);
    }

    public void onUpdate()
    {
    	this.onEntityUpdate();
    	
    	if(!Settings.Weapons.translocatorTeleportAcrossDimensions && this.dimensionFired!=this.dimension)
    	{
    		this.setDead();
    	}
    	
    	if(this.isBurning())
    	{
    		this.setDead();
    	}
    	
    	if(this.ticksExisted % 10 == 0)
    	{
    		this.playSound(Reference.MOD_ID + ":entity.translocatorDisc.hum", 0.3F, 1.0F);
    	}
    	
        if (this.prevRotationPitch == 0.0F && this.prevRotationYaw == 0.0F)
        {
            float f = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.prevRotationYaw = this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);
            this.prevRotationPitch = this.rotationPitch = (float)(Math.atan2(this.motionY, (double)f) * 180.0D / Math.PI);
        }
        
        BlockPos blockpos = new BlockPos(this.xTile, this.yTile, this.zTile);
        IBlockState iblockstate = this.worldObj.getBlockState(blockpos);
        Block block = iblockstate.getBlock();
        
        if (block.getMaterial() != Material.air)
        {
            block.setBlockBoundsBasedOnState(this.worldObj, blockpos);
            AxisAlignedBB axisalignedbb = block.getCollisionBoundingBox(this.worldObj, blockpos, iblockstate);

            if (axisalignedbb != null && axisalignedbb.isVecInside(new Vec3(this.posX, this.posY, this.posZ)))
            {
                this.inGround = true;
            }
        }

        if (this.arrowShake > 0)
        {
            --this.arrowShake;
        }

        if (this.inGround)
        {
            int j = block.getMetaFromState(iblockstate);

            if (block == this.inTile && j == this.inData)
            {
                //++this.ticksInGround;
                
            /*    if (this.ticksInGround >= 1200)
                {
                    this.setDead();
                }*/
                
                this.setRotation(this.rotationYaw, 0.01F);
            }
            else
            {
                this.inGround = false;
                this.motionX *= (double)(this.rand.nextFloat() * 0.2F);
                this.motionY *= (double)(this.rand.nextFloat() * 0.2F);
                this.motionZ *= (double)(this.rand.nextFloat() * 0.2F);
                this.ticksInGround = 0;
                this.ticksInAir = 0;
            }
        }
        else
        {
            ++this.ticksInAir;
            Vec3 vec31 = new Vec3(this.posX, this.posY, this.posZ);
            Vec3 vec3 = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);
            MovingObjectPosition movingobjectposition = this.worldObj.rayTraceBlocks(vec31, vec3, false, true, false);
            vec31 = new Vec3(this.posX, this.posY, this.posZ);
            vec3 = new Vec3(this.posX + this.motionX, this.posY + this.motionY, this.posZ + this.motionZ);

            if (movingobjectposition != null)
            {
                vec3 = new Vec3(movingobjectposition.hitVec.xCoord, movingobjectposition.hitVec.yCoord, movingobjectposition.hitVec.zCoord);
            }

            Entity entity = null;
            List list = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, this.getEntityBoundingBox().addCoord(this.motionX, this.motionY, this.motionZ).expand(1.0D, 1.0D, 1.0D));
            double d0 = 0.0D;
            int i;
            float f1;

            for (i = 0; i < list.size(); ++i)
            {
                Entity entity1 = (Entity)list.get(i);

                if (entity1.canBeCollidedWith() && (entity1 != this.shootingEntity || this.ticksInAir >= 5))
                {
                    f1 = 0.3F;
                    AxisAlignedBB axisalignedbb1 = entity1.getEntityBoundingBox().expand((double)f1, (double)f1, (double)f1);
                    MovingObjectPosition movingobjectposition1 = axisalignedbb1.calculateIntercept(vec31, vec3);

                    if (movingobjectposition1 != null)
                    {
                        double d1 = vec31.distanceTo(movingobjectposition1.hitVec);

                        if (d1 < d0 || d0 == 0.0D)
                        {
                            entity = entity1;
                            d0 = d1;
                        }
                    }
                }
            }

            if (entity != null)
            {
                movingobjectposition = new MovingObjectPosition(entity);
            }

            if (movingobjectposition != null && movingobjectposition.entityHit != null && movingobjectposition.entityHit instanceof EntityPlayer)
            {
                EntityPlayer entityplayer = (EntityPlayer)movingobjectposition.entityHit;

                if (entityplayer.capabilities.disableDamage || this.shootingEntity instanceof EntityPlayer && !((EntityPlayer)this.shootingEntity).canAttackPlayer(entityplayer))
                {
                    movingobjectposition = null;
                }
            }

            float f2;
            float f3;
            float f4;

            if (movingobjectposition != null)
            {
                if (movingobjectposition.entityHit != null)
                {
                    f2 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
                    int k = MathHelper.ceiling_double_int((double)f2 * this.damage);

                    DamageSource damagesource;

                    if (this.shootingEntity == null)
                    {
                        damagesource = (new EntityDamageSourceIndirect(Reference.MOD_ID + ":translocator", this, this)).setProjectile();
                    }
                    else
                    {
                        damagesource = (new EntityDamageSourceIndirect(Reference.MOD_ID + ":translocator", this, this.shootingEntity)).setProjectile();
                    }

                    if (this.isBurning() && !(movingobjectposition.entityHit instanceof EntityEnderman))
                    {
                        movingobjectposition.entityHit.setFire(5);
                    }

                    if (movingobjectposition.entityHit.attackEntityFrom(damagesource, (float)k))
                    {
                        if (movingobjectposition.entityHit instanceof EntityLivingBase)
                        {
                            EntityLivingBase entitylivingbase = (EntityLivingBase)movingobjectposition.entityHit;

                            if (this.knockbackStrength > 0)
                            {
                                f4 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);

                                if (f4 > 0.0F)
                                {
                                    movingobjectposition.entityHit.addVelocity(this.motionX * (double)this.knockbackStrength * 0.6000000238418579D / (double)f4, 0.1D, this.motionZ * (double)this.knockbackStrength * 0.6000000238418579D / (double)f4);
                                }
                            }

                            if (this.shootingEntity != null && movingobjectposition.entityHit != this.shootingEntity && movingobjectposition.entityHit instanceof EntityPlayer && this.shootingEntity instanceof EntityPlayerMP)
                            {
                                ((EntityPlayerMP)this.shootingEntity).playerNetServerHandler.sendPacket(new S2BPacketChangeGameState(6, 0.0F));
                            }
                        }

                        if (!(movingobjectposition.entityHit instanceof EntityEnderman))
                        {
                            this.setDead();
                        }
                    }
                    else
                    {
                        this.motionX *= -0.10000000149011612D;
                        this.motionY *= -0.10000000149011612D;
                        this.motionZ *= -0.10000000149011612D;
                        this.rotationYaw += 180.0F;
                        this.prevRotationYaw += 180.0F;
                        this.ticksInAir = 0;
                    }
                }
                else
                {
                    BlockPos blockpos1 = movingobjectposition.getBlockPos();
                    this.xTile = blockpos1.getX();
                    this.yTile = blockpos1.getY();
                    this.zTile = blockpos1.getZ();
                    iblockstate = this.worldObj.getBlockState(blockpos1);
                    this.inTile = iblockstate.getBlock();
                    this.inData = this.inTile.getMetaFromState(iblockstate);
                    this.motionX = (double)((float)(movingobjectposition.hitVec.xCoord - this.posX));
                    this.motionY = (double)((float)(movingobjectposition.hitVec.yCoord - this.posY));
                    this.motionZ = (double)((float)(movingobjectposition.hitVec.zCoord - this.posZ));
                    f3 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionY * this.motionY + this.motionZ * this.motionZ);
                    this.posX -= this.motionX / (double)f3 * 0.05000000074505806D;
                    this.posY -= this.motionY / (double)f3 * 0.05000000074505806D;
                    this.posZ -= this.motionZ / (double)f3 * 0.05000000074505806D;
                    this.playSound(Reference.MOD_ID + ":weapons.hit1", 0.3F, 1.0F);
                    this.inGround = true;
                    this.arrowShake = 7;

                    if (this.inTile.getMaterial() != Material.air)
                    {
                        this.inTile.onEntityCollidedWithBlock(this.worldObj, blockpos1, iblockstate, this);
                    }
                }
            }

            this.posX += this.motionX;
            this.posY += this.motionY;
            this.posZ += this.motionZ;
            f2 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
            this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

            for (this.rotationPitch = (float)(Math.atan2(this.motionY, (double)f2) * 180.0D / Math.PI); this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F)
            {
                ;
            }

            while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
            {
                this.prevRotationPitch += 360.0F;
            }

            while (this.rotationYaw - this.prevRotationYaw < -180.0F)
            {
                this.prevRotationYaw -= 360.0F;
            }

            while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
            {
                this.prevRotationYaw += 360.0F;
            }

            this.rotationPitch = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * 0.2F;
            this.rotationYaw = this.prevRotationYaw + (this.rotationYaw - this.prevRotationYaw) * 0.2F;
            f3 = 0.99F;
            f1 = 0.05F;

            if (this.isInWater())
            {
                for (int l = 0; l < 4; ++l)
                {
                    f4 = 0.25F;
                    this.worldObj.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX - this.motionX * (double)f4, this.posY - this.motionY * (double)f4, this.posZ - this.motionZ * (double)f4, this.motionX, this.motionY, this.motionZ, new int[0]);
                }

                f3 = 0.6F;
            }

            if (this.isWet())
            {
                this.extinguish();
            }

            this.motionX *= (double)f3;
            this.motionY *= (double)f3;
            this.motionZ *= (double)f3;
            this.motionY -= (double)f1;
            this.setPosition(this.posX, this.posY, this.posZ);
            this.doBlockCollisions();
        }
    }
    
    public void writeEntityToNBT(NBTTagCompound tagCompound)
    {
    	super.writeEntityToNBT(tagCompound);
    	
        //tagCompound.setLong("userUUIDLeast", this.canBePickedUp==1 ? this.shootingEntity.getUniqueID().getLeastSignificantBits() : 0);
        //tagCompound.setLong("userUUIDMost", this.canBePickedUp==1 ? this.shootingEntity.getUniqueID().getMostSignificantBits() : 0);
    	
        tagCompound.setBoolean("teleported", this.teleported);
        tagCompound.setBoolean("damaged", this.isDamaged);
    }
    
    public void readEntityFromNBT(NBTTagCompound tagCompound)
    {
    	super.readEntityFromNBT(tagCompound);
        this.teleported = tagCompound.getBoolean("teleported");
        this.isDamaged = tagCompound.getBoolean("damaged");
    }
    
    public void doTeleport()
    {
    	if (!this.worldObj.isRemote)
    	{
    		teleported = true;
    		if(this.shootingEntity instanceof EntityLivingBase)
    		{
    			EntityLivingBase entitylivingbase = (EntityLivingBase) this.shootingEntity;
    			if (entitylivingbase instanceof EntityPlayerMP)
    			{
    				EntityPlayerMP entityplayermp = (EntityPlayerMP)entitylivingbase;
    				if (entityplayermp.playerNetServerHandler.getNetworkManager().isChannelOpen() && entityplayermp.worldObj == this.worldObj && !entityplayermp.isPlayerSleeping())
    				{
    					net.minecraftforge.event.entity.living.EnderTeleportEvent event = new net.minecraftforge.event.entity.living.EnderTeleportEvent(entityplayermp, this.posX, this.posY, this.posZ, 5.0F);
    					if (!net.minecraftforge.common.MinecraftForge.EVENT_BUS.post(event))
    					{

    						if (entitylivingbase.isRiding())
    						{
    							entitylivingbase.mountEntity((Entity)null);
    						}
    						entitylivingbase.setPositionAndUpdate(event.targetX, event.targetY, event.targetZ);
    						entitylivingbase.fallDistance = 0.0F;
    					}
    				}
    			}
    			this.setDead();
    		}
    	}
    }
    
    public void onCollideWithPlayer(EntityPlayer entityIn)
    {
        if (!teleported && !entityIn.isSneaking() && this.shootingEntity != null && 
        	!this.worldObj.isRemote && this.inGround && this.ticksExisted > 35)
        {
            ItemStack stack = new ItemStack(UnrealItems.gunTranslocator,1,100);
            NBTHelper.setLong(stack, "discUUIDLeast", this.getUniqueID().getLeastSignificantBits());
    		NBTHelper.setLong(stack, "discUUIDMost", this.getUniqueID().getMostSignificantBits());
            
            boolean flag = this.canBePickedUp == 1 && entityIn.inventory.hasItemStack(stack) && entityIn.inventory.getFirstEmptyStack()!=-1 || entityIn.capabilities.isCreativeMode;
            
            if (flag)
            {
                NBTHelper.setLong(stack, "discUUIDLeast", 0);
        		NBTHelper.setLong(stack, "discUUIDMost", 0);
        		stack.setItemDamage(1);
        		boolean found=false;
        		int index = 0;
        		for(index = 0; index < entityIn.inventory.mainInventory.length; index++)
        		{
        			if( entityIn.inventory.mainInventory[index]!=null &&
        				entityIn.inventory.mainInventory[index].hasTagCompound() && 
            			entityIn.inventory.mainInventory[index].getTagCompound().getLong("discUUIDLeast")==this.getUniqueID().getLeastSignificantBits() && 
                    	entityIn.inventory.mainInventory[index].getTagCompound().getLong("discUUIDMost") ==this.getUniqueID().getMostSignificantBits())
        			{
        				found=true;
        				break;
        			}
        		}
                this.playSound(Reference.MOD_ID + ":item.ammoPickup", 0.3F, 1.0F);
                entityIn.onItemPickup(this, 1);
            	if(found)
            	{
                	entityIn.inventory.setInventorySlotContents(index, stack);
                }
                this.setDead();
            }
        }
    }
}
