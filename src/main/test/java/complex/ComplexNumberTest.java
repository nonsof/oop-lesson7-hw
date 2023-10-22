package complex;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComplexNumberTest {

    @Test
    public void testAddition() {
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 2);
        ComplexNumber result = num1.add(num2);
        ComplexNumber expected = new ComplexNumber(3, 5);
        assertEquals(expected.toString(), result.toString());
    }

    @Test
    public void testMultiplication() {
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 2);
        ComplexNumber result = num1.multiply(num2);
        ComplexNumber expected = new ComplexNumber(-4, 7);
        assertEquals(expected.toString(), result.toString());
    }

    @Test
    public void testDivision() {
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(1, 2);
        ComplexNumber result = num1.divide(num2);
        ComplexNumber expected = new ComplexNumber(1.6, 0.2);
        assertEquals(expected.toString(), result.toString());
    }
}
