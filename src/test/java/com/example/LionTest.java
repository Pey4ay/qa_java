package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;
//Так как наш класс Lion имеет входные данные, то параметризыем его, где будем передавать пол животного и
//сравнивать его реальный результат с ожидаемым
@RunWith(Parameterized.class)
public class LionTest {

    //Мок необходим для внешнего класса, так как мы проверяем работу класса Lion
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    private Feline feline;

    //Параметризация
    private final String sex;
    private final boolean hasMane;

    public LionTest(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] whatSexHaveLion(){
        return new Object[][] {
                {"Самец", true}, //если мы передаем пол - самец, то метод на выходе должен выдать значение true
                {"Самка", false}, // если самка - false
        };
    }

    @Test
    public void whatCanDoLion() throws Exception {
        //Создаем объект
        Lion lion = new Lion(feline, sex);

        //Делаем моки для методов из внешних классов
        Mockito.when(feline.getKittens()).thenReturn(1);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of( "Рыба", "Птицы", "Животные"));

        //Выводим результаты работы наших методово класса Lion
        System.out.println(lion.getFood());
        System.out.println(lion.getKittens());

        //Сравниваем ожидаемый результат работы метода и реальный
        assertEquals(hasMane, lion.doesHaveMane());
    }
}