import java.util.*;
class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        int resultSort = 0;
        int extType = 0;
        ArrayList<Integer> arrList = new ArrayList<>();
        if(sort_by.equals("code")){
            resultSort = 0;
        }else if(sort_by.equals("date")){
            resultSort = 1;
        }else if(sort_by.equals("maximum")){
            resultSort = 2;
        }else if(sort_by.equals("remain")){
            resultSort = 3;
        }
        
        
        for(int i=0; i<data.length; i++){
            for(int j=0; j<data[i].length; j++){
                if(data[i][0] < val_ext && ext.equals("code")){
                    arrList.add(data[i][0]);
                    extType = 0;
                    break;
                }else if(data[i][1] < val_ext && ext.equals("date")){
                    arrList.add(data[i][1]);
                    extType = 1;
                    break;
                }else if(data[i][2] < val_ext && ext.equals("maximum")){
                    arrList.add(data[i][2]);
                    extType = 2;
                    break;
                }else if(data[i][3] < val_ext && ext.equals("remain")){
                    arrList.add(data[i][3]);
                    extType = 3;
                    break;
                }
            }
        }
        

        int[] temp = new int[arrList.size()];
        
        for(int k=0; k<arrList.size(); k++){
            for(int l=0; l<data.length; l++){
                if(arrList.get(k) == data[l][extType]){
                    temp[k] = data[l][resultSort];
                }
            }
        }
        
        Arrays.sort(temp);
        
        int[][] result = new int[temp.length][4];
        
        for(int m=0; m<temp.length; m++){
            for(int n=0; n<data.length; n++){
                if(temp[m] == data[n][resultSort]){
                    result[m] = data[n];
                }
            }
        }
        
        answer = result.clone();
        
        return answer;
    }
}