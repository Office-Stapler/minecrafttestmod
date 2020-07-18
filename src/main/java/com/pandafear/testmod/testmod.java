package com.pandafear.testmod;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.pandafear.testmod.world.gen.RubyOreGen;

@Mod(testmod.MODID)
public class testmod {
	public final static String MODID = "testmod";
	public static final Logger LOGGER = LogManager.getLogger();
	public testmod() {
		LOGGER.debug("Hello");
	}

}
