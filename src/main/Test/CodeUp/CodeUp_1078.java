package main.Test.CodeUp;

import java.util.Scanner;

// https://codeup.kr/problem.php?id=1078
public class CodeUp_1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <=count; i++){
            if (i%2==0)
                sum+=i;
        }
        System.out.println(sum);
    }
}
