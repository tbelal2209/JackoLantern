package com.company;

public class FaceDrawing {
    private String[][] faceFeatures;

    public FaceDrawing(String[][] faceFeatures){
        this.faceFeatures = faceFeatures;
    }

    public void fill(String str){
        for (int x = 0; x< faceFeatures.length; x++){
            for (int y = 0; y < faceFeatures[x].length; y++){
                faceFeatures[x][y] = str;
            }
        }
    }

    public void edit(String replace, int row, int column){
        faceFeatures[row][column] = replace;
    }

    public String toString(){
        String output = "";
        for(int i = 0; i< faceFeatures.length; i++){
            for (int n = 0; n< faceFeatures[i].length; n ++){
                output = output + faceFeatures[i][n];
            }
            output+= '\n';
        }
        return output;
    }


}
