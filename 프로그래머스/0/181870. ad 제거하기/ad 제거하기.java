import java.util.ArrayList;
class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> answer = new ArrayList<>();
        for (String str : strArr) {
            if (str.contains("ad") == false) {
                answer.add(str);
            } 
        }
        return answer.stream().toArray(String[]::new);
    }
}