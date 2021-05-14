package com.github.evoslab.breadcrumbs.registry;

import com.github.evoslab.breadcrumbs.Breadcrumbs;

import io.github.haykam821.columns.block.ColumnBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BreadcrumbsColumnBlocks {
    
    public static void RegisterBreadcrumbsColumnBlocks() {
        RegisterBreadcrumbsColumnBlocks("bread_column", BreadcrumbsBlocks.BREAD_BLOCK);
        RegisterBreadcrumbsColumnBlocks("polished_bread_column", BreadcrumbsBlocks.POLISHED_BREAD_BLOCK);
        RegisterBreadcrumbsColumnBlocks("bread_brick_column", BreadcrumbsBlocks.BREAD_BRICKS);

        RegisterBreadcrumbsColumnBlocks("honey_bread_column", BreadcrumbsBlocks.HONEY_BREAD_BLOCK);
        RegisterBreadcrumbsColumnBlocks("polished_honey_bread_column", BreadcrumbsBlocks.POLISHED_HONEY_BREAD_BLOCK);
        RegisterBreadcrumbsColumnBlocks("honey_bread_brick_column", BreadcrumbsBlocks.HONEY_BREAD_BRICKS);

        RegisterBreadcrumbsColumnBlocks("pumpkin_bread_column", BreadcrumbsBlocks.PUMPKIN_BREAD_BLOCK);
        RegisterBreadcrumbsColumnBlocks("polished_pumpkin_bread_column", BreadcrumbsBlocks.POLISHED_PUMPKIN_BREAD_BLOCK);
        RegisterBreadcrumbsColumnBlocks("pumpkin_bread_brick_column", BreadcrumbsBlocks.PUMPKIN_BREAD_BRICKS);
    }

    private static void RegisterBreadcrumbsColumnBlocks(String path, Block base) {
        Identifier id = new Identifier(Breadcrumbs.MODID, path);

        Block block = new ColumnBlock(FabricBlockSettings.copy(base));
        Registry.register(Registry.BLOCK, id, block);

        Registry.register(Registry.ITEM, id, new BlockItem(block, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }

}
