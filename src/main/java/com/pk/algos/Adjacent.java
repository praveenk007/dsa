package com.pk.algos;

/**
 * @author praveenkamath
 **/
public class Adjacent {

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
