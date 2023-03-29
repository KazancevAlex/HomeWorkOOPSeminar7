package org.example.Controller;

import org.example.Model.CalcComplex;
import org.example.Model.Calculable;
import org.example.Model.ComplexNumber;
import org.example.View.ViewCalculator;

public class Calculator implements ICalculator{
    private final ViewCalculator view;
    private Calculable calc;
    private final String complex1;
    private final String complex2;

    public Calculator() {
        this.view = new ViewCalculator();
        complex1 = "Введите первое число:\n";
        complex2 = "Введите второе число:\n";
    }

    @Override
    public void run(){
        while (true) {
            view.show(complex1);
            this.calc = new CalcComplex(newComplexNum());
            while (true) {
                String cmd = view.prompt("Введите команду (+, -, *, /, =) : ");
                if (cmd.equals("*")) {
                    view.show(complex2);
                    calc.multiply(newComplexNum());
                    continue;
                }
                if (cmd.equals("-")) {
                    view.show(complex2);
                    calc.subtract(newComplexNum());
                    continue;
                }
                if (cmd.equals("+")) {
                    view.show(complex2);
                    calc.addition(newComplexNum());
                    continue;
                }
                if (cmd.equals("/")) {
                    view.show(complex2);
                    calc.division(newComplexNum());
                    continue;
                }
                if (cmd.equals("=")) {
                    view.show("Результат = " + calc.getResult().toString());
                    break;
                }
            }
            String cmd = view.prompt("\nЖелаете продолжить (Y/N)?");
            if (cmd.toLowerCase().equals("y")) {
                continue;
            }
            break;
        }
    }

    private ComplexNumber newComplexNum() {
        return new ComplexNumber(view.promptInt("Действительная часть = "),
                view.promptInt("Мнимая часть = "));
    }
}