import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        
        
            for(int i=0; i<arr.length; i++){
                
                if(arrList.size() == 0){
                    arrList.add(arr[i]);
                }else{
                    if(arr[i] == arrList.get(arrList.size()-1)){
                        arrList.remove(arrList.size()-1);
                    }else{
                        arrList.add(arr[i]);
                    }
                }
            }
        
            if(arrList.size() ==0){
                arrList.add(-1);
            }
        
        answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}