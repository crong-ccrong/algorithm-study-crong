import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        int sum = 0;
        int key = 0;
        boolean duplication = false;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);

            if (map.get(i) > sum) {
                sum = map.get(i);
                key = i;
                duplication = false;
            } else if (map.get(i) == sum && key != i) {
                duplication = true;
            }
        }
                
        return duplication ? -1 : key;
    }
}