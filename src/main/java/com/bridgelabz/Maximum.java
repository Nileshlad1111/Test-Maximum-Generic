package com.bridgelabz;

public class Maximum {

    public void findMaximumInteger()
    {
        int[] array = new int[]{10,20,30};
        int currentMax = array[0];
        for(int index=1;index<=array.length-1;index++){
            if(currentMax < array[index]){
                currentMax = array[index];
            }
        }
        System.out.println("Maximum value is "+ currentMax);
    }
    public static void main(String[] args) {
        Maximum maximum = new Maximum();
        maximum.findMaximumInteger();
    }
}

