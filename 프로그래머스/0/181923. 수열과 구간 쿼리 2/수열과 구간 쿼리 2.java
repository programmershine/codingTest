import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        int[] result = new int[queries.length];
        
        //쿼리 배열수만큼 돌림
        for(int i = 0; i<queries.length; i++){
            
            //쿼리배열마다 배열 정수로 변환
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            //s랑 e가 같거나 e가 s보다 크면 i는 0 or 그이상
            if((e-s) >= 0){
                
                //arr2 빈배열 만듦 s랑 e 사이 개수 만큼
                int[] arr2 = new int[(e-s)+1];
                
                    //arr2 각 배열에 그 수만큼 arr 복사
                    for(int j = s; j<= e; j++){
                        arr2[j - s] = arr[j];
                    }
                
                //복사된 arr2를 순서대로 재배열
                Arrays.sort(arr2);  
                
                result[i] = -1; // 기본값 설정
                //재배열된 arr2를 [0]부터 돌림 K 보다큰게있으면 result 배열에 넣고 브레이크
                for (int a = 0; a < arr2.length; a++) {
                    if (arr2[a] > k) {
                        result[i] = arr2[a];
                        break;
                    }
                }     
            }else{
                result[i] = -1; // 기본값 설정
            }
        }
        answer = result.clone();
        
        
        return answer;
    }
}