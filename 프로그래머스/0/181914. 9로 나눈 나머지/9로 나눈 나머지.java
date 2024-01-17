class Solution {
    public int solution(String number) {
        int answer = 0;
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != '0') {
                answer += Character.getNumericValue(number.charAt(i));
            }
        }
        return answer % 9;
    }
}