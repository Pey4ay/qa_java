package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTestGetKittens {

    @Mock
    private Feline feline;

    @Test
    public void whatFamilyHaveLion() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        int expectedResultWithGetKittensNumber = 1;
        Mockito.when(feline.getKittens()).thenReturn(expectedResultWithGetKittensNumber);
        assertEquals(expectedResultWithGetKittensNumber, lion.getKittens());
    }
}