package main.Test.CodeUp;

// https://codeup.kr/problem.php?id=1089

import java.util.Scanner;

public class CodeUp_1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();

        for (int i = 1; i < third; i++)
            first += second;
        System.out.println(first);
    }
}
