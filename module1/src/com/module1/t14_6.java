package com.module1;

import java.util.Scanner;

public class t14_6 {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        System.out.print(N & (N - 1));
    }
}
