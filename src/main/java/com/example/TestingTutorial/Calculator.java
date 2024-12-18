package com.example.TestingTutorial;

public class Calculator {


    public int add(int x, int y){
        return x+y;
    }

    public int subtract(int x, int y){
        return x-y;
    }

    public int multiply(int x, int y){
        return x*y;
    }

    int addManyNumbers(int...nums){
        int sum = 0;
        for( int num:nums){
            sum += num;
        }
        return sum;

    }
    public boolean isEven(int x){
        return x % 2 == 0;
    }

    public boolean isOdd(int y) {
        return y % 2 != 1;
    }
}
