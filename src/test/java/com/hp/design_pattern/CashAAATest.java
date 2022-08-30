package com.hp.design_pattern;

import com.hp.design_pattern.arrange_act_assert.Cash;
import org.junit.*;


/**
 * @author HP
 * @date 2022/8/30
 */
public class CashAAATest {
    @Test
    public void testPlus() {
        final var cash = new Cash(3);
        cash.plus(4);
        Assert.assertEquals(7, cash.count());
    }

    @Test
    public void testMinus() {
        var cash = new Cash(8);
        var result = cash.minus(5);
        Assert.assertTrue(result);
        Assert.assertEquals(3, cash.count());
    }

    @Test
    public void testInsufficientMinus() {
        var cash = new Cash(1);
        var result = cash.minus(6);
        Assert.assertFalse(result);
        Assert.assertEquals(1, cash.count());
    }

    @Test
    public void testUpdate() {
        var cash = new Cash(5);
        cash.plus(6);
        var result = cash.minus(3);
        Assert.assertTrue(result);
        Assert.assertEquals(8, cash.count());
    }
}
