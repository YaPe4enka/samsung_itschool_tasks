package com.module1;

import java.util.Scanner;

public class t18_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = Integer.parseInt(scn.nextLine()), counter = 0;
        boolean execute = false;
        String[] arr = scn.nextLine().split("\\s+");
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(arr[i]) % 2 == 0) {counter += Integer.parseInt(arr[i]); execute = true;}
        }
        if (execute) System.out.print(counter);
        else System.out.print("NO");
    }
}
