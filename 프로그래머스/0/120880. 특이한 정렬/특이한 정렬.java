import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        
        Map<Integer, PriorityQueue<Integer>> map = new TreeMap<>();
        
        for (int num : numlist) {
            map.computeIfAbsent(Math.abs(n - num), k -> new PriorityQueue<>(Comparator.reverseOrder())).add(num);
        }
        
        int index = 0;
        
        for (int key : map.keySet()) {
            PriorityQueue<Integer> queue = map.get(key);
            
            while (!queue.isEmpty()) {
                answer[index++] = queue.poll();
            }
        }
        
        return answer;
    }
}