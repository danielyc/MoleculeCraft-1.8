package com.daniel_yc.moleculecraft.item;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemManager {
	
	public static Item Module;
	
	public static void RegisterItems(){
		GameRegistry.registerItem(Module, "Module");
		
	}
	
	public static void DefineItems(){
		Module = new ItemModule();
		
	}
	
	
	
	
	

}
