package com.daniel_yc.moleculecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemModule extends Item {

	public ItemModule(){
		super();
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setUnlocalizedName("Module");
	}
}
