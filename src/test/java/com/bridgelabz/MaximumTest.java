package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    //object
    Maximum maximum = new Maximum();

    //test case not null
    @Test
    public void givenIntegerValue_NotNull_Value() {
        maximum.findMaximum(1 ,2 ,3);
        Assert.assertNotNull(maximum);
    }

    //test case 1.1
    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition1_ThenReturnMaximum() {
        Integer max = maximum.findMaximum(3 , 2 , 1);
        Assert.assertEquals((Integer) 3 , max);
    }

    //test case 1.2
    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition2_ThenReturnMaximum() {
        Integer max = maximum.findMaximum(2 , 3 , 1);
        Assert.assertEquals((Integer) 3 , max);
    }

    //test case 1.3
    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition3_ThenReturnMaximum() {
        Integer max = maximum.findMaximum(1 , 2 , 3);
        Assert.assertEquals((Integer) 3 , max);
    }

    //Test Cases For Float Values
    //test case not null
    @Test
    public void givenFloatValue_NotNull_Value() {
        maximum.findMaximum(1.1f ,2.2f ,3.3f);
        Assert.assertNotNull(maximum);
    }

    //test case 2.1
    @Test
    public void givenThreeFloats_WhenMaximumFoundAtPosition1_ThenReturnMaximum() {
        Float max = maximum.findMaximum(3.1f , 2.4f , 1.3f);
        Assert.assertEquals((Float) 3.1f , max);
    }

    //test case 2.2
    @Test
    public void givenThreeFloats_WhenMaximumFoundAtPosition2_ThenReturnMaximum() {
        Float max = maximum.findMaximum(2.4f , 3.1f , 1.3f);
        Assert.assertEquals((Float) 3.1f , max);
    }

    //test case 2.3
    @Test
    public void givenThreeFloats_WhenMaximumFoundAtPosition3_ThenReturnMaximum() {
        Float max = maximum.findMaximum(1.3f , 2.4f , 3.1f);
        Assert.assertEquals((Float) 3.1f , max);
    }

    //Test Cases For String Values
    //test case not null
    @Test
    public void givenStringValue_NotNull_Value() {
        maximum.findMaximum("apple" ,"peach" ,"banana");
        Assert.assertNotNull(maximum);
    }

    //test case 3.1
    @Test
    public void givenThreeStrings_WhenMaximumFoundAtPosition1_ThenReturnMaximum() {
        String maximum = this.maximum.findMaximum("apple" , "peach", "banana");
        Assert.assertEquals("peach" , maximum);
    }

    //test case 3.2
    @Test
    public void givenThreeStrings_WhenMaximumFoundAtPosition2_ThenReturnMaximum() {
        String maximum = this.maximum.findMaximum("peach" , "apple" , "banana");
        Assert.assertEquals("peach" , maximum);
    }

    //test case 3.3
    @Test
    public void givenThreeStrings_WhenMaximumFoundAtPosition3_ThenReturnMaximum() {
        String maximum = this.maximum.findMaximum("peach" , "banana" , "apple");
        Assert.assertEquals("peach" , maximum);
    }
}
