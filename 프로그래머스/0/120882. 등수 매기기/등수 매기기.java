import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Integer> sum = new ArrayList<>();
        
        for (int i = 0; i < score.length; i++) {
            sum.add(score[i][0] + score[i][1]);
        }
        
        List<Integer> sort = new ArrayList<>(sum);
        Collections.sort(sort, Collections.reverseOrder());
        
        for (int i = 0; i < score.length; i++) {
            answer[i] = sort.indexOf(sum.get(i)) + 1;
        }
        
        return answer;
    }
}