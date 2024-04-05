package net.cixx.budcraft.item;

import net.cixx.budcraft.Budcraft;
import net.cixx.budcraft.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup LEAN_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Budcraft.MOD_ID, "lean"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.lean"))
                    .icon(() -> new ItemStack(ModItems.LEAN)).entries((displayContext, entries) -> {
                        //Items

                        entries.add(ModItems.MARIJUANA);
                        entries.add(ModItems.CODEINE);
                        entries.add(ModItems.LEAN);
                        entries.add(ModItems.DOUBLE_CUP);
                        entries.add(ModItems.STYROFOAM_CUP);
                        entries.add(ModItems.STYROFOAM);

                        //Blocks
                        entries.add(ModBlocks.STYROFOAM_BLOCK);
                        entries.add(ModBlocks.HASH_BLOCK);
                        entries.add(ModBlocks.BARRED_GLASS);
                        entries.add(ModBlocks.KNITTED_GLASS);
                        entries.add(ModBlocks.ELDERBARK_LOG);
                        entries.add(ModBlocks.ELDERBARK_PLANKS);

                    }).build());

    public static void registerItemGroups() {
        Budcraft.LOGGER.info("Registering Item Groups for " + Budcraft.MOD_ID);
    }
}
