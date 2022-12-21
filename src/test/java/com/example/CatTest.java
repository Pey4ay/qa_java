package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class CatTest {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Feline feline;


    private final String whatSoundHaveCat;

    public CatTest(String whatSoundHaveCat) {
        this.whatSoundHaveCat = whatSoundHaveCat;
    }

    @Parameterized.Parameters
    public static Object[][] whatSound(){
        return new Object[][] {
                {"Мяу"},
                {"Гав"},
                {"Йоу"},
        };
    }

    @Test
    public void whatCatCanDo() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        String expectedResult = whatSoundHaveCat;
        System.out.println(cat.getFood());
        assertEquals(expectedResult, cat.getSound());
    }

}