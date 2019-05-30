package kaikue.fishery.proxy;

import kaikue.fishery.ModBlocks;
import kaikue.fishery.ModItems;
import kaikue.fishery.ModMisc;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public static Configuration config;

	public void preInit(FMLPreInitializationEvent e) {
		ModBlocks.init();
		ModItems.init();
		ModMisc.init();
	}

	public void init(FMLInitializationEvent e) {
		//NetworkRegistry.INSTANCE.registerGuiHandler(Fishery.instance, new GuiProxy());
	}

}
