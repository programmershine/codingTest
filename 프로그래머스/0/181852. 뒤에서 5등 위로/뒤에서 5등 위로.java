import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        Arrays.sort(num_list);
        
        for(int i = 5; i<num_list.length; i++){
                arrList.add(num_list[i]);
        }
        
        answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}