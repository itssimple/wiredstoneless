package tv.nolifeking85.wiredstoneless.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import tv.nolifeking85.wiredstoneless.WiRedstoneLess;

@Mod(WiRedstoneLess.MOD_ID)
public class WiRedstoneLessForge {
    public WiRedstoneLessForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(WiRedstoneLess.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        WiRedstoneLess.init();
    }
}