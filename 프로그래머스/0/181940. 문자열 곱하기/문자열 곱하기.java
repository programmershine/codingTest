class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
     
        StringBuilder a = new StringBuilder(); 
        
        for(int i=0; i<k; i++){
            a.append(my_string);
        }
        
        answer = a.toString();
        return answer;
    }
}