package ru.fiarr4ikdev.oretech.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import ru.fiarr4ikdev.oretech.creativetab.ModCreativeTabs;

public enum ModBlocks {
    COAL_GENERATOR_1("coal_generator_1", new Block(Material.IRON)),
    COAL_GENERATOR_2("coal_generator_2", new Block(Material.IRON)),
    COAL_GENERATOR_3("coal_generator_3", new Block(Material.IRON)),
    COAL_GENERATOR_4("coal_generator_4", new Block(Material.IRON)),
    COAL_GENERATOR_5("coal_generator_5", new Block(Material.IRON)),
    COAL_GENERATOR_6("coal_generator_6", new Block(Material.IRON)),
    COAL_GENERATOR_7("coal_generator_7", new Block(Material.IRON)),
    COAL_GENERATOR_8("coal_generator_8", new Block(Material.IRON)),
    COAL_GENERATOR_9("coal_generator_9", new Block(Material.IRON));

    private final String name;
    private final Block block;

    ModBlocks(String name, Block block) {
        this.name = name;
        this.block = block.setRegistryName(name).setTranslationKey(name);
        block.setCreativeTab(ModCreativeTabs.MAIN);
    }

    public String getName() {
        return name;
    }

    public Block getBlock() {
        return block;
    }
}
