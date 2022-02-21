package main.Test.CodeUp;

// https://codeup.kr/problem.php?id=1079

import java.util.Scanner;

public class CodeUp_1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String text =sc.next();
            System.out.println(text);
            if (text.equals("q"))
                break;
        }
    }
}
