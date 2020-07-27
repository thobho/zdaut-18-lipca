package com.sda.arraysum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArraySumTest {

    //null -> 0
    //[] -> 0
    //[103] -> 103
    //[1,4,7] -> 12

    ArraySumService arraySumService;

    @BeforeEach
    public void setUp(){
        arraySumService = new ArraySumService();
    }

    @Test
    public void shouldReturnZeroForNull(){

        int actualResult = arraySumService.sumArrayElements(null);

        assertEquals(0, actualResult);
    }

    @Test
    public void shouldReturnZeroForEmptyArray(){

        int[] emptyArray = new int[0];

        int actualResult = arraySumService.sumArrayElements(emptyArray);

        assertEquals(0, actualResult);
    }




}
