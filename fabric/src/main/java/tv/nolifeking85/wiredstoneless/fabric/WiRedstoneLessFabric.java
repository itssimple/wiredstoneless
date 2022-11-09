package tv.nolifeking85.wiredstoneless.fabric;

import net.fabricmc.api.ModInitializer;
import tv.nolifeking85.wiredstoneless.WiRedstoneLess;

public class WiRedstoneLessFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        WiRedstoneLess.init();
    }
}