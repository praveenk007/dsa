package com.pk.algos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author praveenkamath
 **/
public class MatrixPathFinder {

    private static List<Adjacent> visited = new ArrayList<>();

    public int processor(int[][] arr, int startRow, int startCol, int endRow, int endCol) {
        return calc(arr, startRow, startCol, endRow, endCol, 0);
    }

    private int calc(int[][] arr, int startRow, int startCol, int endRow, int endCol, int total) {
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
        if(startCol + 1 < arr[startRow].length && arr[right.getRowNum()][right.getColNum()] == 1 && !visited.contains(right)) {
            adjacents.add(right);
        }
        if(startRow - 1 >= 0 && arr[above.getRowNum()][above.getColNum()] == 1 && !visited.contains(above)) {
            adjacents.add(above);
        }
        if(startRow + 1 < arr[startCol].length && arr[below.getRowNum()][below.getColNum()] == 1 && !visited.contains(below)) {
            adjacents.add(below);
        }
        if(startCol - 1 >= 0 && arr[left.getRowNum()][left.getColNum()] == 1 && !visited.contains(left)) {
            adjacents.add(left);
        }
        return adjacents;
    }

    class Adjacent {

        public Adjacent(int rowNum, int colNum) {
            this.rowNum = rowNum;
            this.colNum = colNum;
        }

        @Override
        public int hashCode() {
            return getRowNum() + getColNum();
        }

        @Override
        public boolean equals(Object obj) {
            if(obj == null) return false;
            return ((Adjacent) obj).getColNum() == this.getColNum() && ((Adjacent) obj).getRowNum() == this.getRowNum();
        }

        private int rowNum;

        private int colNum;

        public int getRowNum() {
            return rowNum;
        }

        public void setRowNum(int rowNum) {
            this.rowNum = rowNum;
        }

        public int getColNum() {
            return colNum;
        }

        public void setColNum(int colNum) {
            this.colNum = colNum;
        }
    }


}

