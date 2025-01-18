package com.duoc.ms_rabbitmq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableJpaRepositories
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        try {
            SpringApplication.run(App.class, args);
            logger.info("Aplicación iniciada correctamente");
            logger.info("El ms está listo para recibir solicitudes");
        } catch (Exception e) {
            logger.error("Error al iniciar la aplicación: ", e);
            e.printStackTrace();
        }
    }
}