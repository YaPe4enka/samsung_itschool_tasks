package com.module1;

import java.util.Scanner;

public class t17_2 {
    public static void main(String[] args) {
        String[] res = new Scanner(System.in).nextLine().split("\\s+");
        int counter = 0;
        for(int i = 0; i < res.length; i++) {
            int j = Integer.parseInt(res[i]);
            if (j > 10) counter += j;
            if (j % 5 == 0) break;
        }
        System.out.print(counter);
    }
}
