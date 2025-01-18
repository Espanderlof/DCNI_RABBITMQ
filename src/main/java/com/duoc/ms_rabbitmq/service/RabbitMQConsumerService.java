package com.duoc.ms_rabbitmq.service;

import com.duoc.ms_rabbitmq.model.Message;
import com.duoc.ms_rabbitmq.repository.MessageRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQConsumerService {
    private static final Logger logger = LoggerFactory.getLogger(RabbitMQConsumerService.class);

    @Autowired
    private MessageRepository messageRepository;

    @RabbitListener(queues = "myQueue")
    public void receiveMessage(String content) {
        logger.info("Mensaje recibido de RabbitMQ: {}", content);
        
        try {
            Message message = new Message();
            message.setContent(content);
            message.setRoutingKey("myKey"); // Puedes ajustar esto según tus necesidades
            
            messageRepository.save(message);
            logger.info("Mensaje guardado en Oracle exitosamente");
        } catch (Exception e) {
            logger.error("Error al guardar el mensaje en Oracle: ", e);
        }
    }
}