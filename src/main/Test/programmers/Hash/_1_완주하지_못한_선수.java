package main.Test.programmers.Hash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _1_완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant)
            map.put(player, map.getOrDefault(player,0)+1);
        for (String player : completion)
            map.put(player, map.get(player)-1);

        Iterator<Map.Entry<String ,Integer>> tier = map.entrySet().iterator();

        while (tier.hasNext()){
            Map.Entry<String,Integer> entry = tier.next();
            if (entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        String[] part = {"leo", "kiki", "eden"};
        String[] comp = {"eden", "kiki"};
        _1_완주하지_못한_선수 sol = new _1_완주하지_못한_선수();
        System.out.println(sol.solution(part, comp));
    }
}

