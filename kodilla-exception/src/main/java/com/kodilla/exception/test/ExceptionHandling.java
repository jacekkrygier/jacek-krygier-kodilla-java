package com.kodilla.exception.test;



public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {String result = secondChallenge.probablyIWillThrowException(5, 2);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e + "\nThe numbers are incorrect.");
        } finally {
            System.out.println("Thank you for using this program.");
        }
    }
}

