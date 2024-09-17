import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        ArrayList<String> arrList = new ArrayList<>();
        
        String[] result = my_string.split(" ");
        
        for(int i=0; i<result.length; i++){
            if(!result[i].isEmpty()){
                arrList.add(result[i]);
            }
        }
        
        answer = arrList.toArray(answer);
        
        return answer;
    }
}