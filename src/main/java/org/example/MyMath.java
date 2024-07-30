package org.example;

public class MyMath {
    public int sum(int[] numbers){
        int sum = 0;
        for(int n : numbers)
            sum += n;
        return sum;
    }
}
