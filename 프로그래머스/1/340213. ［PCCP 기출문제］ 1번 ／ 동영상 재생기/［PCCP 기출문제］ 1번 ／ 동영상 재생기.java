import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
        String Npos = "00:" + pos;
        String Nops = "00:" + op_start;
        String Nope = "00:" + op_end;
        String Nvlen = "00:" + video_len;
        String Nbegin = "00:00:00";
        
        LocalTime Tpos = LocalTime.parse(Npos);
        LocalTime Tops = LocalTime.parse(Nops);
        LocalTime Tope = LocalTime.parse(Nope);
        LocalTime Tvlen = LocalTime.parse(Nvlen);
        LocalTime Tbegin = LocalTime.parse(Nbegin);
        
        //LocalTime result = time1.plusHours(time2.getHour()).plusMinutes(time2.getMinute());

        
            for(int i=0; i<commands.length; i++){
              
                if(Tpos.equals(Tops) || (Tpos.isAfter(Tops) && Tpos.isBefore(Tope))){
                    Tpos = Tope;
                }
                
                if(commands[i].equals("prev")){
                    long secondsDifference = java.time.Duration.between(Tbegin, Tpos).getSeconds();
                    System.out.println(secondsDifference);
                    if(secondsDifference < 10){
                        Tpos = Tbegin;
                    }else{
                        System.out.println("그럼이걸해야할거아냐");
                        Tpos = Tpos.minusSeconds(Long.parseLong("10"));
                        System.out.println("그결과는" + Tpos);
                    }
              
                }else if(commands[i].equals("next")){
                    long secondsDifference = java.time.Duration.between(Tpos, Tvlen).getSeconds();
                    if(secondsDifference < 10){
                        Tpos = Tvlen;
                    }else{
                        Tpos = Tpos.plusSeconds(Long.parseLong("10"));
                    }
                }        
            }
        
        
            if(Tpos.equals(Tops) || (Tpos.isAfter(Tops) && Tpos.isBefore(Tope))){
               Tpos = Tope;
            }
            //이거 어려움 외워둘것★
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm:ss");
            answer = Tpos.format(formatter);
        
            //시간이 초가 00이면 자꾸 잘림 그래서 13:00이 13이되어버림
            //String result = Tpos.toString();
            //answer = result.substring(3);
        
        return answer;
    }
}