package com.module1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class t18_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = Integer.parseInt(scn.nextLine()), amount = 0, total = 0;
        String[] arr = scn.nextLine().split("\\s+");
        for (int i = 0; i < N; i++) {
            if (Math.abs(Integer.parseInt(arr[i])) % 2 != 1) continue;
            total += Integer.parseInt(arr[i]);
            amount++;
        }
        if (amount > 0) System.out.print(new BigDecimal((double) total / amount).setScale(2, RoundingMode.HALF_UP));
        else System.out.print("NO");
    }
}