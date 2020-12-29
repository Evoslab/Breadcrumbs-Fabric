package com.github.evoslab.breadcrumbs;

import com.github.evoslab.breadcrumbs.registry.BreadcrumbsBlocks;
import com.github.evoslab.breadcrumbs.registry.BreadcrumbsItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Breadcrumbs implements ModInitializer {

	public static final String MODID = "breadcrumbs";
	public static final Logger LOGGER = LogManager.getLogger(MODID);

	@Override
	public void onInitialize() {
		new BreadcrumbsItems();
		new BreadcrumbsBlocks();
		BreadcrumbsBlocks.RegisterBreadcrumbsBlocks();
		BreadcrumbsItems.RegisterBreadcrumbsItems();
	}

	public static Identifier id(String name) {
		return new Identifier(MODID, name);
	}
}
