class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
            String[] math = binomial.split(" ");
        
    
            int num = 0;
        
            boolean start = false;
        
            boolean plus = false;
            boolean minus = false;
            boolean multi = false;
            boolean divi = false;
        
            for(String ma : math){
                
                if(!start){
                    num = Integer.parseInt(ma);
                    start = true;
                }
                
                if(!ma.isEmpty()){
                    
                    if(ma.equals("+") || ma.equals("-") || ma.equals("*") || ma.equals("/")){
                           switch(ma){
                               case "+" :
                                   plus = true;
                                   break;
                               case "-" :
                                   minus = true;
                                   break;
                               case "*" :
                                   multi = true;
                                   break;
                               case "/" :
                                   divi = true;
                                   break;
                           } 
                    }else{
                        int num2 = Integer.parseInt(ma);
                           if(plus){
                               num = num + num2;
                               plus = false;
                           }else if(minus){
                               num = num - num2;
                               minus = false;
                           }else if(multi){
                               num = num * num2;
                               multi = false;
                           }else if(divi){
                               num = num / num2;
                               divi = false;
                           }
                    }
                                        
                }    
            }    
        
        answer = num;
        
        return answer;
    }
}