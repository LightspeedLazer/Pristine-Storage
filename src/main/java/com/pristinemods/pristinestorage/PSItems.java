package com.pristinemods.pristinestorage;

import java.util.ArrayList;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PSItems {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PristineStorage.ID);

    public static final RegistryObject<BlockItem> PRISTINE_CHEST;
    public static final RegistryObject<BlockItem> PRISTINE_CHEST2;
    private static final ArrayList<Item> TAB_ORDERING = new ArrayList<>();
    static {
        PRISTINE_CHEST2 = registerBlockItemFor(PSBlocks.PRISTINE_CHEST2, true);
        PRISTINE_CHEST = registerBlockItemFor(PSBlocks.PRISTINE_CHEST, true);
    }
    public static final CreativeModeTab tab = new CreativeModeTab(PristineStorage.ID) {
        @Override
        public ItemStack makeIcon() {
            return PRISTINE_CHEST.get().getDefaultInstance();
        }
        @Override
        public void fillItemList(NonNullList<ItemStack> list) {
            super.fillItemList(list);
            list.sort((ItemStack a, ItemStack b) -> {
                return TAB_ORDERING.indexOf(a.getItem()) - TAB_ORDERING.indexOf(b.getItem());
            });
        }
    };

    private static <T extends Block> RegistryObject<BlockItem> registerBlockItemFor(RegistryObject<T> block, boolean inCreativeTab) {
        var ret = ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(inCreativeTab ? tab : null)));
        TAB_ORDERING.add(ret.get());
        return ret;
    }

    public static void register() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
