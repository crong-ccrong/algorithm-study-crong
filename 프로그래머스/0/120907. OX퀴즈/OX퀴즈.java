import java.util.*;

class Solution {
    public String[] solution(String[] quiz) {
        ArrayList<String> answer = new ArrayList<>();
        
        for (String str : quiz) {
            String[] s = str.split(" ");
            int X = Integer.parseInt(s[0]);
            int Y = Integer.parseInt(s[2]);
            String operator = s[1];
            int Z = Integer.parseInt(s[4]);

            switch(operator) {
                case "+" :
                    answer.add(X + Y == Z ? "O" : "X");
                    break;
                case "-" :
                    answer.add(X - Y == Z ? "O" : "X");
                    break;
            }
        }
        
        return answer.toArray(new String[0]);
    }
}