import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        int box = 1;
        Deque<Integer> sub = new ArrayDeque<>();
        
        for (int target : order) {
            while (box <= order.length && box < target) {
                sub.push(box);
                box++;
            }
            
            if (target == box) {
                answer++;
                box++;
            } else if (!sub.isEmpty() && target == sub.peek()) {
                answer++;
                sub.pop();
            } else {
                break;
            }
        }
        
        return answer;
    }
}