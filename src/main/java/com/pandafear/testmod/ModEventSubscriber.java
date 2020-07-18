package com.pandafear.testmod;

import com.pandafear.testmod.armour.Ruby_Armour;
import com.pandafear.testmod.blocks.Ruby_Ore;
import com.pandafear.testmod.tools.RubyTools;

import init.ModBlocks;
import init.ModItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistryEntry;

@EventBusSubscriber(modid = testmod.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber {
	@SubscribeEvent
	public static void onRegisterItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "ruby")
		);
	}
	
	@SubscribeEvent
	public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				setup(new Ruby_Ore(), "ruby_ore")
		);
	}

	@SubscribeEvent
	public static void onRegisterBlockItem(RegistryEvent.Register<Item> event) {
		BlockItem ruby_ore = new BlockItem(
				ModBlocks.RUBY_ORE, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
		event.getRegistry().registerAll(
				setup(ruby_ore, "ruby_ore"));
	}
	
	@SubscribeEvent
	public static void onRegisterTools(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				setup(RubyTools.RUBY_SWORD, "ruby_sword"));
		event.getRegistry().registerAll(
				setup(RubyTools.RUBY_PICK, "ruby_pickaxe"));
		event.getRegistry().registerAll(
				setup(RubyTools.RUBY_AXE, "ruby_axe"));
		event.getRegistry().registerAll(
				setup(RubyTools.RUBY_SHOVEL, "ruby_shovel"));
		event.getRegistry().registerAll(
				setup(RubyTools.RUBY_HOE, "ruby_hoe"));
	}
	
	@SubscribeEvent
	public static void onRegisterArmor(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				setup(Ruby_Armour.RUBY_HELMET, "ruby_helmet"));
		event.getRegistry().registerAll(
				setup(Ruby_Armour.RUBY_CHESTPLATE, "ruby_chestplate"));
		event.getRegistry().registerAll(
				setup(Ruby_Armour.RUBY_LEGGINGS, "ruby_leggings"));
		event.getRegistry().registerAll(
				setup(Ruby_Armour.RUBY_BOOTS, "ruby_boots"));
	}
	
	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
		return setup(entry, new ResourceLocation(testmod.MODID, name));
	}
	
	public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
		entry.setRegistryName(registryName);
		return entry;	
	}
	
}
