package com.github.evoslab.breadcrumbs.registry;

import com.github.evoslab.breadcrumbs.Breadcrumbs;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.github.evoslab.breadcrumbs.registry.BreadcrumbsBlocks.*;

public class BreadcrumbsItems {

    public static final Item BREAD_BLOCK_ITEM = new BlockItem(BREAD_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item HONEY_BREAD_BLOCK_ITEM = new BlockItem(HONEY_BREAD_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    public static final Item BREAD_BRICKS_ITEM = new BlockItem(BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item BREAD_BRICK_SLAB_ITEM = new BlockItem(BREAD_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item BREAD_BRICK_STAIRS_ITEM = new BlockItem(BREAD_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item BREAD_BRICK_WALL_ITEM = new BlockItem(BREAD_BRICK_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));

    public static final Item HONEY_BREAD_BRICKS_ITEM = new BlockItem(HONEY_BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_BREAD_BRICK_SLAB_ITEM = new BlockItem(HONEY_BREAD_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_BREAD_BRICK_STAIRS_ITEM = new BlockItem(HONEY_BREAD_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_BREAD_BRICK_WALL_ITEM = new BlockItem(HONEY_BREAD_BRICK_WALL, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));

    public static void RegisterBreadcrumbsItems() {
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_block"), BREAD_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_block"), HONEY_BREAD_BLOCK_ITEM);

        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_bricks"), BREAD_BRICKS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_brick_slab"), BREAD_BRICK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_brick_stairs"), BREAD_BRICK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_brick_wall"), BREAD_BRICK_WALL_ITEM);

        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_bricks"), HONEY_BREAD_BRICKS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_slab"), HONEY_BREAD_BRICK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_stairs"), HONEY_BREAD_BRICK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_bricks"), HONEY_BREAD_BRICKS_ITEM);

    }

}
