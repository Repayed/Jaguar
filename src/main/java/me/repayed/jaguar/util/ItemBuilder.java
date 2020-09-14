package me.repayed.jaguar.util;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A simple utility class, which allows for
 * faster item creation, and less repetition
 * of code.
 */

public class ItemBuilder {
    private final ItemStack itemStack;
    private final ItemMeta itemMeta;

    /**
     * The constructor for the class. This is where the item
     * stack is created and where the item meta is received.
     *
     * @param material the material that the item will be based around.
     */

    public ItemBuilder(Material material) {
        this.itemStack = new ItemStack(material);
        this.itemMeta = this.itemStack.getItemMeta();
    }

    /**
     * Allows you to set the display name of an item. (Supporting color codes)
     *
     * @param name the name that will be used for the item.
     * @return the ItemBuilder class in order to keep the method chain.
     */

    public ItemBuilder withName(String name) {
        this.itemMeta.setDisplayName(Chat.format(name));
        return this;
    }

    /**
     * This method allows for easier lore handling,
     * and overall makes code a little bit more easier to read.
     *
     * @param lore the lines for the lore.
     * @return the ItemBuilder class in order to keep the method chain.
     */

    public ItemBuilder withLore(String... lore) {
        List<String> temporaryLore = new ArrayList<>();

        Arrays.stream(lore).forEach(loreLine -> temporaryLore.add(Chat.format(loreLine)));

        this.itemMeta.setLore(temporaryLore);
        return this;
    }

    /**
     * Adds a hidden enchantment to the item.
     * To give the impression that it is enchanted.
     *
     * @return the ItemBuilder class in order to keep the method chain.
     */

    public ItemBuilder withFakeEnchantment() {
        this.itemMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        this.itemMeta.addEnchant(Enchantment.LUCK, 1, true);
        return this;
    }

    /**
     * The last method for creating the item.
     *
     * @return the built item.
     */

    public ItemStack build() {
        this.itemStack.setItemMeta(this.itemMeta);
        return this.itemStack;
    }
}