class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        int sum1 = 0;
        int sum2 = 0;
        
        for(int arr : arr1){
            sum1 += arr;
        }
        for(int arr : arr2){
            sum2 += arr;
        }
        System.out.println(sum1 + " " + sum2);
        
        
            if(arr1.length < arr2.length){
                answer = -1;
            }else if(arr1.length > arr2.length){
                answer = 1;
            }else if(arr1.length == arr2.length){
                if(sum2 > sum1){
                    answer = -1;
                }else if(sum1 > sum2){
                    answer = 1;
                }else if(sum1 == sum2){
                    answer = 0;
                }
            }
        
        return answer;
    }
}