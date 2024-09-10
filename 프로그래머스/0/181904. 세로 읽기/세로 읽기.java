class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
            StringBuilder strB = new StringBuilder();    
            
            int j=0;
            while((j+1)*m <= my_string.length()){
                strB.append(my_string.substring((c-1)+(m*j),(c-1)+(m*j)+1));
                j++;
            }
    
            answer = strB.toString();

        return answer;
    }
}