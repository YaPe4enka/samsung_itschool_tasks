package com.module1;

import java.util.Scanner;

public class task_1_9 {

    public int result = 0;

    public static void main(String[] args) {

        task_1_9 me = new task_1_9();

        me.recursion(new Scanner(System.in).nextInt());
        System.out.print(me.result);
    }

    public void recursion(int a) {
        if (a <= 0) return;
        recursion(a / 10);
        this.result += a % 10;
    }
}
