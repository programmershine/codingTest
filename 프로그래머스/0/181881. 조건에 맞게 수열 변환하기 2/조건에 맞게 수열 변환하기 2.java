import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] arrC = arr.clone();
        
            int a=0;
            while(Arrays.equals(arr, arrC)){
                for(int i=0; i<arrC.length; i++){
                    if(arrC[i] >= 50 && arrC[i] % 2 ==0){
                        arrC[i] = arrC[i]/2;
                    }else if(arrC[i] < 50 && arrC[i] % 2 !=0){
                        arrC[i] = (arrC[i]*2) +1;
                    }
                }
                
                    if(!Arrays.equals(arr, arrC)){
                    arr = arrC.clone();
                    
                    }else{
                    break;
                    }
                a++;
            }
        
        answer = a;
        
        return answer;
    }
}