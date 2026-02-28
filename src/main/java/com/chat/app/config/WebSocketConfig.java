package com.chat.app.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker

public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/chat") // this is our end points
                .setAllowedOrigins("https://localhost:8080") // this is the security only this server can ,message
                .withSockJS(); // this is add compatibility for more user.
    }
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // set a message broker
        registry.enableSimpleBroker("/topic"); // if u have a chat room like /topic/chatroom1 . how have acces this chat room all are get the message.
        registry.setApplicationDestinationPrefixes("/app");
        //expect message with broker

    }
}
