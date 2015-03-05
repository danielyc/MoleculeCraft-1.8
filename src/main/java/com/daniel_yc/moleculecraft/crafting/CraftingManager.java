package com.daniel_yc.moleculecraft.crafting;

import com.daniel_yc.moleculecraft.block.BlockManager;
import com.daniel_yc.moleculecraft.item.ItemManager;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class CraftingManager {

	
	public static void AddCraftingRecipies(){
		
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemManager.Module), "rir", "idi", "rir", 'r', new ItemStack(Items.redstone), 'd', new ItemStack(Items.diamond), 'i', new ItemStack(Items.iron_ingot)));
	}
}
