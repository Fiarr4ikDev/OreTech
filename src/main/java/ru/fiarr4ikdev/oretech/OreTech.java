package ru.fiarr4ikdev.oretech;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.fiarr4ikdev.oretech.proxy.CommonProxy;

@Mod(modid = OreTech.MODID, version = OreTech.VERSION, name = OreTech.NAME)
public class OreTech {
    public static final String MODID = "oretech";
    public static final String NAME = "OreTech";
    public static final String VERSION = "1.0.1";

    @SidedProxy(
            clientSide = "ru.fiarr4ikdev.oretech.proxy.ClientProxy",
            serverSide = "ru.fiarr4ikdev.oretech.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
