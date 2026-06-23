class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int num = 0;
        
        for (String s : polynomial.split(" ")) {
            if (s.equals("+")) continue;
            
            if (s.contains("x")) {
                x = s.equals("x") ? x + 1 : x + Integer.parseInt(s.substring(0, s.indexOf("x")));
            } else {
                num += Integer.parseInt(s);
            }
        }
        
        answer = (x == 1) && (num == 0) ? "x" : (x == 1) && (num != 0) ? "x + " + num : (x > 1) && (num == 0) ? x + "x" : (x > 1) && (num > 0) ? x + "x + " + num : num+"";
        
        return answer;
    }
}