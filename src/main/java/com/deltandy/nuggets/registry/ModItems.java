package com.deltandy.nuggets.registry;

import com.deltandy.nuggets.MoreNuggets;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item DIAMOND_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item EMERALD_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item COAL_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item CHARCOAL_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item NETHERITE_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item REDSTONE_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item QUARTZ_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MoreNuggets.MOD_ID, "diamond_nugget"), DIAMOND_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(MoreNuggets.MOD_ID, "emerald_nugget"), EMERALD_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(MoreNuggets.MOD_ID, "coal_nugget"), COAL_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(MoreNuggets.MOD_ID, "charcoal_nugget"), CHARCOAL_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(MoreNuggets.MOD_ID, "netherite_nugget"), NETHERITE_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(MoreNuggets.MOD_ID, "redstone_nugget"), REDSTONE_NUGGET);
        Registry.register(Registry.ITEM, new Identifier(MoreNuggets.MOD_ID, "quartz_nugget"), QUARTZ_NUGGET);
    }

}
