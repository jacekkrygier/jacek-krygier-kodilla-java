package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    private List<Integer> possibleValues = new ArrayList<>();
    public static int EMPTY = -1;
    private int value;
}