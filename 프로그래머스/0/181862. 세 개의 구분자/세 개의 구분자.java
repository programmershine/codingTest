import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        ArrayList<String> arrList = new ArrayList<>();
        
        String cutstr = myStr.replace("a"," ")
                                .replace("b"," ")
                                .replace("c"," ");
        
        String[] result = cutstr.split(" ");
        for(int i=0; i<result.length; i++){
            if(!result[i].isEmpty()){
                arrList.add(result[i]);
            }
        }    
        
        
        
        
        if(arrList.size() == 0){
            String[] strarr = {"EMPTY"};
            
            answer = strarr.clone();
        }else{
            answer = arrList.toArray(answer);    
        }
        
        return answer;
    }
}