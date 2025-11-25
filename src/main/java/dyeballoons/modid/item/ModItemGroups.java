package dyeballoons.modid.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import dyeballoons.modid.DyeBalloons;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup DYE_BALLOONS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(DyeBalloons.MOD_ID, "dye_balloons"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.RED_BALLOON))
                    .displayName(Text.translatable("itemgroup.dyeballoons"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.RED_BALLOON);
                        entries.add(ModItems.ORANGE_BALLOON);
                    }).build());

    public static void registerItemGroups() {
        DyeBalloons.LOGGER.info("Registering Item Groups for " + DyeBalloons.MOD_ID);
    }
}