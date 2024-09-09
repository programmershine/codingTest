class Solution {
    public int[] solution(int[] num_list) {
        int a = num_list.length;
        int lastpang = 0;
        
        // 배열의 크기를 a + 1로 정의하고 초기화합니다.
        int[] answer = new int[a + 1];
        
        if (a > 1) {
            // 배열 길이가 2 이상일 때만 lastpang 계산
            if (num_list[a - 1] > num_list[a - 2]) {
                lastpang = num_list[a - 1] - num_list[a - 2];
            } else {
                lastpang = num_list[a - 1] * 2;
            }
        } else {
            // 배열 길이가 1인 경우 lastpang을 0으로 설정 (또는 적절한 값으로 설정)
            lastpang = num_list[a - 1] * 2; // 예를 들어, lastpang을 num_list[0] * 2로 설정
        }
        
        // 기존 배열의 요소를 answer 배열에 복사합니다.
        for (int i = 0; i < a; i++) {
            answer[i] = num_list[i];
        }
        
        // 마지막 요소에 lastpang 값을 추가합니다.
        answer[a] = lastpang;
        
        return answer;
    }
}
