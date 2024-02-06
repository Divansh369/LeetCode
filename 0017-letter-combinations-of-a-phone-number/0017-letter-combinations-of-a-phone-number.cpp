#include <vector>
#include <string>

class Solution {
public:
    std::vector<std::string> letterCombinations(std::string digits) {
        std::vector<std::string> result;
        if (digits.empty()) {
            return result;
        }
        generateCombinations(digits, 0, "", result);
        return result;
    }
private:
    void generateCombinations(const std::string &digits, int index, std::string current, std::vector<std::string> &result) {
        if (index == digits.length()) {
            result.push_back(current);
            return;
        }
        std::string letters = getLetters(digits[index]);
        for (char letter : letters) {
            generateCombinations(digits, index + 1, current + letter, result);
        }
    }
    std::string getLetters(char digit) {
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
};

