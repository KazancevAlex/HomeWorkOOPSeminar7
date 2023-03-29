package org.example.Model;

public class Calculable implements ICalculable {
    protected ComplexNumber primaryArg;

    public Calculable(ComplexNumber primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public Calculable addition(ComplexNumber number) {
        primaryArg = new ComplexNumber(primaryArg.getReal() + number.getReal(),
                primaryArg.getImaginary() + number.getImaginary());
        return this;
    }

    @Override
    public Calculable subtract(ComplexNumber number) {
        primaryArg = new ComplexNumber(primaryArg.getReal() - number.getReal(),
                primaryArg.getImaginary() - number.getImaginary());
        return this;
    }

    @Override
    public Calculable multiply(ComplexNumber number) {
        primaryArg = new ComplexNumber(primaryArg.getReal() * number.getReal(),
                primaryArg.getImaginary() * number.getImaginary());
        return this;
    }

    @Override
    public Calculable division(ComplexNumber number) {
        primaryArg = new ComplexNumber(primaryArg.getReal() / number.getReal(),
                primaryArg.getImaginary() / number.getImaginary());
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return primaryArg;
    }
}