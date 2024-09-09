class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int result = 0; 
        
            for(int i =0; i<included.length; i++){
                if(included[i]){
                    result += a + (d * i);   
                } 
            }
            
        answer = result;
        return answer;
    }
}