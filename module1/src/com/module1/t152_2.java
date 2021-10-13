package com.module1;

import java.util.*;

public class t152_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in).useLocale(Locale.US);
        double x = scn.nextDouble(), y = scn.nextDouble();

        // y > 0
        // y < 0.5
        // y = sin x

        // x > 0
        // x < PI

        if (x < Math.PI && x > 0 && Math.sin(x) > y && y > 0 && y < 0.5) System.out.print("YES");
        else System.out.print("NO");
    }
}
