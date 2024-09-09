class Solution {
    public String solution(String[] arr) {
        String answer = "";
        
        StringBuilder a = new StringBuilder();
        
        for(int i = 0; i < arr.length; i++){
            a.append(arr[i]);
        }
        
        answer = a.toString();
        return answer;
    }
}