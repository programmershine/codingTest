class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = {};
        int[] result = new int[end_num - start_num + 1];
        int num = end_num - start_num;
        
            for(int i= start_num - start_num; i<= num; i++){
                result[i] = start_num + i;
            }
        
        answer = result.clone();
        
        return answer;
    }
}