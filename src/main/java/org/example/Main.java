package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("tolu");
        names.add("tife");
        System.out.println(names);

        Map<String, Integer> myNames = new HashMap<>();
        myNames.put("tolu ", 20);
        myNames.put("tobi ", 20);
        System.out.println(myNames);

    }
}