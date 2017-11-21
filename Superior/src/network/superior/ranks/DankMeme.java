package network.superior.ranks;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.permissions.Permission;

import link.mc.permission.Rank;

public class DankMeme implements Rank {

	@Override
	public String getName() {
		return "DankMeme";
	}

	@Override
	public String getId() {
		return "dankmeme";
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
		return new ArrayList<>();
	}

}
