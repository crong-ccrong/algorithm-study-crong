import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        for (String word : dic) {
            Map<String, Integer> map = new HashMap<>();

            for (String s : spell) {
                map.put(s, 1);
            }
            
            for (String ch : word.split("")) {
                if (!map.containsKey(ch)) {
                    break;
                }
                
                map.put(ch, map.get(ch) - 1);
                
                if (map.get(ch) < 0) break;
            }
            
            boolean flag = map.values().stream().allMatch(value -> value == 0);
            if (flag) {
                return 1;
            }
        }
        
        return 2;
    }
}