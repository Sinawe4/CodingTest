package main.Test.CodeUp;

// https://codeup.kr/problem.php?id=1090

import java.util.Scanner;

public class CodeUp_1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long first = sc.nextLong();
        int second = sc.nextInt();
        int third = sc.nextInt();

        for (int i = 1; i < third; i++)
            first *= second;
        System.out.println(first);
    }
}
