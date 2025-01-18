package com.duoc.ms_rabbitmq.service;

import com.duoc.ms_rabbitmq.model.Message;
import java.util.List;

public interface MessageService {
    Message saveMessage(Message message);
    List<Message> getAllMessages();
    Message getMessageById(Long id);
}