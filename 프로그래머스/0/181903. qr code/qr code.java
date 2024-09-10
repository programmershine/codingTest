class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        StringBuilder strB = new StringBuilder();
        
            int i=0;
            while(i<code.length()){
                if(i % q == r){
                    strB.append(code.substring(i,i+1));
                }
                i++;
            }
        
        answer = strB.toString();
        return answer;
    }
}