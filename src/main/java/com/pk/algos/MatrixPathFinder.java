package com.pk.algos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author praveenkamath
 **/
public class MatrixPathFinder {

    private static List<Adjacent> visited = new ArrayList<>();

    public static void main(String[] args) {
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
        //op expected - 4
        final MatrixPathFinder pathFinder = new MatrixPathFinder();
        int total  = pathFinder.processor(arr, startRow, startCol, endRow, endCol);
        System.out.println("op: " + total);
    }

    private int processor(int[][] arr, int startRow, int startCol, int endRow, int endCol) {
        return calc(arr, startRow, startCol, endRow, endCol, 0);
    }

    private int calc(int[][] arr, int startRow, int startCol, int endRow, int endCol, int total) {
        if(arr[startRow][startCol] == 0) {
            return 0;
        }
        if(startRow == endRow && startCol == endCol) {
            return 1;
        }
        final List<Adjacent> adjacents = findAdjacents(arr, startRow, startCol);
        if(adjacents.isEmpty()) {
            return 0;
        }
        final Adjacent current = new Adjacent(startRow, startCol);
        visited.add(current);
        for(Adjacent adjacent: adjacents) {
            total = total + processor(arr, adjacent.getRowNum(), adjacent.getColNum(), endRow, endCol);
            visited.remove(adjacent);
        }
        return total;
    }

    private List<Adjacent> findAdjacents(int[][] arr, int startRow, int startCol) {

        final List<Adjacent> adjacents = new ArrayList<>();
        final Adjacent right = new Adjacent(startRow, startCol+1);
        final Adjacent left = new Adjacent(startRow, startCol-1);
        final Adjacent above = new Adjacent(startRow-1, startCol);
        final Adjacent below = new Adjacent(startRow+1, startCol);
        if(startCol + 1 < arr[startRow].length && !visited.contains(right)) {
            adjacents.add(right);
        }
        if(startRow - 1 >= 0 && !visited.contains(above)) {
            adjacents.add(above);
        }
        if(startRow + 1 < arr[startCol].length && !visited.contains(below)) {
            adjacents.add(below);
        }
        if(startCol - 1 >= 0 && !visited.contains(left)) {
            adjacents.add(left);
        }
        return adjacents;
    }
}
