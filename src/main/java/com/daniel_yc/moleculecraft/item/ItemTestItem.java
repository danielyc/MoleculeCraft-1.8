package com.daniel_yc.moleculecraft.item;

import com.daniel_yc.moleculecraft.MoleculeCraft;

import net.minecraft.item.Item;

public class ItemTestItem extends Item {
	
	public ItemTestItem(){
		super();
		this.setCreativeTab(MoleculeCraft.MoleculeTab);
		this.setUnlocalizedName("TestItem");
	}

}
