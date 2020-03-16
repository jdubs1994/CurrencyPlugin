package io.dubois.plugin;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.CraftItemEvent;
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
        ItemStack item = new ItemStack(Material.PINK_STAINED_GLASS, 1);

        {
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName(ChatColor.DARK_GRAY + "");
            itemMeta.setDisplayName("Bronze Ingot");
            item.setItemMeta(itemMeta);
        }


        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("dunno"), item);
        recipe.shape("B  ", "   ", "   ");
        recipe.setIngredient('B', Material.BRICKS);


        this.getServer().addRecipe(recipe);
    }

    @EventHandler
    public void onRecipeCreated(CraftItemEvent event) {
        if (event.getCurrentItem().getItemMeta().getDisplayName().equals("Bronze Ingot")) {
            Common.log("DUDE!");
        }
    }

}
