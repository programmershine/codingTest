class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int[] result = new int[4];
            if(a != b && b != c && a != c){
                answer = a+b+c;
            }else if((a == b && b != c) || (b == c && c != a) || (a == c && c != b )){

                for(int i = 1; i<3; i++){
                result[i] = (int)Math.pow(a,i) + (int)Math.pow(b,i) + (int)Math.pow(c,i);
                }
                answer = result[1] * result[2];
            }else if(a == b && b == c){
         
                for(int i = 1; i<4; i++){
                result[i] = (int)Math.pow(a,i) + (int)Math.pow(b,i) + (int)Math.pow(c,i);
                }
                answer = result[1] * result[2] * result[3];
            }
            
        
        return answer;
    }
}