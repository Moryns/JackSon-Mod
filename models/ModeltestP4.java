// Made with Blockbench 4.7.0
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

public static class ModeltestP4 extends EntityModel<Entity> {
	private final ModelRenderer RightLeg;
	private final ModelRenderer LeftLeg;
	private final ModelRenderer cube_r1;

	public ModeltestP4() {
		textureWidth = 128;
		textureHeight = 128;

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-2.05F, 12.0F, 0.0F);
		RightLeg.setTextureOffset(106, 11).addBox(-2.15F, -0.1F, -2.3F, 4.4F, 8.5F, 4.6F, 0.0F, false);
		RightLeg.setTextureOffset(105, 3).addBox(-2.35F, 8.4F, -2.5F, 4.6F, 0.9F, 5.0F, 0.0F, false);

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setRotationPoint(2.45F, 12.0F, 0.0F);
		LeftLeg.setTextureOffset(84, 3).addBox(-2.25F, 8.4F, -2.5F, 4.6F, 0.9F, 5.0F, 0.0F, false);

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.05F, 3.95F, 0.0F);
		LeftLeg.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 3.1416F, 0.0F);
		cube_r1.setTextureOffset(85, 11).addBox(-2.2F, -4.05F, -2.3F, 4.4F, 8.5F, 4.6F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
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
}