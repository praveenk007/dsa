package com.pk.algos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author praveenkamath
 **/
public class Competition {

    public static void main(String[] args) {
        final List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);
        integers.add(1);
        integers.add(2);
        integers.add(4);
        integers.add(2);
        System.out.println(mult(integers));

    }

    static String mult(final List<Integer> prices) {
        for(int index = 0; index <= prices.size(); index++) {
            for(int j = index + 1; j < prices.size(); j++) {
                if(prices.get(index) < prices.get(j)) {
                    prices.set(index, prices.get(index) - prices.get(j));
                }
            }
        }
        summation(prices);
    }

    private static Integer summation(List<Integer> prices) {
        int num = 0;
        for(Integer price: prices) {
            num = num + price;
        } return num;
    }
}
