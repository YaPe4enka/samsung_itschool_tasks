package com.module1;

import java.util.Scanner;

public class t14_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long A = scn.nextLong();
        byte i = scn.nextByte();
        System.out.print(-(1 << i) & A);
    }
}
