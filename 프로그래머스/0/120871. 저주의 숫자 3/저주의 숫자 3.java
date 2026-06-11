class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        while (count < n) {
            answer++;
            
            if (answer % 3 != 0 && !String.valueOf(answer).contains("3")) {
                count++;
            }
        }
        
        return answer;
    }
}