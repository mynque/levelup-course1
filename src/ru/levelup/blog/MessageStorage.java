package ru.levelup.blog;

import java.util.ArrayList;

public class MessageStorage {

    private static ArrayList<Message> messages = new ArrayList<>();

    public static void add(Message message) {
        messages.add(message);
    }

    public ArrayList<Message> getMessages() {
        return messages;
    }
}
