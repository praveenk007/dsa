package com.pk.algos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author praveenkamath
 **/
public class InfixToPrefixTest {

    @Test
    public void withoutBracketsPositive() {
        final String str = "2+3*5";
        final String actual = new InfixToPrefix().getPrefix(str);
        assertEquals("+2*35", actual);
    }

    @Test
    public void withBracketsPositive1() {
        final String str = "(2+3)*5";
        final String actual = new InfixToPrefix().getPrefix(str);
        assertEquals("*+235", actual);
    }

    @Test
    public void withBracketsPositive2() {
        final String str = "(2+3)*(4+5)";
        final String actual = new InfixToPrefix().getPrefix(str);
        assertEquals("*+23+45", actual);
    }
}
