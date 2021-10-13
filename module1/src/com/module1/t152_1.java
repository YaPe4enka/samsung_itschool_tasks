package com.module1;

import java.util.*;

public class t152_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in).useLocale(Locale.US);
        float x = scn.nextFloat(), y = scn.nextFloat();

        // x^2+y^2=4
        // y = x                x > y
        // x = 2                x < 2

        if (x < 2 && y < x && Math.sqrt(x) + Math.sqrt(y) > 2) System.out.print("YES");
        else System.out.print("NO");
    }
}