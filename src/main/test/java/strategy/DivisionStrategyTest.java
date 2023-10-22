package strategy;

import complex.ComplexNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionStrategyTest {

    @Test
    public void testDivision() {
        CalculatorStrategy strategy = new DivisionStrategy();
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 2);
        ComplexNumber result = strategy.calculate(num1, num2);
        ComplexNumber expected = new ComplexNumber(1.6, 0.2);
        assertEquals(expected.toString(), result.toString());
    }
}
