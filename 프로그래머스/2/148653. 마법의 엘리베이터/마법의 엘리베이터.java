class Solution {
    public int solution(int storey) {
        int answer = 0;
        
        while (storey > 0) {
            int n1 = storey % 10;
            int n10 = (storey / 10) % 10;
            
            if (n1 > 5 || (n1 == 5 && n10 >= 5)) {
                answer += 10 - n1;
                storey += 10 - n1;
            } else {
                answer += n1;
            }
            
            storey /= 10;
        }
        return answer;
    }
}