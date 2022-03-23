package main.Test.programmers;

import java.util.Arrays;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc .nextInt();
        int[] human = new int[count];
        for (int i = 0; i < count; i++)
            human[i] = sc.nextInt();

        Arrays.sort(human);

        int sum = 0;
        int other = 0;

        for (int i = 0; i < count; i++){
            sum += other + human[i];
            other += human[i];
        }

        System.out.println(sum);
    }
}
