package ru.fiarr4ikdev.oretech.block;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.fiarr4ikdev.oretech.OreTech;
import ru.fiarr4ikdev.oretech.creativetab.ModCreativeTabs;

@Mod.EventBusSubscriber
public class BlockRegisterer {

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        for (ModBlocks value : ModBlocks.values()) {
            event.getRegistry().register(value.getBlock());
        }
    }

    @SubscribeEvent
    public static void registerItemBlocks(RegistryEvent.Register<net.minecraft.item.Item> event) {
        for (ModBlocks value : ModBlocks.values()) {
            ItemBlock itemBlock = new ItemBlock(value.getBlock());
            itemBlock.setRegistryName(value.getBlock().getRegistryName());
            event.getRegistry().register(itemBlock);
        }
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        for (ModBlocks value : ModBlocks.values()) {
            ModelLoader.setCustomModelResourceLocation(
                    net.minecraft.item.Item.getItemFromBlock(value.getBlock()),
                    0,
                    new ModelResourceLocation(
                            new ResourceLocation(OreTech.MODID, value.getName()),
                            "inventory"
                    )
            );
        }
    }
}
