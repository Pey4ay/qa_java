package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTestEatMeat {

    @Test
    public void whatEatFeline() throws Exception {
        Feline feline = new Feline();
        List<String> expectedWhatEatFeline = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedWhatEatFeline, feline.eatMeat());
    }
}