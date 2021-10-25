package com.module1;

public class t19_4 {
    public static void main(String[] args) {
        BinFraction(0.1, 10);
    }

    public static void BinFraction(double x, int n) {
        if (n <= 0) return;
        x *= 2;
        System.out.print((int) x);
        x = x - (int) x;
        n--;
        BinFraction(x, n);
    }
}
