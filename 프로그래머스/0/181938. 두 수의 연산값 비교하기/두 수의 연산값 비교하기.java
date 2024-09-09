class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String strA = Integer.toString(a) + Integer.toString(b);
        int sumA = Integer.parseInt(strA);
        int sumB = 2 * a * b;
        
        if(sumA > sumB){
            answer = sumA;
        }else if(sumB > sumA){
            answer = sumB;
        }else if(sumA == sumB){
            answer = sumA;
        }
        
        return answer;
    }
}