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
    public void givenThreeIntegers_WhenMaximumFoundAtPosition1_ThenReturnMaximumSame() {
        Integer maximumInteger = findMaximum.findMaximumInteger(1, 2, 3);
        Assert.assertEquals((Integer) 3, maximumInteger);
    }
}
