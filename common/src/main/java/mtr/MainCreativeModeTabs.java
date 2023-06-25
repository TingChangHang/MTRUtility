package mtr;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import static mtr.Main.MOD_ID;

public interface MainCreativeModeTabs {
    CreativeModeTabs.Wrapper HIGH_RAILS = new CreativeModeTabs.Wrapper(new ResourceLocation(MOD_ID, "highrails"), () -> new ItemStack(HighRailItems.RAIL_CONNECTOR_450.get()));

    CreativeModeTab get();
}