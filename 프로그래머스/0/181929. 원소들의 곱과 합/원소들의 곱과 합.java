class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int sum = 0;
        
        int multi = 0;
       
        for(int i=0; i<num_list.length; i++){
            sum += num_list[i];
            
            if(i == 0){
                multi = num_list[i];
            }else{
                multi = multi * num_list[i];
            }
        }
        int sumpow = (int)Math.pow(sum,2);
        
        if(multi < sumpow){
            answer = 1;
        }else{
            answer = 0;
        }
        
        
        return answer;
    }
}