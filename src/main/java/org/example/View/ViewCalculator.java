package org.example.View;

import java.util.Scanner;

public class ViewCalculator implements IViewCalculator {
    Scanner in;

    public ViewCalculator() {
        this.in = new Scanner(System.in);
    }

    @Override
    public int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }



    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    @Override
    public void show(String message) {
        System.out.print(message);
    }
}