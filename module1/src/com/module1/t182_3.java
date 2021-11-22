package com.module1;

import java.util.Scanner;

public class t182_3 {
    public static void main(String[] args) {
        byte N = new Scanner(System.in).nextByte();
        for (int i = 1; i <= N*N; i+=N+1) {
            System.out.print(i + " ");
        }
    }
}
