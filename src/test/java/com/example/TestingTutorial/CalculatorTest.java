package com.example.TestingTutorial;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    Calculator c = new Calculator();

    @BeforeAll
    public  static void beforeAllTest(){
        System.out.println("This is executed before all test case");
    }
    @AfterAll
    public  static void afterAllTest(){
        System.out.println("This is executed after all test case");
    }

    @BeforeEach
    public void beforeEveryTest(){
        System.out.println("This is executed before every test case");
    }
    @AfterEach
    public void afterEachTest(){
        System.out.println("This is executed after every test case");
    }

@Test
    public void testadd_when_nums_are_positive(){
    System.out.println("Test 1");
        int x = 5;
        int y = 10;
        int expected = 15;
        int actual = c.add(5,10);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSubtract(){
        System.out.println("Test 2");
       int x = 10;
       int y = 5;
       int expected = 5;
       int actual = c.subtract(10,5);

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void isEven_when_testCase_isEven(){
        System.out.println("Test 3");

          int x = 10;
          boolean actual = c.isEven(10);

        Assertions.assertTrue(actual);


    }
    @Test

    public void isEven_when_testCase_isOdd(){
        System.out.println("Test 4");

        int y = 11;
        boolean actual = c.isOdd(11);

        Assertions.assertFalse(actual);


    }
}
