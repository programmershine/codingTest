import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
            for(int i=0; i<arr.length; i++){
                boolean dob = false;
                for(int j=0; j<delete_list.length; j++){
                    
                    if(arr[i] == delete_list[j]){
                        dob = true;
                    }
                    
                }
                if(!dob){
                    arrList.add(arr[i]);
                }
                
            }
        
        answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}