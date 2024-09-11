import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        ArrayList<Integer> intList = new ArrayList<>();
        
            for(int i=0; i<n; i++){
                if((i+1) % k == 0){
                    intList.add(i+1);
                }
            }
        
        Collections.sort(intList);
        answer = intList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}