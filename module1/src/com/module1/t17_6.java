package com.module1;

import java.util.Scanner;

public class t17_6 {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextShort(), counter = 0;
        for (int i = 25; i < N; i++) {
            if (i % 2 == 0) counter += i;
        }
        System.out.print(counter);
    }
}
