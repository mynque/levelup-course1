package ru.levelup.blog;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Message {

    private int messageId;
    private String text;
    private User author;
    private Date date;

    public Message(String text, User author) {
        this.messageId = ThreadLocalRandom.current().nextInt(0, Integer.MAX_VALUE);
        this.text = text;
        this.author = author;
        this.date = Calendar.getInstance().getTime();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Message)) return false;

        Message other = (Message) object;
        return
                messageId == other.messageId
                && text.equals(other.text)
                && author.equals(other.author)
                && date.equals(other.date);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(messageId, text, author, date);
    }

    public abstract void send();

    public Message() {
        super();
    }

    public int getMessageId() {
        return messageId;
    }

    public String getText() {
        return text;
    }

    public User getAuthor() {
        return author;
    }

    public Date getDate() {
        return date;
    }
}
