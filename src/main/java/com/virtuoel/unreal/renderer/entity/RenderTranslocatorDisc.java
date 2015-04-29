package com.virtuoel.unreal.renderer.entity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;

import com.virtuoel.unreal.client.model.ModelTranslocatorDisc;
import com.virtuoel.unreal.entity.EntityTranslocatorDisc;
import com.virtuoel.unreal.reference.Reference;

public class RenderTranslocatorDisc extends Render
{
    private static final ResourceLocation entityTextures = new ResourceLocation(Reference.MOD_NAME, "textures/entity/translocator.png");
    protected ModelBase modelTranslocator = new ModelTranslocatorDisc();
    
	public RenderTranslocatorDisc(RenderManager renderManager)
	{
		super(renderManager);
		this.shadowSize = 0.3F;
	}
	
	public void doRender(EntityTranslocatorDisc p_180552_1_, double p_180552_2_, double p_180552_4_, double p_180552_6_, float p_180552_8_, float p_180552_9_)
    {
        /*GlStateManager.pushMatrix();
        GlStateManager.translate((float)p_180552_2_, (float)p_180552_4_ + 0.25F, (float)p_180552_6_);
        GlStateManager.rotate(180.0F - p_180552_8_, 0.0F, 1.0F, 0.0F);

        float f4 = 0.75F;
        GlStateManager.scale(f4, f4, f4);
        GlStateManager.scale(1.0F / f4, 1.0F / f4, 1.0F / f4);
        this.bindEntityTexture(p_180552_1_);
        GlStateManager.scale(-1.0F, -1.0F, 1.0F);
        this.modelTranslocator.render(p_180552_1_, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GlStateManager.popMatrix();
        super.doRender(p_180552_1_, p_180552_2_, p_180552_4_, p_180552_6_, p_180552_8_, p_180552_9_);*/
		
		GlStateManager.pushMatrix();
        GlStateManager.translate((float)p_180552_2_, (float)p_180552_4_ + 0.25F, (float)p_180552_6_);
        GlStateManager.rotate(180.0F - p_180552_8_, 0.0F, 1.0F, 0.0F);
        float f2 = /*(float)p_180552_1_.getTimeSinceHit() -*/ p_180552_9_;
        float f3 = /*p_180552_1_.getDamageTaken() -*/ p_180552_9_;

        if (f3 < 0.0F)
        {
            f3 = 0.0F;
        }

        if (f2 > 0.0F)
        {
            GlStateManager.rotate(MathHelper.sin(f2) * f2 * f3 / 10.0F * (float)1, 1.0F, 0.0F, 0.0F);
        }

        float f4 = 0.75F;
        GlStateManager.scale(f4, f4, f4);
        GlStateManager.scale(1.0F / f4, 1.0F / f4, 1.0F / f4);
        this.bindEntityTexture(p_180552_1_);
        GlStateManager.scale(-1.0F, -1.0F, 1.0F);
        this.modelTranslocator.render(p_180552_1_, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
        GlStateManager.popMatrix();
        super.doRender(p_180552_1_, p_180552_2_, p_180552_4_, p_180552_6_, p_180552_8_, p_180552_9_);
    }
	
	@Override
	public ResourceLocation getEntityTexture(Entity entity)
	{
		return entityTextures;
	}
	
	@Override
	public void doRender(Entity entity, double x, double y, double z, float p_76986_8_, float partialTicks)
    {
        this.doRender((EntityTranslocatorDisc)entity, x, y, z, p_76986_8_, partialTicks);
    }
	
}
