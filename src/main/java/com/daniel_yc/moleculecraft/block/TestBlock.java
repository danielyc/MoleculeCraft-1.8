package com.daniel_yc.moleculecraft.block;

import com.daniel_yc.moleculecraft.MoleculeCraft;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class TestBlock extends Block {

	protected TestBlock(Material materialIn) {
		super(materialIn);
		this.setCreativeTab(MoleculeCraft.MoleculeTab);
		this.setUnlocalizedName("TestBlock");
		
		
	}
	

}
