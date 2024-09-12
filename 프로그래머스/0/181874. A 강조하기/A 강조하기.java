class Solution {
    public String solution(String myString) {
        String answer = "";
        StringBuilder strB = new StringBuilder();
        
            for(int i=0; i<myString.length(); i++){
                String str = myString.substring(i,i+1);
                char cha = str.charAt(0);
                int code = (int) cha;
            
                if(code == 97){
                    strB.append("A");        
                }else if(code > 97){
                    char eng = (char)code;
                    strB.append(eng);
                }else if(code == 65){
                    char eng = (char)code;
                    strB.append(eng);
                }else if(code > 65 && code <= 90){
                    int cocode = code + 32;
                    char eng = (char)cocode;
                    strB.append(eng);
                }else if(code == 32){
                    char eng = (char)code;
                    strB.append(eng);
                }
            }
        
        answer = strB.toString();
        
        return answer;
    }
}