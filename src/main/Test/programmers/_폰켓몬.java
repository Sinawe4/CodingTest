package main.Test.programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _폰켓몬 {
    public static void main(String[] args) {

    }
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        for (int loop : nums)
            set.add(loop);
        if (set.size() >= nums.length/2)
            answer = nums.length/2;
        else
            answer = set.size();

        return answer;
    }
}
