import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        int index = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for (int n : B) {
            if (A[index] < n) {
                answer++;
                index++;
            }
        }
        
        return answer;
    }
}