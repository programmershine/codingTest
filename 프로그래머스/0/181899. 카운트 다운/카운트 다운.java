import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>(); 
        
            if(start_num>end_num){

                while(start_num >= end_num){
                        System.out.println(start_num);
                        arrList.add(start_num);
                    start_num--;
                }
                
            }
        
        answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}