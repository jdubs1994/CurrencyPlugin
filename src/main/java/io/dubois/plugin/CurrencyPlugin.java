package io.dubois.plugin;

import io.dubois.listeners.RecipeListener;
import io.dubois.recipes.BronzeIngotRecipe;
import org.mineacademy.fo.plugin.SimplePlugin;

public class CurrencyPlugin extends SimplePlugin {
    BronzeIngotRecipe bronzeIngotRecipe = new BronzeIngotRecipe();


    @Override
    protected void onPluginStart() {
        this.getServer().addRecipe(bronzeIngotRecipe.createBronzeIngotRecipe());
        registerEvents(new RecipeListener());
    }
}
