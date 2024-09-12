class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int[] result = new int[num_list.length];
        int originN = n;
        
                int idx = 0;
            
                while(n<num_list.length && idx< num_list.length-originN){
                    result[idx] = num_list[n];
                    idx++;
                    n++;
                }
                
                while(n>0 && idx<num_list.length){
                    result[idx] = num_list[num_list.length-n];
                    idx++;
                    n--;
                }
        answer = result.clone();
        
        
        return answer;
    }
}