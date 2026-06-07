class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int a = sides[0];
        int b = sides[1];
        int max = a + b - 1;
        int min = Math.max(a, b) - Math.min(a, b) + 1;
        
        return max - min + 1;
    }
}