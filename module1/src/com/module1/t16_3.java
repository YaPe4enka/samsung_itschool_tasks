package com.module1;

import java.util.Scanner;

public class t16_3 {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        System.out.print(result(N + " TORT", N));
    }

    public static String result(String str, int N) {
        String[] end = {"A", "OV"};
        if (N % 10 == 0) return str + end[1];
        if (N % 100 > 20) {
            if (N % 10 > 1) {
                if (N % 10 < 5) return str + end[0];
                return str + end[1];
            }
        } else if (N % 100 > 1) {
            if (N % 100 > 4) return str + end[1];
            return str + end[0];
        }
        return str;
    }
}
