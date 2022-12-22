package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CatTestGetSound {
    Feline feline;
    @Test
    public void whatSoundHaveCat() throws Exception {
        //Создаем объект
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }
}