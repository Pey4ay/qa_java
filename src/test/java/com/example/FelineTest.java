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
@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    //Мок для класса энимал, так как он внешний класс, а мы проверяем работу класса Feline
    @Mock
    Animal animal;

    @Test
    public void checkHowWorkFeline() throws Exception {
        //Создаем объект
        Feline feline = new Feline();

        //вызываем мок, который будет передавать статичный список с едой
        Mockito.when(animal.getFood("Хищник")).thenReturn(List.of( "Рыба", "Птицы", "Животные"));

        //Выводим результаты работы наших методов класса Feline
        System.out.println(feline.eatMeat());
        System.out.println(feline.getKittens());

        //Сравниваем необходимое семейство и семейство которое содержится в методе. Они должны быть одинаковыми.
        assertEquals("Ошибка в выборе семейства","Кошачьи", feline.getFamily());
    }
}