package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        assertEquals(calculator.add(1, 3),4);

        assertEquals(calculator.add(-2, -2),-4);

        assertEquals(calculator.add(3, 0),3);
        
        assertEquals(calculator.add(0, 0),0);
    }
}
