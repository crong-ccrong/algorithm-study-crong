class Solution {
    public int solution(String word) {
        int answer = 0;
        
        String vowels = "AEIOU";
        int[] weight = {781, 156, 31, 6, 1};
        
        for (int i = 0; i < word.length(); i++) {
            int index = vowels.indexOf(word.charAt(i));
            
            answer += index * weight[i] + 1;
        }
        
        return answer;
    }
}