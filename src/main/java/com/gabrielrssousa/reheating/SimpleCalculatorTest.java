package com.gabrielrssousa.reheating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SimpleCalculatorTest implements CommandLineRunner {

    @Autowired
    private SimplePublicTests calculator;

    @Override
    public void run(String... args) throws Exception{
        System.out.println("Simple calculator test: " + calculator.add(2,7));
    }
}
