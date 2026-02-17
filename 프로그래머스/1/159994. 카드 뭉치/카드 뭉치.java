import java.util.*;
import java.util.Arrays.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        // cards1과 cards2를 queue에 담기
        Queue<String> queue1 = new LinkedList<>(Arrays.asList(cards1));
        Queue<String> queue2 = new LinkedList<>(Arrays.asList(cards2));

        // goal을 작성할 수 있는지 판별
        for (int i=0; i<goal.length; i++) {
            if (goal[i].equals(queue1.peek())) {
                queue1.poll();
                continue;
            } else if (goal[i].equals(queue2.peek())) {
                queue2.poll();
                continue;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}