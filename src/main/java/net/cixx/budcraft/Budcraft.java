package net.cixx.budcraft;

import net.cixx.budcraft.item.ModItemGroups;
import net.cixx.budcraft.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Budcraft implements ModInitializer {
	public static final String MOD_ID = "budcraft";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
	}
}