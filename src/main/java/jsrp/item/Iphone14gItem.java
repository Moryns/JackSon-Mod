
package jsrp.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import jsrp.itemgroup.JSitemItemGroup;

import jsrp.JsrpModElements;

@JsrpModElements.ModElement.Tag
public class Iphone14gItem extends JsrpModElements.ModElement {
	@ObjectHolder("jsrp:iphone_14g")
	public static final Item block = null;

	public Iphone14gItem(JsrpModElements instance) {
		super(instance, 20);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(JSitemItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC));
			setRegistryName("iphone_14g");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
