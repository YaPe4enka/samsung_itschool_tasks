package com.module1;

public class t19_1 {
    public static void main(String[] args) {

    }

    public static int SumOfDigits(int n) {
        int sum = 0;
        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
