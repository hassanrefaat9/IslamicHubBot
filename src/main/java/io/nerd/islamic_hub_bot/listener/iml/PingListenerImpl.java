package io.nerd.islamic_hub_bot.listener.iml;

import io.nerd.islamic_hub_bot.listener.PingListener;
import org.javacord.api.event.message.MessageCreateEvent;
import org.springframework.stereotype.Component;

@Component
public class PingListenerImpl implements PingListener {

    @Override
    public void onMessageCreate(MessageCreateEvent messageCreateEvent) {
        if (messageCreateEvent.getMessage().getContent().equals("f")) {
            messageCreateEvent.getChannel().sendMessage("Fuck you bitch hahaha");
        }
        if (messageCreateEvent.getMessage().getContent().equals("j")) {
            messageCreateEvent.getChannel().sendMessage(" What is the Difference Between Pitzz and Jew");
        }
        if (messageCreateEvent.getMessage().getContent().equals("a")) {
            messageCreateEvent.getChannel().sendMessage("That pizza doesn’t scream when they put it in the oven.");
        }
    }
}
