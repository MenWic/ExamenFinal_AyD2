package org.yourcompany.finalayd2.processor;

import java.util.ArrayList;
import java.util.List;

public class DataProcessor {

    public List<String> process(String input) {
        List<String> result = new ArrayList<>();
        String[] parts = input.split(",");

        for (String part : parts) {
            part = part.trim();
            if (part.length() > 0) {
                if (part.length() > 10) {
                    part = part.substring(0, 10);
                }
                if (part.matches("[a-zA-Z]+")) {
                    result.add(part.toUpperCase());
                }
            }
        }
        return result;
    }

    public void print(List<String> data) {
        System.out.println("Data processed:");
        data.forEach(item -> System.out.println("- " + item));

        System.out.println("Total items:");
        data.forEach(item -> System.out.println("- " + item));
    }
}
