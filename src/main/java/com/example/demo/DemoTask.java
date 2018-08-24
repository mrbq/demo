package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoTask implements CommandLineRunner {
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("==============================================");
        System.out.println("TASK STARTED");
        System.out.println("==============================================");        
    }
    
}
