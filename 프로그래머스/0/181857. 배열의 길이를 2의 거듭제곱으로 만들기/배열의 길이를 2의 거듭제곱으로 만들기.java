import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList<Integer> arrList = new ArrayList<>();
                
            int i = 0;
            int j = 0;
            int k = 0;
            while(k < arr.length){
                //arrList가 비어있으면 순서대로 넣음
                if(arrList.size() < arr.length){
                    arrList.add(arr[i]);
                    i++;
                    System.out.println(i + "i가커짐");
                //arrList에 arr를 다 채운 길이가 2의 j승보다 크면 2의 j승을 키움
                }else if(arrList.size() >= arr.length && arrList.size() > Math.pow(2,j)){
                    j++;
                    System.out.println(j + "j가커짐");
                //2의 j승이 arrList 길이보다 커지면 arr List에 0을 더함
                }else if(arrList.size() >= arr.length && arrList.size() < Math.pow(2,j)){
                    arrList.add(0);
                    k++;
                    System.out.println(k + "k가커짐");
                }else if(arrList.size() >= arr.length && arrList.size() == Math.pow(2,j)){
                    break;
                }
            }
        
            answer = arrList.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}