import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        ArrayList<String> arrList = new ArrayList<>();
        
            for(int i=0; i<str_list.length; i++){
                if(str_list[i].equals("l")){
                    int n =0;
                    while(n<i){
                        arrList.add(str_list[n]);
                        n++;
                    }
                    break;         
                    
                }else if(str_list[i].equals("r")){
                    int m=i+1;
                    while(m <str_list.length){
                        arrList.add(str_list[m]);
                        m++;
                    }
                    break; 
                }
            }
         
        answer = arrList.toArray(new String[arrList.size()]);
        
        return answer;
    }
}