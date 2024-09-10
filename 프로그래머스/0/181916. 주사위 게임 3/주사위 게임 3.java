import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        // 입력된 4개의 정수를 배열에 저장
        int[] arr = {a, b, c, d};
        
        // 배열을 오름차순으로 정렬
        Arrays.sort(arr);
        
        // 정렬된 배열에서 값의 빈도수를 체크
        
        // 모든 숫자가 같을 경우
        // 예: [2, 2, 2, 2] 
        if (arr[0] == arr[3]) {
            return 1111 * arr[0];  // 모든 숫자가 동일하므로, 1111 * 그 숫자를 반환
        } 
        
        // 3개의 숫자가 같고 1개가 다른 경우
        // 예: [1, 3, 3, 3] 또는 [1, 1, 1, 3]
        else if (arr[0] == arr[2] || arr[1] == arr[3]) {
            int p = arr[2];  // 중복된 수 (예: 3)
            int q = arr[3] + arr[0] - arr[2];  // 중복되지 않은 수 (예: 1)
            return (int) Math.pow(10 * p + q, 2);  // 결과: (10 * p + q) ^ 2
        } 
        
        // 2개의 숫자가 각각 2개씩 반복되는 경우
        // 예: [1, 1, 2, 2]
        else if (arr[0] == arr[1] && arr[2] == arr[3]) {
            return (arr[0] + arr[2]) * (arr[2] - arr[0]);  // (숫자1 + 숫자2) * |숫자2 - 숫자1|
        } 
        
        // 2개의 숫자가 같고 나머지 2개의 수는 다를 때
        // 예: [1, 1, 2, 3]
        else if (arr[0] == arr[1]) {
            return arr[2] * arr[3];  // 두 다른 숫자의 곱을 반환
        }
        else if (arr[1] == arr[2]) {
            return arr[0] * arr[3];  // 두 다른 숫자의 곱을 반환
        }
        else if (arr[2] == arr[3]) {
            return arr[0] * arr[1];  // 두 다른 숫자의 곱을 반환
        }
        
        // 모든 숫자가 다를 때
        // 예: [1, 2, 3, 4]
        else {
            return arr[0];  // 가장 작은 숫자를 반환
        }
    }
}