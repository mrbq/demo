package com.example.demo.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.DemoTask;

@Configuration
public class DemoConfiguration {
    
    @Bean
    public CommandLineRunner demoTask() {
        return new DemoTask();
    }
    
}
