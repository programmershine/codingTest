import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder b = new StringBuilder();
        
        for(int i = 0; i<a.length(); i++){
            char c = a.charAt(i);
            if(Character.isUpperCase(c)){
            b.append(Character.toLowerCase(c));
            }else if(Character.isLowerCase(c)){
            b.append(Character.toUpperCase(c));
            }
        }
        
        System.out.println(b);
    
    }
}