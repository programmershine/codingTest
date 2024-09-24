class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        String[][] Lboard = new String[board.length+2][board.length+2];
        
        for(int i=1; i<Lboard.length-1; i++){
            for(int j=1; j<Lboard.length-1; j++){
                Lboard[i][j] = board[i-1][j-1];               
            }
        }
        
        
        
        if(Lboard[h+1][w+1].equals(Lboard[h][w+1])){
            answer+=1;
        }
        if(Lboard[h+1][w+1].equals(Lboard[h+2][w+1])){
            answer+=1;
        }
        if(Lboard[h+1][w+1].equals(Lboard[h+1][w])){
            answer+=1;
        }
        if(Lboard[h+1][w+1].equals(Lboard[h+1][w+2])){
            answer+=1;
        }
        

        return answer;
    }
}