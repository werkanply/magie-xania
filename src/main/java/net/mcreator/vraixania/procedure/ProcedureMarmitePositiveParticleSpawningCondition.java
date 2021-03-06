package net.mcreator.vraixania.procedure;

import net.minecraft.world.World;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.EntityPlayer;

import net.mcreator.vraixania.ElementsVraiXaniaMod;

import java.util.Map;

@ElementsVraiXaniaMod.ModElement.Tag
public class ProcedureMarmitePositiveParticleSpawningCondition extends ElementsVraiXaniaMod.ModElement {
	public ProcedureMarmitePositiveParticleSpawningCondition(ElementsVraiXaniaMod instance) {
		super(instance, 50);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MarmitePositiveParticleSpawningCondition!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MarmitePositiveParticleSpawningCondition!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MarmitePositiveParticleSpawningCondition!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MarmitePositiveParticleSpawningCondition!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.playSound((EntityPlayer) null, x, y, z,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("block.fire.ambient")),
				SoundCategory.NEUTRAL, (float) 1, (float) 1);
	}
}
