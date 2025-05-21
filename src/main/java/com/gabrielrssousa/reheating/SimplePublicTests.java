package com.gabrielrssousa.reheating;

import org.springframework.stereotype.Component;

@Component
public class SimplePublicTests {
    public int add(int number_one, int number_two){
        return number_one+number_two;
    }
}
