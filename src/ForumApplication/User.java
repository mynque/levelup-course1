package ForumApplication;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class User {

    private int userId;
    private String name;
    private String lastName;
    private String email;
    private Date registrationDate;
    private String password;

    public User(String name, String lastName, String email, String password) {
        this.userId = ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE);
        this.name = name;
        this.lastName = lastName;
        this.email = isValidEmailAddress(email) ? email : null;
        this.registrationDate = Calendar.getInstance().getTime();
        this.password = password;
    }

    public boolean authenticate(String email, int hash) {
        return
                this.email.equals(email)
                && Objects.hash(password) == hash;
    }

    public static boolean isValidEmailAddress(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(ePattern);
        java.util.regex.Matcher m = p.matcher(email);
        return m.matches();
    }

    @Override
    public boolean equals(Object user) {
        if (this == user) return true;
        if (!(user instanceof User)) return false;

        User other = (User) user;

        return
                name.equals(other.name)
                && lastName.equals(other.lastName)
                && email.equals(other.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, email);
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }
}
