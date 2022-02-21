package main.Test.CodeUp;

// https://codeup.kr/problem.php?id=1084

import java.util.Scanner;

public class CodeUp_1084 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        int i,j,f,count = 0;
        for (i = 0; i < r ;i++)
            for (j = 0; j < g ; j++)
                for (f = 0; f < b; f++){
                    System.out.println(i+" "+j+" "+f);
                    count++;
                }
        System.out.println(count);
    }
}
