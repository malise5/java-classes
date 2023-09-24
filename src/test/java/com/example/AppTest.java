package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void shouldReturnHelloWorld() {
        App kudez = new App();
        String expected = "Hello World";
        String result = kudez.greetings();

        assertEquals(expected, result);
    }

    @Test
    public void sum() {
        App kudez = new App();
        int expected = 3;
        int result = kudez.sum(1, 2);

        assertEquals(expected, result);
    }

    @Test
    public void hello() {
        App app = new App("Kudez");

        String expected = "Hello Kudez";
        String actual = app.hello("Kudez");

        assertEquals(expected, actual);

    }

    @Test
    public void returnNumberOfPersons() {
        for (int i = 0; i < 2; i++) {
            App person2 = new App();
        }

        assertEquals(2, App.numberOfPersons());

    }

}
