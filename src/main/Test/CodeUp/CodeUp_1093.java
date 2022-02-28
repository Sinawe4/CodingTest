package main.Test.CodeUp;

// https://codeup.kr/problem.php?id=1093

import java.util.Scanner;

public class CodeUp_1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student = new int[24];

        int count = sc.nextInt();

        for (int i = 0; i < count; i++){
            int j = sc.nextInt();
            student[j-1] +=1;
        }

        for (int i = 0; i < 24; i++)
            System.out.printf("%d ",student[i]);
    }
}
