package me.repayed.jaguar.menu.item;

import org.bukkit.entity.Player;

@FunctionalInterface
public interface Clickable {
    void click(Player player);
}
