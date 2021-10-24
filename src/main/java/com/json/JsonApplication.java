package com.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@Slf4j
public class JsonApplication {

    public static void main(String[] args) {

        final ConfigurableApplicationContext run = SpringApplication.run(JsonApplication.class, args);
        log.info(run.getDisplayName());
    }

}
