class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder strB = new StringBuilder();
        
        
            for(int i=0; i<myString.length(); i++){
                if(myString.charAt(i) < 'l'){
                    strB.append("l");
                }else{
                    strB.append(myString.charAt(i));
                }
            }
        
        answer = strB.toString();
        
        return answer;
    }
}