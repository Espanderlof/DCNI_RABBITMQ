package com.duoc.ms_rabbitmq.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class MessageDTO {
    private Long id;
    private String content;
    private LocalDateTime createdAt;
    private String routingKey;
}