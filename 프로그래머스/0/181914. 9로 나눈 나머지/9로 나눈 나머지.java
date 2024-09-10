class Solution {
    public int solution(String number) {
        int remainder = 0;
        
        // 문자열을 한 자리씩 순회
        for (int i = 0; i < number.length(); i++) {
            // 현재 자리의 숫자 추출 *새로알아간다 getNumericValue 하면 char를 숫자로 바꿔줌 인티저파스인트랑 비슷
            int digit = Character.getNumericValue(number.charAt(i));
            
            // 현재 자리수를 포함하여 나머지를 갱신
            remainder = (remainder * 10 + digit) % 9;
            System.out.println(remainder);
        }
        
        return remainder;
    }
}