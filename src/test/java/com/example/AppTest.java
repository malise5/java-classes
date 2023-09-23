package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest {
    App kudez = new App();

    @Test
    public void shouldReturnHelloWorld() {

        String expected = "Hello World";
        String result = kudez.greetings();

        assertEquals(expected, result);
    }

    @Test
    public void sum() {
        int expected = 3;
        int result = kudez.sum(1, 2);

        assertEquals(expected, result);
    }

}
