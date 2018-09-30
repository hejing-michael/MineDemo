package com.test.unit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Calculator mCalculator;

    @Before
    public void setUp() throws Exception {
        mCalculator = new Calculator();
    }

    @Test
    public void sum() {
    }

    @Test
    public void substract() {
        // 验证当a==5 && b==4时， mCalculator.substract(a, b)计算的差值是否为1，否则不通过
        Assert.assertEquals(1d, mCalculator.substract(5d, 4d), 0);
    }

    @Test
    public void divide() {
    }

    @Test
    public void multiply() {
    }
}