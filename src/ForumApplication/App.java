package ForumApplication;

import java.util.Objects;
import java.util.Scanner;

public class App {

    private static boolean isAuthenticated;

    public static void main(String[] args) {

        User user1 = new User("Ivan", "Petrov", "petrov@mail.com", "123");
        User user2 = new User("Petr", "Sidorov", "sidorov@mail.com", "321");

        UserStorage.add(user1);
        UserStorage.add(user2);

        menu();
    }

    private static int menu() {

        if (!isAuthenticated) authenticate();

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Show all my posts");
        System.out.println("2. Write a private message");
        System.out.println("3. Leave a comment to a post");
        System.out.println("4. Exit");



        if (!sc.hasNextInt()) {
            System.out.println("Please enter a number from 1 to 4:");
            menu();
        }

        int choice = sc.nextInt();

        if (choice < 1 || choice > 4) {
            System.out.println("Please enter a number from 1 to 4:");
            menu();
        }

        return choice;
    }

    private static void authenticate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your email:");
        String email = scanner.nextLine();

        if (!User.isValidEmailAddress(email)) {
            System.out.println("The email is not valid");
            menu();
        }

        System.out.println("Please enter your password:");
        int passwordHash = Objects.hash(scanner.nextLine());

        if (UserStorage.authenticate(email, passwordHash)) {
            isAuthenticated = true;
        } else {
            System.out.println("Your credentials are wrong.");
            menu();
        }
    }
}
