package main.Test.solved.class1;

import java.util.Scanner;

public class BaekJoon_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ln = sc.nextLine();
        ln = ln.trim();
        String a[] = ln.split(" ");
        if (a.length == 1 && a[0].equals(""))
            System.out.println(0);
        else
            System.out.println(a.length);
    }
}
