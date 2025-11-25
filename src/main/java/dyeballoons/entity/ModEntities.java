package dyeballoons.entity;

import dyeballoons.entity.custom.OrangeBalloonProjectileEntity;
import dyeballoons.modid.DyeBalloons;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
public class ModEntities {
    private static final RegistryKey<EntityType<?>> ORANGE_BALLOON_KEY =
            RegistryKey.of(RegistryKeys.ENTITY_TYPE, Identifier.of(DyeBalloons.MOD_ID, "orange_balloon"));

    public static final EntityType<OrangeBalloonProjectileEntity> ORANGE_BALLOON = Registry.register(Registries.ENTITY_TYPE,
            Identifier.of(DyeBalloons.MOD_ID, "orange_balloon"),
            EntityType.Builder.<OrangeBalloonProjectileEntity>create(OrangeBalloonProjectileEntity::new, SpawnGroup.MISC)
                    .dimensions(0.5f, 1.15f).build(ORANGE_BALLOON_KEY));


    public static void registerModEntities() {
        DyeBalloons.LOGGER.info("Registering Mod Entities for " + DyeBalloons.MOD_ID);
    }
}