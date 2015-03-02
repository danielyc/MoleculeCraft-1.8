package com.daniel_yc.moleculecraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class TestBlock extends Block {

	protected TestBlock(Material materialIn) {
		super(materialIn);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setUnlocalizedName("TestBlock");
	}

}
