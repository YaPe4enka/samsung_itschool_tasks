package com.module1;

import java.util.Scanner;

public class t14_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long A = scn.nextLong(), mask = 0;
        byte i = scn.nextByte();
        for (byte j = 0; j < i; j++) {
            mask += (j != 0) ? 2 << (j - 1) : 1;
        }
        System.out.print(A & mask);
    }
}
