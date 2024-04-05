package net.cixx.budcraft.block;

import net.cixx.budcraft.Budcraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.TransparentBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    //Drug Stuff
    public static final Block HASH_BLOCK = registerBlock("hash_block",
            new Block(FabricBlockSettings.copyOf(Blocks.GRASS_BLOCK).sounds(BlockSoundGroup.MUD)));
    public static final Block STYROFOAM_BLOCK = registerBlock("styrofoam_block",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.SNOW)));

    //Glass Stuff
    public static final Block BARRED_GLASS = registerBlock("barred_glass",
            new TransparentBlock(FabricBlockSettings.copyOf(Blocks.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque()));
    public static final Block KNITTED_GLASS = registerBlock("knitted_glass",
            new TransparentBlock(FabricBlockSettings.copyOf(Blocks.GLASS).sounds(BlockSoundGroup.GLASS).nonOpaque()));

    //Wood Stuff
    public static final Block ELDERBARK_LOG = registerBlock("elderbark_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f).sounds(BlockSoundGroup.WOOD)));
    public static final Block ELDERBARK_PLANKS = registerBlock("elderbark_planks",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f).sounds(BlockSoundGroup.WOOD)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Budcraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Budcraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Budcraft.LOGGER.info("Registering ModBlocks for " + Budcraft.MOD_ID);
    }
}
