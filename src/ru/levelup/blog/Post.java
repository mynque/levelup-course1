package ru.levelup.blog;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Post {

    private long postId;
    private User author;
    private String title;
    private String text;
    private Date date;


    // Constructor for automatic date assignment

    public Post(User author, String title, String text) {
        this.postId = ThreadLocalRandom.current().nextLong(0, Long.MAX_VALUE);
        this.author = author;
        this.title = title;
        this.text = text;
        this.date = new Date();
    }

    // Constructor for manual date assignment, the format is yyyy-MM-dd HH:mm:ss

    public Post(User author, String title, String text, String date) {
        this.postId = ThreadLocalRandom.current().nextLong(1, Long.MAX_VALUE); // Generating a positive long
        this.author = author;
        this.title = title;
        this.text = text;

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            this.date = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean equals(Object post) {
        if (this == post) return true;
        if (!(post instanceof Post)) return false;

        Post other = (Post) post;

        return
                Objects.equals(postId, other.postId)
                && author.equals(other.author)
                && title.equals(other.title)
                && text.equals(other.text)
                && date.equals(other.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, author, title, text, date);
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
                if (posts[b].date.compareTo(posts[b - 1].date) < 0) {
                    Date t = posts[b - 1].date;
                    posts[b - 1].date = posts[b].date;
                    posts[b].date = t;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
