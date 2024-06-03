package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private ForumStatistics forumStatistics;

    @BeforeEach
    void setUp() {
        forumStatistics = new ForumStatistics();
    }

    @Test
    void testCalculateAdvStatisticsWithThousandPosts() {
        // Given
        List<String> users = generateListOfNUsers(100);
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2000);

        // When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        // Then
        assertEquals(100, forumStatistics.getUsersCount());
        assertEquals(1000, forumStatistics.getPostsCount());
        assertEquals(2000, forumStatistics.getCommentsCount());
        assertEquals(10.0, forumStatistics.getAveragePostsPerUser());  // Corrected from 20.0 to 10.0
        assertEquals(20.0, forumStatistics.getAverageCommentsPerUser());
        assertEquals(2.0, forumStatistics.getAverageCommentsPerPost());
    }

    private List<String> generateListOfNUsers(int usersCount) {
        List<String> users = new ArrayList<>();
        for (int i = 1; i <= usersCount; i++) {
            users.add("User" + i);
        }
        return users;
    }
}
