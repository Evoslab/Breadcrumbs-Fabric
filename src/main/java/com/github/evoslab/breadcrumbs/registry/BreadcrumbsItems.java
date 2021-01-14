package com.github.evoslab.breadcrumbs.registry;

import com.github.evoslab.breadcrumbs.Breadcrumbs;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.github.evoslab.breadcrumbs.registry.BreadcrumbsBlocks.*;

public class BreadcrumbsItems {

    //Bread Blocks
    public static final Item BREAD_BLOCK_ITEM = new BlockItem(BREAD_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item BREAD_SLAB_ITEM = new BlockItem(BREAD_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item BREAD_STAIRS_ITEM = new BlockItem(BREAD_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item BREAD_WALL_ITEM = new BlockItem(BREAD_WALL, new Item.Settings().group(ItemGroup.DECORATIONS));

    //Polished Bread Blocks
    public static final Item POLISHED_BREAD_BLOCK_ITEM = new BlockItem(POLISHED_BREAD_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item POLISHED_BREAD_SLAB_ITEM = new BlockItem(POLISHED_BREAD_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item POLISHED_BREAD_STAIRS_ITEM = new BlockItem(POLISHED_BREAD_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item POLISHED_BREAD_WALL_ITEM = new BlockItem(POLISHED_BREAD_WALL, new Item.Settings().group(ItemGroup.DECORATIONS));

    //Bread Bricks
    public static final Item BREAD_BRICKS_ITEM = new BlockItem(BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item BREAD_BRICK_SLAB_ITEM = new BlockItem(BREAD_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item BREAD_BRICK_STAIRS_ITEM = new BlockItem(BREAD_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item BREAD_BRICK_WALL_ITEM = new BlockItem(BREAD_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS).maxCount(64));

    //Bread Stonecutted Blocks
    public static final Item BREAD_PAVEMENT_ITEM = new BlockItem(BREAD_PAVEMENT, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item BREAD_PILLAR_ITEM = new BlockItem(BREAD_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item CHISELED_BREAD_BRICKS_ITEM = new BlockItem(CHISELED_BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));

    //Honey Bread Blocks
    public static final Item HONEY_BREAD_BLOCK_ITEM = new BlockItem(HONEY_BREAD_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_BREAD_SLAB_ITEM = new BlockItem(HONEY_BREAD_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_BREAD_STAIRS_ITEM = new BlockItem(HONEY_BREAD_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_BREAD_WALL_ITEM = new BlockItem(HONEY_BREAD_WALL, new Item.Settings().group(ItemGroup.DECORATIONS).maxCount(64));

    //Polished Honey Bread Blocks
    public static final Item POLISHED_HONEY_BREAD_BLOCK_ITEM = new BlockItem(POLISHED_HONEY_BREAD_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item POLISHED_HONEY_BREAD_SLAB_ITEM = new BlockItem(POLISHED_HONEY_BREAD_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item POLISHED_HONEY_BREAD_STAIRS_ITEM = new BlockItem(POLISHED_HONEY_BREAD_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item POLISHED_HONEY_BREAD_WALL_ITEM = new BlockItem(POLISHED_HONEY_BREAD_WALL, new Item.Settings().group(ItemGroup.DECORATIONS).maxCount(64));

    //Honey Bread Bricks
    public static final Item HONEY_BREAD_BRICKS_ITEM = new BlockItem(HONEY_BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_BREAD_BRICK_SLAB_ITEM = new BlockItem(HONEY_BREAD_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_BREAD_BRICK_STAIRS_ITEM = new BlockItem(HONEY_BREAD_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_BREAD_BRICK_WALL_ITEM = new BlockItem(HONEY_BREAD_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS).maxCount(64));

    //Honey Bread Stonecutted Blocks
    public static final Item HONEY_BREAD_PAVEMENT_ITEM = new BlockItem(HONEY_BREAD_PAVEMENT, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_BREAD_PILLAR_ITEM = new BlockItem(HONEY_BREAD_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item CHISELED_HONEY_BREAD_BRICKS_ITEM = new BlockItem(CHISELED_HONEY_BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));

    //Pumpkin Bread Blocks
    public static final Item PUMPKIN_BREAD_BLOCK_ITEM = new BlockItem(PUMPKIN_BREAD_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item PUMPKIN_BREAD_SLAB_ITEM = new BlockItem(PUMPKIN_BREAD_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item PUMPKIN_BREAD_STAIRS_ITEM = new BlockItem(PUMPKIN_BREAD_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item PUMPKIN_BREAD_WALL_ITEM = new BlockItem(PUMPKIN_BREAD_WALL, new Item.Settings().group(ItemGroup.DECORATIONS));

    //Polished Bread Blocks
    public static final Item POLISHED_PUMPKIN_BREAD_BLOCK_ITEM = new BlockItem(POLISHED_PUMPKIN_BREAD_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item POLISHED_PUMPKIN_BREAD_SLAB_ITEM = new BlockItem(POLISHED_PUMPKIN_BREAD_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item POLISHED_PUMPKIN_BREAD_STAIRS_ITEM = new BlockItem(POLISHED_PUMPKIN_BREAD_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item POLISHED_PUMPKIN_BREAD_WALL_ITEM = new BlockItem(POLISHED_PUMPKIN_BREAD_WALL, new Item.Settings().group(ItemGroup.DECORATIONS));

    //Bread Bricks
    public static final Item PUMPKIN_BREAD_BRICKS_ITEM = new BlockItem(PUMPKIN_BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item PUMPKIN_BREAD_BRICK_SLAB_ITEM = new BlockItem(PUMPKIN_BREAD_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item PUMPKIN_BREAD_BRICK_STAIRS_ITEM = new BlockItem(PUMPKIN_BREAD_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item PUMPKIN_BREAD_BRICK_WALL_ITEM = new BlockItem(PUMPKIN_BREAD_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS).maxCount(64));

    //Bread Stonecutted Blocks
    public static final Item PUMPKIN_BREAD_PAVEMENT_ITEM = new BlockItem(PUMPKIN_BREAD_PAVEMENT, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item PUMPKIN_BREAD_PILLAR_ITEM = new BlockItem(PUMPKIN_BREAD_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item CHISELED_PUMPKIN_BREAD_BRICKS_ITEM = new BlockItem(CHISELED_PUMPKIN_BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));

    public static void RegisterBreadcrumbsItems() {

        //Bread Blocks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_block"), BREAD_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_slab"), BREAD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_stairs"), BREAD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_wall"), BREAD_WALL_ITEM);

        //Polished Bread Blocks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "polished_bread_block"), POLISHED_BREAD_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "polished_bread_slab"), POLISHED_BREAD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "polished_bread_stairs"), POLISHED_BREAD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "polished_bread_wall"), POLISHED_BREAD_WALL_ITEM);

        //Bread Bricks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_bricks"), BREAD_BRICKS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_brick_slab"), BREAD_BRICK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_brick_stairs"), BREAD_BRICK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_brick_wall"), BREAD_BRICK_WALL_ITEM);

        //Bread Stonecutted Blocks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_pavement"), BREAD_PAVEMENT_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_pillar"), BREAD_PILLAR_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "chiseled_bread_bricks"), CHISELED_BREAD_BRICKS_ITEM);

        //Honey Bread Blocks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_block"), HONEY_BREAD_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_slab"), HONEY_BREAD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_stairs"), HONEY_BREAD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_wall"), HONEY_BREAD_WALL_ITEM);

        //Polished Honey Bread Blocks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "polished_honey_bread_block"), POLISHED_HONEY_BREAD_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "polished_honey_bread_slab"), POLISHED_HONEY_BREAD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "polished_honey_bread_stairs"), POLISHED_HONEY_BREAD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "polished_honey_bread_wall"), POLISHED_HONEY_BREAD_WALL_ITEM);

        //Honey Bread Bricks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_bricks"), HONEY_BREAD_BRICKS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_slab"), HONEY_BREAD_BRICK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_stairs"), HONEY_BREAD_BRICK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_wall"), HONEY_BREAD_BRICK_WALL_ITEM);

        //Honey Bread Stonecutted Blocks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_pavement"), HONEY_BREAD_PAVEMENT_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_pillar"), HONEY_BREAD_PILLAR_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "chiseled_honey_bread_bricks"), CHISELED_HONEY_BREAD_BRICKS_ITEM);

        //Pumpkin Bread Blocks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_block"), PUMPKIN_BREAD_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_slab"), PUMPKIN_BREAD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_stairs"), PUMPKIN_BREAD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_wall"), PUMPKIN_BREAD_WALL_ITEM);

        //Polished Pumpkin Bread Blocks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "polished_pumpkin_bread_block"), POLISHED_PUMPKIN_BREAD_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "polished_pumpkin_bread_slab"), POLISHED_PUMPKIN_BREAD_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "polished_pumpkin_bread_stairs"), POLISHED_PUMPKIN_BREAD_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "polished_pumpkin_bread_wall"), POLISHED_PUMPKIN_BREAD_WALL_ITEM);

        //Pumpkin Bread Bricks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_bricks"), PUMPKIN_BREAD_BRICKS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_brick_slab"), PUMPKIN_BREAD_BRICK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_brick_stairs"), PUMPKIN_BREAD_BRICK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_brick_wall"), PUMPKIN_BREAD_BRICK_WALL_ITEM);

        //Pumpkin Bread Stonecutted Blocks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_pavement"), PUMPKIN_BREAD_PAVEMENT_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_pillar"), PUMPKIN_BREAD_PILLAR_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "chiseled_pumpkin_bread_bricks"), CHISELED_PUMPKIN_BREAD_BRICKS_ITEM);

    }

}
