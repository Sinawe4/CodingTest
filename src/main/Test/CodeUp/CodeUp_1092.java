package main.Test.CodeUp;

// https://codeup.kr/problem.php?id=1092

import java.util.Scanner;

public class CodeUp_1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for (int i = 1;; i++)
            if (i % a ==0 && i % b == 0 && i % c == 0) {
                System.out.println(i);
                break;
            }
    }
}
