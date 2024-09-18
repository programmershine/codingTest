import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        
        
            for(int i=0; i<arr.length; i++){
                int temp = arr[i];
                
                for(int j=0; j<temp; j++){
                    arrList.add(arr[i]);
                }
                
            }
        
        answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}