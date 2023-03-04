package mcr.mercenarioscraft;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("MERCENARIOS Plugin foi instalado!!");
        Bukkit.getPluginManager().registerEvents(this, this);
        getCommand("curar").setExecutor(new HealCommand());
    }

    @EventHandler
    public void onPlayerEggThrow(PlayerEggThrowEvent e) {
        e.getPlayer().sendMessage("O ovo tá caro! tem gente passando fome caralho.");
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
