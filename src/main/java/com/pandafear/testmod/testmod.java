package com.pandafear.testmod;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(testmod.MODID)
public class testmod {
	public final static String MODID = "testmod";
	private static final Logger LOGGER = LogManager.getLogger();
	public testmod() {
		LOGGER.debug("Hello");
	}
	
}
