package com.jonahseguin.drink.argument;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandArg {

    private final CommandSender sender;
    private final String value;
    private final CommandArgs args;

    public CommandArg(CommandSender sender, String value, CommandArgs args) {
        this.sender = sender;
        this.value = value;
        this.args = args;
    }

    public CommandSender getSender() {
        return sender;
    }

    public String get() {
        return value;
    }

    public boolean isSenderPlayer() {
        return sender instanceof Player;
    }

    public Player getSenderAsPlayer() {
        return (Player) sender;
    }

    public CommandArgs getArgs() {
        return args;
    }
}
