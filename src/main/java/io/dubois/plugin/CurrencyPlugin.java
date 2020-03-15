package io.dubois.plugin;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;

public class CurrencyPlugin extends SimplePlugin {

	@Override
	protected void onPluginStart() {
		loadRecipe();
		Common.log("This should be working!!!!!");
	}

	private void loadRecipe() {
		ItemStack item = new ItemStack(Material.BRICKS, 1);
		ItemMeta meta = item.getItemMeta();

		meta.setDisplayName("Bronze Ingot");

		ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("dunno"), item);
		recipe.shape("B  ", "   ", "   ");
		recipe.setIngredient('B', Material.BRICKS);

		item.setItemMeta(meta);

		Common.log(meta.getDisplayName());

		this.getServer().addRecipe(recipe);
	}

}
