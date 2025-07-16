package ru.fiarr4ikdev.oretech.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import ru.fiarr4ikdev.oretech.block.ModBlocks;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class ModCreativeTabs {

    public static final CreativeTabs MAIN = create("oretech", () ->
            new ItemStack(Item.getItemFromBlock(ru.fiarr4ikdev.oretech.block.ModBlocks.COAL_GENERATOR_1.getBlock()))
    );

    private static CreativeTabs create(String name, Supplier<ItemStack> iconSupplier) {
        return new CreativeTabs(name) {
            @Override
            public ItemStack createIcon() {
                return iconSupplier.get();
            }
        };
    }
}