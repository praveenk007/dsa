package com.pk.algos;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author praveenkamath
 **/
public class PostfixEvalTest {

    @Test
    public void eval1() {
        final String postfix = "2 3 2 * +";
        assertEquals(8, new PostfixEval().eval(postfix), 0);
    }

    @Test
    public void eval2() {
        final String postfix = "15 3 2 + /";
        assertEquals(3, new PostfixEval().eval(postfix), 0);
    }

    @Test
    public void eval3() {
        final String postfix = "15 3 2 + -";
        assertEquals(10, new PostfixEval().eval(postfix), 0);
    }

    @Test
    public void eval4() {
        final String postfix = "7 8 + 3 2 + /";
        assertEquals(3, new PostfixEval().eval(postfix), 0);
    }

    @Test
    public void eval5_noSpaceOperators() {
        final String postfix = "7 8 + 3 2 +/";
        assertEquals(3, new PostfixEval().eval(postfix), 0);
    }
}
