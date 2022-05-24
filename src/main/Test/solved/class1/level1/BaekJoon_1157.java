package main.Test.solved.class1.level1;

import java.util.Scanner;

public class BaekJoon_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ln = sc.nextLine();
        int[] arr = new int[26];

        for (int i = 0; i <ln.length() ; i ++){
            if (65 <= ln.charAt(i) && ln.charAt(i) <= 90) {
                arr[ln.charAt(i) - 65]++;
            }
            else
                arr[ln.charAt(i)-97]++;

        }

        int max = -1;
        char missingno = '?';

        for (int i = 0; i <26 ; i ++){
            if (arr[i] > max){
                max = arr[i];
                missingno = (char) (i+65);
            }
            else if (arr[i] == max)
                missingno = '?';
        }
        System.out.println(missingno);
    }
}
