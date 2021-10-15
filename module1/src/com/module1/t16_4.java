package com.module1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class t16_4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt(), B = scn.nextInt();
        double res = 0;

        // No solution check:
        if ((A == 0 && B <= A) || (A <= 0 && B <= 0)) {System.out.print("no such x"); return;}
        res = -((double) B / (double) A);
        if (res <= 0 || (A >= 0 && B >= 0)) {System.out.print("any x"); return;}

        BigDecimal res_rounded = new BigDecimal(res);
        res_rounded = res_rounded.setScale(1, RoundingMode.HALF_UP);

        if (A > 0 && B < 0) {
            System.out.print("x<" + -res_rounded.doubleValue() + " or x>" + res_rounded.doubleValue()); return;
        } else if (A < 0 && B > 0) {
            System.out.print(-res_rounded.doubleValue() + "<x<" + res_rounded.doubleValue()); return;
        }
        //      A      B
        //      -      -              + no such x
        //      -      +              + d1...X...d2
        //      +      -              + (x...d1) or (x...d2)
        //      +      +              + any x
        //      0      -              + no such x
        //      0      +              - any x
        //      +      0              + any x
        //      -      0              + no such x
    }
}