package strategy;

import complex.ComplexNumber;

public interface CalculatorStrategy {
    ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2);
}
