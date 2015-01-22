package de.citymc.SCO;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemTest extends Item {
	
	public ItemTest(){
		setCreativeTab(CreativeTabs.tabTools);
		setMaxStackSize(16);
		setUnlocalizedName("ItemTest");
		//setTextureName("SCO:ItemTest");
	}

}
