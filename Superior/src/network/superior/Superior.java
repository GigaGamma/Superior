package network.superior;

import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import link.mc.event.InventoryRunnable;
import link.mc.event.McLinkInitEvent;
import link.mc.kryan.Block;
import link.mc.kryan.Crafting;
import link.mc.kryan.Item;
import link.mc.math.ItemId;
import link.mc.permission.Ranks;
import network.superior.items.KitchenCrafter;
import network.superior.items.KnowledgeBook;
import network.superior.items.RubyBlock;
import network.superior.items.Salad;
import network.superior.ranks.DankMeme;
import network.superior.ranks.YouTuber;
import network.superior.ranks.YouTuber2;
import network.superior.ranks.Admin;
import network.superior.ranks.Moderator;
import network.superior.ranks.ChatMod;

public class Superior extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		Bukkit.getPluginManager().registerEvents(this, this);
		
		getLogger().log(Level.INFO, "SuperiorNetworks Running on McLink");
		
		Ranks.register(new DankMeme());
		Ranks.register(new YouTuber());
		Ranks.register(new YouTuber2());
		Ranks.register(new Admin());
		Ranks.register(new Moderator());
		Ranks.register(new ChatMod());
		
		Item.Registry.item(KnowledgeBook.class);
		Item.Registry.item(Salad.class);
		Block.Registry.block(RubyBlock.class);
		
		Crafting.Registry.recipe(new InventoryRunnable() {
			
			@Override
			public void run() {
				
			}
			
		});
	}
	
	@EventHandler
	public void init(McLinkInitEvent event) {
		
	}
	
	@EventHandler
	public void join(PlayerJoinEvent event) {
		System.out.println("Join");
		event.getPlayer().getInventory().addItem(ItemId.attach(KnowledgeBook.ITEM, "superior:book_of_knowledge"));
	}
	
}
