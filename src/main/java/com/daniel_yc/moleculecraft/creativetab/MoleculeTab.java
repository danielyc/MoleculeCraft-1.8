package com.daniel_yc.moleculecraft.creativetab;

import com.daniel_yc.moleculecraft.block.BlockManager;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MoleculeTab extends CreativeTabs {

	public MoleculeTab(String label) {
		super(label);
		
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(BlockManager.TestBlock);
	}

}
