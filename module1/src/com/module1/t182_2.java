package com.module1;

import java.util.Arrays;
import java.util.Scanner;

public class t182_2 {
    public static void main(String[] args) {
        String[] arr = new Scanner(System.in).nextLine().split("\\s+");
        int[] arr_sorted = new int[Integer.parseInt(arr[0]) - 1];
        int res = 0;
        for (int i = 1; i < arr.length; i++) {
            arr_sorted[i - 1] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr_sorted);

        for (int i = 0; i < Integer.parseInt(arr[0]); i++) {
            if (contains(arr_sorted, i + 1)) continue;
            System.out.print(i + 1);
        }
    }

    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
}
