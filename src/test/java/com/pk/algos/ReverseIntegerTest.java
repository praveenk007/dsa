package com.pk.algos;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

/**
 * @author praveenkamath
 **/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReverseIntegerTest {

    @Test
    public void zeroTestPass() {
        int reversed = reverse(0);
        assertEquals(0, reversed);
    }

    @Test
    public void zeroTestFail() {
        int reversed = reverse(0);
        assertNotEquals(1, reversed);
    }

    private int reverse(int number) {
        return new ReverseInteger().reverseInt(number);
    }

    @Test
    public void twoDigitPass() {
        int reversed = reverse(47);
        assertEquals(74, reversed);
    }

    @Test
    public void twoDigitFail1() {
        int reversed = reverse(47);
        assertNotEquals(70, reversed);
    }

    @Test
    public void twoDigitFail2() {
        int reversed = reverse(47);
        assertNotEquals(4, reversed);
    }

    @Test
    public void threeDigitPass() {
        int reversed = reverse(123);
        assertEquals(321, reversed);
    }

    @Test
    public void threeDigitFail1() {
        int reversed = reverse(123);
        assertNotEquals(1, reversed);
    }

    @Test
    public void threeDigitFail2() {
        int reversed = reverse(123);
        assertNotEquals(2, reversed);
    }

    @Test
    public void threeDigitFail3() {
        int reversed = reverse(123);
        assertNotEquals(3, reversed);
    }

    @Test
    public void threeDigitFail4() {
        int reversed = reverse(123);
        assertNotEquals(32, reversed);
    }

    @Test
    public void threeDigitFail5() {
        int reversed = reverse(123);
        assertNotEquals(21, reversed);
    }

    @Test
    public void tenDigitPass() {
        int reversed = reverse(756498471);
        assertEquals(174894657, reversed);
    }

    @Test
    public void tenDigitFail() {
        int reversed = reverse(756498471);
        assertNotEquals(0, reversed);
    }

    @Test
    public void sameFiveDigitPass() {
        int reversed = reverse(44444);
        assertEquals(44444, reversed);
    }

    @Test
    public void sameFiveDigitFail() {
        int reversed = reverse(44444);
        assertNotEquals(4, reversed);
    }
}
