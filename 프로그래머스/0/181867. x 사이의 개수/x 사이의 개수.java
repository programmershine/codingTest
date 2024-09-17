import java.util.*;

class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
        
            int xCount = 0;
            for(int i=0; i<myString.length(); i++){
                
                if(myString.substring(i,i+1).equals("x")){
                    System.out.println(xCount);
                    arrList.add(xCount);
                    xCount =0;
                }else{
                    xCount +=1;
                }
            }
            arrList.add(xCount);
        
        answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}