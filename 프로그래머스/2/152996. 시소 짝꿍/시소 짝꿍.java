import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public long solution(int[] weights) {
        long answer = 0;
        long[] count = new long[1001];
        
        for (int weight : weights) {
            count[weight]++;
        }
        
        for (int i = 100; i <= 1000; i++) {
            long people = count[i];
            
            if (people == 0) {
                continue;
            }
            
            answer += people * (people - 1) / 2;
            
            int partner = i * 2;
            
            if (partner <= 1000) {
                answer += people * count[partner];
            }
            
            if ((i * 3) % 2 == 0) {
                partner = i * 3 / 2;
                
                if (partner <= 1000) {
                    answer += people * count[partner];
                }
            }
            
            if ((i * 4) % 3 == 0) {
                partner = i * 4 / 3;
                
                if (partner <= 1000) {
                    answer += people * count[partner];
                }
            }
        }
        
        return answer;
    }
}