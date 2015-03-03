package com.daniel_yc.moleculecraft.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemManager {
	
	public static Item Module;
	public static Item TestItem;
	
	
	public static void DefineItems(){
		
		Module = new ItemModule();
		TestItem = new ItemTestItem();
		
	}
	
	public static void RegisterItems(){
		
		GameRegistry.registerItem(Module, "Module");
		GameRegistry.registerItem(TestItem, "TestItem");
		
	}
	

}
