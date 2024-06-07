package com.kodilla.spring.forum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class ForumUserTestSuite {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testGetUsername() {
        // Given
        ForumUser forumUser = context.getBean(ForumUser.class);

        // When
        String username = forumUser.getUsername();

        // Then
        Assertions.assertEquals("John Smith", username);
    }
}
