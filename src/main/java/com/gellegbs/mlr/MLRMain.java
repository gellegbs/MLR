package com.gellegbs.mlr;

import com.gellegbs.mlr.items.ItemBasic;
import com.gellegbs.mlr.proxy.CommonProxy;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)

public class MLRMain {

	public static Item carving_knife;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event){
		carving_knife = new ItemBasic().setUnlocalizedName("carving_knife");
		GameRegistry.registerItem(carving_knife, "carving_knife");
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event){
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event){
		
	}
}
