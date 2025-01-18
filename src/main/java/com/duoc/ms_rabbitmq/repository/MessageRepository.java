package com.duoc.ms_rabbitmq.repository;

import com.duoc.ms_rabbitmq.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}