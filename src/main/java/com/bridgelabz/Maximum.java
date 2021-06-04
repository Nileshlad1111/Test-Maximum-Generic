package com.bridgelabz;

public class Maximum <E extends Comparable> {
    E firstValue;
    E secondValue;
    E thirdValue;

    //contractor
    public Maximum() {
    }
    
    //contractor
    public Maximum(E firstValue , E secondValue , E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public E findMaximum(){
        E maximum = findMaximum(firstValue, secondValue, thirdValue);
        printMax(maximum);
        return maximum;
    }

    public <E> void printMax(E maximum){
        System.out.println(maximum);
    }

    public static < E extends Comparable> E findMaximum (E firstValue , E secondValue , E thirdValue) {
        E maximumValue = firstValue;
        if (secondValue.compareTo(maximumValue) > 0)
            maximumValue = secondValue;
        if (thirdValue.compareTo(maximumValue) > 0)
            maximumValue = thirdValue;
        return maximumValue;
    }

    public static void main(String[] args){
        System.out.println("Wel come generic using test maximum problem");
    }
}

