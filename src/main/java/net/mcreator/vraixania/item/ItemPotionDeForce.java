
package net.mcreator.vraixania.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemFood;
import net.minecraft.item.Item;
import net.minecraft.item.EnumAction;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.vraixania.procedure.ProcedurePotionDeForceFoodEaten;
import net.mcreator.vraixania.ElementsVraiXaniaMod;

import java.util.Map;
import java.util.HashMap;

@ElementsVraiXaniaMod.ModElement.Tag
public class ItemPotionDeForce extends ElementsVraiXaniaMod.ModElement {
	@GameRegistry.ObjectHolder("vrai_xania:potion_de_force")
	public static final Item block = null;
	public ItemPotionDeForce(ElementsVraiXaniaMod instance) {
		super(instance, 58);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemFoodCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("vrai_xania:potion_de_force", "inventory"));
	}
	public static class ItemFoodCustom extends ItemFood {
		public ItemFoodCustom() {
			super(0, 0f, false);
			setUnlocalizedName("potion_de_force");
			setRegistryName("potion_de_force");
			setAlwaysEdible();
			setCreativeTab(CreativeTabs.BREWING);
			setMaxStackSize(1);
		}

		@Override
		public EnumAction getItemUseAction(ItemStack par1ItemStack) {
			return EnumAction.DRINK;
		}

		@Override
		protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer entity) {
			super.onFoodEaten(itemStack, world, entity);
			int x = (int) entity.posX;
			int y = (int) entity.posY;
			int z = (int) entity.posZ;
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				ProcedurePotionDeForceFoodEaten.executeProcedure($_dependencies);
			}
		}
	}
}
