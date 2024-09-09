class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<numLog.length - 1; i++){
            int diff = numLog[i+1] - numLog[i];
            switch(diff){
                case 1 :
                    str.append('w');
                    break;
                case -1 :
                    str.append('s');
                    break;
                case +10 :
                    str.append('d');
                    break;
                case -10 :
                    str.append('a');
                    break;
                default:
                     throw new IllegalArgumentException("Invalid step difference: " + diff);
            }
            
        }
        answer = str.toString();

        return answer;
    }
}