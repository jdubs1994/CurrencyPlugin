package io.dubois.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;
import org.mineacademy.fo.Common;

public class RecipeListener implements Listener {

    @EventHandler
    public void onRecipeCreated(CraftItemEvent event) {
        if (event.getCurrentItem().getItemMeta().getDisplayName().equals("Bronze Ingot")) {
            Common.log("Really only using this for debugging so far");
        }
    }
}
