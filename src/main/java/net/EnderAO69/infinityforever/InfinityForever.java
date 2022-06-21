package net.EnderAO69.infinityforever;

import net.EnderAO69.infinityforever.block.ModBlocks;
import net.EnderAO69.infinityforever.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfinityForever implements ModInitializer {
	public static final String  MOD_ID = "infinityforever";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");


	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}
