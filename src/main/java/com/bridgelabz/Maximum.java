package com.bridgelabz;

public class Maximum {

    //method of maximum integer value
    public static Integer findMaximumInteger(Integer oneValue, Integer twoValue, Integer threeValue) {
        Integer maximumValue = oneValue;
        if (oneValue.compareTo(maximumValue) > 0)
            maximumValue = twoValue;
        if (threeValue.compareTo(maximumValue) > 0)
            maximumValue = threeValue;
        return maximumValue;
    }
    public static void main(String[] args) {
        Maximum maximum = new Maximum();

    }
}

