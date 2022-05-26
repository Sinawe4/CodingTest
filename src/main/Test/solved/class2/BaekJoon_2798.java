package main.Test.solved.class2;

import java.util.Scanner;

public class BaekJoon_2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int max = sc.nextInt();
        int[] point = new int[count];
        for (int i = 0; i < count; i++)
            point[i] = sc.nextInt();
        System.out.println(search(count,max,point));
    }
    public static int search(int count, int max, int[] point){
        int sum = 0;
        int past = 0;
        for (int i = 0; i < count-2; i++){
            for (int j = i+1; j < count- 1; j++){
                for (int t = j+1; t < count; t++){

                    sum = point[i] + point [j] + point[t];

                    if (max == sum)
                        return sum;

                    if (past < sum && sum < max)
                        past = sum;
                }
            }
        }
        return past;
    }
}




