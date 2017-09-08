package ru.levelup;

import java.util.Date;

public class App {
    public static void main(String[] args) {

        News news = new News("Dmitriy", new Date(), "Photoshop 7");
        System.out.println(news.author + " " + news.getSource());

        Publication publication = news;

        Object object = news;

        News news1 = (News)object;
    }

}
