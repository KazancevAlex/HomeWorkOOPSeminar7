package org.example.Model;

public interface ICalculable {
    Calculable addition(ComplexNumber number);
    Calculable subtract(ComplexNumber number);
    Calculable multiply(ComplexNumber number);
    Calculable division(ComplexNumber number);
    ComplexNumber getResult();
}