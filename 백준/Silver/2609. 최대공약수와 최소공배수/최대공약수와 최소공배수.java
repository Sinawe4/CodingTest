import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int factor = gcd(a,b);
        System.out.println(factor);
        System.out.println(a*b/factor);
    }
    public static int gcd(int a, int b){
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}

