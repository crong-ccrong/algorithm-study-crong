class Solution {
    public String solution(String s, int n) {
        String answer = "";
                
        for (char c : s.toCharArray()) {
            
            if (c == ' ') {
                answer += " ";
            } else if (c >= 'a' && c <= 'z') {
                answer += (char)('a' + (c - 'a' + n) % 26);
            } else if (c >= 'A' && c <= 'Z') {
                answer += (char)('A' + (c - 'A' + n) % 26);
            }
        }
        
        return answer;
    }
}