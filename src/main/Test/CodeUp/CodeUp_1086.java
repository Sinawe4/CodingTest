package main.Test.CodeUp;

// https://codeup.kr/problem.php?id=1086

import java.util.Scanner;

public class CodeUp_1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        int s = sc.nextInt();
        double sum = (h*b*s) / 8;
        for (int i = 0; i < 2; i++){
            sum /= 1024;
        }
        System.out.printf("%.2f MB",sum);

    }
}
