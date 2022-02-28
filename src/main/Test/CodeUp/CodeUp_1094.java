package main.Test.CodeUp;

// https://codeup.kr/problem.php?id=1094

import java.util.Scanner;

public class CodeUp_1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] student = new int[count];

        for (int i = 0; i < count; i++){
            int j = sc.nextInt();
            student[i] = j;
        }

        for (int i = --count; i >= 0; i--)
            System.out.printf("%d ",student[i]);
    }
}
