package com.virtuoel.unreal.fluid;

import net.minecraftforge.fluids.Fluid;

public class Nanoblack extends Fluid
{
	public Nanoblack(String fluidName)
	{
		super(fluidName);
	}
	
	@Override
    public int getColor()
    {
        return 0x000000;
    }
}
