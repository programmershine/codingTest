class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
            if(num_list.length>=11){
                for(int i=0; i<num_list.length; i++){
                    answer += num_list[i];
                }
            }else if(num_list.length<=10){
                for(int i=0; i<num_list.length; i++){
                    if(answer == 0){
                        answer = 1;
                    }
                    answer = answer * num_list[i];
                }
            }
        
        return answer;
    }
}