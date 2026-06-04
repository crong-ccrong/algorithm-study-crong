import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        while((length & (length-1)) != 0) {
            length = length + 1;
        }
                
        return Arrays.copyOf(arr, length);
    }
}