package main.Test.solved.class2;

import java.io.IOException;
import java.util.Scanner;

public class BaekJoon_2292 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int range = 2;

        if (N == 1)
            System.out.println(1);
        else{
            while (range <= N){
                range = range+(6*count);
                count++;
            }
            System.out.println(count);
        }
    }
}

