package network.superior.items;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import link.mc.gui.Page;
import link.mc.kryan.Crafting;
import link.mc.kryan.Item;
import link.mc.util.item.ItemConstruct;

@Item(id = "superior:book_of_knowledge", name = "Book of Knowledge")
public class KnowledgeBook {
	
	public static final ItemStack ITEM = new ItemConstruct(Material.KNOWLEDGE_BOOK).getMeta().setName("Book of Knowledge").getItem();

	@Item.State
	public ItemStack item() {
		return ITEM;
	}
	
	@Item.Action(type = Item.ActionType.USE)
	public void onUse(PlayerInteractEvent event) {
		//event.getPlayer().sendMessage("The GUI for the knowledge book is still work in progress");
		Page p = new Page("The Book of Knowledge", new KnowledgeLayout());
		p.registerEvents();
		event.getPlayer().openInventory(p.compileItems());
	}
	
	@Crafting
	public boolean recipe(Inventory inventory) {
		/*if (inventory.getType().equals(InventoryType.DROPPER) && inventory.contains(Material.BOOK) && inventory.contains(Material.APPLE)) {
			return true;
		}
		
		return false;*/
		return Crafter.CONTAINER.is(inventory) && inventory.contains(Material.BOOK) && inventory.contains(Material.APPLE);
	}
	
}
