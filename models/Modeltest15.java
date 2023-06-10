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
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		this.RightArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.LeftArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}