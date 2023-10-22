package strategy;

import complex.ComplexNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionStrategyTest {

    @Test
    public void testAddition() {
        CalculatorStrategy strategy = new AdditionStrategy();
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 2);
        ComplexNumber result = strategy.calculate(num1, num2);
        ComplexNumber expected = new ComplexNumber(3, 5);
        assertEquals(expected.toString(), result.toString());
    }
}
