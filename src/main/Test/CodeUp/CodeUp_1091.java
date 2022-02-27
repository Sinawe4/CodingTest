package main.Test.CodeUp;

// https://codeup.kr/problem.php?id=1091

import java.util.Scanner;

public class CodeUp_1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long first = sc.nextLong();
        int second = sc.nextInt();
        int third = sc.nextInt();
        int four = sc.nextInt();

        for (int i = 1; i < four; i++){
            first *= second;
            first += third;
        }
        System.out.println(first);
    }
}
