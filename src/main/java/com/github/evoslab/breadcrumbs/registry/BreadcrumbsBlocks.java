package com.github.evoslab.breadcrumbs.registry;

import com.github.evoslab.breadcrumbs.Breadcrumbs;
import com.github.evoslab.breadcrumbs.block.BreadcrumbsStairsBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BreadcrumbsBlocks {

    //Bread Blocks
    public static final Block BREAD_BLOCK = new Block(Properties.BREAD);
    public static final Block HONEY_BREAD_BLOCK = new Block(Properties.BREAD);
    public static final Block PUMPKIN_BREAD_BLOCK = new Block(Properties.BREAD);

    //Bread Bricks
    public static final Block BREAD_BRICKS = new Block(Properties.BREAD_BRICKS);
    public static final SlabBlock BREAD_BRICK_SLAB = new SlabBlock(Properties.BREAD_BRICKS);
    public static final BreadcrumbsStairsBlock BREAD_BRICK_STAIRS = new BreadcrumbsStairsBlock(BREAD_BRICKS.getDefaultState(), Properties.BREAD_BRICKS);
    public static final WallBlock BREAD_BRICK_WALL = new WallBlock(Properties.BREAD_BRICKS);

    public static final Block BREAD_PAVEMENT = new Block(Properties.BREAD_BRICKS);
    public static final PillarBlock BREAD_PILLAR = new PillarBlock(Properties.BREAD_BRICKS);
    public static final Block CHISELED_BREAD_BRICKS = new Block(Properties.BREAD_BRICKS);
    public static final Block POLISHED_BREAD_BRICKS = new Block(Properties.BREAD_BRICKS);

    //Honey Bread Bricks
    public static final Block HONEY_BREAD_BRICKS = new Block(Properties.BREAD_BRICKS);
    public static final SlabBlock HONEY_BREAD_BRICK_SLAB = new SlabBlock(Properties.BREAD_BRICKS);
    public static final BreadcrumbsStairsBlock HONEY_BREAD_BRICK_STAIRS = new BreadcrumbsStairsBlock(BREAD_BRICKS.getDefaultState(), Properties.BREAD_BRICKS);
    public static final WallBlock HONEY_BREAD_BRICK_WALL = new WallBlock(Properties.BREAD_BRICKS);

    public static final Block HONEY_BREAD_PAVEMENT = new Block(Properties.BREAD_BRICKS);
    public static final PillarBlock HONEY_BREAD_PILLAR = new PillarBlock(Properties.BREAD_BRICKS);
    public static final Block HONEY_CHISELED_BREAD_BRICKS = new Block(Properties.BREAD_BRICKS);
    public static final Block HONEY_POLISHED_BREAD_BRICKS = new Block(Properties.BREAD_BRICKS);

    //Pumpkin Bread Bricks
    public static final Block PUMPKIN_BREAD_BRICKS = new Block(Properties.BREAD_BRICKS);
    public static final SlabBlock PUMPKIN_BREAD_BRICK_SLAB = new SlabBlock(Properties.BREAD_BRICKS);
    public static final BreadcrumbsStairsBlock PUMPKIN_BREAD_BRICK_STAIRS = new BreadcrumbsStairsBlock(BREAD_BRICKS.getDefaultState(), Properties.BREAD_BRICKS);
    public static final WallBlock PUMPKIN_BREAD_BRICK_WALL = new WallBlock(Properties.BREAD_BRICKS);

    public static final Block PUMPKIN_BREAD_PAVEMENT = new Block(Properties.BREAD_BRICKS);
    public static final PillarBlock PUMPKIN_BREAD_PILLAR = new PillarBlock(Properties.BREAD_BRICKS);
    public static final Block PUMPKIN_CHISELED_BREAD_BRICKS = new Block(Properties.BREAD_BRICKS);
    public static final Block PUMPKIN_POLISHED_BREAD_BRICKS = new Block(Properties.BREAD_BRICKS);

    public static void RegisterBreadcrumbsBlocks() {

        //Bread Blocks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_block"), BREAD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_block"), HONEY_BREAD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_block"), PUMPKIN_BREAD_BLOCK);

        //Bread Bricks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_bricks"), BREAD_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_brick_slab"), BREAD_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_brick_stairs"), BREAD_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_brick_wall"), BREAD_BRICK_WALL);

        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_pavement"), BREAD_PAVEMENT);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_pillar"), BREAD_PILLAR);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "chiseled_bread_bricks"), CHISELED_BREAD_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "polished_bread_bricks"), POLISHED_BREAD_BRICKS);

        //Honey Bread Bricks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_bricks"), HONEY_BREAD_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_slab"), HONEY_BREAD_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_stairs"), HONEY_BREAD_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_wall"), HONEY_BREAD_BRICK_WALL);

        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_pavement"), HONEY_BREAD_PAVEMENT);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_pillar"), HONEY_BREAD_PILLAR);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_chiseled_bread_bricks"), HONEY_CHISELED_BREAD_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_bricks"), HONEY_POLISHED_BREAD_BRICKS);

        //Pumpkin Bread Bricks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_bricks"), PUMPKIN_BREAD_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_brick_slab"), PUMPKIN_BREAD_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_brick_stairs"), PUMPKIN_BREAD_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_brick_wall"), PUMPKIN_BREAD_BRICK_WALL);

        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_pavement"), PUMPKIN_BREAD_PAVEMENT);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_pillar"), PUMPKIN_BREAD_PILLAR);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_chiseled_bread_bricks"), PUMPKIN_CHISELED_BREAD_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_bricks"), PUMPKIN_POLISHED_BREAD_BRICKS);

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
