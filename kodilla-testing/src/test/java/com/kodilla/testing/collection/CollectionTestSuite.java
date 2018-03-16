package com.kodilla.testing.collection;

import java.lang.*;
import java.util.*;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

public class CollectionTestSuite {
    static int testcounter = 0;

    @Before
    public void before(){
        testcounter++;
        System.out.println("Test Case " + testcounter + " : begin");
    }
    @After
    public void after(){
        System.out.println("Test Case " + testcounter + " : end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end. Everything works correctly");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList() {
        System.out.println("Starting testOddNumbersExterminatorEmptyList");

        //Given
        List<Integer> emptyList = new ArrayList<Integer>();
        OddNumbersExterminator test1Exterminator = new OddNumbersExterminator();

        //When
        List<Integer> evenNumbers = test1Exterminator.exterminate(emptyList);

       //Then
        Assert.assertEquals(0, evenNumbers.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Starting testOddNumbersExterminatorNormalList");

        //Given
        List<Integer> theList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        OddNumbersExterminator test2Exterminator = new OddNumbersExterminator();

        //When
        List<Integer> evenNumbers = test2Exterminator.exterminate(theList);
        List<Integer> caseEvenNumbers = Arrays.asList(2,4,6,8,10);

        //Then
        Assert.assertEquals(evenNumbers, caseEvenNumbers);
    }
}
