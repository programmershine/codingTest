import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int math = n;
        
        ArrayList<Integer> List = new ArrayList<>();
        List.add(math);
        
        for(int i = 0; i < n; i++){
            if(math % 2 ==0){
                math = math/2;
                List.add(math);
            }else{
                math = 3 * math + 1;
                List.add(math);
            }
            if(math == 1){
                break;
            }
        }
        
        int[] result = List.stream().mapToInt(Integer::intValue).toArray();
        answer = result.clone();
        
        return answer;
    }
}