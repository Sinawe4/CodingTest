package main.Test.solved.class1;

import java.util.Scanner;

public class BaekJoon_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        float[] point = new float[count];
        float sum = 0;
        for (int i = 0; i < count; i++)
            point[i] = sc.nextInt();
        int max = 0;
        for (int i = 0; i < count; i++){
            if (max < point[i])
                max = (int)point[i];
        }
        for (int i = 0; i < count; i++){
            sum += point[i]/max*100;
        }
        System.out.println(sum/count);
    }
}
