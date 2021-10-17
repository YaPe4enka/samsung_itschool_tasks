package com.module1;

import java.util.Scanner;

public class t18_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = Integer.parseInt(scn.nextLine());
        String[] arr = scn.nextLine().split("\\s+");
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
