package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[] {2,3,7,2};
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(average, 3.5, 0);
    }
}