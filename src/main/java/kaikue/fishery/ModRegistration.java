package kaikue.fishery;

import kaikue.fishery.blocks.BaseBlock;
import kaikue.fishery.items.BaseItem;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ModRegistration {

	@SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
		for(BaseBlock block : ModBlocks.blocks) {
			event.getRegistry().register(block);
		}
		
		//ResourceLocation resourceLocation = new ResourceLocation(Fishery.MODID, "beamnetwork");
		//GameRegistry.registerTileEntity(TileEntityBeamNetwork.class, resourceLocation);
    }
	
	@SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
		for(BaseItem item : ModItems.items) {
			event.getRegistry().register(item);
		}
		for(BaseBlock block : ModBlocks.blocks) {
			event.getRegistry().register(block.itemBlock.setRegistryName(block.getRegistryName()));
		}
		
		ModMisc.registerOreDictionary();
		
    }
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {

		ModItems.initModels();
		ModBlocks.initModels();
	}
}
