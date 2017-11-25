package network.superior.blocks;

import java.util.List;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.MetadataValue;

import link.mc.gui.Page;
import link.mc.kryan.Block;
import link.mc.kryan.Container;
import link.mc.kryan.Item;
import link.mc.util.item.ItemConstruct;

@Item(id = "superior:ruby_block", name = "Ruby Block")
@Block(id = "superior:ruby_block", name = "Ruby Block")
public class RubyBlock {
	
	public static final ItemStack ITEM = new ItemConstruct(Material.REDSTONE_BLOCK).getMeta().setName("Ruby Block").getItem();
	public static final ItemStack BLOCK = new ItemConstruct(Material.REDSTONE_BLOCK).getMeta().setName("Ruby Block").getItem();
	
	
	@Item.State
	public ItemStack item() {
		return ITEM;
	}
	
	@Block.State
	public ItemStack block(Location location) {
		return BLOCK;
	}
	
	@Block.Action(type = Block.ActionType.USE)
	public void onUse(PlayerInteractEvent event) {
		
	}
	
}
