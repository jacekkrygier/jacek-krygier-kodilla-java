package com.kodilla.testing.collection;

import java.util.*;
import java.lang.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> evenNumbers = new ArrayList<Integer>();
        for (int n=0; n < numbers.size(); n++) {
           int checkedValue = numbers.get(n);
            if (checkedValue % 2 == 0) {
                evenNumbers.add(checkedValue);
            }
        }
        return evenNumbers;
    }
}
