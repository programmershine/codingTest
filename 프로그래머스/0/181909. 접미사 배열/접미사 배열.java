import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
            
        for(int i=0; i<my_string.length(); i++){
            String str = my_string.substring(i,my_string.length());
            list.add(str);
        }
        
        Collections.sort(list);
        
        answer = list.toArray(new String[my_string.length()]);
        
        return answer;
    }
}