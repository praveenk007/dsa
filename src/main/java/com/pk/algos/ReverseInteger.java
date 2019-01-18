package com.pk.algos;

/**
 * @author praveenkamath
 **/
public class ReverseInteger {

    public int reverseInt(int number) {
        return recursiveFn(number, number % 10);
    }

    private int recursiveFn(int number, int remainder) {
        if(number < 10) {
            return remainder;
        }
        int quotient = number / 10;
        remainder = (remainder * 10 + quotient % 10);
        return recursiveFn(quotient, remainder);
    }
}
