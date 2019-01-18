package com.pk.algos;

import com.pk.algos.LargestSumContiguousSubarray;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;

/**
 * @author praveenkamath
 **/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LargestSumContiguousSubarrayTest {

    @Test
    public void test_positives() {
        int arr[] = {9, 5, 4, 6, 8};
        int max = LargestSumContiguousSubarray.getMaxSum(arr);
        assertEquals(32, max);
    }

    @Test
    public void test_negatives() {
        int arr[] = {-9, -5, -6, -8};
        int max = LargestSumContiguousSubarray.getMaxSum(arr);
        assertEquals(-5, max);
    }

    @Test
    public void test_mix() {
        int arr[] = {-9, 6, -1, 5};
        int max = LargestSumContiguousSubarray.getMaxSum(arr);
        assertEquals(10, max);
    }
}
