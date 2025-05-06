package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        assertEquals(4, calculator.add(1, 3));

        assertEquals(-4, calculator.add(-2, -2));

        assertEquals(3, calculator.add(3, 0));
        
        assertEquals(0, calculator.add(0, 0));
    }
}