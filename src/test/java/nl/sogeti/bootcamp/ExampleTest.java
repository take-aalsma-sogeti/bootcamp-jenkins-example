package nl.sogeti.bootcamp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testDoSomething() {
        Example example = new Example();
        assertEquals("ABCD", example.getAbcd());
    }
}