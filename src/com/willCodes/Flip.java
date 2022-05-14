package com.willCodes;

public class Flip {
    //flips a two-dimesional string array horizontally
    public static String[][] flipHori(String[][] array) {
        String[][] flipped = new String[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                flipped[i][j] = array[i][array[i].length - j - 1];
            }
        }
        return flipped;
    }
    //flips a two-dimensional string array vertically
    public static String[][] flipVert(String[][] array) {
        String[][] flipped = new String[array.length][array[0].length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                flipped[i][j] = array[array.length - i - 1][j];
            }
        }
        return flipped;
    }
}

/*
manage seating charts in ClassFlip
Copyright (C) 2021-2022  Shbozz development
*/
