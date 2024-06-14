package src.test.java;

import static org.junit.Assert.*;
import src.main.java.*;
import org.junit.Test;

public class FunctionFaktorialTest {

    @Test
    public void testFactorial() {
        assertEquals(1, FunctionFaktorial.factorial(0));
        assertEquals(1, FunctionFaktorial.factorial(1));
        assertEquals(2, FunctionFaktorial.factorial(2));
        assertEquals(6, FunctionFaktorial.factorial(3));
        assertEquals(24, FunctionFaktorial.factorial(4));
        assertEquals(120, FunctionFaktorial.factorial(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFactorialNegative() {
        FunctionFaktorial.factorial(-1);
    }
}

