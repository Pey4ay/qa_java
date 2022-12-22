package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class FelineTestGetFamily {

    @Test
    public void checkHowWorkFeline(){
        Feline feline = new Feline();
        assertEquals("Ошибка в выборе семейства","Кошачьи", feline.getFamily());
    }
}