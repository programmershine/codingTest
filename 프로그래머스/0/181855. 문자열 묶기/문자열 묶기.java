class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] result = new int[30];
        
        for(String arr : strArr){
            result[arr.length() -1] += 1;
        }
        
        int temp = 0;
        for(int re : result){
            
            if(re > temp){
                temp = re;
            }
        }

        answer = temp;
        
        
        return answer;
    }
}