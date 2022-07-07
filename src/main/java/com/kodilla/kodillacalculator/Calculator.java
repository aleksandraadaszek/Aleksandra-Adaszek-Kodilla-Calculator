package com.kodilla.kodillacalculator;

public class Calculator {

    public int addAToB (int a, int b){
        return a + b;
    }
    public int subtractAFromB(int a, int b){
        return b - a;
    }
    public static void main (String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.addAToB(7,8);
        int result2 = calculator.subtractAFromB(7,8);
        System.out.println("The result of adding 'a' to 'b' is:" + " " +  result1 + ".");
        System.out.println("The result of subtracting 'a' from 'b' is:" + " " +  result2 + ".");
    }
}

