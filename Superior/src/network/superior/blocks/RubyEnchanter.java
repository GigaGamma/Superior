package network.superior.blocks;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import link.mc.kryan.Block;
import link.mc.kryan.Item;
import link.mc.util.item.ItemConstruct;

@Item(id = "superior:", name = "Ruby Ench")
@Block(id = "superior:ruby_enchanter", name = "Ruby Block")
public class RubyEnchanter {
	
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
