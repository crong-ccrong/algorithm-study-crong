import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int bridgeWeight = 0;
        int index = 0;
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < bridge_length; i++) {
            queue.offer(0);
        }
        
        while (index < truck_weights.length) {
            answer++;
            
            bridgeWeight -= queue.poll();
            
            int truck = truck_weights[index];
            if (bridgeWeight + truck <= weight) {
                queue.offer(truck);
                bridgeWeight += truck;
                index++;
            } else {
                queue.offer(0);
            }
        }
        
        answer += bridge_length;
        
        return answer;
    }
}