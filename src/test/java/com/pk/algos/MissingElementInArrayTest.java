package com.pk.algos;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

/**
 * @author praveenkamath
 **/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MissingElementInArrayTest {

    @Test
    public void threeElementsPass() {
        int arr[] = {1,3};
        int mising = new MissingElementInArray().getMissing(arr);
        assertEquals(2, mising);
    }

    @Test
    public void threeElementsFail() {
        int arr[] = {1,3};
        int mising = new MissingElementInArray().getMissing(arr);
        assertNotEquals(1, mising);
    }

    @Test
    public void noMissingPass() {
        int arr[] = {1,2,3};
        int mising = new MissingElementInArray().getMissing(arr);
        assertEquals(0, mising);
    }

    @Test
    public void noMissingFail() {
        int arr[] = {1,2,3};
        int mising = new MissingElementInArray().getMissing(arr);
        assertNotEquals(1, mising);
    }

    @Test
    public void nullPass() {
        int mising = new MissingElementInArray().getMissing(null);
        assertEquals(-1, mising);
    }

    @Test
    public void nullFail() {
        int mising = new MissingElementInArray().getMissing(null);
        assertNotEquals(1, mising);
    }
}
