class Solution {
    public String solution(String code) {
        String answer = "";
        
        if (code == null || code.isEmpty()) {
            return "EMPTY";
        }
        StringBuilder str = new StringBuilder();
        int mode = 0;
            for(int i = 0; i<code.length(); i++){
                if(mode == 0){
                    if( code.charAt(i) != '1'){
                        if(i % 2 == 0){
                            str.append(code.charAt(i));
                        }
                    }else if(code.charAt(i) == '1'){
                        mode = 1;
                    }
                }else if(mode == 1){
                   if( code.charAt(i) != '1'){
                        if(i % 2 != 0){
                            str.append(code.charAt(i));
                        }
                    }else if(code.charAt(i) == '1'){
                        mode = 0;
                    }
                }
            }
        answer = str.toString();

        
        return str.length() > 0 ? answer : "EMPTY";
    }
}