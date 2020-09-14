package me.repayed.jaguar.menu;

import java.util.HashSet;
import java.util.Set;

/**
 * Class which stores all of the current menus,
 * for easier handling and to take advantage
 * of polymorphism.
 */

public class MenuHandler {
    private static Set<Menu> menuSet;

    public MenuHandler() {
        menuSet = new HashSet<>();
    }

    public static void addMenu(Menu menu) {
        menuSet.add(menu);
    }

    public static Set<Menu> getMenus() {
        return menuSet;
    }

}
