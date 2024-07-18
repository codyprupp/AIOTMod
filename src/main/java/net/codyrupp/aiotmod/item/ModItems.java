package net.codyrupp.aiotmod.item;

import net.codyrupp.aiotmod.AIOTMod;
import net.codyrupp.aiotmod.item.custom.AIOTItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AIOTMod.MODID);

    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));

    private static final Properties aiotProperties = new Item.Properties()
                                        .stacksTo(1)
                                        .durability(3000)
                                        .attributes(AIOTItem.createAttributes(Tiers.DIAMOND, 10, 2));
    public static final RegistryObject<Item> AIOT = ITEMS.register("aiot", () -> new AIOTItem(aiotProperties));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}