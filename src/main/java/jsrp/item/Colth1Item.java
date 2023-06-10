
package jsrp.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.BipedModel;

import jsrp.itemgroup.JSitemItemGroup;

import jsrp.JsrpModElements;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@JsrpModElements.ModElement.Tag
public class Colth1Item extends JsrpModElements.ModElement {
	@ObjectHolder("jsrp:colth_1_helmet")
	public static final Item helmet = null;
	@ObjectHolder("jsrp:colth_1_chestplate")
	public static final Item body = null;
	@ObjectHolder("jsrp:colth_1_leggings")
	public static final Item legs = null;
	@ObjectHolder("jsrp:colth_1_boots")
	public static final Item boots = null;

	public Colth1Item(JsrpModElements instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 25;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 5, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "colth_1";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(JSitemItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedBody = new Modeltest15().Body;
				armorModel.bipedLeftArm = new Modeltest15().LeftArm;
				armorModel.bipedRightArm = new Modeltest15().RightArm;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "jsrp:textures/entities/test1.png";
			}
		}.setRegistryName("colth_1_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(JSitemItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new ModeltestP10().LeftLeg;
				armorModel.bipedRightLeg = new ModeltestP10().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "jsrp:textures/entities/texture.png";
			}
		}.setRegistryName("colth_1_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(JSitemItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public BipedModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlotType slot, BipedModel defaultModel) {
				BipedModel armorModel = new BipedModel(1);
				armorModel.bipedLeftLeg = new ModeltestC4().LeftLeg;
				armorModel.bipedRightLeg = new ModeltestC4().RightLeg;
				armorModel.isSneak = living.isSneaking();
				armorModel.isSitting = defaultModel.isSitting;
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "jsrp:textures/entities/testc1.png";
			}
		}.setRegistryName("colth_1_boots"));
	}

	// Made with Blockbench 4.7.0
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModeltestC4 extends EntityModel<Entity> {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;

		public ModeltestC4() {
			textureWidth = 128;
			textureHeight = 128;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-2.075F, 12.3F, 0.0F);
			RightLeg.setTextureOffset(86, 2).addBox(-2.125F, 9.7F, -2.3F, 4.3F, 2.0F, 4.6F, 0.0F, false);
			RightLeg.setTextureOffset(86, 12).addBox(-2.225F, 11.7F, -2.4F, 4.4F, 0.4F, 4.8F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(1.975F, 12.3F, 0.0F);
			LeftLeg.setTextureOffset(109, 2).addBox(-2.175F, 9.7F, -2.3F, 4.3F, 2.0F, 4.6F, 0.0F, false);
			LeftLeg.setTextureOffset(109, 12).addBox(-2.175F, 11.7F, -2.4F, 4.4F, 0.4F, 4.8F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

	// Made with Blockbench 4.7.0
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class Modeltest15 extends EntityModel<Entity> {
		private final ModelRenderer Body;
		private final ModelRenderer RightArm;
		private final ModelRenderer LeftArm;

		public Modeltest15() {
			textureWidth = 128;
			textureHeight = 128;
			Body = new ModelRenderer(this);
			Body.setRotationPoint(0.0F, 12.725F, 0.0F);
			Body.setTextureOffset(3, 11).addBox(-4.3F, -0.625F, -2.4F, 8.6F, 11.9F, 4.8F, 0.0F, false);
			Body.setTextureOffset(3, 3).addBox(-4.2F, 11.275F, -2.3F, 8.4F, 1.0F, 4.6F, 0.0F, false);
			RightArm = new ModelRenderer(this);
			RightArm.setRotationPoint(-5.025F, 14.775F, 0.0F);
			RightArm.setTextureOffset(88, 9).addBox(-3.275F, -2.675F, -2.3F, 4.6F, 10.9F, 4.6F, 0.0F, false);
			RightArm.setTextureOffset(88, 2).addBox(-3.175F, 8.225F, -2.2F, 4.4F, 1.0F, 4.4F, 0.0F, false);
			LeftArm = new ModelRenderer(this);
			LeftArm.setRotationPoint(5.025F, 14.775F, 0.0F);
			LeftArm.setTextureOffset(108, 9).addBox(-1.325F, -2.675F, -2.3F, 4.7F, 10.9F, 4.6F, 0.0F, false);
			LeftArm.setTextureOffset(108, 2).addBox(-1.225F, 8.225F, -2.2F, 4.5F, 1.0F, 4.4F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
			this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		}
	}

	// Made with Blockbench 4.7.0
	// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
	// Paste this class into your mod and generate all required imports
	public static class ModeltestP10 extends EntityModel<Entity> {
		private final ModelRenderer RightLeg;
		private final ModelRenderer LeftLeg;

		public ModeltestP10() {
			textureWidth = 128;
			textureHeight = 128;
			RightLeg = new ModelRenderer(this);
			RightLeg.setRotationPoint(-2.05F, 12.0F, 0.0F);
			RightLeg.setTextureOffset(107, 11).addBox(-2.15F, -0.1F, -2.3F, 4.4F, 9.1F, 4.6F, 0.0F, false);
			RightLeg.setTextureOffset(107, 3).addBox(-2.35F, 9.0F, -2.5F, 4.6F, 1.0F, 5.0F, 0.0F, false);
			LeftLeg = new ModelRenderer(this);
			LeftLeg.setRotationPoint(2.05F, 12.0F, 0.0F);
			LeftLeg.setTextureOffset(86, 11).addBox(-2.25F, -0.1F, -2.3F, 4.4F, 9.1F, 4.6F, 0.0F, false);
			LeftLeg.setTextureOffset(86, 3).addBox(-2.25F, 9.0F, -2.5F, 4.6F, 1.0F, 5.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
			LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
			this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
			this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		}
	}

}
