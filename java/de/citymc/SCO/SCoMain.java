package de.citymc.SCO;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import de.citymc.SCO.Proxy.Proxy;


@Mod(modid = "sco", name = "SwordCraftOnline", version = "0.0.1")
//@NetworkMod(clientSideRequired=true)
public class SCoMain {
	
	@Instance(value="SCO")
	public static SCoMain instace;
	
	@SidedProxy(clientSide="de.citymc.SCO.Proxy.ClientProxy", serverSide="de.citymc.SCO.Proxy.Proxy")
	public static Proxy proxy;
	
	Item ItemTest;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ItemTest = new ItemTest().setTextureName("SCO:ItemTest");
		GameRegistry.registerItem(ItemTest, "Test-Item!");
	}
	
	@EventHandler
	public void load(FMLPreInitializationEvent event){
		proxy.registerRenderers();
		
		Recipes();
		
	}
	
	@EventHandler
	public void postInit(FMLPreInitializationEvent event){
		
	}
	
	private void Recipes(){
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.diamond_block, 1), Blocks.dirt, Blocks.sand);
		GameRegistry.addShapedRecipe(new ItemStack (Items.diamond, 1), "x x", " x ", "x x", Character.valueOf('x'), Blocks.dirt);
		
	}
}
