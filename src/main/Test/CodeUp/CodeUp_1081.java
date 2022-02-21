package main.Test.CodeUp;

import java.util.Scanner;

// https://codeup.kr/problem.php?id=1081
public class CodeUp_1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        for (int i = 1; i <= first; i++)
            for (int j = 1; j <= second; j++)
                System.out.println(i+" "+j);
    }
}
