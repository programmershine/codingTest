class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int[] result = new int[n];
            int i = 0;
            if(n>=1){
                while(i < n){
                    result[i] = num_list[i];
                    i++;
                }
            }
        answer = result.clone();
        
        return answer;
    }
}