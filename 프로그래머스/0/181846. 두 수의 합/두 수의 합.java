class Solution {
    public String solution(String a, String b) {
        StringBuilder result = new StringBuilder();
        
        int alen = a.length();
        int blen = b.length();
        
        int carry = 0;
        int maxLength = Math.max(alen, blen);
        
        for (int i = 0; i < maxLength; i++) {
            int anum = i < alen ? a.charAt(alen - 1 - i) - '0' : 0;
            int bnum = i < blen ? b.charAt(blen - 1 - i) - '0' : 0;

            int sum = anum + bnum + carry;
            result.append(sum % 10);
            carry = sum / 10;
        }
        
        if (carry > 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }
}
