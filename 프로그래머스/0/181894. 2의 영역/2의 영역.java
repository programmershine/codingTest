import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        ArrayList<Integer> resultList = new ArrayList<>();
        
            for(int i=0; i<arr.length; i++){
                if(arr[i] == 2){
                    arrList.add(i);    
                }
            }    
        
            if(!arrList.isEmpty()){
            int s_idx = arrList.get(0) ;
            int e_idx = arrList.get(arrList.size() - 1);
            
                while(s_idx <= e_idx){
                    resultList.add(arr[s_idx]);
                    s_idx++;
                }
            }
            
            if(resultList.isEmpty()){
                answer = new int[1];
                answer[0] = -1;
            }else{
                answer = resultList.stream().mapToInt(Integer::intValue).toArray();
            }
        return answer;
    }
}