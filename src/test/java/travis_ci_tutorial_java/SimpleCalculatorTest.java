package travis_ci_tutorial_java;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
    @Test
    public void testAdd() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.add(1, 1), 2);
    }

    @Test
    public void testSubtract() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.subtract(5, 3), 2);
    }

    @Test
    public void testMultiply() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.multiply(4, 3), 12);
    }

    @Test
    public void testDivide() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.divide(10, 2), 5);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        SimpleCalculator calc = new SimpleCalculator();
        calc.divide(5, 0);
    }
}
