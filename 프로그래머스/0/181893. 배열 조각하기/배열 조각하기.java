import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};

        ArrayList<Integer> arrList = Arrays.stream(arr)
                                            .boxed()
                                            .collect(Collectors.toCollection(ArrayList::new));
        
            for(int i=0; i<query.length; i++){
                
                //통과가안됨.
                //if(i % 2 ==0){
                //    int a = query[i] ;
                //    while(a+1 < arrList.size()){
                //    arrList.remove(a+1);
                //    a++;
                //    }
                //}else{
                //    int b = query[i];
                //   while(b>0){
                //  arrList.remove(0);  
                //  b--;
                //  }
                //}
                
                if (i % 2 == 0) {
                    // 짝수 인덱스: 오른쪽 범위 삭제
                    int a = query[i];
                    if (a < arrList.size()) {
                        arrList.subList(a + 1, arrList.size()).clear();
                    }
                } else {
                    // 홀수 인덱스: 왼쪽 범위 삭제 Math.min 개념은 (b,c)중 작은것 택함. 변수가 사이즈보다 커지면 사이즈 최대로 맞추는기능
                    int b = query[i];
                    if (b < arrList.size()) {
                        arrList.subList(0, Math.min(b, arrList.size())).clear();
                    }
                }
                
            }
        answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}