package dyeballoons.modid.item;

import dyeballoons.modid.DyeBalloons;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public class ModItems {
        public static Item register(String name, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
            // Create the item key.
            ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, name));

            // Create the item instance.
            Item item = itemFactory.apply(settings.setId(itemKey));

            // Register the item.
            Registry.register(BuiltInRegistries.ITEM, itemKey, item);

            return item;
        }

    }
    public static final Item RED_BALLOON = register("red_balloon", Item::new, new Item.Properties());

    public static void registerModItems() {
        DyeBalloons.LOGGER.info("Registering Mod Items for " + DyeBalloons.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(RED_BALLOON);
        });
    }
}
