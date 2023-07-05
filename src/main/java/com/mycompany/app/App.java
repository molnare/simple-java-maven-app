package com.mycompany.app;

/**
 * Hello world!!!
 */
public class App {

    private final String message = "Hello World!";

    public App() {
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        double d = 1.1;
        BigDecimal bd1 = new BigDecimal(d);
    }

    private final String getMessage() {
        return message;
    }

}
