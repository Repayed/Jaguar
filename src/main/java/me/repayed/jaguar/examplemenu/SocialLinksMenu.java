package me.repayed.jaguar.examplemenu;

import me.repayed.jaguar.menu.Menu;
import me.repayed.jaguar.menu.MenuRows;
import me.repayed.jaguar.menu.item.MenuItem;
import me.repayed.jaguar.utils.Chat;
import me.repayed.jaguar.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.inventory.ItemStack;

public class SocialLinksMenu extends Menu {

    public SocialLinksMenu() {
        super("Social Links", MenuRows.THREE_ROWS);
        loadAllItems();
    }

    @Override
    public void loadAllItems() {
        ItemStack discordItem = new ItemBuilder(Material.EMERALD)
                .withName("&a&lDISCORD")
                .withLore(
                        "&7Click here to be sent the discord link.",
                        "&7This is just another test.")
                .build();

        MenuItem discordMenuItem = new MenuItem(discordItem, 11);
        discordMenuItem.setClickable(player -> {
            player.closeInventory();
            player.sendMessage(Chat.format("&a&l[!] &aThe discord link is: &fdiscord.gg/test"));
            player.playSound(player.getLocation(), Sound.ITEM_PICKUP, 0.75F, 0.75F);
        });

        loadItem(discordMenuItem);

        for (int i = 0; i < getInventory().getSize(); i++) {
            if (getInventory().getItem(i) == null)
                getInventory().setItem(i, new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 7));
        }
    }
}
