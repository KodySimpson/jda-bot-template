package me.kodysimpson;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class DiscordBot {

    public static void main(String[] args) throws LoginException {

        JDA bot = JDABuilder.createDefault("OTQ2MTg0OTM3NTc1NDI4MTE2.YhbBZA.xizOVTtflX8E07RNpjh4M0-yVOI")
                .setActivity(Activity.playing("with your mom"))
                .build();

    }
}
