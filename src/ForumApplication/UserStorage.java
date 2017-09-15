package ForumApplication;

import java.util.Arrays;

public class UserStorage {

    private static User[] users = new User[0];
    
    public static void add(User user) {

        // Keep the current state in prevUsers
        User[] prevUsers = users;

        // Initialize a new array having one more element
        User[] newUsers = new User[prevUsers.length + 1];

        // Copy previous users into the newly defined array
        for (int i = 0; i < prevUsers.length; i++) {
            newUsers[i] = prevUsers[i];
        }

        // Set the method parameter as a value for the last element
        newUsers[newUsers.length - 1] = user;

        users = newUsers;
    }

    public static boolean authenticate(String email, int passwordHash) {
        boolean isUser = false;
        for (User user : UserStorage.users) {
            isUser = isUser || user.authenticate(email, passwordHash);
        }
        return isUser;
    }

    public static User[] getUsers() {
        return users;
    }
}
