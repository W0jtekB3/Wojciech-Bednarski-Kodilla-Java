package com.kodilla.spring;

import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import org.junit.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.assertEquals;

@SpringBootApplication
public class KodillaSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaSpringApplication.class, args);
    }

    @Test // Use the correct Test annotation
    public void testSquareLoadedIntoContainer() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean(Square.class);
        //When
        String name = ((Square) shape).getShapeName();
        //Then
        assertEquals("This is a square.", name);
    }
}
