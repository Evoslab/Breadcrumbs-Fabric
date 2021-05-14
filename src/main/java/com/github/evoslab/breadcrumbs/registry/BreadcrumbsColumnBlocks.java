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
    }

    private static void RegisterBreadcrumbsColumnBlocks(String path, Block base) {
        Identifier id = new Identifier(Breadcrumbs.MODID, path);

        Block block = new ColumnBlock(FabricBlockSettings.copy(base));
        Registry.register(Registry.BLOCK, id, block);

        Registry.register(Registry.ITEM, id, new BlockItem(block, new Item.Settings().group(ItemGroup.DECORATIONS)));
    }

}
