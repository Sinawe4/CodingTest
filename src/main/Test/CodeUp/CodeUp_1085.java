package main.Test.CodeUp;

// https://codeup.kr/problem.php?id=1085

import java.util.Scanner;

public class CodeUp_1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextInt();
        double b = sc.nextInt();
        double s = sc.nextInt();
        double c = sc.nextInt();
        double sum = (h*b*s*c) / 8;
        for (int i = 0; i < 2; i++){
            sum /= 1024;
        }
        System.out.println(Math.round(sum*10)/10.0 + " MB");

    }
}
