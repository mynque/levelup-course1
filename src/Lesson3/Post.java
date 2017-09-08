package Lesson3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Post {

    private long postId;
    private String title;
    private String text;
    private Date postedAt;


    // Constructor for automatic date assignment

    public Post(String title, String text) {

        this.postId = ThreadLocalRandom.current().nextLong(0, Long.MAX_VALUE);
        this.title = title;
        this.text = text;
        this.postedAt = new Date();
    }

    // Constructor for manual date assignment, the format is yyyy-MM-dd HH:mm:ss

    public Post(String title, String text, String postedAt) {

        this.postId = ThreadLocalRandom.current().nextLong(1, Long.MAX_VALUE); // Generating a positive long
        this.title = title;
        this.text = text;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.postedAt = format.parse(postedAt);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    // Bubble sorting by ID lowest to highest

    public static Post[] sortByPostId(Post[] posts) {

        for (int a = 1; a < posts.length; a++) {
            for (int b = posts.length - 1; b >= a; b--) {
                if (posts[b].postId < posts[b - 1].postId) {
                    Post t = posts[b - 1];
                    posts[b - 1] = posts[b];
                    posts[b] = t;
                }
            }
        }

        return posts;
    }

    // Bubble sorting by date earliest to latest

    public static Post[] sortByPostedAt(Post[] posts) {

        for (int a = 1; a < posts.length; a++) {
            for (int b = posts.length - 1; b >= a; b--) {
                if (posts[b].postedAt.compareTo(posts[b - 1].postedAt) < 0) {
                    Date t = posts[b - 1].postedAt;
                    posts[b - 1].postedAt = posts[b].postedAt;
                    posts[b].postedAt = t;
                }
            }
        }

        return posts;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getPostedAt() {
        return postedAt;
    }

    public void setPostedAt(Date postedAt) {
        this.postedAt = postedAt;
    }
}
