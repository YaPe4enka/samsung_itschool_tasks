package com.module1;

import java.util.Scanner;

public class task_1_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt(), b = scn.nextInt(), n = scn.nextInt(), res = 0;
        res = (b + a * 100) * n;

        System.out.print(res / 100 + " " + res % 100);
    }
}
