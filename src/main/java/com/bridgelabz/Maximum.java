package com.bridgelabz;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Wel come generic using test maximum problem");
    }

    //method of maximum integer value
    public static Integer findMaximumInteger(Integer firstValue, Integer secondValue, Integer thirdValue) {
        Integer maximumValue = firstValue;
        if (secondValue.compareTo(maximumValue) > 0)
            maximumValue = secondValue;
        if (thirdValue.compareTo(maximumValue) > 0)
            maximumValue = thirdValue;
        return maximumValue;
    }

    //method of maximum float value
    public static Float findMaximumFloat(Float firstValue, Float secondValue, Float thirdValue) {
        Float maximumValue = firstValue;
        if (secondValue.compareTo(maximumValue) > 0)
            maximumValue = secondValue;
        if (thirdValue.compareTo(maximumValue) > 0)
            maximumValue = thirdValue;
        return maximumValue;
    }

    //method of maximum String value
    public static String findMaximumString(String firstValue, String secondValue, String thirdValue) {
        String maximumValue = firstValue;
        if (secondValue.compareTo(maximumValue) > 0)
            maximumValue = secondValue;
        if (thirdValue.compareTo(maximumValue) > 0)
            maximumValue = thirdValue;
        return maximumValue;
    }

}

