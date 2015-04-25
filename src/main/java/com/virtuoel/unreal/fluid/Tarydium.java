package com.virtuoel.unreal.fluid;

import net.minecraftforge.fluids.Fluid;

public class Tarydium extends Fluid
{
	public Tarydium(String fluidName)
	{
		super(fluidName);
	}
	
	@Override
    public int getColor()
    {
        return 0x11EE11;
    }
}
