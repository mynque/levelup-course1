package ForumApplication;

import java.util.Objects;

public class PostMessage extends Message {

    private Post post;

    public PostMessage(Post post, User author, String text ) {
        super(text, author);
        this.post = post;
    }

    @Override
    public void send() {
        System.out.println("You have added the following message to " + post + ":");
        System.out.println(this.getText());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof PostMessage)) return false;

        PostMessage other = (PostMessage) object;

        return
                getMessageId() == other.getMessageId()
                        && getText().equals(other.getText())
                        && getAuthor().equals(other.getAuthor())
                        && getDate().equals(other.getDate())
                        && post.equals(other.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMessageId(), getText(), getAuthor(), getDate(), post);
    }
}
