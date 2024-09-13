class Solution {
    public String solution(String myString, String pat) {
        String answer = "";

        int endPoint = 0;
        
            for(int i=myString.length(); i>=pat.length(); i--){
                String strMyEnd = myString.substring(i-pat.length(),i);
                                
                if(strMyEnd.equals(pat)){
                    endPoint = i;
                    break;
                }
            }
        answer = myString.substring(0,endPoint);
        
        return answer;
    }
}