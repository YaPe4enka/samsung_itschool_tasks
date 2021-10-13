package com.module1;

import java.util.Scanner;

public class t14_2 {
    public static void main(String[] args) {
        byte n = new Scanner(System.in).nextByte();
        if (n != 0) System.out.print(2 << (n - 1));
        else System.out.print(1);
    }
}
