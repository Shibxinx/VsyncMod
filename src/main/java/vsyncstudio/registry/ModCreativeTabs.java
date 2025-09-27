package vsyncstudio.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.IEventBus;

import vsyncstudio.Vsyncmod;

public class ModCreativeTabs {

    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Vsyncmod.MODID);

    public static final RegistryObject<CreativeModeTab> VSYNC_TAB = TABS.register("vsync_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.literal("Vsync Weapons"))
                    .icon(() -> new ItemStack(ModItem.CHING_TIAN.get()))
                    .displayItems((params, output) -> {
                        //Item want to show
                            output.accept(ModItem.CHING_TIAN.get());
                            output.accept(ModItem.DEVIL_JIAN.get());
                            output.accept(ModItem.HOLYDEMON_SWORD.get());
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}
