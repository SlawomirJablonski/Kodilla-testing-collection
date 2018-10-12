package com.kodilla.testing.collection;

import org.junit.*;
import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> givenList = new ArrayList<>();

        //When
        ArrayList<Integer> expectedArray = new ArrayList<>();

        ArrayList<Integer> result = exterminator.exterminate(givenList);

        System.out.println("Testing " + result);

        //Then
        Assert.assertEquals(expectedArray, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        Integer firstNumber = 5;
        Integer secondNumber = 6;
        OddNumbersExterminator cos = new OddNumbersExterminator();
        ArrayList<Integer> givenList = new ArrayList<>();
        givenList.add(firstNumber);
        givenList.add(secondNumber);

        //When
        ArrayList<Integer> expectedArray = new ArrayList<>();
        expectedArray.add(6);

        ArrayList<Integer> result = cos.exterminate(givenList);

        System.out.println("Testing " + result);

        //Then
        Assert.assertEquals(expectedArray, result);
    }
}
