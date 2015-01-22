package de.citymc.SCO;

import net.minecraft.block.material.Material;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class Blockmain extends Block{
	

	private String filename;
	
	public Blockmain(int id, Material mat){
		super(id, mat);
		}

	@Override
	public void registerIcons(IconRegister reg){
		this.blockIcon = reg.registerIcon(filename);
	}
	
	public void setIconFile(String name){
		filename = name;
	}
}
