package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTestGetFood {

    @Mock
    private Feline feline;

    @Test
    public void whatEatCat() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedWhatEatCat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedWhatEatCat);
        assertEquals(expectedWhatEatCat, cat.getFood());
    }
}