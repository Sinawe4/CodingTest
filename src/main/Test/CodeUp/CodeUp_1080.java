package main.Test.CodeUp;

// https://codeup.kr/problem.php?id=1080

import java.util.Scanner;

public class CodeUp_1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        int sum = 0;
        int i;
        int n;
        for (i = 1; sum < max; i++)
            sum +=i;
        System.out.println(i-1);
    }
}
