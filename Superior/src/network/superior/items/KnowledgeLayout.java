package network.superior.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import link.mc.gui.ItemPosition;
import link.mc.gui.Layout;

public class KnowledgeLayout extends Layout {

	public List<ItemPosition> l = new ArrayList<ItemPosition>();
	
	@Override
	public void init() {
		l.add(new ItemPosition(0, 0, new ItemStack(Material.BEDROCK)));
	}

	@Override
	public int getSize() {
		return 36;
	}

	@Override
	public List<ItemPosition> getItems() {
		return l;
	}

}
