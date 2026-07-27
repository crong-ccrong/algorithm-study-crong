class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (String s : skill_trees) {
            StringBuilder sb = new StringBuilder();
            
            for (char c : s.toCharArray()) {
                if (skill.indexOf(c) != -1) {
                    sb.append(c);
                }
            }
            
            if (skill.startsWith(sb.toString())) {
                answer++;
            }
        }
        
        return answer;
    }
}