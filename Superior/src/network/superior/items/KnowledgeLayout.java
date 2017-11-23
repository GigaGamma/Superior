package network.superior.items;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import link.mc.gui.ItemPosition;
import link.mc.gui.Layout;
import link.mc.gui.RawItemPosition;

public class KnowledgeLayout extends Layout {

	public List<RawItemPosition> l = new ArrayList<RawItemPosition>();
	
	@Override
	public void init() {
		l.add(new ItemPosition(0, 0, new ItemStack(Material.BEDROCK)));
	}

	@Override
	public int getSize() {
		return 36;
	}

	@Override
	public List<RawItemPosition> getItems() {
		return l;
	}

}
