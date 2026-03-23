class Solution {
    
    int answer = 0;
    boolean[] visited;
    
    public int solution(int n, int[][] computers) {
        visited = new boolean[n];
        
        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                dfs(i, n, computers);
                answer++;
            }
        }
        
        return answer;
    }
    
    private void dfs(int node, int n, int[][] computers) {
        visited[node] = true;
        
        for (int i=0; i<n; i++) {
            if (computers[node][i] == 1 && !visited[i]) {
                dfs(i, n, computers);
            }
        }
    }
}