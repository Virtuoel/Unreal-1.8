package com.virtuoel.unreal.fluid;

import net.minecraftforge.fluids.Fluid;

public class Health extends Fluid
{
	public Health(String fluidName)
	{
		super(fluidName);
	}
	
	@Override
    public int getColor()
    {
        return 0x1111EE;
    }
}
