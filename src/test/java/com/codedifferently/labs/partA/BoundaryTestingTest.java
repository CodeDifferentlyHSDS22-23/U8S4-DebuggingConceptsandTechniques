package com.codedifferently.labs.partA;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex02.BoundaryTesting;

public class BoundaryTestingTest {
    @Test
    public void boundaryTest01(){
        String expected = "Bad request: 1582 2\n" +
                "Bad request: 1583 0\n" +
                "Bad request: 1583 13\n" +
                "Valid request\n" +
                "Valid request";
        String actual = BoundaryTesting.boundaryTesting();
        Assertions.assertEquals(expected, actual);
    }
}
