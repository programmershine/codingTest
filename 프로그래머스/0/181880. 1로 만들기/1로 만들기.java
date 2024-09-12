class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
            for(int i=0; i<num_list.length; i++){
                int a = 0;
                int numC = num_list[i];
                while(numC > 1){
                    if(numC % 2 == 0){
                        numC = numC/2;
                    }else{
                        numC = (numC-1)/2;
                    }
                    a++;
                }
                answer += a;
            }
        
        return answer;
    }
}