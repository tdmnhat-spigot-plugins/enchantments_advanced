    package dev.tdmnhat.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class EnchantmentAdvanced extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerConfig();
        registerEvents();
        registerCommands();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void registerConfig() {

    }

    private void registerEvents() {

    }

    private void registerCommands() {

    }
}
