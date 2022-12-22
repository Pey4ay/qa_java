package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FelineTestGetKittens {

    @Test
    public void whatKittensHaveFeline(){
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
}