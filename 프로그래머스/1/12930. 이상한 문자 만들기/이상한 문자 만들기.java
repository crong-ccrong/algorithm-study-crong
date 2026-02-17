class Solution {
    public String solution(String s) {
        String answer = "";
        for (String str : s.split(" ", -1)) {
            for (int i=0; i<str.length(); i++) {
                answer += i % 2 == 0 ? Character.toUpperCase(str.charAt(i)) : Character.toLowerCase(str.charAt(i));
            }
            answer += " ";
        }
        return answer.substring(0, answer.length() -1);
    }
}