package com.virtuoel.unreal.fluid;

import net.minecraftforge.fluids.Fluid;

public class Mercury extends Fluid
{
	public Mercury(String fluidName)
	{
		super(fluidName);
	}
	
	@Override
    public int getColor()
    {
        return 0x888888;
    }
}
