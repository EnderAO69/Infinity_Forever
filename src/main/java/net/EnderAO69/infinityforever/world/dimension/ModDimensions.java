package net.EnderAO69.infinityforever.world.dimension;

import net.EnderAO69.infinityforever.InfinityForever;









import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {
    public static final RegistryKey<World> FFDIM_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(InfinityForever.MOD_ID, "ffdim"));
    public static final RegistryKey<DimensionType> FFDIM_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY,
            FFDIM_DIMENSION_KEY.getValue());


    public static void register() {
        InfinityForever.LOGGER.debug("Registering ModDimensions for " + InfinityForever.MOD_ID);

       
    }
}