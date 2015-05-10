package com.virtuoel.unreal.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTranslocatorDisc extends ModelBase
{
	//fields
	ModelRenderer Base;
	ModelRenderer Stick;
	ModelRenderer Left;
	ModelRenderer Front;
	ModelRenderer Right;
	ModelRenderer Back;
	ModelRenderer Top;
	
	public ModelTranslocatorDisc()
	{
		//textureWidth = 32;
		//textureHeight = 32;
		
		Base = new ModelRenderer(this, 0, 4);
		Base.setTextureSize(32, 32);
		Base.addBox(-2.5F, -1.0F, -2.5F, 5, 1, 5);
		Base.setRotationPoint(0F, 4F, 0F);
		Base.mirror = true;
		Stick = new ModelRenderer(this, 16, 0);
		Stick.setTextureSize(32, 32);
		Stick.addBox(-0.5F, -5.0F, -0.5F, 1, 4, 1);
		Stick.setRotationPoint(0F, 4F, 0F);
		Stick.mirror = true;
		Left = new ModelRenderer(this, 0, 0);
		Left.setTextureSize(32, 32);
		Left.addBox(0.5F, -5.0F, -0.5F, 1, 1, 1);
		Left.setRotationPoint(0F, 4F, 0F);
		Left.mirror = true;
		Front = new ModelRenderer(this, 4, 0);
		Front.setTextureSize(32, 32);
		Front.addBox(-0.5F, -5.0F, -1.5F, 1, 1, 1);
		Front.setRotationPoint(0F, 4F, 0F);
		Front.mirror = true;
		Right = new ModelRenderer(this, 0, 0);
		Right.setTextureSize(32, 32);
		Right.addBox(-1.5F, -5.0F, -0.5F, 1, 1, 1);
		Right.setRotationPoint(0F, 4F, 0F);
		Right.mirror = true;
		Back = new ModelRenderer(this, 4, 0);
		Back.setTextureSize(32, 32);
		Back.addBox(-0.5F, -5.0F, 0.5F, 1, 1, 1);
		Back.setRotationPoint(0F, 4F, 0F);
		Back.mirror = true;
		Top = new ModelRenderer(this, 8, 0);
		Top.setTextureSize(32, 32);
		Top.addBox(-0.5F, -6.0F, -0.5F, 1, 1, 1);
		Top.setRotationPoint(0F, 4F, 0F);
		Top.mirror = true;
	}
	
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f0, f1, f2, f3, f4, f5);
		Base.render(f5);
		Stick.render(f5);
		Left.render(f5);
		Front.render(f5);
		Right.render(f5);
		Back.render(f5);
		Top.render(f5);
	}
	
}
