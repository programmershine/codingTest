class Solution {
    public int solution(int n, String control) {
        int answer = 0;

        int result = n;
        
            for(int i = 0; i<control.length(); i++){
               switch(control.charAt(i)){
                   case 'w' :
                       result = result + 1;
                       break;
                   case 's' :
                       result = result - 1; 
                       break;
                   case 'd' :
                       result = result + 10; 
                       break;
                   case 'a' :
                       result = result - 10;
                       break;
                    default:
                       throw new IllegalArgumentException("Unexpected control character: " + control.charAt(i));
               }  
            }
            answer = result;

        
        return answer;
    }
}