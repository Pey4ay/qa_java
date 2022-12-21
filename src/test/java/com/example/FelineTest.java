package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void checkHowWorkFeline(){
        Feline feline = new Feline();

        String expectedResults = "Кошачьи";
        assertEquals(expectedResults, feline.getFamily());
    }
}