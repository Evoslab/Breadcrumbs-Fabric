package com.github.evoslab.breadcrumbs.registry;

import com.github.evoslab.breadcrumbs.Breadcrumbs;
import com.github.evoslab.breadcrumbs.block.BreadcrumbsStairsBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BreadcrumbsBlocks {

    public static final Block BREAD_BLOCK = new Block(Properties.BREAD);
    public static final Block HONEY_BREAD_BLOCK = new Block(Properties.BREAD);
    public static final Block PUMPKIN_BREAD_BLOCK = new Block(Properties.BREAD);

    public static final Block BREAD_BRICKS = new Block(Properties.BREAD_BRICKS);
    public static final SlabBlock BREAD_BRICK_SLAB = new SlabBlock(Properties.BREAD_BRICKS);
    public static final BreadcrumbsStairsBlock BREAD_BRICK_STAIRS = new BreadcrumbsStairsBlock(BREAD_BRICKS.getDefaultState(), Properties.BREAD_BRICKS);
    public static final WallBlock BREAD_BRICK_WALL = new WallBlock(Properties.BREAD_BRICKS);

    public static final Block HONEY_BREAD_BRICKS = new Block(Properties.BREAD_BRICKS);
    public static final SlabBlock HONEY_BREAD_BRICK_SLAB = new SlabBlock(Properties.BREAD_BRICKS);
    public static final BreadcrumbsStairsBlock HONEY_BREAD_BRICK_STAIRS = new BreadcrumbsStairsBlock(BREAD_BRICKS.getDefaultState(), Properties.BREAD_BRICKS);
    public static final WallBlock HONEY_BREAD_BRICK_WALL = new WallBlock(Properties.BREAD_BRICKS);

    public static final Block PUMPKIN_BREAD_BRICKS = new Block(Properties.BREAD_BRICKS);
    public static final SlabBlock PUMPKIN_BREAD_BRICK_SLAB = new SlabBlock(Properties.BREAD_BRICKS);
    public static final BreadcrumbsStairsBlock PUMPKIN_BREAD_BRICK_STAIRS = new BreadcrumbsStairsBlock(BREAD_BRICKS.getDefaultState(), Properties.BREAD_BRICKS);
    public static final WallBlock PUMPKIN_BREAD_BRICK_WALL = new WallBlock(Properties.BREAD_BRICKS);

    public static void RegisterBreadcrumbsBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_block"), BREAD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_block"), HONEY_BREAD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_block"), PUMPKIN_BREAD_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_bricks"), BREAD_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_brick_slab"), BREAD_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_brick_stairs"), BREAD_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_brick_wall"), BREAD_BRICK_WALL);

        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_bricks"), HONEY_BREAD_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_slab"), HONEY_BREAD_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_stairs"), HONEY_BREAD_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_wall"), HONEY_BREAD_BRICK_WALL);

        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_bricks"), PUMPKIN_BREAD_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_brick_slab"), PUMPKIN_BREAD_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_brick_stairs"), PUMPKIN_BREAD_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_brick_wall"), PUMPKIN_BREAD_BRICK_WALL);
    }

    public static class Properties {
        public static final FabricBlockSettings BREAD = FabricBlockSettings.of(Material.WOOD)
                .hardness(1.0f)
                .resistance(1.0f)
                .sounds(BlockSoundGroup.WOOD)
                .breakByTool(FabricToolTags.HOES)
                .breakByHand(true);

        public static final FabricBlockSettings BREAD_BRICKS = FabricBlockSettings.of(Material.STONE)
                .hardness(1.0f)
                .resistance(1.0f)
                .sounds(BlockSoundGroup.STONE)
                .breakByTool(FabricToolTags.PICKAXES)
                .breakByHand(true);

    }
}
