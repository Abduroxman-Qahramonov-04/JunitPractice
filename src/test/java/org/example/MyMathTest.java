package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void sum() {
        int[] numbers = {1,2,3};
        MyMath math = new MyMath();
        int result = math.sum(numbers);
        int expectedResult = 6;
        assertEquals(expectedResult,result);
    }
}