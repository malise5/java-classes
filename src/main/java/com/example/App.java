package com.example;

public class App {

    private String personName;

    private static int numbers;

    public App(String personName) {
        this.personName = personName;
    }

    public App() {
        App.numbers++;
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public String greetings() {
        return "Hello World";
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public static int numberOfPersons() {
        return numbers;
    }

}
