package com.npadhya.practice.matrix;

import java.util.ArrayList;
import java.util.List;

public class NqueenProblem {

    public static boolean nQueenPlaement(int col){
        if(col <= 3){
            return false;
        }

        if (placeQueen(col,0)){
            return true;
        }
        return false;
    }

    private static boolean placeQueen(int col, int currentCol){
        List<List<Boolean>> queens = new ArrayList<List<Boolean>>();
        if(currentCol>col){
            return true;
        }
        int row = 0;
        while(row < col){
            List<Boolean> rows = new ArrayList<Boolean>();
            rows.add(row,true);
            queens.add(currentCol,rows);
            if(isSafeToPlace(queens,row,currentCol) && placeQueen(col,currentCol++)){
                return true;
            }
            //rows.remove(row);
            queens.remove(currentCol);
            //queens.set(row,cols);
            row++;
        }
        return true;
    }

    private static boolean isSafeToPlace(List<List<Boolean>> queens, int row, int col){
        if(queens.size() == row){
            return false;
        }

        for(int i = 0 ; i < queens.size(); i++){
            for(int j = 0; j < queens.get(i).size();j++){
                if(queens.get(j).get(i)){
                    return false;
                }
                if(queens.get(j).get(i))
            }
        }

        return true;
    }
}
