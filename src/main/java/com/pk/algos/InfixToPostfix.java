package com.pk.algos;

import java.util.*;

/**
 * @author praveenkamath
 **/
public class InfixToPostfix {

    private static Map<String, Integer>  precedence = new HashMap<>();

    private static final Stack<String> OPERATORS_STACK = new Stack<>();

    private static final List<String>       POSTFIX_LIST = new ArrayList<>();

    private static final String DIGITS = "1234567890";

    public InfixToPostfix() {
        precedence.put("*", 3);
        precedence.put("/", 3);
        precedence.put("-", 2);
        precedence.put("+", 2);
        precedence.put("(", 1);
    }

    public String getPostfix(final String infix) {
        final String[] infixChars = infix.split("");
        for (String character: infixChars) {
            if(DIGITS.contains(character)) {
                POSTFIX_LIST.add(character);
            } else if("(".equals(character)) {
                OPERATORS_STACK.push(character);
            } else if(")".equals(character)) {
                String top = OPERATORS_STACK.pop();
                while(!top.equals("(")) {
                    POSTFIX_LIST.add(top);
                    top = OPERATORS_STACK.pop();
                }
            } else {
                while(!OPERATORS_STACK.isEmpty() && precedence.get(OPERATORS_STACK.peek()) >= precedence.get(character)) {
                    POSTFIX_LIST.add(OPERATORS_STACK.pop());
                } OPERATORS_STACK.push(character);
            }
        }

        while(!OPERATORS_STACK.isEmpty()) {
            POSTFIX_LIST.add(OPERATORS_STACK.pop());
        }
        StringBuilder sb = new StringBuilder();
        for (String str: POSTFIX_LIST) {
            sb.append(str);
        }
        return sb.toString();
    }
}
