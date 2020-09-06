package me.repayed.jaguar;

import me.repayed.jaguar.examplemenu.LinksCommand;
import me.repayed.jaguar.listeners.MenuClickListener;
import me.repayed.jaguar.menu.MenuHandler;
import me.repayed.jaguar.examplemenu.SocialLinksMenu;
import org.bukkit.plugin.java.JavaPlugin;

public class Jaguar extends JavaPlugin {

    private MenuHandler menuHandler;

    @Override
    public void onEnable() {
        this.menuHandler = new MenuHandler();
        MenuHandler.addMenu(new SocialLinksMenu());

        getServer().getPluginManager().registerEvents(new MenuClickListener(), this);
        getCommand("links").setExecutor(new LinksCommand());
    }

    public MenuHandler getMenuHandler() {
        return this.menuHandler;
    }

}
