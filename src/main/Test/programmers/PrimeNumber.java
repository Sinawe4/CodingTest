package main.Test.programmers;

import java.util.Scanner;


// https://programmers.co.kr/learn/courses/30/lessons/12921

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for(int i = 0; i <= n; i++){
            if(PrimeNumber(i) ==true)
                count++;
        }

        System.out.println(count);

    }

    public static boolean PrimeNumber (int number) {
        if(number < 2) {
            return false;
        }

        for(int i = 2; i * i <= number; i++) {
            if(number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
