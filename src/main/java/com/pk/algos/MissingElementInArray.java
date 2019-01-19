package com.pk.algos;

/**
 * @author praveenkamath
 **/
public class MissingElementInArray {

    public int getMissing(int arr[]) {
        if(arr == null || arr.length == 0) {
            return -1;
        }
        for(int index =  1; index <= arr.length; index++) {
            if(index != arr[index-1]) {
                return index;
            }
        } return 0;
    }
}
