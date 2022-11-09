package tv.nolifeking85.wiredstoneless;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.Registries;
import net.minecraft.core.Registry;
import net.minecraft.world.item.Item;

public class WiRedstoneLess {
    public static final String MOD_ID = "wiredstoneless";

    public static final Supplier<Registries> REGISTRIES = Suppliers.memoize(() -> Registries.get(MOD_ID));
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(MOD_ID, Registry.ITEM_REGISTRY);
    public static void init() {
        ITEMS.register();

        System.out.printf("Mod %s loaded%n", MOD_ID);
    }
}