package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;
import static org.junit.Assert.*;

//Данный тест без параметризации, так как методы класса не требуют входных данных
@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Test
    public void whatCatCanDo() throws Exception {
        //Создаем объект
        Cat cat = new Cat(feline);
        //Мок для вывода метода из класса Feline
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        //Вывод результата работы метода getFood из тестируемого класса, который работает с моком
        System.out.println(cat.getFood());
        //Сравниваем ожидаемый результат работы метода и реальный
        assertEquals("Мяу", cat.getSound());
    }

}