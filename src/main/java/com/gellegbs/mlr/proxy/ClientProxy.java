package com.gellegbs.mlr.proxy;

import com.gellegbs.mlr.MLRMain;
import com.gellegbs.mlr.items.ItemBasic;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	@Override
	public void preInit(FMLPreInitializationEvent event){
		super.preInit(event);
	}
	
	@Override
	public void init(FMLInitializationEvent event){
		super.init(event);
	
		//get renders & textures for items
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(MLRMain.carving_knife, 0, new ModelResourceLocation("mlr:carving_knife", "inventory"));
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event){
		super.postInit(event);
	}
}
