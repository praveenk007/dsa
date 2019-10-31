package com.pk.algos;


import java.util.Stack;

/**
 * @author praveenkamath
 **/
public class PostfixEval {

    private final Stack<Float> OPERANDS = new Stack<>();

    public float eval(final String postfix) {
        if(null == postfix || postfix.trim().length() == 0) {
            return 0;
        }
        final String[] strArr = postfix.split(" ");
        for(int index = 0; index < strArr.length; index++) {
            if(isNumeric(strArr[index])) {
                OPERANDS.push(Float.parseFloat(strArr[index]));
            } else {
                strArr[index].chars().forEach(ascii -> {
                    final float head1 = OPERANDS.pop();
                    final float head2 = OPERANDS.pop();
                    OPERANDS.push(operate(head2, head1, String.valueOf((char) ascii)));
                });
            }
        } return OPERANDS.pop();
    }

    private float operate(float a, float b, String operator) {
        if(operator.equals("*")) {
            return a * b;
        } else if(operator.equals("/")) {
            return a / b;
        } else if(operator.equals("+")) {
            return a + b;
        } else if(operator.equals("-")) {
            return a - b;
        } return 0;
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }

}
