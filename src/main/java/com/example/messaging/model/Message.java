package com.example.messaging.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "messages")
@Data
public class Message {
    @Id
    private String id;
    private String message;
    private String sender;
    private String sendee;
    private String channelId;
}