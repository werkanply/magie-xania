// Made with Blockbench 3.7.4
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports

public static class Modelfeux extends EntityModel<Entity> {
	private final ModelRenderer feux;

	public Modelfeux() {
		textureWidth = 32;
		textureHeight = 32;

		feux = new ModelRenderer(this);
		feux.setRotationPoint(-8.0F, 16.0F, 8.0F);
		feux.setTextureOffset(21, 0).addBox(-3.0F, 2.0F, 0.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		feux.setTextureOffset(8, 0).addBox(-2.0F, 6.0F, -10.0F, 4.0F, 2.0F, 20.0F, 0.0F, false);
		feux.setTextureOffset(23, 0).addBox(-10.0F, 6.0F, -2.0F, 20.0F, 2.0F, 4.0F, 0.0F, false);
		feux.setTextureOffset(6, 16).addBox(3.0F, 6.0F, -6.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		feux.setTextureOffset(0, 16).addBox(1.0F, 4.0F, -4.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		feux.setTextureOffset(25, 27).addBox(-3.0F, 2.0F, -2.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
		feux.setTextureOffset(18, 19).addBox(3.0F, 6.0F, 3.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		feux.setTextureOffset(27, 19).addBox(1.0F, 4.0F, 1.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		feux.setTextureOffset(3, 16).addBox(0.0F, 2.0F, 1.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
		feux.setTextureOffset(0, 20).addBox(-6.0F, 6.0F, -6.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		feux.setTextureOffset(24, 16).addBox(-4.0F, 4.0F, -4.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		feux.setTextureOffset(28, 10).addBox(0.0F, 2.0F, -2.0F, 2.0F, 2.0F, 3.0F, 0.0F, false);
		feux.setTextureOffset(9, 22).addBox(-6.0F, 6.0F, 3.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		feux.setTextureOffset(0, 23).addBox(-4.0F, 4.0F, 1.0F, 3.0F, 2.0F, 3.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		feux.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}