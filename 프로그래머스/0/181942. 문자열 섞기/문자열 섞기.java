class Solution {
    public String solution(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int length1 = str1.length();
        int length2 = str2.length();
        int maxLength = Math.max(length1, length2);

        for (int i = 0; i < maxLength; i++) {
            if (i < length1) {
                result.append(str1.charAt(i));
            }
            if (i < length2) {
                result.append(str2.charAt(i));
            }
        }

        return result.toString();
    }
}
