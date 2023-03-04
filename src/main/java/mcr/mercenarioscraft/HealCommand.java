package mcr.mercenarioscraft;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){
        if(sender instanceof Player) {
            Player player = (Player) sender;
            player.sendMessage("Tá saudável ein mano!");
            player.setHealth(20);
        }
        return false;
    }

}
