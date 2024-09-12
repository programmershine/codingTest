class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        char charA = alp.charAt(0);
        int intA = (int)charA;
        
        StringBuilder strB = new StringBuilder();
        
        
            for(int i=0; i<my_string.length(); i++){
                String str = my_string.substring(i,i+1);
                char cha = str.charAt(0);
                int code = (int)cha;
                
                if(code == charA + 32 || code == charA || charA == code + 32){
                    strB.append(str.toUpperCase());
                }else{
                    strB.append(str.toLowerCase());
                }
            }
        answer = strB.toString();
        
        return answer;
    }
}