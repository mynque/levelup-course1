package ru.levelup.lesson6;

import java.util.Objects;

public class User {

    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return false;
        if (!(object instanceof User)) return false;

        User other = (User) object;

        return
                Objects.equals(login, other.login)
                && Objects.equals(password, other.password);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + login.hashCode();
        result = 31 * result + password.hashCode();
        return result;
    }
}
