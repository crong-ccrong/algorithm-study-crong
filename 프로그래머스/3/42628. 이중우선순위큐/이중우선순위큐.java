import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        
        for (String operation : operations) {
            String s = operation.split(" ")[0];
            int n = Integer.parseInt(operation.split(" ")[1]);
            
            if ("I".equals(s)) {
                maxQ.add(n);
                minQ.add(n);
            } else if (n == 1 && !maxQ.isEmpty()) {
                int max = maxQ.poll();
                minQ.remove(max);
            } else if (n == -1 && !minQ.isEmpty()) {
                int min = minQ.poll();
                maxQ.remove(min);
            }
        }
        
        if (maxQ.isEmpty()) {
            return new int[]{0, 0};
        }
        
        return new int[]{maxQ.poll(), minQ.poll()};
    }
}