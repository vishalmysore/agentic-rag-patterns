package org.example.rag;

import io.github.vishalmysore.tools4ai.EnableAgent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@EnableAgent
public class AgenticRag {
    public static void main(String[] args) {
        SpringApplication.run(AgenticRag.class, args);

    }
}
