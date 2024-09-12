class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int[] result = new int[num_list.length-n+1];
        
        int idx = 0;
        while(n <= num_list.length){
            result[idx] = num_list[n-1];
            idx++;
            n++;
        }
        answer = result.clone();
        
        return answer;
    }
}