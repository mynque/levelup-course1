package ForumApplication;

import java.util.Objects;

public class PrivateMessage extends Message {

    private User recipient;

    public PrivateMessage(User author, User recipient, String text) {
        super(text, author);
        this.recipient = recipient;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof PrivateMessage)) return false;

        PrivateMessage other = (PrivateMessage) object;
        return
                getMessageId() == other.getMessageId()
                && getText().equals(other.getText())
                && getAuthor().equals(other.getAuthor())
                && getDate().equals(other.getDate())
                && recipient.equals(other.recipient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessageId(), getText(), getAuthor(), getDate(), recipient);
    }

    public void send() {
        System.out.println("The following message has been sent to " + this.recipient + ":");
        System.out.println();
    }

    public User getRecipient() {
        return recipient;
    }
}
