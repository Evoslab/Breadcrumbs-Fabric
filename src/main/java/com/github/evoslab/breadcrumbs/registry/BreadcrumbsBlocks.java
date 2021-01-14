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
    public static final SlabBlock BREAD_SLAB = new SlabBlock(Properties.BREAD);
    public static final BreadcrumbsStairsBlock BREAD_STAIRS = new BreadcrumbsStairsBlock(BREAD_BLOCK.getDefaultState(), Properties.BREAD);
    public static final WallBlock BREAD_WALL = new WallBlock(Properties.BREAD);

    //Polished Bread Blocks
    public static final Block POLISHED_BREAD_BLOCK = new Block(Properties.BREAD);
    public static final SlabBlock POLISHED_BREAD_SLAB = new SlabBlock(Properties.BREAD);
    public static final BreadcrumbsStairsBlock POLISHED_BREAD_STAIRS = new BreadcrumbsStairsBlock(POLISHED_BREAD_BLOCK.getDefaultState(), Properties.BREAD);
    public static final WallBlock POLISHED_BREAD_WALL = new WallBlock(Properties.BREAD);

    //Bread Bricks
    public static final Block BREAD_BRICKS = new Block(Properties.BREAD);
    public static final SlabBlock BREAD_BRICK_SLAB = new SlabBlock(Properties.BREAD);
    public static final BreadcrumbsStairsBlock BREAD_BRICK_STAIRS = new BreadcrumbsStairsBlock(BREAD_BRICKS.getDefaultState(), Properties.BREAD);
    public static final WallBlock BREAD_BRICK_WALL = new WallBlock(Properties.BREAD);

    //Bread Stonecutted Blocks
    public static final Block BREAD_PAVEMENT = new Block(Properties.BREAD);
    public static final PillarBlock BREAD_PILLAR = new PillarBlock(Properties.BREAD);
    public static final Block CHISELED_BREAD_BRICKS = new Block(Properties.BREAD);

    //Honey Bread Blocks
    public static final Block HONEY_BREAD_BLOCK = new Block(Properties.BREAD);
    public static final SlabBlock HONEY_BREAD_SLAB = new SlabBlock(Properties.BREAD);
    public static final BreadcrumbsStairsBlock HONEY_BREAD_STAIRS = new BreadcrumbsStairsBlock(HONEY_BREAD_BLOCK.getDefaultState(), Properties.BREAD);
    public static final WallBlock HONEY_BREAD_WALL = new WallBlock(Properties.BREAD);

    //Polished Honey Bread Blocks
    public static final Block POLISHED_HONEY_BREAD_BLOCK = new Block(Properties.BREAD);
    public static final SlabBlock POLISHED_HONEY_BREAD_SLAB = new SlabBlock(Properties.BREAD);
    public static final BreadcrumbsStairsBlock POLISHED_HONEY_BREAD_STAIRS = new BreadcrumbsStairsBlock(POLISHED_HONEY_BREAD_BLOCK.getDefaultState(), Properties.BREAD);
    public static final WallBlock POLISHED_HONEY_BREAD_WALL = new WallBlock(Properties.BREAD);

    //Honey Bread Bricks
    public static final Block HONEY_BREAD_BRICKS = new Block(Properties.BREAD);
    public static final SlabBlock HONEY_BREAD_BRICK_SLAB = new SlabBlock(Properties.BREAD);
    public static final BreadcrumbsStairsBlock HONEY_BREAD_BRICK_STAIRS = new BreadcrumbsStairsBlock(HONEY_BREAD_BRICKS.getDefaultState(), Properties.BREAD);
    public static final WallBlock HONEY_BREAD_BRICK_WALL = new WallBlock(Properties.BREAD);

    //Honey Bread Stonecutted Blocks
    public static final Block HONEY_BREAD_PAVEMENT = new Block(Properties.BREAD);
    public static final PillarBlock HONEY_BREAD_PILLAR = new PillarBlock(Properties.BREAD);
    public static final Block CHISELED_HONEY_BREAD_BRICKS = new Block(Properties.BREAD);

    //Pumpkin Bread Blocks
    public static final Block PUMPKIN_BREAD_BLOCK = new Block(Properties.BREAD);
    public static final SlabBlock PUMPKIN_BREAD_SLAB = new SlabBlock(Properties.BREAD);
    public static final BreadcrumbsStairsBlock PUMPKIN_BREAD_STAIRS = new BreadcrumbsStairsBlock(PUMPKIN_BREAD_BLOCK.getDefaultState(), Properties.BREAD);
    public static final WallBlock PUMPKIN_BREAD_WALL = new WallBlock(Properties.BREAD);

    //Polished Pumpkin Bread Block
    public static final Block POLISHED_PUMPKIN_BREAD_BLOCK = new Block(Properties.BREAD);
    public static final SlabBlock POLISHED_PUMPKIN_BREAD_SLAB = new SlabBlock(Properties.BREAD);
    public static final BreadcrumbsStairsBlock POLISHED_PUMPKIN_BREAD_STAIRS = new BreadcrumbsStairsBlock(POLISHED_PUMPKIN_BREAD_BLOCK.getDefaultState(), Properties.BREAD);
    public static final WallBlock POLISHED_PUMPKIN_BREAD_WALL = new WallBlock(Properties.BREAD);

    //Pumpkin Bread Bricks
    public static final Block PUMPKIN_BREAD_BRICKS = new Block(Properties.BREAD);
    public static final SlabBlock PUMPKIN_BREAD_BRICK_SLAB = new SlabBlock(Properties.BREAD);
    public static final BreadcrumbsStairsBlock PUMPKIN_BREAD_BRICK_STAIRS = new BreadcrumbsStairsBlock(PUMPKIN_BREAD_BRICKS.getDefaultState(), Properties.BREAD);
    public static final WallBlock PUMPKIN_BREAD_BRICK_WALL = new WallBlock(Properties.BREAD);

    //Pumpkin Bread Stonecutted Blocks
    public static final Block PUMPKIN_BREAD_PAVEMENT = new Block(Properties.BREAD);
    public static final PillarBlock PUMPKIN_BREAD_PILLAR = new PillarBlock(Properties.BREAD);
    public static final Block CHISELED_PUMPKIN_BREAD_BRICKS = new Block(Properties.BREAD);

    public static void RegisterBreadcrumbsBlocks() {

        //Bread Blocks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_block"), BREAD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_slab"), BREAD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_stairs"), BREAD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_wall"), BREAD_WALL);

        //Polished Bread Blocks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "polished_bread_block"), POLISHED_BREAD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "polished_bread_slab"), POLISHED_BREAD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "polished_bread_stairs"), POLISHED_BREAD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "polished_bread_wall"), POLISHED_BREAD_WALL);

        //Bread Bricks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_bricks"), BREAD_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_brick_slab"), BREAD_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_brick_stairs"), BREAD_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_brick_wall"), BREAD_BRICK_WALL);

        //Bread Stonecutted Blocks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_pavement"), BREAD_PAVEMENT);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "bread_pillar"), BREAD_PILLAR);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "chiseled_bread_bricks"), CHISELED_BREAD_BRICKS);

        //Honey Bread Blocks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_block"), HONEY_BREAD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_slab"), HONEY_BREAD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_stairs"), HONEY_BREAD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_wall"), HONEY_BREAD_WALL);

        //Polished Honey Bread Blocks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "polished_honey_bread_block"), POLISHED_HONEY_BREAD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "polished_honey_bread_slab"), POLISHED_HONEY_BREAD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "polished_honey_bread_stairs"), POLISHED_HONEY_BREAD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "polished_honey_bread_wall"), POLISHED_HONEY_BREAD_WALL);

        //Honey Bread Bricks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_bricks"), HONEY_BREAD_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_slab"), HONEY_BREAD_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_stairs"), HONEY_BREAD_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_wall"), HONEY_BREAD_BRICK_WALL);

        //Honey Bread Stonecutted Blocks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_pavement"), HONEY_BREAD_PAVEMENT);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "honey_bread_pillar"), HONEY_BREAD_PILLAR);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "chiseled_honey_bread_bricks"), CHISELED_HONEY_BREAD_BRICKS);

        //Pumpkin Bread Blocks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_block"), PUMPKIN_BREAD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_slab"), PUMPKIN_BREAD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_stairs"), PUMPKIN_BREAD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_wall"), PUMPKIN_BREAD_WALL);

        //Polished Pumpkin Bread Blocks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "polished_pumpkin_bread_block"), POLISHED_PUMPKIN_BREAD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "polished_pumpkin_bread_slab"), POLISHED_PUMPKIN_BREAD_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "polished_pumpkin_bread_stairs"), POLISHED_PUMPKIN_BREAD_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "polished_pumpkin_bread_wall"), POLISHED_PUMPKIN_BREAD_WALL);

        //Pumpkin Bread Bricks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_bricks"), PUMPKIN_BREAD_BRICKS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_brick_slab"), PUMPKIN_BREAD_BRICK_SLAB);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_brick_stairs"), PUMPKIN_BREAD_BRICK_STAIRS);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_brick_wall"), PUMPKIN_BREAD_BRICK_WALL);

        //Pumpkin Bread Stonecutted Blocks
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_pavement"), PUMPKIN_BREAD_PAVEMENT);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_pillar"), PUMPKIN_BREAD_PILLAR);
        Registry.register(Registry.BLOCK, new Identifier(Breadcrumbs.MODID, "chiseled_pumpkin_bread_bricks"), CHISELED_PUMPKIN_BREAD_BRICKS);

    }

    public static class Properties {
        public static final FabricBlockSettings BREAD = FabricBlockSettings.of(Material.WOOL)
                .hardness(1.0f)
                .resistance(1.0f)
                .sounds(BlockSoundGroup.WOOL)
                .breakByTool(FabricToolTags.HOES)
                .breakByHand(true);
    }
}
