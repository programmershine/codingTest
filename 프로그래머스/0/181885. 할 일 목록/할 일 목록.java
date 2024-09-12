import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        ArrayList<String> arrList = new ArrayList<>(); 
        
        
            for(int i=0; i<todo_list.length; i++){
                if(!finished[i]){
                    arrList.add(todo_list[i]);
                }
            }
        
        answer = arrList.toArray(new String[0]);
        
        return answer;
    }
}