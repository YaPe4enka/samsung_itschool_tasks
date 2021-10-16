package com.module1;

import java.util.Scanner;

public class t17_5 {
    public static void main(String[] args) {
        System.out.print(makeBinaryString(new Scanner(System.in).nextInt()).length());
    }

    public static String makeBinaryString(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }
        sb.reverse();
        return sb.toString();
    }
}
