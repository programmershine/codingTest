import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
                
        int[] stk = {};
        ArrayList<Integer> list = new ArrayList<>();        
        
        for(int i = 0; i < arr.length; i++){
           
            //if(list.size() == 0){
            //    list.add(arr[i]);
            //    i++;
            //}else{
            //    if(list.get(list.size()-1) < arr[i]){
            //        list.add(arr[i]);
            //        i++;
            //   }else{
            //        list.remove(list.size()-1);
            //    }
            //}

            // if문 while문의 차이를 알아내야함
            
            while (!list.isEmpty() && list.get(list.size() - 1) >= arr[i]) {
                list.remove(list.size() - 1);
            }
            list.add(arr[i]);
        
            
        }
        stk = list.stream().mapToInt(Integer::intValue).toArray();
        
        
        return stk;
    }
}