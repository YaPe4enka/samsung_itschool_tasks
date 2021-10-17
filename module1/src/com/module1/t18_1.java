package com.module1;

import java.util.Scanner;

public class t18_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = Integer.parseInt(scn.nextLine());
        String[] arr = scn.nextLine().split("\\s+");
        String res = "NO";
        int X = Integer.parseInt(scn.nextLine());
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(arr[i]) == X) {
                res = Integer.toString(i + 1);
                break;
            }
        }
        System.out.print(res);
    }
}
