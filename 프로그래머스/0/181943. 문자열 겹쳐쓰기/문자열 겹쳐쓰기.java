class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        // 문자열의 일부를 대체하여 새 문자열을 생성합니다.
        String before = my_string.substring(0, s); // 시작 인덱스 s까지의 문자열
        String after = my_string.substring(s + overwrite_string.length()); // 대체 문자열 이후의 부분
        
        // 대체 문자열을 포함한 새 문자열을 반환합니다.
        answer = before + overwrite_string + after;
        
        return answer;
    }
}