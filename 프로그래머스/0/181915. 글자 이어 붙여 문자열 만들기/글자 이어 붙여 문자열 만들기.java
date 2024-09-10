class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        
        StringBuilder result = new StringBuilder();
        
            for(int i=0; i<index_list.length; i++){
                result.append(my_string.substring(index_list[i],index_list[i]+1));
            }
        answer = result.toString();
        return answer;
    }
}