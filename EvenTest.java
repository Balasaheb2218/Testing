package Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class EvenTest {
    @Test
    public void testIsEven() {
        Even even = new Even();

        assertTrue(even.isEven(4));

        assertFalse(even.isEven(5));

        assertTrue(even.isEven(0));

    }
}
