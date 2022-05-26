package main.Test.solved.class2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BaekJoon_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        int count = sc.nextInt();
        int sequence = sc.nextInt();

        for (int i = 1; i <= count; i++)
            queue.add(i);

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('<');

        while (queue.size() > 1){
            for (int i = 0; i < sequence-1;i++){
                int val = queue.poll();
                queue.offer(val);
            }
            stringBuilder.append(queue.poll()).append(", ");
        }
        stringBuilder.append(queue.poll()).append('>');
        System.out.println(stringBuilder);
    }
}

