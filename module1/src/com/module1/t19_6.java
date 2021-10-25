package com.module1;

public class t19_6 {
    public static void main(String[] args) {
        int[] t = {200, -5555 , 4852, -5555, 15, 78, 65};
        minToBegin(t);
    }

    public static void minToBegin(int[] x) {
        int min = x[0], index = -1;
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= min) continue;
            min = x[i];
            index = i;
        }
        System.out.print(min + " ");
        for (int i = 0; i < x.length; i++) {
            if (index == i) continue;
            System.out.print(x[i] + " ");
        }
    }
}
