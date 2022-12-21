package com.example;

import org.junit.Test;

import static org.junit.Assert.*;


public class LionTest {

    @Test
    public void whatCanDoLion() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline, "Самец");

        boolean expectedResult = true;
        assertEquals(expectedResult, lion.hasMane);

    }
}