import java.util.*;

class Solution {
    public String[] solution(String myString) {
        // 입력 문자열이 빈 문자열일 때
        if (myString.isEmpty()) {
            return new String[0];
        }
        
        ArrayList<String> arrList = new ArrayList<>();
        int start = 0;
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                if (start < i) {  // 비어 있지 않은 부분 문자열만 추가
                    arrList.add(myString.substring(start, i));
                }
                start = i + 1;  // 'x' 이후의 문자부터 시작
            }
        }
        
        // 마지막 'x' 이후에 부분 문자열이 있을 경우 처리
        if (start < myString.length()) {
            arrList.add(myString.substring(start));
        }
        
        // ArrayList를 배열로 변환하고 정렬
        String[] answer = arrList.toArray(new String[0]);
        Arrays.sort(answer);
        
        return answer;
    }
}
