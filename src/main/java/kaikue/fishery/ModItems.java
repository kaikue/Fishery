package kaikue.fishery;

import java.util.ArrayList;
import java.util.Arrays;

import kaikue.fishery.items.BaseItem;

public class ModItems {

	public static ArrayList<BaseItem> items;

	//public static ItemLaserCore itemLaserCore;
	
	public static void init() {
		items = new ArrayList<BaseItem>();
		items.addAll(Arrays.asList(
				//itemLaserCore = new ItemLaserCore(),
				));

	}

	public static void initModels() {
		for(BaseItem item : items) {
			item.initModel();
		}
	}
}
