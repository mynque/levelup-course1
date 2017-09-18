package ru.levelup.blog;

import java.util.Objects;

public class PrivateMessage extends Message {

    private User recipient;

    public PrivateMessage(User author, User recipient, String text) {
        super(text, author);
        this.recipient = recipient;
    }




    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) return false;
        if (!(object instanceof PrivateMessage)) return false;

        PrivateMessage other = (PrivateMessage) object;
        return recipient.equals(other.recipient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), recipient);
    }

    public void send() {
        System.out.println("The following message has been sent to " + this.recipient + ":");
        System.out.println();
    }

    public User getRecipient() {
        return recipient;
    }
}
