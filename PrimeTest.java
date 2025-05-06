package Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PrimeTest {

    @Test
    public void testIsPrime() {
        Prime prime = new Prime();

        assertTrue(prime .isPrime(5));

        assertFalse(prime .isPrime(4));
    }
}