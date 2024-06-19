package com.kodilla.spring.reader;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class ReaderConfig {

    @Bean
    public Reader reader(@Lazy Book book) {
        return new Reader(book);
    }

    @Bean
    public Book book() {
        return new Book();
    }
}