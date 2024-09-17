import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        // 결과를 저장할 배열 초기화
        String[] answer = {};
        // 결과 문자열을 저장할 ArrayList 생성
        ArrayList<String> arrList = new ArrayList<>();

        // 입력 배열의 각 문자열에 대해 반복
        for(int i = 0; i < strArr.length; i++){
            // 인덱스 쌍을 저장할 리스트 생성
            ArrayList<int[]> intList = new ArrayList<>();        

            // 문자열에서 "ad"가 있는 모든 위치를 찾아 인덱스 쌍을 저장
            for(int j = 0; j < strArr[i].length() - 1; j++){
                if(strArr[i].substring(j, j + 2).equals("ad")){
                    int[] testArr = {j, j + 2};
                    intList.add(testArr);
                }
            }
            // <<<<< 잘못이해했었음 ad있는 배열삭제임.>>>>>
            // "ad"를 찾았다면 문자열을 처리해야 함  
//            if(!intList.isEmpty()){
                // 문자열을 StringBuilder로 변환
//                StringBuilder strB = new StringBuilder(strArr[i]);
                // 저장된 인덱스 쌍을 역순으로 처리하여 문자열에서 "ad" 제거 
//                for(int k = 0; k < intList.size(); k++){
//                    int temp1 = intList.get(intList.size() - 1 - k)[0];
//                    int temp2 = intList.get(intList.size() - 1 - k)[1];
//                    if(strB.length() > 0){
//                        strB.delete(temp1, temp2);
//                    }
//                }
                // 처리된 문자열을 ArrayList에 추가
//                arrList.add(strB.toString());
//            } else {
                // "ad"가 없으면 원본 문자열을 그대로 ArrayList에 추가
//                arrList.add(strArr[i]);
//            }
            
            //제대로된 답
            if(intList.isEmpty()){
                arrList.add(strArr[i]);
            }
            
            
        }

        // ArrayList를 String 배열로 변환
        answer = arrList.toArray(new String[0]);

        return answer;
    }
}
