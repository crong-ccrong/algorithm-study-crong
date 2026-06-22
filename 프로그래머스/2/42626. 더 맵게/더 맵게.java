import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int i : scoville) {
            pq.offer(i);
        }
        
        while (pq.size() >= 2 && pq.peek() < K) {
            int min = pq.poll();
            int num = pq.poll();
            pq.offer(min + num * 2);
            answer++;
        }
        
        if (pq.peek() < K) {
            return -1;
        }
        
        return answer;
    }
}