package main.Test.CodeUp;
// https://codeup.kr/problem.php?id=1087

import java.util.Scanner;

public class CodeUp_1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum= 0 ;
        int i = 1;
        int num = sc.nextInt();
        while (true){
            sum += i;
            if (num <= sum)
                break;
            i++;
        }
        System.out.println(sum);
    }
}
