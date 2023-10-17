package com.pristinemods.pristinestorage;

import java.util.ArrayList;

import net.minecraft.core.NonNullList;
import net.minecraft.resources.ResourceLocation;
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

    private static final ArrayList<ResourceLocation> TAB_ORDERING = new ArrayList<>();
    public static final RegistryObject<BlockItem> PRISTINE_CHEST = registerBlockItemFor(PSBlocks.PRISTINE_CHEST, true);
    public static final RegistryObject<BlockItem> PRISTINE_CHEST2 = registerBlockItemFor(PSBlocks.PRISTINE_CHEST2, true);
    
    public static final CreativeModeTab tab = new CreativeModeTab(PristineStorage.ID) {
        @Override
        public ItemStack makeIcon() {
            return PRISTINE_CHEST.get().getDefaultInstance();
        }
        @Override
        public void fillItemList(NonNullList<ItemStack> list) {
            for (ResourceLocation loc : TAB_ORDERING) {
                ForgeRegistries.ITEMS.getValue(loc).fillItemCategory(this, list);
            }
        }
    };

    private static <T extends Block> RegistryObject<BlockItem> registerBlockItemFor(RegistryObject<T> block, boolean inCreativeTab) {
        if (inCreativeTab) {
            TAB_ORDERING.add(new ResourceLocation(PristineStorage.ID, block.getId().getPath()));
        }
        return ITEMS.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(inCreativeTab ? tab : null)));
    }

    public static void register() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
