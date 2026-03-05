import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String X, String Y) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        
        for (char c : X.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for (char c : Y.toCharArray()) {
            if (map.containsKey(c) && map.get(c) > 0) {
                map.put(c, map.get(c) -1);
                list.add(c);
            }
        }
        
        list.sort(Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        
        answer = sb.length() == 0 ? "-1" : sb.toString();
        
        if (answer.charAt(0) == '0') {
            answer = "0";
        }
        
        return answer;
    }
}