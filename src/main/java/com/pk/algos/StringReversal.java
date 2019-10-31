package com.pk.algos;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author praveenkamath
 **/
public class StringReversal {

    public String reverse(final String str) {
        final char[] asciis = new char[str.length()];
        AtomicInteger atomicInteger = new AtomicInteger(str.length());
        str.chars().forEach(ascii -> asciis[atomicInteger.decrementAndGet()] = (char) ascii);
        return String.valueOf(asciis);
    }

    public static void main(String[] args) {
        System.out.println(new StringReversal().reverse("hey 8 Lol"));
    }
}
