import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();    
        
            for(int i=0; i<intervals.length; i++){
                int s_idx = intervals[i][0];
                int e_idx = intervals[i][1];
                
                    while(s_idx<=e_idx){
                        arrList.add(arr[s_idx]);
                        s_idx++;
                    }
            }
        
        answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}