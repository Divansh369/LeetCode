import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }
        generateCombinations(digits, 0, "", result);
        return result;
    }

    private void generateCombinations(String digits, int index, String current, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String letters = getLetters(digits.charAt(index));
        for (char letter : letters.toCharArray()) {
            generateCombinations(digits, index + 1, current + letter, result);
        }
    }

    private String getLetters(char digit) {
        switch (digit) {
            case '2':
                return "abc";
            case '3':
                return "def";
            case '4':
                return "ghi";
            case '5':
                return "jkl";
            case '6':
                return "mno";
            case '7':
                return "pqrs";
            case '8':
                return "tuv";
            case '9':
                return "wxyz";
            default:
                return "";
        }
    }
}
