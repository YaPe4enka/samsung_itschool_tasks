package com.module1;

import java.util.Scanner;

public class t16_1 {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        String ans = "OTHER";
        if (-1 < N && N < 10) ans = "DIGIT";
        else if (N > 0 && N < 100) ans = "NUM";
        System.out.print(ans);
    }
}
