package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTestGetFood {

    @Mock
    private Feline feline;

    @Test
    public void whatEatLion() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        List<String> expectedWhatEatLion = List.of("Птицы", "Животные", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedWhatEatLion);
        assertEquals(expectedWhatEatLion, lion.getFood());
    }
}