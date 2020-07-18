package com.pandafear.testmod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.OreBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.common.ToolType;

public class Ruby_Ore extends OreBlock {
	public Ruby_Ore() {
		super(Block.Properties
				.create(Material.IRON)
				.harvestLevel(2)
				.harvestTool(ToolType.PICKAXE)
				.sound(SoundType.STONE)
				.hardnessAndResistance(3.0F, 3.0F)
				.func_235861_h_()
				);
	}
	@Override
	protected int getExperience(Random rand) {
		return MathHelper.nextInt(rand, 2, 5);
	}
}
