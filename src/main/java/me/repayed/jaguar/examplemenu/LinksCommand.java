package me.repayed.jaguar.examplemenu;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class LinksCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "[Links] Only players may use this command.");
        } else {
            Player player = (Player) sender;
            player.openInventory(new SocialLinksMenu().getInventory());
        }

        return true;
    }
}
