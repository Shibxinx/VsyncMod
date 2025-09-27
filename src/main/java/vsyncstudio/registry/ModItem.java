package vsyncstudio.registry;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public class ModItem {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "vsyncmod");

    public static final RegistryObject<Item> CHING_TIAN = ITEMS.register("ching_tian",
            () -> new SwordItem(Tiers.NETHERITE, 10, -2.45F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DEVIL_JIAN = ITEMS.register("devil_jian",
            () -> new SwordItem(Tiers.NETHERITE, 10, -2.45F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> HOLYDEMON_SWORD = ITEMS.register("holydemon_sword",
            () -> new SwordItem(Tiers.NETHERITE, 10, -2.45F, new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
} // end class
