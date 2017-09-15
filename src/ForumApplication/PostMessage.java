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
        if (!super.equals(object)) return false;
        if (!(object instanceof PostMessage)) return false;

        PostMessage other = (PostMessage) object;
        return post.equals(other.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), post);
    }
}
