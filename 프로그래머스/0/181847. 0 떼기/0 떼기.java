class Solution {
    public String solution(String n_str) {
        String answer = "";
        StringBuilder strB = new StringBuilder();
        
        boolean stop = false;
        
            for(int i=0; i<n_str.length(); i++){
                if(n_str.charAt(i) != '0'){
                    stop = true;
                }
                
                if(stop){
                    strB.append(n_str.charAt(i));
                }
            }
        
        answer = strB.toString();

        return answer;
    }
}