package net.EnderAO69.infinityforever.item;

import net.EnderAO69.infinityforever.InfinityForever;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems implements ModInitializer {



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(InfinityForever.MOD_ID, name), item);
    }


    public static void registerModItems(){
        InfinityForever.LOGGER.debug("Registering ModItems for" + InfinityForever.MOD_ID);

    }

    @Override
    public void onInitialize() {

    }
}
