package net.raiiiden.midnight_weapons.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.raiiiden.midnight_weapons.MidnightWeapons;




public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MidnightWeapons.MOD_ID);
    public static final RegistryObject<Item> AMONG_US_FISTS = ITEMS.register("among_us_fists",
            () -> new SwordItem(Tiers.DIAMOND, -1, -2.2F, new Item.Properties().durability(1000)));
    public static final RegistryObject<Item> ARCHANGEL_SPEAR = ITEMS.register("archangel_spear",
            () -> new SwordItem(Tiers.DIAMOND, 8, -2.4F, new Item.Properties().durability(9990)));
    public static final RegistryObject<Item> ARCHANGEL_SWORD = ITEMS.register("archangel_sword",
            () -> new SwordItem(Tiers.DIAMOND, 7, -2.4F, new Item.Properties().durability(9990)));
    public static final RegistryObject<Item> BLOOD_THIRST = ITEMS.register("blood_thirst",
            () -> new SwordItem(Tiers.DIAMOND, 1, -2.4F, new Item.Properties().durability(2000)));
    public static final RegistryObject<Item> BONESHATTER_GREATSWORD = ITEMS.register("boneshatter_greatsword",
            () -> new SwordItem(Tiers.DIAMOND, 5, -2.8F, new Item.Properties().durability(4000)));
    public static final RegistryObject<Item> CHAOS_DAGGER = ITEMS.register("chaos_dagger",
            () -> new SwordItem(Tiers.DIAMOND, 7, -2.4F, new Item.Properties().durability(0)));
    public static final RegistryObject<Item> CHAOS_EATER = ITEMS.register("chaos_eater",
            () -> new SwordItem(Tiers.DIAMOND, 10, -2.7F, new Item.Properties().durability(0)));
    public static final RegistryObject<Item> CRIMSON_REAVER = ITEMS.register("crimson_reaver",
            () -> new SwordItem(Tiers.DIAMOND, 8, -2.4F, new Item.Properties().durability(0)));
    public static final RegistryObject<Item> CRIMSON_SHADOWBLADE = ITEMS.register("crimson_shadowblade",
            () -> new SwordItem(Tiers.DIAMOND, 6, -2.7F, new Item.Properties().durability(4200)));
    public static final RegistryObject<Item> DAYBREAKER = ITEMS.register("daybreaker",
            () -> new SwordItem(Tiers.DIAMOND, 5, -2.5F, new Item.Properties()));
    public static final RegistryObject<Item> DEATHBRINGER = ITEMS.register("death_bringer",
            () -> new SwordItem(Tiers.DIAMOND, 7, -2.6F, new Item.Properties().durability(8000)));
    public static final RegistryObject<Item> DEMONICBLADE = ITEMS.register("demonic_blade",
            () -> new SwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties().durability(6660)));
    public static final RegistryObject<Item> DEMONICLONGSWORD = ITEMS.register("demonic_longsword",
            () -> new SwordItem(Tiers.DIAMOND, 6, -2.5F, new Item.Properties().durability(4000)));
    public static final RegistryObject<Item> DEMONICZWEIHANDER = ITEMS.register("demonic_zweihander",
            () -> new SwordItem(Tiers.DIAMOND, 11, -2.4F, new Item.Properties().durability(6000)));
    public static final RegistryObject<Item> DEVOURER = ITEMS.register("devourer",
            () -> new SwordItem(Tiers.DIAMOND, 10, -2.9F, new Item.Properties().durability(6660)));
    public static final RegistryObject<Item> DRACONIC_FROSTREAPER = ITEMS.register("draconic_frostreaper",
            () -> new SwordItem(Tiers.DIAMOND, 12, -3.0F, new Item.Properties().durability(6666)));
    public static final RegistryObject<Item> DRACONIC_GAUNTLET = ITEMS.register("draconic_gauntlet",
            () -> new SwordItem(Tiers.DIAMOND, 6, -1.9F, new Item.Properties().durability(0)));
    public static final RegistryObject<Item> EAGLE_CLAW = ITEMS.register("eagle_claw",
            () -> new SwordItem(Tiers.DIAMOND, 1, -1.8F, new Item.Properties().durability(3000)));
    public static final RegistryObject<Item> EAGLE_FANG = ITEMS.register("eagle_fang",
            () -> new SwordItem(Tiers.DIAMOND, 1, -1.8F, new Item.Properties().durability(3000)));
    public static final RegistryObject<Item> EMERALDIAN_GREATSWORD = ITEMS.register("emeraldian_greatsword",
            () -> new SwordItem(Tiers.DIAMOND, 10, -3.2F, new Item.Properties().durability(1100)));
    public static final RegistryObject<Item> ENDER_BLADE = ITEMS.register("ender_blade",
            () -> new SwordItem(Tiers.DIAMOND, 9, -2.5F, new Item.Properties().durability(4000)));
    public static final RegistryObject<Item> EVERBLEEDER = ITEMS.register("everbleeder",
            () -> new SwordItem(Tiers.DIAMOND, 2, -2.6F, new Item.Properties().durability(2000)));
    public static final RegistryObject<Item> FROSTREAPER = ITEMS.register("frostreaper",
            () -> new SwordItem(Tiers.DIAMOND, 14, -2.3F, new Item.Properties().durability(0)));
    public static final RegistryObject<Item> GHASTLY_SPEAR = ITEMS.register("ghastly_spear",
            () -> new SwordItem(Tiers.DIAMOND, 5, -2.3F, new Item.Properties().durability(3100)));
    public static final RegistryObject<Item> GOLDEN_BATTLEAXE = ITEMS.register("golden_battleaxe",
            () -> new SwordItem(Tiers.DIAMOND, 6, -2.8F, new Item.Properties().durability(1000)));
    public static final RegistryObject<Item> GRANOLA = ITEMS.register("granola",
            () -> new SwordItem(Tiers.DIAMOND, 5, -2.5F, new Item.Properties().durability(3000)));
    public static final RegistryObject<Item> HEILONGJIAN = ITEMS.register("heilongjian",
            () -> new SwordItem(Tiers.DIAMOND, 3, -2.3F, new Item.Properties().durability(2000)));
    public static final RegistryObject<Item> HEROIC_SWORD = ITEMS.register("heroic_sword",
            () -> new SwordItem(Tiers.DIAMOND, 6, -2.5F, new Item.Properties().durability(0)));
    public static final RegistryObject<Item> HOLY_LONGSWORD = ITEMS.register("holy_longsword",
            () -> new SwordItem(Tiers.DIAMOND, 6, -2.5F, new Item.Properties().durability(0)));
    public static final RegistryObject<Item> KINGS_DAGGER = ITEMS.register("kings_dagger",
            () -> new SwordItem(Tiers.DIAMOND, 3, -1.6F, new Item.Properties().durability(0)));
    public static final RegistryObject<Item> MURASAMA = ITEMS.register("murasama",
            () -> new SwordItem(Tiers.DIAMOND, 6, -2.5F, new Item.Properties().durability(9999)));

    public static void register(IEventBus eventBus)
    {
        ITEMS.register(eventBus);
    }
}
