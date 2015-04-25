package com.virtuoel.unreal.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.virtuoel.unreal.creativetab.CreativeTabUnreal;
import com.virtuoel.unreal.init.UnrealBlocks;

public class BlockUnrealTransparent extends BlockUnreal
{
	private boolean ignoreSimilarity;
	
    public BlockUnrealTransparent(Material materialIn, boolean ignoreSimilarityIn)
    {
        super(materialIn);
        this.ignoreSimilarity = ignoreSimilarityIn;
		this.setCreativeTab(CreativeTabUnreal.UNREAL_TAB);
    }
    
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess worldIn, BlockPos pos, EnumFacing side)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        Block block = iblockstate.getBlock();
        
        if (this == UnrealBlocks.blockForceField)
        {
            if (worldIn.getBlockState(pos.offset(side.getOpposite())) != iblockstate)
            {
                return true;
            }
            
            if (block == this)
            {
                return false;
            }
        }
        
        return !this.ignoreSimilarity && block == this ? false : super.shouldSideBeRendered(worldIn, pos, side);
    }
	
}
