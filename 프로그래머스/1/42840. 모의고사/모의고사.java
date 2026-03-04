class Solution {
    public int[] solution(int[] answers) {
        int[] answer = null;
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        int aScore = 0, bScore = 0, cScore = 0; 
        int aIndex = 0, bIndex = 0, cIndex = 0;
        
        for(int i = 0; i < answers.length; i++){
         
            aScore += answers[i] == a[aIndex++] ? 1 : 0;
            bScore += answers[i] == b[bIndex++] ? 1 : 0;
            cScore += answers[i] == c[cIndex++] ? 1 : 0;
            if(aIndex == 5) aIndex = 0;
            if(bIndex == 8) bIndex = 0;
            if(cIndex == 10) cIndex = 0;
            
        }

        if((aScore==bScore)&&(bScore==cScore)){
            answer = new int[]{1,2,3};
        }else if((aScore==bScore)&&(bScore>cScore)){
            answer = new int[]{1,2};
        }else if((aScore==cScore)&&(cScore>bScore)){
            answer = new int[]{1,3};
        }else if((bScore==cScore)&&(cScore>aScore)){
            answer = new int[]{2,3};
        }else if((aScore>bScore)&&(aScore>cScore)){
            answer = new int[]{1};
        }else if((bScore>aScore)&&(bScore>cScore)){
            answer = new int[]{2};
        }else {
            answer = new int[]{3};
        }
        
        return answer;
    }
}