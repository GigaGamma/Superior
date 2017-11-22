/*
 * SuperiorNetworks tier 1 YT rank
 */
package network.superior.ranks;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.permissions.Permission;

import link.mc.permission.Rank;

public class YouTuber implements Rank {

	@Override
	public String getName() {
		return "YouTuber";
	}

	@Override
	public String getId() {
		return "yt";
	}

	@Override
	public ChatColor getColor() {
		return ChatColor.RED;
	}

	@Override
	public boolean isOpped() {
		return false;
	}

	@Override
	public List<Permission> getPerms() {
		List<Permission> p = new ArrayList<Permission>();
		p.add(new Permission("mclink.fly"));
		p.add(new Permission("mclink.build"));
		return p;
	}

}
