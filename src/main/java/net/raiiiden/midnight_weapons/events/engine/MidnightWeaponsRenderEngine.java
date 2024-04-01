package net.raiiiden.midnight_weapons.events.engine;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.api.distmarker.Dist;
import net.raiiiden.midnight_weapons.item.ModItems;
import yesman.epicfight.api.client.forgeevent.PatchedRenderersEvent;

@EventBusSubscriber(
        modid = "midnight_weapons",
        bus = Bus.MOD,
        value = {Dist.CLIENT}
)
public class MidnightWeaponsRenderEngine {
    public MidnightWeaponsRenderEngine() {
    }

    @SubscribeEvent
    public static void registerRenderer(PatchedRenderersEvent.Add event) {
        event.addItemRenderer((Item) ModItems.MURASAMA.get(), new RenderKatanaIron());
    }
}