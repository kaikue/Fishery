package kaikue.fishery;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import kaikue.fishery.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Fishery.MODID, dependencies = "required-after:forge@[14.23.5.2838,)", useMetadata = true)
public class Fishery {

	public static final String MODID = "fishery";

	public static final Logger logger = LogManager.getLogger(Fishery.MODID);

	@SidedProxy(clientSide = "kaikue.fishery.proxy.ClientProxy", serverSide = "kaikue.fishery.proxy.ServerProxy")
	public static CommonProxy proxy;

	@Mod.Instance
	public static Fishery instance = new Fishery();

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

}
