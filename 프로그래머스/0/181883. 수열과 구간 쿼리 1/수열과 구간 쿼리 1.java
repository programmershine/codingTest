class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        int[] arrC = arr.clone();
        
            for(int i=0; i<queries.length; i++){
                int s = queries[i][0];
                int e = queries[i][1];
                
                for(int j=s; j<=e; j++){
                    
                        arrC[j] += 1;   
            
                }
                
            }    
        answer = arrC.clone();
        
        return answer;
    }
}