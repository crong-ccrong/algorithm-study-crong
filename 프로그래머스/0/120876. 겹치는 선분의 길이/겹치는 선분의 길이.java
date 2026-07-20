import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int[] line : lines) {
            int start = line[0];
            int end = line[1];
            
            for (int i = start; i < end; i++) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
        }
        
        for (int value : map.values()) {
            if (value >= 2) answer++;
        }
        
        
        return answer;
    }
}