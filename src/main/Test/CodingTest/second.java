package main.Test.CodingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class second {

    public static int solution(String[] scores) {
        int answer = scores.length; //모든 참가자들의 갯수 확인

        for (int i = 0; i < scores.length; i++) {     // scores의 길이만큼 반복
            if (countChar(scores[i], 'F') >= 2) { // F가 2이상일경우 탈락
                answer--;
            } else if (countChar(scores[i],'A') >= 2 && countChar(scores[i],'F') < 2) {
                continue;
            } else {
                if (average(scores[i])) {
                    continue;
                } else {
                    answer--;
                }
            }
        }

        return answer;
    }

    // 신입 개발자들의 면접 점수가 평균 이상이면 true, 아닐경우 false를 리턴하는 함수
    public static boolean average(String list) {
        boolean acceptance = true; // 기본값 설정
        Map<Character, Integer> map = new HashMap<>(); // 맵 선언
        String[] listArray = list.split(""); // 문자열을 배열로 바꾼다
        Arrays.sort(listArray); // 바꾼 배열을 정렬
        int sum = 0;

        // 선언한 맵에 등급에 따른 점수 넣어주기
        for (int i = 0; i < 6; i++) {
            map.put((char) (65 + i), 5 - i);
        }

        for (int i = 1; i < listArray.length - 1; i++) {
            sum += map.get(listArray[i].charAt(0));
        }

        if (sum / (listArray.length - 2) < 3) {
            acceptance = false;
        }


        return acceptance;
    }

    // 특정 문자의 갯수 확인용 메소드
    public static int countChar(String str, char ch) {
        return str.length() - str.replace(String.valueOf(ch), "").length();
    }
}
