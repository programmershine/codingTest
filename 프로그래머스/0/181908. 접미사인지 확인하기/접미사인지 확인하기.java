import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        ArrayList<String> list = new ArrayList<>();
        int len = my_string.length();
        
        for(int i = 0; i<len; i++){
            String str = my_string.substring(i,len);
            System.out.println(str + "맞잖아" + is_suffix);
            if(str.equals(is_suffix)){
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}