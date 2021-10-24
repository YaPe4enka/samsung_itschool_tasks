package com.module1;

import java.util.*;

public class t18_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        short N = Short.parseShort(scn.nextLine());
        String[] input = scn.nextLine().split("\\s+");
        int[] res = new int[N];

        for (int i = 0; i < N; i++) {
            res[i] = Integer.parseInt(input[i]);
        }

        System.out.print(mode((res)));
    }

    public static int mode(int a[]) {
        int maxValue = 0, maxCount = 0;

        for (int i = 0; i < a.length; ++i) {
            int count = 0;
            for (int j = 0; j < a.length; ++j) {
                if (a[j] == a[i]) ++count;
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = a[i];
            }
        }

        return maxValue;
    }
}













//public class t18_6 {
//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        short N = Short.parseShort(scn.nextLine());
//        String[] arr = scn.nextLine().split("\\s+");
//        int[][] mask = new int[arr.length][2];
//        int[] biggest_num = {0, 0};
//        for (int i = 0; i < arr.length; i++) {
//            boolean executable = true;
//            for (int j = 0; j < mask.length; j++) {
//                int handler = Integer.parseInt(arr[i]);
//                if (handler == mask[j][0]) mask[j][1]++;
//                if (mask[j][1] > biggest_num[1]) {
//                    biggest_num[0] = mask[j][0];
//                    biggest_num[1] = mask[j][1];
//                }
//                if (handler == mask[j][0]) {executable = false; break;}
//            }
//            if (executable) {
//                mask[i][0] = Integer.parseInt(arr[i]);
//                mask[i][1]++;
//                for (int j = 0; j < mask.length; j++) {
//                    if (mask[j][1] > biggest_num[1]) {
//                        biggest_num[0] = mask[j][0];
//                        biggest_num[1] = mask[j][1];
//                        break;
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < mask.length; i++) {
//            System.out.print(mask[i][0] + " ");
//            System.out.println(mask[i][1]);
//        }
//        System.out.println(biggest_num[0]);
//    }
//}




//    Scanner scn = new Scanner(System.in);
//    short N = Short.parseShort(scn.nextLine());
//    String[] input = scn.nextLine().split("\\s+");
//    int[] res = new int[N], counter = {0, 0}, counter_max = {0, 0};
//
//        for (int i = 0; i < N; i++) {
//        res[i] = Integer.parseInt(input[i]);
//        }
//        Arrays.sort(res);
//
//
//        for (int i = N; i < N; i++) {
//        if (res[i] != counter[0]) {
//        counter[0] = res[i];
//        counter[1] = 1;
//        } else counter[1]++;
//        if (counter_max[1] <= counter[1]) {
//        counter_max[0] = counter[0];
//        counter_max[1] = counter[1];
//        }
//        System.out.println(Arrays.toString(counter_max) + "    " + Arrays.toString(counter));
//        }
////        for (int i = 0; i < N; i++) {
////            if (Integer.parseInt(input[i]) == )
////        }
//        System.out.println(counter_max[0]);



/*
public class t18_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        short N = Short.parseShort(scn.nextLine());
        String[] input = scn.nextLine().split("\\s+");
        int[] res = new int[N], counter = {0, 0}, counter_max = {0, 0};

        for (int i = 0; i < N; i++) {
            res[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(res);
    }
} */