package com.module1;

import java.util.Scanner;

public class t17_3 {
    public static void main(String[] args) {
        String[] num = new Scanner(System.in).nextLine().split("\\s+");
        int counter = 0;
        for(int i = 0; i < num.length; i++) {
            int j = Integer.parseInt(num[i]);
            if (getCountsOfDigits(j) != 2) break;
            counter += sum(j);
        }
        System.out.print(counter);
    }

    public static int sum(int N) {
        int sum = 0;
        while (N != 0) {
            sum += N % 10;
            N /= 10;
        } return sum;
    }

    // https://habr.com/en/post/269237/
    public static int getCountsOfDigits(long number) {
        return (number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }
}
