// Made with Blockbench 4.7.0
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModeltestC3 extends EntityModel<Entity> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;

	public ModeltestC3() {
		textureWidth = 128;
		textureHeight = 128;

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.075F, 13.6F, 0.0F);
		RightLeg.setTextureOffset(86, 2).addBox(-2.125F, 8.4F, -2.3F, 4.3F, 2.0F, 4.6F, 0.0F, false);
		RightLeg.setTextureOffset(86, 12).addBox(-2.225F, 10.4F, -2.4F, 4.4F, 0.4F, 4.8F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(1.975F, 11.6F, 0.0F);
		LeftLeg.setTextureOffset(109, 2).addBox(-2.175F, 10.4F, -2.3F, 4.3F, 2.0F, 4.6F, 0.0F, false);
		LeftLeg.setTextureOffset(109, 12).addBox(-2.175F, 12.4F, -2.4F, 4.4F, 0.4F, 4.8F, 0.0F, false);
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