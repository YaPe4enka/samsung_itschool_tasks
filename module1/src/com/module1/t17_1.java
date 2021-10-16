package com.module1;

import java.util.Scanner;

public class t17_1 {
    public static void main(String[] args) {
        String[] res = new Scanner(System.in).nextLine().split("\\s+");
        int counter = 0;
        for(int i = 0; i < res.length; i++) {
            counter++;
            if (Integer.parseInt(res[i]) < 0) break;
        }
        System.out.print(counter);
    }
}
