package main.Test.CodeUp;

// https://codeup.kr/problem.php?id=1082

import java.util.Scanner;

public class CodeUp_1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt(16);

        for (int i = 1; i < 16; i++)
            System.out.println(Integer.toHexString(number).toUpperCase()+"*"+Integer.toHexString(i).toUpperCase()+"="+Integer.toHexString(number*i).toUpperCase());
    }
}
