package com.company;

public class FaceDrawing extends Main {
    private String replace;
    private int row;
    private int column;
    public FaceDrawing(String replace, int row, int column) {

this.replace = replace;
this.row = row;
this.column = column;

    }
    public String getReplace(){
        return replace;
    }
    public int getrow(){
        return row;
    }
    public int getcolumn(){
        return column;
    }

}
