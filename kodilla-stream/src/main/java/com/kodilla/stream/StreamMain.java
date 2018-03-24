package com.kodilla.stream;

import com.kodilla.stream.beautifier.BeautifyingMethods;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;


public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("jacek krygier",(text -> text.toUpperCase()));
        poemBeautifier.beautify("jacek krygier",(text -> text + "!!!"));
        poemBeautifier.beautify("jacek krygier", BeautifyingMethods::addABC);
        poemBeautifier.beautify("jacek krygier", BeautifyingMethods::addEmo);
        poemBeautifier.beautify("JaCek KryGier", (text -> text.toLowerCase()));


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
