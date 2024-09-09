import java.util.*;


class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> result = new ArrayList<>();
        
        if(l<r){
            for(int i = 0; i<r+1; i += 5){
                if(i >= l){
                    String numStr = Integer.toString(i);
                    int[] numStrArr = new int[numStr.length()];
                    boolean tf = false;
                    for(int j=0; j<numStr.length(); j++){
                        numStrArr[j] = Integer.parseInt(numStr.substring(j,j+1));
                        if(numStrArr[j] != 0 && numStrArr[j] != 5){
                            tf = false;
                            break;
                        }else{
                            tf = true;
                        }
                        System.out.print(i + " ");  
                    }
                    if(tf) {
                        result.add(i);
                    }
                }
            }
        }
        
        int[] resultArr = result.stream().mapToInt(Integer::intValue).toArray();
        
        answer = resultArr.clone();
        
        if(answer.length == 0){
            int[] exnum = new int[1];
            exnum[0] = -1;
            answer = exnum.clone();
        }
        
        
        return answer;
    }
}