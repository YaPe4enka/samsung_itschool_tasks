package com.module1;

import java.util.Scanner;

public class t18_4 {
    public static void main(String[] args) {
        int N = new Scanner(System.in).nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = 4 + 3 * i;
        }
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
