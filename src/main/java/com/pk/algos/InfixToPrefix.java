package com.pk.algos;

/**
 * @author praveenkamath
 **/
public class InfixToPrefix {

    public String getPrefix(final String infix) {
        // 2+3*4
        // Reverse: 4*3+2
        // Postfix: 43*2+
        // Reverse postfix : +2*34 = prefix
        final StringBuilder reversedSb = new StringBuilder(new StringReversal().reverse(infix));
        for (int index = 0; index < reversedSb.length(); index++) {
            if (reversedSb.charAt(index) == '(') {
                reversedSb.setCharAt(index, ')');
            } else if (reversedSb.charAt(index) == ')') {
                reversedSb.setCharAt(index, '(');
            }
        }
        final String postFix = new InfixToPostfix().getPostfix(reversedSb.toString());
        return new StringReversal().reverse(postFix);
    }
}
