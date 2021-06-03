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
}
