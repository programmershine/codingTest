class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        int[] testAnswer = arr.clone();

            for(int i=0; i<queries.length; i++){
                
                int[] testA = testAnswer.clone();
                int[] testB = testAnswer.clone();
                
                int a = queries[i][0];
                int b = queries[i][1];
                                
                testAnswer[a] = testA[b];
                testAnswer[b] = testB[a];
                
            }
        
        answer = testAnswer.clone();
        
        return answer;
    }
}