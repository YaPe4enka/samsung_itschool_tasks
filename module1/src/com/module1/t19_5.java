package com.module1;

public class t19_5 {
    public static void main(String[] args) {
        int[] test = {4875, 9578, 4215, 7548, 2015, 7458};
        System.out.print(avgOf4Digit(test));
    }

    public static double avgOf4Digit(int[] x) {
        double res = -1, sum = 0;
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] <= 0 || getCountsOfDigits(x[i]) != 4) continue;
            sum += x[i];
            count++;
        }
        if (count > 0) res = Math.round((sum / count) * 100.0) / 100.0;
        return res;
    }

    public static int getCountsOfDigits(int number) {
        return(number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
    }
}
