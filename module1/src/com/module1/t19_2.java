package com.module1;

public class t19_2 {
    public static void main(String[] args) {
        System.out.print(SumOfSeven(0, 100));
    }

    public static int SumOfSeven(int a, int b) {
        int res = 0;
        for (int i = a; i <= b; i++) {
            if (i % 7 != 0 || (i >= 100 || i <= 10)) continue;
            res += SumOfDigits(i);
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
