class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String upMyStr = myString.toUpperCase();
        String upPat = pat.toUpperCase();
        
        if(upMyStr.length()>=upPat.length()){
            for(int i=0; i<(upMyStr.length()-upPat.length()+1); i++){
                if(upMyStr.substring(i,i+upPat.length()).equals(upPat)){
                    answer =1;
                }
            }
        }else if(upMyStr.length()<upPat.length()){
            answer =0;
        }
    
        return answer;
    }
}