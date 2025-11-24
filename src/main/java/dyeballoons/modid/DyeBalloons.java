package dyeballoons.modid;

import dyeballoons.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DyeBalloons implements ModInitializer {
	public static final String MOD_ID = "dye-balloons";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}