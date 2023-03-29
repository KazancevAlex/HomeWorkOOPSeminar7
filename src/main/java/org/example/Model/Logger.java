package org.example.Model;

public class Logger implements ILogger {

    public Logger() {
    }

    @Override
    public void loggerOut(String message) {
        System.out.println("Первая группа комплексных чисел: " + message);
    }
}

