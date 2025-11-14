import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int[] computePi(String p) {
        int n = p.length();
        int[] pi = new int[n];
        
        int i = 0;
        
        for (int j = 1; j < n; j++) {
            while (i > 0 && p.charAt(j) != p.charAt(i)) {
                i = pi[i - 1];
            }
            
            if (p.charAt(j) == p.charAt(i)) {
                i++;
                pi[j] = i;
            } else {
                pi[j] = 0;
            }
        }
        return pi;
    }
    
    public static boolean kmpSearch(String s, String p) {
        int n = s.length();
        int m = p.length();
        
        if (m == 0) {
            return true;
        }
        if (n < m) {
            return false;
        }
        
        int[] pi = computePi(p);
        int i = 0;
        
        for (int j = 0; j < n; j++) {
            while (i > 0 && s.charAt(j) != p.charAt(i)) {
                i = pi[i - 1];
            }
            
            if (s.charAt(j) == p.charAt(i)) {
                i++;
                
                if (i == m) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String s = br.readLine();
        String p = br.readLine();
        
        if (s == null || p == null) {
            System.out.println(0);
            return;
        }
        
        System.out.println(kmpSearch(s, p) ? 1 : 0);
    }
}