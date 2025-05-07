package org.yourcompany.finalayd2;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FinalExampleTest {

    @Test
    public void testProcessData_validAndInvalidWords() {
        FinalExample fe = new FinalExample();
        String input = "apple, banana1, strawberry, verylongword, pear";

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        fe.processData(input);
        String output = out.toString();

        assertTrue(output.contains("- APPLE"));
        assertTrue(output.contains("- STRAWBERR")); // cortado a 10 y uppercased
        assertTrue(output.contains("- PEAR"));
        assertFalse(output.contains("banana1"));
        assertFalse(output.contains("verylongword"));
    }

    @Test
    public void testCreateUser_emptyName() {
        FinalExample fe = new FinalExample();
        String result = fe.createUser("", "test@example.com", "", "", "", "");
        assertEquals("Name cannot be empty", result);
    }

    @Test
    public void testCreateUser_invalidEmail() {
        FinalExample fe = new FinalExample();
        String result = fe.createUser("Jacob", "invalid-email", "", "", "", "");
        assertEquals("Invalid email", result);
    }

    @Test
    public void testCreateUser_success() {
        FinalExample fe = new FinalExample();
        String result = fe.createUser("Jose", "jose@example.com", "", "", "", "");
        assertEquals("User created: Jose", result);
    }

    @Test
    public void testCalculateArea_circle() {
        FinalExample fe = new FinalExample();
        double result = fe.calculateArea("circle", 2.0);
        assertEquals(Math.PI * 4, result, 0.0001);
    }

    @Test
    public void testCalculateArea_rectangle() {
        FinalExample fe = new FinalExample();
        double result = fe.calculateArea("rectangle", 4.0, 10.0);
        assertEquals(12.0, result, 0.0001);
    }

    @Test
    public void testCalculateArea_triangle() {
        FinalExample fe = new FinalExample();
        double result = fe.calculateArea("triangle", 5.0, 8.0);
        assertEquals(6.0, result, 0.0001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCalculateArea_invalidShape() {
        FinalExample fe = new FinalExample();
        fe.calculateArea("hexagon", 3.0, 3.0);
    }
}
