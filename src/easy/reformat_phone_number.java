package easy;

class Solution {
    public String solution(String s) {
        String phoneStr = "";

        String lastStr = "";
        String answer = "";

        for (char c : s.toCharArray()) {
            if (c != ' ' && c != '-') {
                phoneStr += c;
            }
        }

        if (phoneStr.length() > 1 && phoneStr.length() % 3 == 1) {
            lastStr =  phoneStr.substring(phoneStr.length() -2, phoneStr.length());
            phoneStr = phoneStr.substring(0 , phoneStr.length() -2);
        }

        int index = 0;
        for (char c : phoneStr.toCharArray()) {
            if ((index + 1) % 3 == 0 && (index + 1) != phoneStr.length()) {
                answer += c + "-";
            } else {
                answer += c;
            }
            index++;
        }

        if (lastStr.length() > 0) {
            answer = answer + "-" + lastStr;
        }

        return answer;
    }
}



