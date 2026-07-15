import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        Map<String, String> map = new HashMap<>();
        
        for (String s : record) {
            String[] str = s.split(" ");
            switch (str[0]) {
                case "Enter" :
                case "Change" :
                    map.put(str[1], str[2]);
                    break;
            }
        }
        
        for (String s : record) {
            String[] str = s.split(" ");
            switch (str[0]) {
                case "Enter" :
                    list.add(map.get(str[1]) + "님이 들어왔습니다.");
                    break;
                case "Leave" :
                    list.add(map.get(str[1]) + "님이 나갔습니다.");
                    break;
            }
        }
        
        return list.toArray(new String[0]);
    }
}