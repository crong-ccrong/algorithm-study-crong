import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] clothes = new int[n + 2];
        
        for (int i : lost) {
            clothes[i]--;
        }
        
        for (int i : reserve) {
            clothes[i]++;
        }
        
        for (int i = 1; i <= n; i++) {
            if (clothes[i] == -1) {
                if (clothes[i - 1] == 1) {
                    clothes[i - 1]--;
                    clothes[i]++;
                } else if (clothes[i + 1] == 1) {
                    clothes[i + 1]--;
                    clothes[i]++;
                }
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if (clothes[i] >= 0) answer++;
        }
        
        return answer;
    }
}