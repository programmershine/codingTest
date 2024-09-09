import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            while (!list.isEmpty() && list.get(list.size() - 1) >= arr[i]) {
                list.remove(list.size() - 1);
            }
            list.add(arr[i]);
        }
        
        // ArrayList를 int[]로 변환
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
