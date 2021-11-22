package com.module1;

import java.util.Scanner;

public class t182_1 {
    public static void main(String[] args) {
        System.out.println(new StringBuilder(Integer.toBinaryString(new Scanner(System.in).nextInt())).reverse().toString());
    }
}
