class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int sum = a+b;
        
            //둘다 홀 수 일 때
            if(sum % 2 == 0 && a % 2 != 0){
                
                answer = (int)Math.pow(a,2) + (int)Math.pow(b,2);
                
            //둘다 짝 수 일 때(모두 홀수가 아닐 때)
            }else if(sum % 2 == 0 && a % 2 == 0){
                int max = Math.max(a,b);
                int min = Math.min(a,b);
                
                answer = max - min;
            //하나만 홀 수 일 때    
            }else if(sum % 2 != 0){
                answer = 2 * (a+b) ;
            }
        
        return answer;
    }
}