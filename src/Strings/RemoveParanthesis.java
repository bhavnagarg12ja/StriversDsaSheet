package Strings;

public class RemoveParanthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        String result = removeOuterParantheses(s);
        System.out.println(result);
    }

    private static String removeOuterParantheses(String s) {
        StringBuilder result = new StringBuilder();
        int balance = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) {
                    result.append(c);
                }
                balance++;
            } else {
                balance--;
                if (balance > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }

}
