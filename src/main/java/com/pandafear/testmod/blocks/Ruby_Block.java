package com.pandafear.testmod.blocks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class Ruby_Block extends Block {
	
	public Ruby_Block() {
		  super(Block.Properties.create(Material.IRON)
				.harvestLevel(2)
				.harvestTool(ToolType.PICKAXE)
				.sound(SoundType.STONE)
				.hardnessAndResistance(3.0F, 3.0F)
				.func_235861_h_()
		);
	}
	
}
