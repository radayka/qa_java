package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

public class ParametrizedLionTest {
    @RunWith(Parameterized.class)
    public static class ParameterizedLionTest {
        private final String sex;
        private final boolean hasMane;

        public ParameterizedLionTest(String sex, boolean hasMane) {
            this.sex = sex;
            this.hasMane = hasMane;
        }

        @Parameterized.Parameters(name = "Пол: {0}, грива: {1}")
        public static Object[][] lionTestData() {
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false}
            };
        }

        @Test
        public void doesHaveManeReturnCorrectValue() throws Exception {
            Feline feline = Mockito.mock(Feline.class);
            Lion lion = new Lion(sex, feline);
            boolean actual = lion.doesHaveMane();
            Assert.assertEquals(hasMane, actual);
        }
    }
}
