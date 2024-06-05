package com.kodilla.stream;

import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        List<ForumUser> userList = createSampleUserList();

        Map<Integer, ForumUser> filteredUsers = userList.stream()
                .filter(user -> user.getGender() == 'M')
                .filter(user -> user.getDateOfBirth().plusYears(20).isBefore(LocalDate.now()))
                .filter(user -> user.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, user -> user));

        filteredUsers.forEach((userId, user) -> System.out.println("User ID: " + userId + ", User: " + user.getUsername()));
    }

    private static List<ForumUser> createSampleUserList() {
        // Create and return sample user list
        return List.of(
                new ForumUser(1, "user1", 'M', LocalDate.of(1990, 1, 1), 5),
                new ForumUser(2, "user2", 'F', LocalDate.of(1985, 6, 15), 0),
                new ForumUser(3, "user3", 'M', LocalDate.of(2000, 3, 25), 2),
                new ForumUser(4, "user4", 'F', LocalDate.of(1975, 9, 30), 1)
        );
    }
}
