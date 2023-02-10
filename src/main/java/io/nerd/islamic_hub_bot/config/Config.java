package io.nerd.islamic_hub_bot.config;

import io.nerd.islamic_hub_bot.listener.PingListener;
import io.nerd.islamic_hub_bot.listener.RateListener;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class Config {
    @Autowired
    PingListener pingListener;

    @Autowired
    RateListener rateListener;
    @Value("${discord.token}")
    private String token;

    @Bean
    public DiscordApi discordApi() {

        DiscordApi api = new DiscordApiBuilder().setToken(token)
                .setAllNonPrivilegedIntents()
                .login()
                .join();


        api.addMessageCreateListener(pingListener);
        api.addMessageCreateListener(rateListener);
        return api;
    }
}
