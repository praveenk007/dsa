package com.pk.algos;

import java.util.ArrayList;
import java.util.List;

/**
 * @author praveenkamath
 **/
public class MatrixPathFinderList {

    private static List<Adjacent> visited = new ArrayList<>();

    public int processor(List<List<Integer>> arr, int startRow, int startCol, int endRow, int endCol) {
        if(arr.isEmpty() || arr.get(startRow).get(startCol) == 0) {
            return 0;
        } return calc(arr, startRow, startCol, endRow, endCol);
    }

    private int calc(List<List<Integer>> arr, int startRow, int startCol, int endRow, int endCol) {
        int count = 0;
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
            count = count + processor(arr, adjacent.getRowNum(), adjacent.getColNum(), endRow, endCol);
            visited.remove(adjacent);
        }
        return count;
    }

    private List<Adjacent> findAdjacents(List<List<Integer>> arr, int startRow, int startCol) {
        System.out.println(startRow + " " + startCol);
        final List<Adjacent> adjacents = new ArrayList<>();
        final Adjacent right = new Adjacent(startRow, startCol+1);
        final Adjacent left = new Adjacent(startRow, startCol-1);
        final Adjacent above = new Adjacent(startRow-1, startCol);
        final Adjacent below = new Adjacent(startRow+1, startCol);
        if(startCol + 1 < arr.get(startRow).size() && arr.get(right.getRowNum()).get(right.getColNum()) == 1 && !visited.contains(right)) {
            adjacents.add(right);
        }
        /*if(startRow - 1 >= 0 && arr.get(above.getRowNum()).get(above.getColNum()) == 1 && !visited.contains(above)) {
            adjacents.add(above);
        }*/
        if(startRow + 1 < arr.size() && arr.get(below.getRowNum()).get(below.getColNum()) == 1 && !visited.contains(below)) {
            adjacents.add(below);
        }
        /*if(startCol - 1 >= 0 && arr.get(left.getRowNum()).get(left.getColNum()) == 1 && !visited.contains(left)) {
            adjacents.add(left);
        }*/
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

