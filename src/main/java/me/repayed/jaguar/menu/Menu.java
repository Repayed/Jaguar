package me.repayed.jaguar.menu;

import me.repayed.jaguar.menu.item.MenuItem;
import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu {
    private Inventory inventory;
    private List<MenuItem> menuItemList;

    public Menu(String name, MenuRows menuRows) {
        this.inventory = Bukkit.createInventory(null, menuRows.getSize(), name);
        this.menuItemList = new ArrayList<>();
    }

    public Inventory getInventory() {
        return this.inventory;
    }

    public List<MenuItem> getMenuItemList() {
        return this.menuItemList;
    }

    public void loadItem(MenuItem menuItem) {
        this.inventory.setItem(menuItem.getIndex(), menuItem.getItemStack());
        this.menuItemList.add(menuItem);
    }

    public abstract void loadAllItems();

}
