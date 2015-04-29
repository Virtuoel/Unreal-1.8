package com.virtuoel.unreal.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTranslocatorDisc extends ModelBase
{
	//fields
	ModelRenderer Base;
	ModelRenderer Stick;
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	
	public ModelTranslocatorDisc()
	{
		//textureWidth = 32;
		//textureHeight = 32;
		
		Base = new ModelRenderer(this, 0, 4);
		Base.addBox(-2.5F, -0.5F, -2.5F, 5, 1, 5);
		Base.setRotationPoint(0F, 23F, 0F);
		//Base.setTextureSize(32, 32);
		//Base.mirror = true;
		Stick = new ModelRenderer(this, 16, 0);
		Stick.addBox(-0.5F, -4.5F, -0.5F, 1, 4, 1);
		Stick.setRotationPoint(0F, 23F, 0F);
		//Stick.setTextureSize(32, 32);
		//Stick.mirror = true;
		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0.5F, -0.5F, -0.5F, 1, 1, 1);
		Shape1.setRotationPoint(0F, 19F, 0F);
		//Shape1.setTextureSize(32, 32);
		//Shape1.mirror = true;
		Shape2 = new ModelRenderer(this, 4, 0);
		Shape2.addBox(-0.5F, -0.5F, -1.5F, 1, 1, 1);
		Shape2.setRotationPoint(0F, 19F, 0F);
		//Shape2.setTextureSize(32, 32);
		//Shape2.mirror = true;
		Shape3 = new ModelRenderer(this, 0, 0);
		Shape3.addBox(-1.5F, -0.5F, -0.5F, 1, 1, 1);
		Shape3.setRotationPoint(0F, 19F, 0F);
		//Shape3.setTextureSize(32, 32);
		//Shape3.mirror = true;
		Shape4 = new ModelRenderer(this, 4, 0);
		Shape4.addBox(-0.5F, -0.5F, 0.5F, 1, 1, 1);
		Shape4.setRotationPoint(0F, 19F, 0F);
		//Shape4.setTextureSize(32, 32);
		//Shape4.mirror = true;
		Shape5 = new ModelRenderer(this, 8, 0);
		Shape5.addBox(-0.5F, -1.5F, -0.5F, 1, 1, 1);
		Shape5.setRotationPoint(0F, 19F, 0F);
		//Shape5.setTextureSize(32, 32);
		//Shape5.mirror = true;
	}
	
	public void render(Entity entity, float f0, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f0, f1, f2, f3, f4, f5);
		Base.render(f5);
		Stick.render(f5);
		Shape1.render(f5);
		Shape2.render(f5);
		Shape3.render(f5);
		Shape4.render(f5);
		Shape5.render(f5);
	}
	
}
