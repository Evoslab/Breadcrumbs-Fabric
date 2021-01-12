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
    public static final Item HONEY_BREAD_BLOCK_ITEM = new BlockItem(HONEY_BREAD_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));
    public static final Item PUMPKIN_BREAD_BLOCK_ITEM = new BlockItem(PUMPKIN_BREAD_BLOCK, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS));

    //Bread Bricks
    public static final Item BREAD_BRICKS_ITEM = new BlockItem(BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item BREAD_BRICK_SLAB_ITEM = new BlockItem(BREAD_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item BREAD_BRICK_STAIRS_ITEM = new BlockItem(BREAD_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item BREAD_BRICK_WALL_ITEM = new BlockItem(BREAD_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS).maxCount(64));

    public static final Item BREAD_PAVEMENT_ITEM = new BlockItem(BREAD_PAVEMENT, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item BREAD_PILLAR_ITEM = new BlockItem(BREAD_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item CHISELED_BREAD_BRICKS_ITEM = new BlockItem(CHISELED_BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item POLISHED_BREAD_BRICKS_ITEM = new BlockItem(POLISHED_BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));

    //Honey Bread Bricks
    public static final Item HONEY_BREAD_BRICKS_ITEM = new BlockItem(HONEY_BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_BREAD_BRICK_SLAB_ITEM = new BlockItem(HONEY_BREAD_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_BREAD_BRICK_STAIRS_ITEM = new BlockItem(HONEY_BREAD_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_BREAD_BRICK_WALL_ITEM = new BlockItem(HONEY_BREAD_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS).maxCount(64));

    public static final Item HONEY_BREAD_PAVEMENT_ITEM = new BlockItem(HONEY_BREAD_PAVEMENT, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_BREAD_PILLAR_ITEM = new BlockItem(HONEY_BREAD_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_CHISELED_BREAD_BRICKS_ITEM = new BlockItem(HONEY_CHISELED_BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item HONEY_POLISHED_BREAD_BRICKS_ITEM = new BlockItem(HONEY_POLISHED_BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));

    //Pumpkin Bread Bricks
    public static final Item PUMPKIN_BREAD_BRICKS_ITEM = new BlockItem(PUMPKIN_BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item PUMPKIN_BREAD_BRICK_SLAB_ITEM = new BlockItem(PUMPKIN_BREAD_BRICK_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item PUMPKIN_BREAD_BRICK_STAIRS_ITEM = new BlockItem(PUMPKIN_BREAD_BRICK_STAIRS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item PUMPKIN_BREAD_BRICK_WALL_ITEM = new BlockItem(PUMPKIN_BREAD_BRICK_WALL, new Item.Settings().group(ItemGroup.DECORATIONS).maxCount(64));

    public static final Item PUMPKIN_BREAD_PAVEMENT_ITEM = new BlockItem(PUMPKIN_BREAD_PAVEMENT, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item PUMPKIN_BREAD_PILLAR_ITEM = new BlockItem(PUMPKIN_BREAD_PILLAR, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item PUMPKIN_CHISELED_BREAD_BRICKS_ITEM = new BlockItem(PUMPKIN_CHISELED_BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));
    public static final Item PUMPKIN_POLISHED_BREAD_BRICKS_ITEM = new BlockItem(PUMPKIN_POLISHED_BREAD_BRICKS, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS).maxCount(64));

    public static void RegisterBreadcrumbsItems() {

        //Bread Blocks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_block"), BREAD_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_block"), HONEY_BREAD_BLOCK_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_block"), PUMPKIN_BREAD_BLOCK_ITEM);

        //Bread Bricks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_bricks"), BREAD_BRICKS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_brick_slab"), BREAD_BRICK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_brick_stairs"), BREAD_BRICK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_brick_wall"), BREAD_BRICK_WALL_ITEM);

        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_pavement"), BREAD_PAVEMENT_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "bread_pillar"), BREAD_PILLAR_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "chiseled_bread_bricks"), CHISELED_BREAD_BRICKS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "polished_bread_bricks"), POLISHED_BREAD_BRICKS_ITEM);

        //Honey Bread Bricks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_bricks"), HONEY_BREAD_BRICKS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_slab"), HONEY_BREAD_BRICK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_stairs"), HONEY_BREAD_BRICK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_brick_wall"), HONEY_BREAD_BRICK_WALL_ITEM);

        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_pavement"), HONEY_BREAD_PAVEMENT_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_bread_pillar"), HONEY_BREAD_PILLAR_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_chiseled_bread_bricks"), HONEY_CHISELED_BREAD_BRICKS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "honey_polished_bread_bricks"), HONEY_POLISHED_BREAD_BRICKS_ITEM);

        //Pumpkin Bread Bricks
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_bricks"), PUMPKIN_BREAD_BRICKS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_brick_slab"), PUMPKIN_BREAD_BRICK_SLAB_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_brick_stairs"), PUMPKIN_BREAD_BRICK_STAIRS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_brick_wall"), PUMPKIN_BREAD_BRICK_WALL_ITEM);

        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_pavement"), PUMPKIN_BREAD_PAVEMENT_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_bread_pillar"), PUMPKIN_BREAD_PILLAR_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_chiseled_bread_bricks"), PUMPKIN_CHISELED_BREAD_BRICKS_ITEM);
        Registry.register(Registry.ITEM, new Identifier(Breadcrumbs.MODID, "pumpkin_polished_bread_bricks"), PUMPKIN_POLISHED_BREAD_BRICKS_ITEM);

    }

}
