package com.pk.algos;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author praveenkamath
 **/
public class InfixToPostfixTest {

    @Test
    public void test_nobrack_positive() {
        final String infix = "1+2*3";
        final String expected = "123*+";
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        assertEquals(expected, infixToPostfix.getPostfix(infix));
    }

    @Test
    public void test_brack_positive() {
        final String infix = "(1+2)*3";
        final String expected = "12+3*";
        InfixToPostfix infixToPostfix = new InfixToPostfix();
        assertEquals(expected, infixToPostfix.getPostfix(infix));
    }
}
