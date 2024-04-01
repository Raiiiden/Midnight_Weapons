package net.raiiiden.midnight_weapons;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.raiiiden.midnight_weapons.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MidnightWeapons.MOD_ID)
public class MidnightWeapons
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "midnight_weapons";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public MidnightWeapons()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.COMBAT)
        {

            event.accept(ModItems.AMONG_US_FISTS);
            event.accept(ModItems.ARCHANGEL_SPEAR);
            event.accept(ModItems.ARCHANGEL_SWORD);
            event.accept(ModItems.BLOOD_THIRST);
            event.accept(ModItems.BONESHATTER_GREATSWORD);
            event.accept(ModItems.CHAOS_DAGGER);
            event.accept(ModItems.CHAOS_EATER);
            event.accept(ModItems.CRIMSON_REAVER);
            event.accept(ModItems.CRIMSON_SHADOWBLADE);
            event.accept(ModItems.CURSED_LONGSWORD);
            event.accept(ModItems.CURSED_SPEAR);
            event.accept(ModItems.DAYBREAKER);
            event.accept(ModItems.DEATHBRINGER);
            event.accept(ModItems.DEMONICBLADE);
            event.accept(ModItems.DEMONICLONGSWORD);
            event.accept(ModItems.DEMONICZWEIHANDER);
            event.accept(ModItems.DEVOURER);
            event.accept(ModItems.DRACONIC_FROSTREAPER);
            event.accept(ModItems.DRACONIC_GAUNTLET);
            event.accept(ModItems.DRAGONFIRE_GREAT_AXE);
            event.accept(ModItems.EAGLE_CLAW);
            event.accept(ModItems.EAGLE_FANG);
            event.accept(ModItems.EMERALDIAN_GREATSWORD);
            event.accept(ModItems.ENDER_BLADE);
            event.accept(ModItems.EVERBLEEDER);
            event.accept(ModItems.FROSTREAPER);
            event.accept(ModItems.GHASTLY_SPEAR);
            event.accept(ModItems.GOLDEN_BATTLEAXE);
            event.accept(ModItems.GRANOLA);
            event.accept(ModItems.HEILONGJIAN);
            event.accept(ModItems.HEROIC_SWORD);
            event.accept(ModItems.HOLY_LONGSWORD);
            event.accept(ModItems.KINGS_DAGGER);
            event.accept(ModItems.MOONLIGHT_DAGGER);
            event.accept(ModItems.MOONLIGHT_GLAIVE);
            event.accept(ModItems.MURASAMA);
            event.accept(ModItems.PHOENIX_WING);
            event.accept(ModItems.RIPPERS);
            event.accept(ModItems.RIVERS_OF_BLOOD);
            event.accept(ModItems.ROYAL_SLASH);
            event.accept(ModItems.SALAMANDERS_VIGOR);
            event.accept(ModItems.SALAMANDERS_ZEAL);
            event.accept(ModItems.VOIDREAPER);
            event.accept(ModItems.VOIDSGRASP);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
