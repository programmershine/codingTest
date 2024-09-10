class Solution {
    public int solution(String number) {
        int remainder = 0;
        
        // 문자열을 한 자리씩 순회
        for (int i = 0; i < number.length(); i++) {
            // 현재 자리의 숫자 추출
            int digit = Character.getNumericValue(number.charAt(i));
            
            // 현재 자리수를 포함하여 나머지를 갱신
            remainder = (remainder * 10 + digit) % 9;
            System.out.println(remainder);
        }
        
        return remainder;
    }
}