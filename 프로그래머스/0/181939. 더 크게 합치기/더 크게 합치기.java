class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strA = Integer.toString(a) + Integer.toString(b);
        String strB = Integer.toString(b) + Integer.toString(a);
            
        int sumA = Integer.parseInt(strA);
        int sumB = Integer.parseInt(strB);
        if(sumA > sumB){
            answer = sumA;
        }else{
            answer = sumB;
        }
        
        return answer;
    }
}