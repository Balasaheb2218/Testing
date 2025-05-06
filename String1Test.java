package Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class String1Test {

    @Test
    public void testStringLength() {
        String1 string = new String1();

        assertEquals(5, string.stringLength("Hello"));

        assertEquals(0, string.stringLength(""));
    }
}