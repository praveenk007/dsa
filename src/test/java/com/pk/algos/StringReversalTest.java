package com.pk.algos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author praveenkamath
 **/
public class StringReversalTest {

    @Test
    public void singleStringTest() {
        final String str = "praveen";
        assertEquals("neevarp", new StringReversal().reverse(str));
    }

    @Test
    public void multiStringTest() {
        final String str = "praveen is a good boy";
        assertEquals("yob doog a si neevarp", new StringReversal().reverse(str));
    }

    @Test
    public void multiCaseTest() {
        final String str = "Praveen is a GOOD boy";
        assertEquals("yob DOOG a si neevarP", new StringReversal().reverse(str));
    }
}
