package com.npadhya.practice.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NqueenProblem {

    public static boolean nQueenPlaement(int col){
        if(col <= 3){
            return false;
        }
        int[] placedQueens = new int[col];
        Arrays.fill(placedQueens,Integer.MAX_VALUE);
        return placeQueen(placedQueens,-1);
    }

    private static boolean placeQueen(int[] placedQueens, int col){
        col++;
        int row = 0;
        if(placedQueens[placedQueens.length-1] < Integer.MAX_VALUE){
            return true;
        }

        while(row < placedQueens.length){
            placedQueens[col] = row;
            if(isSafeToPlace(placedQueens,row,col) && placeQueen(placedQueens,col)){
                return true;
            }
            placedQueens[col]=Integer.MAX_VALUE;
            row++;
        }

        return false;
    }

    private static boolean isSafeToPlace(int[] queens, int row, int col){
        if(col != 0 && queens[col-1] == row){
            return false;
        }

        for(int i = 0 ; i < col; i++){
            int prevCols = i;
            int prevRows = queens[i];
            if(prevRows == row || Math.abs(prevCols - col) == Math.abs(prevRows - row)){
                return false;
            }
        }

        return true;
    }

}
