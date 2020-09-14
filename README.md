# Jaguar Inventory Library (Incomplete)

This project was designed to make gui making easier, and cleaner,
it's nowhere near done, and it contains a bunch of quick fixes, and all
that as it's just a proof of concept, as well as looking to get advice/suggestions
on how to make it better, and what things could be improved.

The idea behind it is that gui making should be as the following example:

## Example

```
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
	}
}

```

## Example Inventory Picture
[Inventory](https://gyazo.com/a7524cb2f66495aa6c0791848e2b8e70)
