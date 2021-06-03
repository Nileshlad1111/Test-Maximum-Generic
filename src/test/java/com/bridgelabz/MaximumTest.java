package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class MaximumTest {
    Maximum findMaximum = new Maximum();

    //test case not null
    @Test
    public void givenValue_NotNull_Value() {
        findMaximum.findMaximumInteger(1,2,3);
        Assert.assertNotNull(findMaximum);
    }

    //test case 1.1
    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition1_ThenReturnMaximum() {
        Integer max = findMaximum.findMaximumInteger(3, 2, 1);
        Assert.assertEquals((Integer) 3, max);
    }

    //test case 1.2
    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition2_ThenReturnMaximum() {
        Integer max = findMaximum.findMaximumInteger(2, 3, 1);
        Assert.assertEquals((Integer) 3, max);
    }


}
