package com.module1;

import java.util.Scanner;

public class t17_8 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine(), res = "NO";
        int[] N = new int[input.length()];
        for (int i = 0; i < input.length(); i++) { N[i] = input.charAt(i) - '0'; }
        for (int i = 0; i < N.length; i++) {
            if (N[i] % 2 == 1) res = Integer.toString(N[i]);
        }
        System.out.print(res);
    }
}