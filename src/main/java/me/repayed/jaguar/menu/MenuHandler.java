package me.repayed.jaguar.menu;

import java.util.HashSet;
import java.util.Set;

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
