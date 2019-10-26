package com.pk.algos;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

/**
 * @author praveenkamath
 **/

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MatrixPathFinderTest {

    @Test
    public void test1_positive() {
        final int[][] arr = {
                {0,1,1,0},
                {0,1,1,1},
                {0,0,1,1},
                {0,0,1,1}
        };
        int startRow = 0;
        int startCol = 1;
        int endRow   = 3;
        int endCol   = 2;
        int actual  = new MatrixPathFinder().processor(arr, startRow, startCol, endRow, endCol);
        assertEquals(8 ,actual);
    }

    @Test
    public void test1_negative() {
        final int[][] arr = {
                {0,1,1,0},
                {0,1,1,1},
                {0,0,1,1},
                {0,0,1,0}
        };
        int startRow = 0;
        int startCol = 1;
        int endRow   = 3;
        int endCol   = 2;
        int actual  = new MatrixPathFinder().processor(arr, startRow, startCol, endRow, endCol);
        assertNotEquals(1 ,actual);
    }

    @Test
    public void same_destination_positive() {
        final int[][] arr = {
                {0,1,1,0},
                {0,1,1,1},
                {0,0,1,1},
                {0,0,1,0}
        };
        int startRow = 0;
        int startCol = 1;
        int endRow   = 0;
        int endCol   = 1;
        int actual  = new MatrixPathFinder().processor(arr, startRow, startCol, endRow, endCol);
        assertEquals(1 ,actual);
    }

    @Test
    public void same_destination_negative() {
        final int[][] arr = {
                {0,1,1,0},
                {0,1,1,1},
                {0,0,1,1},
                {0,0,1,0}
        };
        int startRow = 0;
        int startCol = 1;
        int endRow   = 0;
        int endCol   = 1;
        int actual  = new MatrixPathFinder().processor(arr, startRow, startCol, endRow, endCol);
        assertNotEquals(0 ,actual);
    }
}
