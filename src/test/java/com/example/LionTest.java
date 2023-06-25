package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LionTest {
    Feline feline = new Feline();

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void doesHaveManeIsTrue() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeIsFalse() throws Exception {
        Lion lion2 = new Lion("Самка", feline);
        assertFalse(lion2.doesHaveMane());
    }


    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    @Test(expected = Exception.class)
    public void exceptionWorks() throws Exception {
         new Lion("123", feline);
    }
}