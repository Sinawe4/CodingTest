package main.Test.solved.class1.level1;

import java.util.Scanner;

public class BaekJoon_2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] point = new int[9];
        for (int i = 0; i < 9; i++)
            point[i] = sc.nextInt();
        int max = 0;
        int count = 0;
        for (int i = 0; i < 9; i++) {
            if (max < point[i]) {
                max = point[i];
                count = i;
            }
        }
        System.out.println(max);
        System.out.println(count+1);
    }
}

