class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        
           if(arr.length % 2 != 0){
               for(int i=0; i<arr.length; i++){
                   if(i % 2 ==0){
                       arr[i] = arr[i] + n;
                   }
               }
           }else{
                for(int j=0; j<arr.length; j++){
                   if(j % 2 !=0){
                       arr[j] = arr[j] + n;
                   }
               } 
           }
        
        answer = arr.clone();
        
        return answer;
    }
}