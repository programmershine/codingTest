class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        int count = 1;
        int total = n * n;
        
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        
        while (count <= total) {
            // 왼쪽에서 오른쪽으로
            for (int i = left; i <= right; i++) {
                answer[top][i] = count++;
            }
            top++; // 윗쪽 경계 이동

            // 위에서 아래로
            for (int i = top; i <= bottom; i++) {
                answer[i][right] = count++;
            }
            right--; // 오른쪽 경계 이동

            // 오른쪽에서 왼쪽으로
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    answer[bottom][i] = count++;
                }
                bottom--; // 아랫쪽 경계 이동
            }

            // 아래에서 위로
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    answer[i][left] = count++;
                }
                left++; // 왼쪽 경계 이동
            }
        }
        
        return answer;
    }
}
