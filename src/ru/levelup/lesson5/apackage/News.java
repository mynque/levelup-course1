package ru.levelup.lesson5.apackage;

public class News extends AbstractPublication {
    public News(String author) {
        super.author = author;
    }

    @Override
    protected void publish() {

    }
}
