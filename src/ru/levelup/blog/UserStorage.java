package ru.levelup.blog;

import java.util.ArrayList;

public class UserStorage {

    private static ArrayList<User> users = new ArrayList<>();

    public static void add(User user) {
        users.add(user);
    }

    public static boolean authenticate(String email, int passwordHash) {
        boolean isUser = false;
        for (User user : UserStorage.users) {
            isUser = isUser || user.authenticate(email, passwordHash);
        }
        return isUser;
    }

    public static ArrayList<User> getUsers() {
        return users;
    }
}