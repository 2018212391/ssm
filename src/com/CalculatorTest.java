package com;

import org.junit.Test;
import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c;
    static final double delta = 0.001;

    @Before
    public void setUp() {
        c = new Calculator();
    }

    @Test
    public void testAdd() {
        c.add(10);
        assertEquals(10.0, c.getRet(), delta);
    }

    @Test
    public void testSub() {
        c.sub(5);
        assertEquals(-5.0, c.getRet(), delta);
    }

    @Test
    public void testMuti() {
        c.muti(4);
        assertEquals(0, c.getRet(), delta);
    }

    @Test
    public void testDiv() {
        c.div(6);
        assertEquals(0, c.getRet(), delta);
    }

    @Test
    public void testClear() {
        c.clear();
        assertEquals(0.0, c.getRet(), delta);
    }

    @Test
    public void mixed() {
        c.add(20);
        c.sub(10);
        assertEquals(10, c.getRet(), delta);
    }
}
