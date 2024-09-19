import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        ArrayList<Integer> arrList = new ArrayList<>();
        
            for(int i=0; i<attendance.length; i++){
                if(attendance[i] == true){
                        arrList.add(rank[i]);
                }
            }
        
        Collections.sort(arrList);
        
        int num1 = arrList.get(0);
        int num2 = arrList.get(1);
        int num3 = arrList.get(2);

        
        int result = 0;
        for(int j = 0; j<rank.length; j++){
            if(rank[j] == num1){
                result += j * 10000;
            }else if(rank[j] == num2){
                result += j * 100;
            }else if(rank[j] == num3){
                result += j;
            }
        }
        answer = result;
        
        return answer;
    }
}