package kaikue.fishery;

import java.util.ArrayList;
import java.util.Arrays;

import kaikue.fishery.blocks.BaseBlock;

public class ModBlocks {

	public static ArrayList<BaseBlock> blocks;

	//public static BlockSiliconCrystal blockSiliconCrystal;

	public static void init() {
		blocks = new ArrayList<BaseBlock>();
		blocks.addAll(Arrays.asList(
				//blockSiliconCrystal = new BlockSiliconCrystal(),
				));
	}
	
	public static void initModels() {
		for(BaseBlock block : blocks) {
			block.initModel();
		}
	}
}
