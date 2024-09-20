class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        StringBuilder strB = new StringBuilder();
        
        
            for(int i=0; i<str_list.length; i++){
                
                if(!str_list[i].contains(ex)){
                    strB.append(str_list[i]);
                }
                
            }
        
        answer = strB.toString();
        
        return answer;
    }
}