package main.Test.solved.class1.level1;

import java.util.Scanner;

public class BaekJoon_1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        String str = (A>B) ? ">" : (A<B) ? "<" : "==";
        System.out.println(str);

    }
}
