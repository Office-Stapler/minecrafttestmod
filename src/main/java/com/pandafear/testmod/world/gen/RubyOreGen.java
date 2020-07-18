package com.pandafear.testmod.world.gen;

import com.pandafear.testmod.testmod;
// import com.pandafear.testmod.blocks.Ruby_Ore;

import init.ModBlocks;
import net.minecraft.world.biome.Biome;
// import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class RubyOreGen {
	public static void generateOre() {
		 for (Biome biome : ForgeRegistries.BIOMES) {
			ConfiguredPlacement<?> customConfig = Placement.COUNT_RANGE.configure(
			new CountRangeConfig(20, 5, 5, 70));
			biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
				new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,
				ModBlocks.RUBY_ORE.getDefaultState(),
					10))
					.withPlacement(customConfig));
		 }
		 testmod.LOGGER.debug("DEBUGGING....");
		 testmod.LOGGER.debug(ModBlocks.RUBY_ORE);
	}
}
