package net.mcreator.vraixania.procedure;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.vraixania.block.BlockFeuxdecamp;
import net.mcreator.vraixania.ElementsVraiXaniaMod;

import java.util.Map;

@ElementsVraiXaniaMod.ModElement.Tag
public class ProcedureMarmiteBlockDestroyedByPlayer extends ElementsVraiXaniaMod.ModElement {
	public ProcedureMarmiteBlockDestroyedByPlayer(ElementsVraiXaniaMod instance) {
		super(instance, 46);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MarmiteBlockDestroyedByPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityPlayer) {
			ItemStack _setstack = new ItemStack(BlockFeuxdecamp.block, (int) (1));
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), _setstack);
		}
	}
}
