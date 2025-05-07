package org.yourcompany.finalayd2;

import org.yourcompany.finalayd2.processor.DataProcessor;
import org.yourcompany.finalayd2.user.UserCreator;
import org.yourcompany.finalayd2.geometry.ShapeAreaCalculator;

import java.util.List;

public class App {

    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();
        List<String> data = processor.process("apple,123banana,strawberry");
        processor.print(data);

        UserCreator creator = new UserCreator();
        System.out.println("\n" + creator.createUser("Luis", "mail@test.com", "", "", "", ""));

        ShapeAreaCalculator calculator = new ShapeAreaCalculator();
        System.out.println("Area: " + calculator.calculate("triangle", 3, 4));
    }
}
