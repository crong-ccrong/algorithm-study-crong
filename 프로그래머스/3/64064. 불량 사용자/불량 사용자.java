import java.util.*;

class Solution {
    
    Set<Set<String>> result = new HashSet<>();

    
    public int solution(String[] user_id, String[] banned_id) {
        
        boolean[] visited = new boolean[user_id.length];
        dfs(0, user_id, banned_id, visited, new HashSet<>());
        return result.size();
    }
    
    private void dfs (int node, String[] user_id, String[] banned_id, boolean[] visited, Set<String> current) {
        
        if (node == banned_id.length) {
            result.add(new HashSet<>(current));
            return;
        }
        
        for (int i=0; i<user_id.length; i++) {
            if (!visited[i] && match(user_id[i], banned_id[node])) {
                current.add(user_id[i]);
                visited[i] = true;
                dfs(node+1, user_id, banned_id, visited, current);
                visited[i] = false;
                current.remove(user_id[i]);
            }
        }
    }
    
    private boolean match (String user, String banned) {
        if (user.length() != banned.length()) return false;
        
        for (int i=0; i<user.length(); i++) {
            if (banned.charAt(i) == '*') continue;
            if (user.charAt(i) != banned.charAt(i)) return false;
        }
        
        return true;
    }
}