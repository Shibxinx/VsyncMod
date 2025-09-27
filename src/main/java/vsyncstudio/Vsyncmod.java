package vsyncstudio;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import vsyncstudio.registry.ModItem;
import vsyncstudio.registry.ModCreativeTabs;

@Mod("vsyncmod")
public class Vsyncmod {

    public static final String MODID = "vsyncmod";



    public Vsyncmod(){

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItem.register(modEventBus);

        ModCreativeTabs.register(modEventBus);

        System.out.println("Vsyncmod had loaded!");
    }
}
