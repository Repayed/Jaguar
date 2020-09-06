package me.repayed.jaguar.listeners;

import me.repayed.jaguar.menu.MenuHandler;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MenuClickListener implements Listener {

    @EventHandler
    public void onMenuClick(InventoryClickEvent event) {
        final Inventory clickedInventory = event.getClickedInventory();
        final ItemStack clickedItem = event.getCurrentItem();

        if (clickedInventory == null) return;
        if (!(event.getWhoClicked() instanceof Player)) return;

        final Player player = (Player) event.getWhoClicked();

        MenuHandler.getMenus().forEach(menu -> {
            if (clickedInventory.getTitle().equalsIgnoreCase(menu.getInventory().getTitle())) {
                event.setCancelled(true);
                menu.getMenuItemList().forEach(item -> {
                    final ItemMeta clickedItemMeta = clickedItem.getItemMeta();
                    final ItemMeta menuItemMeta = item.getItemStack().getItemMeta();

                    if (clickedItemMeta != null && clickedItemMeta.getDisplayName() != null) {
                        if (clickedItemMeta.getDisplayName().equals(menuItemMeta.getDisplayName()))
                            item.click(player);
                    }
                });
            }
        });

    }
}
