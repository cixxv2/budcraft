package net.cixx.budcraft.util;

import net.cixx.budcraft.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModTags {

    private static void registerFlammableBlock() {
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.ELDERBARK_LOG, 5, 5);
        instance.add(ModBlocks.ELDERBARK_PLANKS, 5, 5);
    }
}
