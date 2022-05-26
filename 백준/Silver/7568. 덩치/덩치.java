import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] height = new int[count];
        int[] weight = new  int[count];
        int[] rank = new int[count];
        for (int i = 0; i < count; i++){
            height[i] = sc.nextInt();
            weight[i] = sc.nextInt();
        }
        for (int i = 0; i < count; i++){
            rank[i] = 1;
            for (int j = 0 ; j < count; j++){
                if (i==j)
                    continue;
                if (height[i] < height[j] && weight[i] < weight[j])
                    rank[i]++;
            }
            System.out.println(rank[i]);
        }
    }
}

