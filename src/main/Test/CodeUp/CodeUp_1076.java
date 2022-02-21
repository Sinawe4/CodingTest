package main.Test.CodeUp;

// https://codeup.kr/problem.php?id=1076

import java.util.Scanner;

public class CodeUp_1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char alphabet = sc.next().charAt(0);
        char start = 'a';

        do {
            System.out.println(start);
            start++;
        }
        while (start <= alphabet);
    }
}
