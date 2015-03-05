package com.daniel_yc.moleculecraft.texture;

import com.daniel_yc.moleculecraft.block.BlockManager;
import com.daniel_yc.moleculecraft.item.ItemManager;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class TextureManager {
	
	public static void registerItemTextures(){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(ItemManager.Module, 0, new ModelResourceLocation("moleculecraft:Module", "inventory"));
		
		
	}
	
	public static void registerBlockTextures(){
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(BlockManager.TestBlock), 0, new ModelResourceLocation("moleculecraft:TestBlock", "inventory"));
		
		
		
	}

}
