package vsyncstudio.registry;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.TooltipFlag;
import org.jetbrains.annotations.Nullable;
import java.util.List;

public class ModItem {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, "vsyncmod");

    public static final RegistryObject<Item> CHING_TIAN = ITEMS.register("ching_tian",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DEVIL_JIAN = ITEMS.register("devil_jian",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> HOLYDEMON_SWORD = ITEMS.register("holydemon_sword",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> AMETHYRA = ITEMS.register("amethyra",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)){
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
                    super.appendHoverText(stack, world, tooltip, flag); // รักษาของเดิม
                    tooltip.add(Component.literal("This Spear Made For ARDEN_U")); // เพิ่มข้อความ tooltip
                }
            }
            );

    public static final RegistryObject<Item> EVILFORKS = ITEMS.register("evil_forks",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)){
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
                    super.appendHoverText(stack, world, tooltip, flag); // รักษาของเดิม
                    tooltip.add(Component.literal("This Trident Made For ShibaSayo")); // เพิ่มข้อความ tooltip
                }
            }
            );
    public static final RegistryObject<Item> VOID_STRIKE = ITEMS.register("void_strike",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)){
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
                    super.appendHoverText(stack, world, tooltip, flag); // รักษาของเดิม
                    tooltip.add(Component.literal("This Sword Made For DevilTainer")); // เพิ่มข้อความ tooltip
                }
            }
    );
    public static final RegistryObject<Item> CRIMSON_CRESCENT = ITEMS.register("crimson_crescent",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)){
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
                    super.appendHoverText(stack, world, tooltip, flag); // รักษาของเดิม
                    tooltip.add(Component.literal("This Sycthe Made For KiruaMx")); // เพิ่มข้อความ tooltip
                }
            }
    );
    public static final RegistryObject<Item> SYNTHETIC = ITEMS.register("synthetic",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)){
                @Override
                public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
                    super.appendHoverText(stack, world, tooltip, flag); // รักษาของเดิม
                    tooltip.add(Component.literal("This Sword Made For Ray")); // เพิ่มข้อความ tooltip
                }
            }
    );

    public static final RegistryObject<Item> ABYSSREND = ITEMS.register("abyssrend",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> CELESTIA = ITEMS.register("celestia",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> CHIGETSU = ITEMS.register("chigetsu",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> CRIMSON_SYCTHE = ITEMS.register("crimson_sycthe",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> DRANEW = ITEMS.register("dranew",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> FORGE_OF_FIRE = ITEMS.register("forge_of_fire",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> HOLY_WEAPONS = ITEMS.register("holy_weapons",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> MASASHI = ITEMS.register("masashi",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> POISON_NEEDLE = ITEMS.register("poison_needle",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> SYLVEN = ITEMS.register("sylven",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> YUJIRO = ITEMS.register("yujiro",
            () -> new SwordItem(Tiers.IRON, 1, -2.45F, new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
} // end class
