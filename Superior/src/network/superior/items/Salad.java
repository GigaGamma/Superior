package network.superior.items;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import link.mc.kryan.Crafting;
import link.mc.kryan.Item;
import link.mc.util.item.ItemConstruct;

@Item(id = "foode:salad", name = "Salad")
public class Salad {
	
	public static final ItemStack ITEM = new ItemConstruct(Material.DIAMOND_SPADE).getMeta().setData((short) 1).setUnbreakable(true).setName("&green Salad&").removeFlags().getItem();

	@Item.State
	public ItemStack item() {
		return ITEM;
	}
	
	@Item.Action(type = Item.ActionType.USE)
	public void onUse(PlayerInteractEvent event) {
		if (event.getPlayer().getGameMode().equals(GameMode.CREATIVE))
			return;
		event.getPlayer().sendMessage("Delicious!");
		event.getPlayer().getInventory().removeItem(event.getItem());
		event.getPlayer().setFoodLevel(event.getPlayer().getFoodLevel() + 4);
	}
	
	@Crafting
	public boolean recipe(Inventory inventory) {
		/*if (inventory.getType().equals(InventoryType.DROPPER) && inventory.contains(Material.BOOK) && inventory.contains(Material.APPLE)) {
			return true;
		}*/
		
		return false;
	}
	
}
