package com.example.messaging.service;

import com.example.messaging.model.Message;
import com.example.messaging.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Mono<Message> createMessage(Message message) {
        return messageRepository.save(message);
    }

    public Flux<Message> streamMessages(String channelId) {
        return messageRepository.findWithTailableCursorByChannelId(channelId);
    }

    public Mono<Void> deleteMessage(String id) {
        return messageRepository.deleteById(id);
    }
}