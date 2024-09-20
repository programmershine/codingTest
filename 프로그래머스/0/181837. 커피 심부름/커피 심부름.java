class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
            for(String ord : order){
                if(ord.contains("americano") || ord.contains("anything")){
                    answer += 4500;
                }
                
                if(ord.contains("latte")){
                    answer += 5000;
                }
            }
        
        return answer;
    }
}