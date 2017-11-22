/*
 * SuperiorNetworks chat mod rank
 */
package network.superior.ranks;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.permissions.Permission;

import link.mc.permission.Rank;

public class ChatMod implements Rank {

	@Override
	public String getName() {
		return "Chat Mod";
	}

	@Override
	public String getId() {
		return "chmd";
	}

	@Override
	public ChatColor getColor() {
		return ChatColor.DARK_GREEN;
	}

	@Override
	public boolean isOpped() {
		return true;
	}

	@Override
	public List<Permission> getPerms() {
		List<Permission> p = new ArrayList<Permission>();
		p.add(new Permission("mclink.fly"));
		return p;
	}

}
