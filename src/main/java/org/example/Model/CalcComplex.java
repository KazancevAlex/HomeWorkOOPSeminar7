package org.example.Model;

public class CalcComplex extends Calculable {
    private Logger logger;

    public CalcComplex(ComplexNumber primaryArg) {
        super(primaryArg);
        this.logger = new Logger();
        logger.loggerOut(primaryArg.toString());
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