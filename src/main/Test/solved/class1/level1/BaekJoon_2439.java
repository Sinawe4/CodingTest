package main.Test.solved.class1.level1;

import java.util.Scanner;

public class BaekJoon_2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            for (int j = 4; j != i; j--){
                System.out.printf(" ");
            }
            for (int j = 0; j <= i; j++)
                System.out.printf("*");
            System.out.println("");
        }
    }
}

