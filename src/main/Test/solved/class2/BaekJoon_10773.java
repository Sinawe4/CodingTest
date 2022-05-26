package main.Test.solved.class2;

import java.util.Scanner;
import java.util.Stack;

public class BaekJoon_10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int sum = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < count; i++){
            int num = sc.nextInt();
            if  (num == 0)
                stack.pop();
            else
                stack.push(num);
        }
        for (int i:stack) {
            sum+=i;
        }

        System.out.println(sum);
    }
}

