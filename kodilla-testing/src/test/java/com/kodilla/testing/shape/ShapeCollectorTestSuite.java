package com.kodilla.testing.shape;

import com.kodilla.testing.shape.*;
import org.junit.*;
import java.util.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Starting test: " + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test " + testCounter + " completed");
    }

    @Test
    public void testAddFigure() {

        //Given
        Square square = new Square(5);
        ShapeCollector shapeCollector1 = new ShapeCollector();

        //When
        shapeCollector1.addFigure(square);
        Shape testedShape = shapeCollector1.getFigure(0);

        //Then
        Assert.assertEquals(square, testedShape);

    }

    @Test
    public void testRemoveFigure() {

        //Given
        Triangle triangle = new Triangle(3,2);
        ShapeCollector shapeCollector1 = new ShapeCollector();
        shapeCollector1.addFigure(triangle);

        //When
        List<Shape> shapesAfterRemove = shapeCollector1.removeFigure(triangle);

        //Then
        Assert.assertEquals(0, shapesAfterRemove.size());

    }

    @Test
    public void testGetFigure() {

        //Given
        Circle circle = new Circle(4);
        ShapeCollector shapeCollector1 = new ShapeCollector();
        shapeCollector1.addFigure(circle);

        //When
        Shape testedShape = shapeCollector1.getFigure(0);

        //Then
        Assert.assertEquals(circle, testedShape);

    }

    @Test
    public void testShowFigure() {

        //Given
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(3,2);
        Square square = new Square(5);
        ShapeCollector shapeCollector1 = new ShapeCollector();
        shapeCollector1.addFigure(circle);
        shapeCollector1.addFigure(triangle);
        shapeCollector1.addFigure(square);

        //When
        List<Shape> testedList = shapeCollector1.showFigures();
        List<Shape> testedList2 = new ArrayList<Shape>();
        testedList2.add(circle);
        testedList2.add(triangle);
        testedList2.add(square);

        //Then
        Assert.assertEquals(testedList, testedList2);

    }

}

