import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
            for(int i=0; i<arr.length; i++){
                if(flag[i]){
                    for(int j=0; j<arr[i]*2; j++){
                        arrList.add(arr[i]);
                    }
                }else{
                    for(int k=0; k<arr[i]; k++){
                        arrList.remove(arrList.size()-1);
                    }
                }
            }
        
        answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}