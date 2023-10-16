package com.pristinemods.pristinestorage;

import com.pristinemods.pristinestorage.blocks.PristineChest;
import com.pristinemods.pristinestorage.blocks.PristineChest2;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class PSBlocks {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, PristineStorage.ID);
    
    public static final RegistryObject<Block> PRISTINE_CHEST = BLOCKS.register(PristineChest.ID, () -> new PristineChest(BlockBehaviour.Properties.of(Material.STONE)));
    public static final RegistryObject<Block> PRISTINE_CHEST2 = BLOCKS.register(PristineChest2.ID, () -> new PristineChest2(BlockBehaviour.Properties.of(Material.STONE)));

    public static void register() {
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
