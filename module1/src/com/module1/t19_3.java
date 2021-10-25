package com.module1;

public class t19_3 {
    public static void main(String[] args) {
        System.out.print(SumOfThirteen(10000));
    }

    public static int SumOfThirteen(int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (SumOfDigits(i) % 13 != 0) continue;
            res++;
        }
        return res;
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
