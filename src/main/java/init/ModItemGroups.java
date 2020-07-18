package init;

import com.google.common.base.Supplier;
import com.pandafear.testmod.testmod;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {
	public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(testmod.MODID, 
			() -> new ItemStack(ModItems.RUBY));

	public static class ModItemGroup extends ItemGroup {
			private final Supplier<ItemStack> iconSupplier;
	
			public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
				super(name);
				this.iconSupplier = iconSupplier;
			}
	
			@Override
			public ItemStack createIcon() {
				return iconSupplier.get();
			}
		}




}