package com.module1;

import java.util.Scanner;

public class t182_4 {
    public static void main(String[] args) {
        byte n = new Scanner(System.in).nextByte();
        int res = 1;
        for (byte i = 1; i <= n; i++) {
            res *= i;
        }
        System.out.print(res);
    }
}
