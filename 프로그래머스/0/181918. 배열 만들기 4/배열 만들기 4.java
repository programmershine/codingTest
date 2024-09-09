import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
                
        int[] stk = {};
        ArrayList<Integer> list = new ArrayList<>();        
        
        for(int i = 0; i < arr.length; i++){
           
            //if(list.size() == 0){
            //    list.add(arr[i]);
            //    i++;
            //}else{
            //    if(list.get(list.size()-1) < arr[i]){
            //        list.add(arr[i]);
            //        i++;
            //   }else{
            //        list.remove(list.size()-1);
            //    }
            //}

            // if문 while문의 차이를 알아내야함
            //                   while(조건에 합한경우 계속반복)                       if(조건에따라 수행)
            // for문 i=0         배열 비어서 종료 -> arr[0]=1추가        {1}           배열이 0이라 arr[0]=1추가 하고 i++ 함         {1}           
            //
            // for문 i=1         마지막 1이 4보다 크지않아서 while종료    {1,4}         i++해서 패스                                 {1}
            //                   -> arr[1]=4 추가                                   (i++안했다면 arr[1]=4가 마지막배열 1보다 큼 -> arr[1]=4 추가) (1,4)   
            //
            // for문 i=2         마지막 4가 2보다 큼 -> 4지움            {1,2}
            //                   마지막 1이 2보다 작음 while종료 2추가
            //
            // 결론 : 문제에서 제거remove 할때는 i 를 올리지 않음 즉 for문에서 다음 for문으로 넘어가면 안됌. > while문을 쓰면 안올리고 해결이됨. 
            // 올리는 경우는 추가니까 while문 밖에 추가 add가 있으면됨. 문제가 좀 이상하긴함. 입출력 예를 잘 살펴보면 알 수 있음.
            
            while (!list.isEmpty() && list.get(list.size() - 1) >= arr[i]) {
                list.remove(list.size() - 1);
            }
            list.add(arr[i]);
        
            
        }
        stk = list.stream().mapToInt(Integer::intValue).toArray();
        
        
        return stk;
    }
}