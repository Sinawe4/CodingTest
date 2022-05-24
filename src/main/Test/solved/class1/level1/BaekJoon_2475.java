package main.Test.solved.class1.level1;

import java.util.Scanner;

public class BaekJoon_2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] point = new int[5];
        for (int i = 0; i < 5; i++)
            point[i] = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += point[i] * point[i];
        }
        System.out.println(sum%10);
    }
}

