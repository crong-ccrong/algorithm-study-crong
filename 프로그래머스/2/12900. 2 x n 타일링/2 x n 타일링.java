import java.util.*;

class Solution {
    public int solution(int n) {
        final int MOD = 1000000007;
        
        if (n == 1) {
            return 1;
        }
        
        int n1 = 1;
        int n2 = 2;
        
        for (int i = 3; i <= n; i++) {
            int temp = (n1 + n2) % MOD;
            n1 = n2;
            n2 = temp;
        }
        
        return n2;
    }
}