package com.exemple.fizzbuzz.config;

import com.exemple.fizzbuzz.domain.FizzBuzzCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanInitializer {

    @Bean
    public FizzBuzzCalculator fizzBuzzCalculator() {
        return new FizzBuzzCalculator();
    }
}
