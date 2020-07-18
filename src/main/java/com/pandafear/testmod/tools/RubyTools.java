package com.pandafear.testmod.tools;

import init.ModItemGroups;
import init.ModItems;
import net.minecraft.item.AxeItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;

public class RubyTools {
	public static final SwordItem RUBY_SWORD = 
			new SwordItem(new Ruby_Sword(), 3, -2f, new Item.Properties()
													.group(ModItemGroups.MOD_ITEM_GROUP));
	public static final PickaxeItem RUBY_PICK = 
			new PickaxeItem(new Ruby_Pick(), 1, -3.1f, new Item.Properties()
													.group(ModItemGroups.MOD_ITEM_GROUP));
	public static final AxeItem RUBY_AXE = 
			new AxeItem(new Ruby_Axe(), 5, -3.1f, new Item.Properties()
												.group(ModItemGroups.MOD_ITEM_GROUP));
	public static final ShovelItem RUBY_SHOVEL =
			new ShovelItem(new Ruby_Shovel(), 1, -3.1f, new Item.Properties()
												.group(ModItemGroups.MOD_ITEM_GROUP));
	public static final HoeItem RUBY_HOE = new HoeItem(new Ruby_Hoe(), 1, -3.1f,
												new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
}

class Ruby_Tools implements IItemTier {
	   public int getMaxUses() {
		   return 800;
	   }

	   public float getEfficiency() {
		   return 7.0F;
	   }

	   public float getAttackDamage() {
		   return 1.0F;
	   }

	   public int getHarvestLevel() {
		   return 3;
	   }

	   public int getEnchantability() {
		   return 10;
	   }

	   public Ingredient getRepairMaterial() {
		   return Ingredient.fromItems(ModItems.RUBY);
	   }
}

class Ruby_Sword extends Ruby_Tools {
	@Override
   public float getAttackDamage() {
	   return 3.0F;
   }
}

class Ruby_Pick extends Ruby_Tools {
	@Override
	public float getAttackDamage() {
		return 1.0f;
	}
}

class Ruby_Axe extends Ruby_Tools {
	@Override
	public float getAttackDamage() {
		return 4.0f;
	}
}

class Ruby_Shovel extends Ruby_Tools {
	@Override
	public float getAttackDamage() {
		return 1.4f;
	}
}

class Ruby_Hoe extends Ruby_Tools {
	@Override
	public float getAttackDamage() {
		return 1.0f;
	}
}