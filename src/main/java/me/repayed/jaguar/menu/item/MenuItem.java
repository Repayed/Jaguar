package me.repayed.jaguar.menu.item;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class MenuItem {
    private final ItemStack itemStack;
    private Clickable clickable;
    private final int index;

    public MenuItem(ItemStack itemStack, int index) {
        this.itemStack = itemStack;
        this.index = index;
    }

    public ItemStack getItemStack() {
        return this.itemStack;
    }

    public int getIndex() {
        return this.index;
    }

    public Clickable getClickable() {
        return this.clickable;
    }

    public void click(Player player) {
        getClickable().click(player);
    }

    public void setClickListener(Clickable clickable) {
        this.clickable = clickable;
    }


}
