import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        
            int a = slicer[0];
            int b = slicer[1];
            int c = slicer[2];
        
            for(int i=0; i<num_list.length; i++){
                if(n == 1 && i<=b){
                    arrList.add(num_list[i]);
                }else if(n == 2 && i>=a){
                    arrList.add(num_list[i]);
                }else if(n == 3 && i<=b && i>=a){
                    arrList.add(num_list[i]);
                }else if(n == 4 && i<=b && i>=a && (i-a) % c == 0){
                    arrList.add(num_list[i]);
                }
            }
        
        answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        
        return answer;
    }
}