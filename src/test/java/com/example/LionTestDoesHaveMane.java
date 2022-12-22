package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTestDoesHaveMane {

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    private Feline feline;

    private final String sex;
    private final boolean hasMane;

    public LionTestDoesHaveMane(String sex, boolean hasMane){
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] whatEqualsSexHaveLion(){
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void whatSexHaveLion() throws Exception {
        Lion lion = new Lion(feline, sex);
        assertEquals(hasMane, lion.doesHaveMane());
    }
}