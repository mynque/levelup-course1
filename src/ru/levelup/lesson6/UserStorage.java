package ru.levelup.lesson6;

public class UserStorage {

    private static User[] users;

    static {
        users = new User[] {
                new User("emorozov", "123"),
                new User("dmipro", "123111"),
                new User("dmipro2", "12311")
        };
    }

    public static boolean authenticate(User user) {
        for (User aUser : users) {
            if (aUser.equals(user)) return true;
        }
        return false;
    }
}
