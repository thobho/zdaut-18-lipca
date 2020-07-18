package com.sda.objects;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class VetServiceTest {

    VetService vetServiceUnderTest;

    @BeforeEach
    public void setUp(){
        vetServiceUnderTest = new VetService();
    }

    @Test
    public void shouldReturnPriceForDogSmallerThan10kg(){
        //przygotowanie danych
        Dog examplePatient = new Dog("", 9);
        double expectedPrice = 90;

        //wywołanie metody testowej
        double actualPrice = vetServiceUnderTest.getTreatmentPrice(examplePatient);

        //sprawdzenie poprawności danych
        assertEquals(expectedPrice, actualPrice);
    }

}