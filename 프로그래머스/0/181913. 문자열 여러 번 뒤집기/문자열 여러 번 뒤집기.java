class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
          // 문자열을 문자 배열로 변환
        char[] strArr = my_string.toCharArray();
        
        // 쿼리 처리
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            
            // 범위가 유효한 경우 문자열 반전
            while (s < e) {
                char temp = strArr[s];
                strArr[s] = strArr[e];
                strArr[e] = temp;
                s++;
                e--;
            }
        }
        
        // 문자 배열을 문자열로 변환
        answer = new String(strArr);
        
        return answer;
    }
}