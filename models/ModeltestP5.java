// Made with Blockbench 4.7.0
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModeltestP5 extends EntityModel<Entity> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public ModeltestP5() {
		textureWidth = 128;
		textureHeight = 128;

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.05F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(106, 13).addBox(-2.15F, -0.1F, -2.3F, 4.4F, 8.7F, 4.6F, 0.0F, false);
		RightLeg.setTextureOffset(105, 6).addBox(-2.35F, 8.6F, -2.5F, 4.6F, 0.9F, 5.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.05F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(80, 13).addBox(-2.25F, -0.1F, -2.3F, 4.4F, 8.7F, 4.6F, 0.0F, false);
		LeftLeg.setTextureOffset(80, 6).addBox(-2.25F, 8.6F, -2.5F, 4.6F, 0.9F, 5.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		RightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.LeftLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.RightLeg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}