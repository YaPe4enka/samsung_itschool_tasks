package com.module1;

import java.util.Scanner;

public class t17_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(), b = scn.nextInt(), counter = 0;
        while (a > 0) {
            a -= b;
            if (a < 0) break;
            counter++;
        }
        if (a == 0) b = 0;
        System.out.print(counter + " " + Math.abs(b + a));
    }
}
