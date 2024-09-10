import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
           for(int i = 0; i<intStrs.length; i++){
               
               String str = intStrs[i];
               int temp = Integer.parseInt(str.substring(s,s+l));
               if(temp>k){
                    arrList.add(temp);
               }
           } 
        answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}