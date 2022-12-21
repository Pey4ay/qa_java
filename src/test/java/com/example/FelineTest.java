package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

//Данный тест не требует входный данных, так как его методы ничего не принимают, следовательно,
//тест будет без параметризации
public class FelineTest {

    @Test
    public void checkHowWorkFeline() throws Exception {
        //Создаем объект
        Feline feline = new Feline();

        //Выводим результаты работы наших методов класса Feline
        System.out.println(feline.eatMeat());
        System.out.println(feline.getKittens());

        //Сравниваем необходимое семейство и семейство которое содержится в методе. Они должны быть одинаковыми.
        assertEquals("Ошибка в выборе семейства","Кошачьи", feline.getFamily());
    }
}