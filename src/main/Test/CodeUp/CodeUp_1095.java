package main.Test.CodeUp;

// https://codeup.kr/problem.php?id=1095

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodeUp_1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int[] student = new int[count];
        int min = 999;
        for (int i = 0; i < count; i++){
            int j = sc.nextInt();
            student[i] = j;
        }

        for (int i = 0; i < count; i++){
            min = Math.min(min,student[i]);
        }
        System.out.println(min);
    }
}
