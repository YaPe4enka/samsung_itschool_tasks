package com.module1;

import java.util.Scanner;

public class task_1_6 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        while (n >= 86400) n -= 86400;
        System.out.print(String.format("%d:%02d:%02d", n / 3600, (n % 3600) / 60, n % 60));
    }
}
