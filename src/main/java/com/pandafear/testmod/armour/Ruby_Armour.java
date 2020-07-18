package com.pandafear.testmod.armour;

import com.pandafear.testmod.testmod;

import init.ModItemGroups;
import init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class Ruby_Armour {
	public static final ArmorItem RUBY_HELMET = new ArmorItem(new Ruby_Armour_Material(), EquipmentSlotType.HEAD, 
			new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
	public static final ArmorItem RUBY_CHESTPLATE = new ArmorItem(new Ruby_Armour_Material(), EquipmentSlotType.CHEST, 
			new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
	public static final ArmorItem RUBY_LEGGINGS = new ArmorItem(new Ruby_Armour_Material(), EquipmentSlotType.LEGS, 
			new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
	public static final ArmorItem RUBY_BOOTS = new ArmorItem(new Ruby_Armour_Material(), EquipmentSlotType.FEET, 
			new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
}

class Ruby_Armour_Material implements IArmorMaterial {
	private static final int[] MAX_DAMAGE_ARRAY = new int[] {13, 15, 16, 11};
	private static final int[] DAMAGE_REDUCTION_ARRAY = new int[]{2, 5, 7, 3};
	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * 28;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return DAMAGE_REDUCTION_ARRAY[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return 30;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return Ingredient.fromItems(ModItems.RUBY);
	}

	@Override
	public String getName() {
		return testmod.MODID + ":ruby";
	}

	@Override
	public float getToughness() {
		return 1.8f;
	}

	@Override
	public float func_230304_f_() {
		return 0.1f;
	}
}