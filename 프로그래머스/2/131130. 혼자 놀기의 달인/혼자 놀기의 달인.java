class Solution {
        
    public int solution(int[] cards) {
        
        boolean[] visited = new boolean[cards.length];
        int first = 0;
        int second = 0;
        
        for (int i=0; i<cards.length; i++) {
            if (!visited[i]) {
                int size = dfs(i, cards, visited);
            
                if (size > first) {
                    second = first;
                    first = size;
                } else if (size > second) {
                    second = size;
                }
            }
        }
        
        return first * second;
    }
    
    private int dfs (int node, int[] cards, boolean[] visited) {
        if (visited[node]) return 0;    
        
        visited[node] = true;

        return 1 + dfs(cards[node]-1, cards, visited);
    }
}