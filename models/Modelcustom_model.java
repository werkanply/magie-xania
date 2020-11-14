
public static class Modelcustom_model extends ModelBase {
	private final ModelRenderer bb_main;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 64;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -3.0F, -17.0F, 0.0F, 4, 17, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 16, 30, -3.0F, -19.0F, -1.0F, 4, 2, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 30, -3.0F, -21.0F, -2.0F, 4, 2, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 20, 11, -4.0F, -23.0F, -5.0F, 8, 6, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 24, -4.0F, -22.0F, -6.0F, 8, 5, 1, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 22, -4.0F, -21.0F, -10.0F, 8, 4, 4, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 16, 0, -2.0F, -1.0F, -9.0F, 2, 1, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 30, 0, -9.0F, -1.0F, 1.0F, 6, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 32, 36, -4.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 24, 36, -5.0F, -1.0F, -3.0F, 2, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 16, 36, -6.0F, -1.0F, -5.0F, 2, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 6, 11, -2.0F, -1.0F, 1.0F, 2, 1, 10, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 28, 30, 1.0F, -1.0F, 1.0F, 6, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 8, 36, -6.0F, -1.0F, 7.0F, 2, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 36, -5.0F, -1.0F, 5.0F, 2, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 32, 33, -4.0F, -1.0F, 3.0F, 2, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 30, 6, 0.0F, -1.0F, 3.0F, 2, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 30, 3, 0.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 30, 1.0F, -1.0F, 5.0F, 2, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 16, 6, 2.0F, -1.0F, 7.0F, 2, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 16, 3, 1.0F, -1.0F, -3.0F, 2, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 12, 0, 2.0F, -1.0F, -5.0F, 2, 1, 2, 0.0F, false));
		bb_main.cubeList.add(new ModelBox(bb_main, 28, 21, -3.0F, -2.0F, 1.0F, 7, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.bb_main.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.bb_main.rotateAngleX = f4 / (180F / (float) Math.PI);
	}
}