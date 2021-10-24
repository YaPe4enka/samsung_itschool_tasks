package com.module1;

import java.util.Scanner;

public class t18_7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        short N = Short.parseShort(scn.nextLine());
        String[] input = scn.nextLine().split("\\s+"), neg_mask = new String[N], pos_mask = new String[N];

        for (int i = 0; i < N; i++) {
            neg_mask[i] = input[i];
            pos_mask[i] = input[i];
            if (Integer.parseInt(input[i]) >= 0) {
                neg_mask[i] = "-";
                continue;
            }
            pos_mask[i] = "-";
        }

        show(neg_mask);
        show(pos_mask);
    }

    public static void show(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == "-") continue;
            System.out.print(arr[i] + " ");
        }
    }
}
