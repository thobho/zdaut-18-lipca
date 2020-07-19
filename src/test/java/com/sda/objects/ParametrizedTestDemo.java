package com.sda.objects;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.fail;

public class ParametrizedTestDemo {


    @ParameterizedTest
    @ValueSource(strings = {"Ala", "na", "kota"})
    public void test(String testData) {
        //tu nie będzie danych testowych

        System.out.println(testData);
    }


}
