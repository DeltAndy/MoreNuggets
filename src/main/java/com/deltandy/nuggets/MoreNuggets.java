package com.deltandy.nuggets;

import com.deltandy.nuggets.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class MoreNuggets implements ModInitializer {

    public static final String MOD_ID = "nuggets";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
