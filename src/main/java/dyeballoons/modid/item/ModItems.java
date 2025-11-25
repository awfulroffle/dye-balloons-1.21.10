package dyeballoons.modid.item;

import dyeballoons.modid.DyeBalloons;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(DyeBalloons.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DyeBalloons.MOD_ID, name)))));
    }
    public static final Item RED_BALLOON = registerItem("red_balloon", Item::new);
    public static final Item ORANGE_BALLOON = registerItem("orange_balloon", Item::new);

    public static void registerModItems() {
        DyeBalloons.LOGGER.info("Registering Mod Items for " + DyeBalloons.MOD_ID);
    }
}
