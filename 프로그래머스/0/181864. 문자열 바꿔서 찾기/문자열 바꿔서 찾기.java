class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder strB = new StringBuilder();
        boolean result = false;
        
            for(int i=0; i<myString.length(); i++){
                if(myString.charAt(i) == 'A'){
                    strB.append('B');
                }else if(myString.charAt(i) == 'B'){
                    strB.append('A');
                }
            }
        
            for(int j=0; j<= strB.length() - (pat.length()); j++){
      
                if(strB.substring(j,j+pat.length()).equals(pat)){
                    result = true;
                }
            }
        
            if(result){
                answer = 1;
            }
        
        return answer;
    }
}