class Solution {
    public int solution(String name) {
        int answer = 0;
        
        for (int i = 0; i < name.length(); i++) {
            int move = name.charAt(i) - 'A';
            answer += Math.min(move, 26 - move);
        }
        
        int cursor = name.length() - 1;
        
        for (int i = 0; i < name.length(); i++) {
            int next = i + 1;
            
            while (next < name.length() && name.charAt(next) == 'A') {
                next++;
            }
            
            int move = Math.min((i * 2 + name.length() - next), (i + (name.length() - next) * 2));
            cursor = Math.min(cursor, move);
        }
        
        answer += cursor;
        
        return answer;
    }
}