import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        ArrayList<String> arrList = new ArrayList<>();
        
        
            for(int i=0; i<picture.length; i++){
                int num1 = k;
                int num2 = k;
                StringBuilder strB = new StringBuilder();
                
                for(int j =0; j<picture[i].length(); j++){
                 
                    while(num1>0){
                        strB.append(picture[i].substring(j,j+1));
                        num1--;
                    }
                    num1 = k;
                }
                
                while(num2>0){
                    arrList.add(strB.toString());
                    num2--;
                }
                num2 = k;
            }
        
        answer = arrList.toArray(answer);
        
        return answer;
    }
}