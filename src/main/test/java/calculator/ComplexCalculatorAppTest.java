package calculator;

import complex.ComplexNumber;
import org.junit.Before;
import org.junit.Test;
import strategy.AdditionStrategy;
import strategy.CalculatorStrategy;
import strategy.DivisionStrategy;
import strategy.MultiplicationStrategy;

import static org.junit.Assert.assertEquals;

public class ComplexCalculatorAppTest {

    private ComplexCalculatorApp calculator;

    @Before
    public void setUp() {
        // Инициализация калькулятора с конкретной стратегией (например, сложение)
        CalculatorStrategy strategy = new AdditionStrategy();
        calculator = new ComplexCalculatorApp(strategy);
    }

    @Test
    public void testAddition() {
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 2);
        ComplexNumber result = calculator.calculate(num1, num2);
        ComplexNumber expected = new ComplexNumber(3, 5);
        assertEquals(expected.toString(), result.toString());
    }

    @Test
    public void testMultiplication() {
        // Тест на умножение
    }

    @Test
    public void testDivision() {
        // Тест на деление
    }
}
