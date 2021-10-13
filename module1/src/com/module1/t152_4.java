package com.module1;

import java.util.*;

public class t152_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in).useLocale(Locale.US);
        double x = scn.nextDouble(), y = scn.nextDouble();
        if ((y > Math.pow(x, 2) - 2) && ((x <= 0 && y < -x) || (x > 0 && y > x))) System.out.print("YES");
        else System.out.print("NO");
    }
}
