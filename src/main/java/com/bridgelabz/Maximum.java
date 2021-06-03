package com.bridgelabz;

public class Maximum {
    public static void main(String[] args) {
        System.out.println("Wel come generic using test maximum problem");
    }

    public static < E extends Comparable> E findMaximum(E firstValue , E secondValue , E thirdValue) {
        E maximumValue = firstValue;
        if (secondValue.compareTo(maximumValue) > 0)
            maximumValue = secondValue;
        if (thirdValue.compareTo(maximumValue) > 0)
            maximumValue = thirdValue;
        return maximumValue;
    }
}

