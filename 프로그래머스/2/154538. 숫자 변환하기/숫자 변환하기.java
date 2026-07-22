import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        Queue<Integer> queue = new ArrayDeque<>();
        boolean[] visited = new boolean[y + 1];
        
        if (x == y) {
            return 0;
        }
        
        queue.offer(x);
        visited[x] = true;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            answer++;
            
            for (int i = 0; i < size; i++) {
                int num = queue.poll();
                int[] next = {num * 2, num * 3, num + n};
                for (int j : next) {
                    if (y == j) {
                        return answer;
                    }
                    
                    if (j < y && !visited[j]) {
                        visited[j] = true;
                        queue.offer(j);
                    }
                }
            }
        }
        
        return -1;
    }
}