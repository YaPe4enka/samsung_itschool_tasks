package com.module1;

import java.util.Scanner;

public class t17_9 {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int[] N = new int[input.length()];
        int res = 9;
        for (int i = 0; i < input.length(); i++) {N[i] = input.charAt(i) - '0';}
        for (int i = 0; i < N.length; i++) {if (N[i] < res && N[i] > 0) res = N[i];}
        System.out.print(res);
    }
}
