import java.util.*;

class Solution {
    public int[][] solution(int[][] arr) {
        int rowLen = arr.length;
        int colLen = 0;

        // 최대 열 길이 계산
        for (int i = 0; i < rowLen; i++) {
            colLen = Math.max(colLen, arr[i].length);
        }

        int maxLen = Math.max(rowLen, colLen);
        int[][] result = new int[maxLen][maxLen]; // 정사각형 배열 생성

        // 기존 배열을 결과 배열에 복사하고 부족한 부분은 0으로 채움
        for (int i = 0; i < rowLen; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j];
            }
        }

        return result; // 결과 배열 반환
    }
}
