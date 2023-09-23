package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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
        App person = new App();
        App person2 = new App();

        assertEquals(2, App.numberOfPersons());

    }

}
