package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args){

        Calculator calculator = new Calculator();

        //Test 1
        int sum = calculator.addAToB(9,8);
        if (sum==9 + 8) {
            System.out.println("test OK, addition works correctly");
        } else {
            System.out.println("Error");
        }

        //Test 2
        int difference = calculator.substractAFromB(9,8);
        if (difference==9 - 8) {
            System.out.println("test OK, substraction works correctly");
        } else {
            System.out.println("Error");
        }
        System.out.println("End of testing");

    }
}
