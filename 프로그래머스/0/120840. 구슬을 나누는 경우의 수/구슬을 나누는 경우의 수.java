class Solution {
    public int solution(int balls, int share) {
        long answer = 1;
        share = Math.min(share, balls - share);
        
        for (int i = 1; i <= share; i++) {
            answer = answer * (balls - i + 1) / i;
        }
        
        return (int) answer;
    }
}