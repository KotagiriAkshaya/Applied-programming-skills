class Solution {

    public String minRemoveToMakeValid(String s) {

        StringBuilder str = new StringBuilder();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '(') {
                count++;
                str.append(ch);
            } 
            else if (ch == ')') {

                if (count > 0) {
                    count--;
                    str.append(ch);
                }
            } 
            else {
                str.append(ch);
            }
        }

        for (int i = str.length() - 1; i >= 0 && count > 0; i--) {

            if (str.charAt(i) == '(') {
                str.deleteCharAt(i);
                count--;
            }
        }

        return str.toString();
    }
}