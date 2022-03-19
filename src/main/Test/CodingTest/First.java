package main.Test.CodingTest;

public class First {
    public static void main(String[] args) {
        int[] coin = {50,150,200,100,300,200};
        System.out.println(solution(coin));

    }

    public static int solution(int[] coinPriceList){
        int answer = 0;

        for ( int i = 0; i < coinPriceList.length -1; i++){
            System.out.println(answer);
            if (coinPriceList[i] < coinPriceList[i+1]){
                answer += coinPriceList[i+1];
                System.out.println(1);
            }
            else {
                answer += coinPriceList[i];
                i++;
                System.out.println(2);
            }
        }
        return answer;
    }
}
