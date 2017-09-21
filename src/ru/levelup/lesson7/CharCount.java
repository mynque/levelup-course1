package ru.levelup.lesson7;

import java.util.HashMap;
import java.util.Map;

public class CharCount {

    public static void main(String[] args) {
        String string = "vvasiliy sostet her";

        CharCount.count(string);
    }

    public static void count(String string) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch: string.toCharArray()) {
            if (map.get(ch) == null) map.put(ch, 0);
            map.put(ch, map.get(ch) + 1);
        }

        for (Character ch: map.keySet()) {
            System.out.println("Character " + ch + " met " + map.get(ch) + " times.");
        }
    }
}
