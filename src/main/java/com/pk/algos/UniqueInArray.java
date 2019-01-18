package com.pk.algos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author praveenkamath
 **/
public class UniqueInArray<T> {

    public void printUnqiueSetImpl(T objects[]) {
        final Set<T> tempSet = new HashSet<>();
        Arrays.stream(objects).forEach(elem -> {
            if(tempSet.contains(elem)) {
                System.out.println(elem);
            } else {
                tempSet.add(elem);
            }
        });
    }

    public boolean printUnqiueSetImplReturn(T objects[]) {
        final Set<T> tempSet = new HashSet<>();
        boolean isDuplicate = false;
        for(T elem: objects) {
            if (tempSet.contains(elem)) {
                System.out.println(elem);
                isDuplicate = true;
            } else {
                tempSet.add(elem);
            }
        } return isDuplicate;
    }

    public boolean printUnique_AdjacentDuplicates(T objects[]) {
        int index = 1;
        int lastIndex = objects.length - 1;
        boolean isDuplicate = false;
        if(objects[0] == objects[lastIndex]) {
            System.out.println(objects[0]);
            index = 2;
            lastIndex--;
            isDuplicate = true;
        }
        for(;index <= lastIndex; index++) {
            if(objects[index] == objects[index-1]) {
                System.out.println(objects[index]);
                isDuplicate = true;
            }
        } return isDuplicate;
    }
}
