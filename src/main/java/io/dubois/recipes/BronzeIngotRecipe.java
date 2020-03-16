package io.dubois.recipes;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public class BronzeIngotRecipe {

    public ShapedRecipe createBronzeIngotRecipe() {
        ItemStack item = new ItemStack(Material.PINK_STAINED_GLASS, 1);

        {
            ItemMeta itemMeta = item.getItemMeta();
            itemMeta.setDisplayName(ChatColor.DARK_GRAY + "");
            itemMeta.setDisplayName("Bronze Ingot");
            item.setItemMeta(itemMeta);
        }

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("dunno"), item);
        recipe.shape("B B", "   ", "B B");
        recipe.setIngredient('B', Material.BRICKS);

        return recipe;
    }
}
