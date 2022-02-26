package com.jonahseguin.drink.command;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

import javax.annotation.Nonnull;

@Getter @Setter
public class DrinkAuthorizer {
    public boolean isAuthorized(@Nonnull CommandSender sender, @Nonnull DrinkCommand command) {
        if (command.getPermission() != null && command.getPermission().length() > 0) {
            if (!sender.hasPermission(command.getPermission())) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', command.getPermissionMessage()));
                return false;
            }
        }
        return true;
    }
}
