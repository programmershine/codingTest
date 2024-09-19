//import java.util.*;

//class Solution {
//    public int[] solution(int[] arr, int k) {
//        int[] answer = {};
//        ArrayList<Integer> arrList = new ArrayList<>();
//                
//            for(int i=0; i<arr.length; i++){
//                        
//                if(arrList.size() > 0 && arrList.size() < k && arrList.get(arrList.size()-1) != arr[i]){
//                    arrList.add(arr[i]);
//                }else if(arrList.size() == 0){
//                    arrList.add(arr[i]);
//                }
//                
//           }
//          
//          if(arrList.size()<k){
//              while(arrList.size() < k){
//                  arrList.add(-1);
//              }
//          }
//      
//      answer = arrList.stream().mapToInt(Integer::intValue).toArray();
//      
//      return answer;
//  }
//}

import java.util.Arrays; 
import java.util.ArrayList; //입력한 순서를 보장시켜보자 (HashSet은 안되니까)

class Solution {
    public int[] solution(int[] arrs , int k) {

        ArrayList<Integer> arrList = new ArrayList<>(); 
        int[] answer = new int[k];
        Arrays.fill(answer , -1); 

        for(int arr : arrs) {
            if(arrList.indexOf(arr) == -1 ) {
                arrList.add(arr); 
            }
        }

        int maxLen = arrList.size() > k ? k : arrList.size();

        for(int i = 0; i < maxLen; i++) {
            answer[i] = arrList.get(i); 
        }    

        return answer;
    }
}