class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = 0;
        int lasttime = attacks[attacks.length-1][0];
        int maxHealth = health;
        int reset = 0;
        boolean attacked = false;
 
            //시간 0초는 아무것도안함 1~11초까지 행동
            for(int i=1; i<=lasttime; i++){
                
                //시간당 공격당하는 회수+데미지
                for(int j=0; j<attacks.length; j++){
                    if(i == attacks[j][0]){
                        health -= attacks[j][1];
                        reset = 0;
                        attacked = true;
   
                    }    
                }
                
                //죽었으면 끝
                if(health<=0){
                    break;        
                }
                
                if(!attacked){
                    System.out.println(i+"초" + health);
                    //공격계산 끝나고 최대체력넘지않으면
                    if(health < maxHealth){
                        reset++;
                        
                        //체력채움
                        if(reset < bandage[0]){
                            health += bandage[1];
                            
                                //체력넘어가면 최대치
                                if(health > maxHealth){
                                    health = maxHealth;
                                }

                        //추가체력시 추가채력도채움
                        }else if(reset == bandage[0]){
                            health += bandage[1] + bandage[2];
                            reset = 0;
                                //체력넘어가면 최대치
                                if(health>maxHealth){
                                    health = maxHealth;
                                }
                        }

                    }else{
                        System.out.println(i+"초: 최대체력 이상 가질 수 없습니다.");
                        reset++;
                    }
                }
                attacked = false;
            }
        
         
        
        if(health<=0){
            answer = -1;
        }else{
            answer = health;
        }
        
        return answer;
    }
}