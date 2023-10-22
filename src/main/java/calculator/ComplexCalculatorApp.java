package calculator;

import complex.ComplexNumber;
import strategy.CalculatorStrategy;
import logger.Logger;

public class ComplexCalculatorApp {
    private Logger logger;
    private CalculatorStrategy strategy;

    public ComplexCalculatorApp(CalculatorStrategy strategy) {
        this.strategy = strategy;
        logger = Logger.getInstance(); // Реализация Singleton для логгера
    }

    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        ComplexNumber result = strategy.calculate(num1, num2);
        logger.log("Calculated: " + num1 + " using " + strategy.getClass().getSimpleName() + " " + num2 + " = " + result);
        return result;
    }

    public static void main(String[] args) {
        // Создание калькулятора и выполнение операций
    }
}
