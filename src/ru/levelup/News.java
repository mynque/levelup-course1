package ru.levelup;

import java.util.Date;

public class News extends Publication {

    private String source;

    public News(String author, Date date, String source) {
        super(author, date);
        this.source = source;
    }

    public String getSource() {
        return source;
    }
}
