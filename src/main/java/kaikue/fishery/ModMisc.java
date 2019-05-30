package kaikue.fishery;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModMisc {

	public static final CreativeTabs creativeTab = new CreativeTabs(Fishery.MODID) {
		@Override public ItemStack getTabIconItem() {
			return new ItemStack(Items.FISH); //TODO
		}
	};

	public static void init() {
		//registerWorldGeneration();
	}

	/*public static void registerWorldGeneration() {
		GameRegistry.registerWorldGenerator(new ModWorldGen(), 4);
	}*/
	
	public static void registerOreDictionary() {
		//OreDictionary.registerOre("itemSilicon", ModItems.itemSilicon);
	}
}
